package com.example.task_android3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_name,et_email,et_password,et_phone;
    Button btn_next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.et_name);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        et_phone = findViewById(R.id.et_phone);
        btn_next = findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent next = new Intent(getBaseContext(),MainActivity2.class);
                next.putExtra("name" , et_name.getText().toString());
                next.putExtra("email" , et_email.getText().toString());
                next.putExtra("password" , et_password.getText().toString());
                next.putExtra("phone" , et_phone.getText().toString());

                startActivity(next);

            }
        });



    }
}