package com.example.andres.shiroestore.activity.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.andres.shiroestore.R;
import com.example.andres.shiroestore.activity.admin.AdminMainViewActivity;
import com.example.andres.shiroestore.activity.user.StoreActivity;

public class MainActivity extends AppCompatActivity {

    private Button mLogin;
    private TextView mCreateAccount;
    private EditText mUserLogin;
    private String var;

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

            var = mUserLogin.getText().toString();
            if (var.equalsIgnoreCase("bryan")) {
                Intent intent = new Intent(MainActivity.this, AdminMainViewActivity.class);
                startActivity(intent);
                finish();
            } else {
                if (var.equalsIgnoreCase("andres")){
                    Intent intent = new Intent(MainActivity.this, StoreActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.userPasswordIncorrect), Toast.LENGTH_SHORT).show();
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogin = (Button) findViewById(R.id.btnLogin);
        mCreateAccount = (TextView) findViewById(R.id.txtCreateAccount);
        mUserLogin = (EditText) findViewById(R.id.txtLoginUser);

        mLogin.setOnClickListener(mListenerLogin);
        mCreateAccount.setOnClickListener(mListenerCreateAccount);
    }

}
