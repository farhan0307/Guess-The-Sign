package com.example.guesssign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    int r1 ,r2;
    Button btnleft , btnright , btnplus , btnminus , btnmultiply , btndevide;
    TextView txt1,txt2;
    int result;
    String [] character = {"+","-","*","/"};
    int index =0;
    String sign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.t_result);
        txt2 = findViewById(R.id.t_rightwrong);
        btnleft = findViewById(R.id.b_leftrendom);
        btnright = findViewById(R.id.b_rightrandom);
        btnplus = findViewById(R.id.b_plus);
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sign.equals("+"))
                {
                    txt2.setText("Right");
                }
                else
                {
                    txt2.setText("Wrong");
                }
            }
        });

        btnminus = findViewById(R.id.b_minus);
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sign.equals("-"))
                {
                    txt2.setText("Right");
                }
                else
                {
                    txt2.setText("Wrong");
                }
            }
        });
        btnmultiply = findViewById(R.id.b_multiply);
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sign.equals("*"))
                {
                    txt2.setText("Right");
                }
                else
                {
                    txt2.setText("Wrong");
                }
            }
        });
        btndevide = findViewById(R.id.b_devide);
        btndevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sign.equals("/"))
                {
                    txt2.setText("Right");
                }
                else
                {
                    txt2.setText("Wrong");
                }
            }
        });


        CreatRandomNumber();
    }
    private void CreatRandomNumber() {
        Random rand = new Random();
        r1 = rand.nextInt(10);
        r2 = rand.nextInt(10);

        btnleft.setText(Integer.toString(r1));

        btnright.setText(Integer.toString(r2));
        index = rand.nextInt(character.length);
        String c = character[index];
        if(c.equals("+"))
        {
            result = r1+r2;
            sign = "+";
        }
        else if(c.equals("-"))
        {
            result = r1-r2;
            sign = "-";
        }
        else if(c.equals("*"))
        {
            result = r1*r2;
            sign = "*";
        }
        else if(c.equals("/"))
        {
            result = r1/r2;
            sign = "/";
        }
        txt1.setText(Integer.toString(result));
    }


    public void onClickReset(View view) {
        CreatRandomNumber();
    }

}