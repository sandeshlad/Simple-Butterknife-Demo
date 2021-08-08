package com.example.butterknifedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "message";

    @BindView(R.id.lbl_title)
    TextView lblTitle;

    @BindView(R.id.input_name)
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind the current view
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_enter)
    public void PassDataToActivityTwo(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        //editText = (EditText) findViewById(R.id.input_name);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}