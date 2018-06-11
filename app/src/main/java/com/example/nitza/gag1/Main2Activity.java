package com.example.nitza.gag1;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    TextView tv;
    Button g; String s, j;
    Intent k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=(TextView)findViewById(R.id.tv);
        g=(Button)findViewById(R.id.g);
        k=getIntent();
        s=k.getStringExtra("s");
        tv.setText("The last result is "+s);

    }
    public void onActivityResult (int rq, Intent data){
        if (data!=null){

            j =data.getStringExtra("re");
        }

    }
    public void fa(View view) {
        k.putExtra("re", s);
        setResult(RESULT_OK, k);
        finish();
    }
}


