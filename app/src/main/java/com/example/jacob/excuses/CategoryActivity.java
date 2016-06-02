package com.example.jacob.excuses;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class CategoryActivity extends AppCompatActivity {
    public final static String MESSAGE = "com.example.jacob.excuses.MESSAGE2";
    String key;
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        button = (Button) findViewById(R.id.category1_id);
        button1 = (Button) findViewById(R.id.category2_id);
        button2 = (Button) findViewById(R.id.category3_id);
        button3 = (Button) findViewById(R.id.category4_id);
        button4 = (Button) findViewById(R.id.category5_id);
        button5 = (Button) findViewById(R.id.category6_id);
        button6 = (Button) findViewById(R.id.category7_id);
        button7 = (Button) findViewById(R.id.category8_id);
        button8 = (Button) findViewById(R.id.category9_id);
        button9 = (Button) findViewById(R.id.category10_id);
        button10 = (Button) findViewById(R.id.category11_id);
        button11 = (Button) findViewById(R.id.category12_id);
        button12 = (Button) findViewById(R.id.category13_id);
        button13 = (Button) findViewById(R.id.category14_id);
        button14 = (Button) findViewById(R.id.category15_id);
        button15 = (Button) findViewById(R.id.category16_id);
        button16 = (Button) findViewById(R.id.category17_id);
        button17 = (Button) findViewById(R.id.category18_id);
        button18 = (Button) findViewById(R.id.category19_id);
        button19 = (Button) findViewById(R.id.category20_id);
        button20 = (Button) findViewById(R.id.category21_id);
        button21 = (Button) findViewById(R.id.category22_id);
        button22 = (Button) findViewById(R.id.category23_id);
        button23 = (Button) findViewById(R.id.category24_id);
        button24 = (Button) findViewById(R.id.category25_id);
        button25 = (Button) findViewById(R.id.category26_id);
        button26 = (Button) findViewById(R.id.category27_id);
        button27 = (Button) findViewById(R.id.return_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button.getText().toString();
                getExcuse(key);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button1.getText().toString();
                getExcuse(key);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button2.getText().toString();
                getExcuse(key);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button3.getText().toString();
                getExcuse(key);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button4.getText().toString();
                getExcuse(key);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button5.getText().toString();
                getExcuse(key);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button6.getText().toString();
                getExcuse(key);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button7.getText().toString();
                getExcuse(key);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button8.getText().toString();
                getExcuse(key);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button9.getText().toString();
                getExcuse(key);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button10.getText().toString();
                getExcuse(key);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button11.getText().toString();
                getExcuse(key);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button12.getText().toString();
                getExcuse(key);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button13.getText().toString();
                getExcuse(key);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button14.getText().toString();
                getExcuse(key);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button15.getText().toString();
                getExcuse(key);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button16.getText().toString();
                getExcuse(key);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button17.getText().toString();
                getExcuse(key);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button18.getText().toString();
                getExcuse(key);
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button19.getText().toString();
                getExcuse(key);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button20.getText().toString();
                getExcuse(key);
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button21.getText().toString();
                getExcuse(key);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button22.getText().toString();
                getExcuse(key);
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button23.getText().toString();
                getExcuse(key);
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button24.getText().toString();
                getExcuse(key);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button25.getText().toString();
                getExcuse(key);
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = button26.getText().toString();
                getExcuse(key);
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void handleClick(View view)
    {

    }

    public void getExcuse(String s)
    {
        Intent intent = new Intent(this, ExcusesActivity.class);
        intent.putExtra(MESSAGE, key);
        startActivity(intent);
    }

}
