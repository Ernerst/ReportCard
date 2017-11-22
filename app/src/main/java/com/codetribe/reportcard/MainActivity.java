package com.codetribe.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private EditText edtpassword,edtusername;
    private String username,password;
    Intent intent;
    private TextView txtSignUp;

    private Student student;
    private RCDatabase rcDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button) findViewById(R.id.btnlogin);
        edtusername=(EditText)findViewById(R.id.edtusername);
        edtpassword=(EditText)findViewById(R.id.edtpass);
        txtSignUp=(TextView)findViewById(R.id.txtSignUp);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username=edtusername.getText().toString();
                password=edtpassword.getText().toString();

                if(username.equalsIgnoreCase("211386576") && password.equalsIgnoreCase("khutso"))
                {

                     intent = new Intent(MainActivity.this,AdminUpdate.class);
                    startActivity(intent);

                }else if(username.equalsIgnoreCase("123456") && password.equalsIgnoreCase("123456") )
                {
                    intent = new Intent(MainActivity.this,StudentView.class);
                    startActivity(intent);

                }else {

                    Toast.makeText(MainActivity.this,"User not found, Register or consult your Admin with Your login details ",Toast.LENGTH_LONG).show();
                }




            }
        });

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,StudentSignUp.class);
                startActivity(intent);
            }
        });




    }
}
