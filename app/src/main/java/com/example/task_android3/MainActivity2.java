package com.example.task_android3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv_name;
    TextView tv_email;
    TextView tv_phone;
    EditText et2_phone;
    EditText et_text;
    Button btn_share;
    Button btn_call;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_name = findViewById(R.id.tv_name);
        tv_email = findViewById(R.id.tv_email);
        tv_phone = findViewById(R.id.tv_phone);
        et2_phone = findViewById(R.id.et2_phone);
        et_text = findViewById(R.id.et_text);

        btn_share = findViewById(R.id.btn_share);
        btn_call = findViewById(R.id.btn_call);


       Intent i = getIntent();
       String name = i.getStringExtra("name");
       String email = i.getStringExtra("email");
       String phone = i.getStringExtra("phone");


        tv_name.setText("Welcome "+ name);
        tv_email.setText("Email : "+ email);
        tv_phone.setText("Phone : "+ phone);

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String text = et_text.getText().toString();
                Intent share = new Intent();
                share.setAction(Intent.ACTION_SEND);
                share.setType("text/plain");

                startActivity(share);

            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String number = et2_phone.getText().toString();
                Intent call = new Intent();
                call.setAction(Intent.ACTION_DIAL);
                Uri uri = Uri.parse("tel: " + number);
                        call.setData(uri);

                startActivity(call);

            }
        });



    }
}