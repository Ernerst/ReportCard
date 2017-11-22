package com.codetribe.reportcard;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentSignUp extends AppCompatActivity {

    private TextView txtpass,txtcomfim;
    private EditText edtpass,editcomfirm,edtstudentNo;
    private String studentNo,pass,comfirm;

    private Button sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sign_up);


        txtpass=(TextView)findViewById(R.id.textView5);
        txtcomfim=(TextView)findViewById(R.id.textView6);

        edtpass=(EditText)findViewById(R.id.edtPassWs);
        editcomfirm=(EditText)findViewById(R.id.edtPassCo) ;
        edtstudentNo=(EditText)findViewById(R.id.edtStudNos);

        sub=(Button)findViewById(R.id.btnSubmitPass);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pass=edtpass.getText().toString();
                comfirm=editcomfirm.getText().toString();

                if(!pass.equalsIgnoreCase(comfirm))
                {
                    txtpass.setTextColor(Color.RED);
                    txtcomfim.setTextColor(Color.RED);
                    Toast.makeText(StudentSignUp.this,"PASSWORDS DO NOT MATCH",Toast.LENGTH_SHORT).show();

                }else{

                    Toast.makeText(StudentSignUp.this,"Registration Submited",Toast.LENGTH_SHORT).show();
                    edtpass.setText("");
                    editcomfirm.setText("");
                    edtstudentNo.setText("");
                    txtpass.setTextColor(Color.BLACK);
                    txtcomfim.setTextColor(Color.BLACK);
                    Intent intent= new Intent(StudentSignUp.this,MainActivity.class);
                    startActivity(intent);
                }


            }
        });




    }
}
