package com.example.exma2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText unm,pass;
    Button login,cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unm=findViewById(R.id.usernm);
        pass=findViewById(R.id.passwd);
        login=findViewById(R.id.login);
        cancel=findViewById(R.id.cancel);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(unm.getText().toString().equals("admin")&&pass.getText().toString().equals("password"))
                {
                    Toast.makeText(getApplicationContext(),"login successful",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
