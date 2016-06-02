package com.example.jacob.excuses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.example.jacob.excuses.MESSAGE";
    String searchString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button_id);
        Button button2 = (Button)findViewById(R.id.button2_id);
        Button button3 = (Button)findViewById(R.id.button3_id);
        Button button4 = (Button)findViewById(R.id.button4_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getExcuse();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCategories();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitYourOwn();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    public void getCategories()
    {
        Intent intent = new Intent(this, CategoryActivity.class);
        startActivity(intent);
    }

    public void submitYourOwn()
    {
        Intent intent = new Intent(this, SubmitYourOwnActivity.class);
        startActivity(intent);
    }

    public void getExcuse()
    {
        Intent intent = new Intent(this, ResultActivity.class);
        EditText editText = (EditText) findViewById(R.id.excuse);
        searchString = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, searchString);
        startActivity(intent);
    }

}
