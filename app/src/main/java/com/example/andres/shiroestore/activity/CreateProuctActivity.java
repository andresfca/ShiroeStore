package com.example.andres.shiroestore.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.andres.shiroestore.R;

public class CreateProuctActivity extends AppCompatActivity {

    private EditText name;
    private Spinner category;
    private EditText price;
    private EditText cant;
    private String photo;
    private String detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_prouct);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
    }
}
