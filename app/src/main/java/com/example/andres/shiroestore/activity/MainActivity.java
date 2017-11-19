package com.example.andres.shiroestore.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.andres.shiroestore.R;

public class MainActivity extends AppCompatActivity {

    private Button mLogin;
    private TextView mCreateAccount;

    private View.OnClickListener mListenerCreateAccount = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SingInActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener mListenerLogin = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, AdminMainViewActivity.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogin = (Button) findViewById(R.id.btnLogin);
        mCreateAccount = (TextView) findViewById(R.id.txtCreateAccount);

        mLogin.setOnClickListener(mListenerLogin);
        mCreateAccount.setOnClickListener(mListenerCreateAccount);
    }

}
