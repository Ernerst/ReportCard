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

public class SignUp extends AppCompatActivity {

    private Button btnsubmit;
    private EditText edtsurname,edtstudno,edtpass,edtcomfirmPass,edtsub1,edtsub2,edtsub3,edtsub4,edtsub5,edtsub6;
    private String password,comfirmpassword,name,studnumber,sub1,sub2,sub3,sub4,sub5,sub6;
    private TextView txtPass,txtComfirmPass;

    RCDatabase rcDatabase;
    Student student;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnsubmit=(Button)findViewById(R.id.btnSubmitreg);
        edtsurname=(EditText)findViewById(R.id.edtregSurname);
        edtstudno=(EditText)findViewById(R.id.edtregStudentNo);


        edtsub1=(EditText)findViewById(R.id.edtregsub1);
        edtsub2=(EditText)findViewById(R.id.edtregsub2);
        edtsub3=(EditText)findViewById(R.id.edtregsub3);
        edtsub4=(EditText)findViewById(R.id.edtregsub4);
        edtsub5=(EditText)findViewById(R.id.edtregsub5);
        edtsub6=(EditText)findViewById(R.id.edtregsub6);




        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                name=edtsurname.getText().toString();
                studnumber=String.valueOf(edtstudno.getText().toString());
                sub1=edtsub1.getText().toString();
                sub2=edtsub2.getText().toString();
                sub3=edtsub3.getText().toString();
                sub4=edtsub4.getText().toString();
                sub5=edtsub5.getText().toString();
                sub6=edtsub6.getText().toString();
//                password=edtpass.getText().toString();
//                comfirmpassword=edtcomfirmPass.getText().toString();


              //  student= new Student(name,studnumber,sub1,sub2,sub3,sub4,sub5,sub6);


               // rcDatabase= new RCDatabase(SignUp.this);
               // rcDatabase.AddStudent(student);
                edtsurname.setText("");
                edtstudno.setText("");
//                edtpass.setText("");
//                edtcomfirmPass.setText("");
                edtsub1.setText("");
                edtsub2.setText("");
                edtsub3.setText("");
                edtsub4.setText("");
                edtsub5.setText("");
                edtsub6.setText("");


                Toast.makeText(SignUp.this,"Registering complete",Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(SignUp.this,AdminUpdate.class);
                startActivity(intent);






            }
        });





    }
}
