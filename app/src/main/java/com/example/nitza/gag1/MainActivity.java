package com.example.nitza.gag1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    EditText ed;
    String s,ki,str;



    double x=0;
    double sum=0;
    double f=0;
    int n=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        ed=findViewById(R.id.ed);
    }
    public void b1(View view) {
        if(!(ed.getText().toString().equals(""))&&(!(ed.getText().toString().equals("."))&&(!(ed.getText().toString().equals("-")) && (!(ed.getText().toString().equals(".-")) &&(!(ed.getText().toString().equals("."))))))) {
            s = ed.getText().toString();
            x = Double.parseDouble(s);
            ed.setText(" ");
            switch (n){
                case 1:
                    sum = sum + x;
                    break;
                case 2:
                    sum = sum - x;
                    break;
                case 3:
                    sum = (sum * x);
                    break;
                case 4:
                    if (x == 0) {
                        Toast.makeText(this, "wrong input", Toast.LENGTH_SHORT).show();
                    } else {
                        sum = (sum / x);
                        break;}
                    ed.setHint(Double.toString(sum));}
        }else{
            Toast.makeText(this,"wrong input",Toast.LENGTH_SHORT).show();}
        n=1;}
    public void b2(View view) {
        if(!(ed.getText().toString().equals(""))&&(!(ed.getText().toString().equals("."))&&(!(ed.getText().toString().equals("-")) && (!(ed.getText().toString().equals(".-")) &&(!(ed.getText().toString().equals("."))))))) {
            s = ed.getText().toString();
            x = Double.parseDouble(s);
            ed.setText("");
            switch (n) {
                case 1:
                    sum = sum + x;
                    break;
                case 2:
                    sum = sum - x;
                    break;
                case 3:
                    sum = sum * x;
                    break;
                case 4:
                    if (x == 0) {
                        Toast.makeText(this, "wrong input", Toast.LENGTH_SHORT);
                    } else {
                        sum = sum / x;
                        break;}

            }
            ed.setHint(Double.toString(sum));
        }else{
            Toast.makeText(this,"wrong input",Toast.LENGTH_SHORT);
        }
        n=2;
    }
    public void b3(View view) {
        if(!(ed.getText().toString().equals(""))&&(!(ed.getText().toString().equals("."))&&(!(ed.getText().toString().equals("-")) && (!(ed.getText().toString().equals(".-")) &&(!(ed.getText().toString().equals("."))))))) {
            s = ed.getText().toString();
            x = Double.parseDouble(s);
            ed.setText(" ");
            switch (n) {
                case 1:
                    sum =( sum + x);
                    break;
                case 2:
                    sum = (sum - x);
                    break;
                case 3:
                    sum = (sum * x);
                    break;
                case 4:
                    if (x == 0) {
                        Toast.makeText(this, "wrong input", Toast.LENGTH_SHORT).show();
                    } else {
                        sum = (sum / x);
                        break;
                    }
                    ed.setHint(Double.toString(sum));
            }
        }else{
            Toast.makeText(this,"wrong input",Toast.LENGTH_SHORT);
        }
        n=3;
    }
    public void b4(View view) {
        if(!(ed.getText().toString().equals(""))&&(!(ed.getText().toString().equals("."))&&(!(ed.getText().toString().equals("-")) && (!(ed.getText().toString().equals(".-")) &&(!(ed.getText().toString().equals("."))))))) {
            s = ed.getText().toString();
            x = Double.parseDouble(s);
            ed.setText(" ");
            switch (n) {
                case 1:
                    sum = sum + x;
                    break;
                case 2:
                    sum = sum - x;
                    break;
                case 3:
                    sum = (sum * x);
                    break;
                case 4:
                    if (x == 0) {
                        Toast.makeText(this, "wrong input", Toast.LENGTH_SHORT).show();
                    } else {
                        sum = (sum / x);
                        break;
                    }
                    ed.setHint(Double.toString(sum));
            }
        }else{ Toast.makeText(this, "input is wrong",Toast.LENGTH_LONG ).show();}
        n=4;
    }

    public void b5(View view) {
        ed.setText("");
        ed.setHint("display");
        sum=0;
        x=0;
        n=0;
    }
    public void b6(View view) {

        if ((!ed.getText().toString().equals(""))&&((!ed.getText().toString().equals("."))&&(!ed.getText().toString().equals("-"))&&(!ed.getText().toString().equals("-.")))) {
            s = ed.getText().toString();
            x = Double.parseDouble(s);
            ed.setText("");
            switch (n) {
                case 1:
                    sum = sum + x;
                    break;
                case 2:
                    sum = sum - x;
                    break;
                case 3:
                    sum = (sum * x);
                    break;
                case 4:
                    if (x == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    else{
                        sum = (sum / x);
                        break;}
            }
            s = Double.toString(sum);
            ed.setHint(s);
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        f=sum;
        n=1; x=0; sum=0;
    }

    public void b7(View view) {
        Intent t=new Intent(this,Main2Activity.class);
        if (sum==0){
            s=Double.toString(f);
            t.putExtra("s", s);
        }
        else{
            s=Double.toString(sum);
            t.putExtra("s", s);
        }
        startActivityForResult(t,1);
    }
    public void onActivityResult (int a, int b ,Intent c){
        ki=c.getStringExtra("re");
        ed.setText("The last result is "+ ki);
    }
}



