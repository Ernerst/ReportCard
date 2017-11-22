package com.codetribe.reportcard;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AdminUpdate extends AppCompatActivity {

    private Button btnfindStudent,btnViewAll,btnUpdate,btnregisterStud;
    private TextView txtsub1,txtsub2,txtsub3,txtsub4,txtsub5,txtsub6;
    private EditText edtsub1,edtsub2,edtsub3,edtsub4,edtsub5,edtsub6,edtStudent,classTest1,classtest2,
            semesterTest1,semestertest2;
    private  String studentNo;
    private ArrayList<Student> data = new ArrayList<>();


    private int markClass1,markClass2,markSeme1,markSeme2;
    private double finalmark;





    private Dialog dialog;
    private AlertDialog.Builder builder;
    RCDatabase rcDatabase;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_update);



        btnfindStudent=(Button)findViewById(R.id.btnfind);
        btnViewAll=(Button)findViewById(R.id.btnViewAll);
        btnUpdate=(Button)findViewById(R.id.btnupdate);
        btnregisterStud=(Button)findViewById(R.id.btnRegisterStudent);


        txtsub1=(TextView)findViewById(R.id.txtsub1);
        txtsub2=(TextView)findViewById(R.id.txtsubject2);
        txtsub3=(TextView)findViewById(R.id.txtsubject3);
        txtsub4=(TextView)findViewById(R.id.txtsub4);
        txtsub5=(TextView)findViewById(R.id.txtsu5);
        txtsub6=(TextView)findViewById(R.id.txtsu6);

        edtsub1=(EditText)findViewById(R.id.edtsub1);
        edtsub2=(EditText)findViewById(R.id.edtsub2);
        edtsub3=(EditText)findViewById(R.id.edtsub3);
        edtsub4=(EditText)findViewById(R.id.edtsub4);
        edtsub5=(EditText)findViewById(R.id.edtsub5);
        edtsub6=(EditText)findViewById(R.id.edtsub6);
        edtStudent=(EditText)findViewById(R.id.edtsearchStud);


        txtsub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v=AdminUpdate.this.getLayoutInflater().inflate(R.layout.marks,null,false);

                classTest1=(EditText)v.findViewById(R.id.classTest1);
                classtest2=(EditText)v.findViewById(R.id.classtest2);
                semesterTest1=(EditText)v.findViewById(R.id.semesterTest1);
                semestertest2=(EditText)v.findViewById(R.id.semesterTest2);


                dialog=new Dialog(AdminUpdate.this);
                builder= new AlertDialog.Builder(AdminUpdate.this);

                builder.setTitle("Set Marks");
                builder.setView(v);
                builder.setNegativeButton("Cancel",null);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        markClass1=Integer.parseInt(classTest1.getText().toString());
                        markClass2=Integer.parseInt(classtest2.getText().toString());

                        markSeme1=Integer.parseInt(semesterTest1.getText().toString());
                        markSeme2=Integer.parseInt(semestertest2.getText().toString());


                        finalmark=(markClass1+markClass2+markSeme1+markSeme2)/4;

                        edtsub1.setVisibility(EditText.VISIBLE);

                        edtsub1.setText(String.valueOf(finalmark));




                    }
                });
                dialog=builder.create();
                dialog.show();






            }
        });

        txtsub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v=AdminUpdate.this.getLayoutInflater().inflate(R.layout.marks,null,false);

                classTest1=(EditText)v.findViewById(R.id.classTest1);
                classtest2=(EditText)v.findViewById(R.id.classtest2);
                semesterTest1=(EditText)v.findViewById(R.id.semesterTest1);
                semestertest2=(EditText)v.findViewById(R.id.semesterTest2);


                dialog=new Dialog(AdminUpdate.this);
                builder= new AlertDialog.Builder(AdminUpdate.this);

                builder.setTitle("Set Marks");
                builder.setView(v);
                builder.setNegativeButton("Cancel",null);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        markClass1=Integer.parseInt(classTest1.getText().toString());
                        markClass2=Integer.parseInt(classtest2.getText().toString());

                        markSeme1=Integer.parseInt(semesterTest1.getText().toString());
                        markSeme2=Integer.parseInt(semestertest2.getText().toString());


                        finalmark=(markClass1+markClass2+markSeme1+markSeme2)/4;

                        edtsub2.setVisibility(EditText.VISIBLE);

                        edtsub2.setText(String.valueOf(finalmark));




                    }
                });
                dialog=builder.create();
                dialog.show();



            }
        });

        txtsub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v=AdminUpdate.this.getLayoutInflater().inflate(R.layout.marks,null,false);

                classTest1=(EditText)v.findViewById(R.id.classTest1);
                classtest2=(EditText)v.findViewById(R.id.classtest2);
                semesterTest1=(EditText)v.findViewById(R.id.semesterTest1);
                semestertest2=(EditText)v.findViewById(R.id.semesterTest2);


                dialog=new Dialog(AdminUpdate.this);
                builder= new AlertDialog.Builder(AdminUpdate.this);

                builder.setTitle("Set Marks");
                builder.setView(v);
                builder.setNegativeButton("Cancel",null);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        markClass1=Integer.parseInt(classTest1.getText().toString());
                        markClass2=Integer.parseInt(classtest2.getText().toString());

                        markSeme1=Integer.parseInt(semesterTest1.getText().toString());
                        markSeme2=Integer.parseInt(semestertest2.getText().toString());


                        finalmark=(markClass1+markClass2+markSeme1+markSeme2)/4;

                        edtsub3.setVisibility(EditText.VISIBLE);

                        edtsub3.setText(String.valueOf(finalmark));




                    }
                });
                dialog=builder.create();
                dialog.show();



            }
        });

        txtsub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v=AdminUpdate.this.getLayoutInflater().inflate(R.layout.marks,null,false);

                classTest1=(EditText)v.findViewById(R.id.classTest1);
                classtest2=(EditText)v.findViewById(R.id.classtest2);
                semesterTest1=(EditText)v.findViewById(R.id.semesterTest1);
                semestertest2=(EditText)v.findViewById(R.id.semesterTest2);


                dialog=new Dialog(AdminUpdate.this);
                builder= new AlertDialog.Builder(AdminUpdate.this);

                builder.setTitle("Set Marks");
                builder.setView(v);
                builder.setNegativeButton("Cancel",null);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        markClass1=Integer.parseInt(classTest1.getText().toString());
                        markClass2=Integer.parseInt(classtest2.getText().toString());

                        markSeme1=Integer.parseInt(semesterTest1.getText().toString());
                        markSeme2=Integer.parseInt(semestertest2.getText().toString());


                        finalmark=(markClass1+markClass2+markSeme1+markSeme2)/4;

                        edtsub4.setVisibility(EditText.VISIBLE);

                        edtsub4.setText(String.valueOf(finalmark));




                    }
                });
                dialog=builder.create();
                dialog.show();



            }
        });

        txtsub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v=AdminUpdate.this.getLayoutInflater().inflate(R.layout.marks,null,false);

                classTest1=(EditText)v.findViewById(R.id.classTest1);
                classtest2=(EditText)v.findViewById(R.id.classtest2);
                semesterTest1=(EditText)v.findViewById(R.id.semesterTest1);
                semestertest2=(EditText)v.findViewById(R.id.semesterTest2);


                dialog=new Dialog(AdminUpdate.this);
                builder= new AlertDialog.Builder(AdminUpdate.this);

                builder.setTitle("Set Marks");
                builder.setView(v);
                builder.setNegativeButton("Cancel",null);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        markClass1=Integer.parseInt(classTest1.getText().toString());
                        markClass2=Integer.parseInt(classtest2.getText().toString());

                        markSeme1=Integer.parseInt(semesterTest1.getText().toString());
                        markSeme2=Integer.parseInt(semestertest2.getText().toString());


                        finalmark=(markClass1+markClass2+markSeme1+markSeme2)/4;

                        edtsub5.setVisibility(EditText.VISIBLE);

                        edtsub5.setText(String.valueOf(finalmark));




                    }
                });
                dialog=builder.create();
                dialog.show();



            }
        });

        txtsub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v=AdminUpdate.this.getLayoutInflater().inflate(R.layout.marks,null,false);

                classTest1=(EditText)v.findViewById(R.id.classTest1);
                classtest2=(EditText)v.findViewById(R.id.classtest2);
                semesterTest1=(EditText)v.findViewById(R.id.semesterTest1);
                semestertest2=(EditText)v.findViewById(R.id.semesterTest2);


                dialog=new Dialog(AdminUpdate.this);
                builder= new AlertDialog.Builder(AdminUpdate.this);

                builder.setTitle("Set Marks");
                builder.setView(v);
                builder.setNegativeButton("Cancel",null);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        markClass1=Integer.parseInt(classTest1.getText().toString());
                        markClass2=Integer.parseInt(classtest2.getText().toString());

                        markSeme1=Integer.parseInt(semesterTest1.getText().toString());
                        markSeme2=Integer.parseInt(semestertest2.getText().toString());


                        finalmark=(markClass1+markClass2+markSeme1+markSeme2)/4;

                        edtsub6.setVisibility(EditText.VISIBLE);

                        edtsub6.setText(String.valueOf(finalmark));




                    }
                });
                dialog=builder.create();
                dialog.show();



            }
        });




        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminUpdate.this,ViewAll.class);
                startActivity(intent);
            }
        });

        btnfindStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              studentNo=edtStudent.getText().toString();
//
//
//                rcDatabase= new RCDatabase(AdminUpdate.this);
//
//                Cursor  cursor = rcDatabase.getStudent(studentNo);
//
//                cursor.moveToFirst();
//
//                String name=cursor.getString(cursor.getColumnIndex(RCDatabase.COLUMN_NAME));
//
//                txtsub1.setText(name);
//


                rcDatabase= new RCDatabase(AdminUpdate.this);

                data= rcDatabase.getAllStudents();
                Student student;


                for (int i=0;i<data.size();i++)
                {


                    student=data.get(i);

                    if(studentNo.equalsIgnoreCase(student.getStudentNo())){


                        txtsub1.setText(student.getSub1());
                        txtsub2.setText(student.getSub2());
                        txtsub3.setText(student.getSub3());
                        txtsub4.setText(student.getSub4());
                        txtsub5.setText(student.getSub5());
                        txtsub6.setText(student.getSub6());

                        Toast.makeText(AdminUpdate.this,"Click on a subject to update student's marks",Toast.LENGTH_SHORT).show();

                    }


                }








            }
        });

        btnregisterStud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminUpdate.this,SignUp.class);
                startActivity(intent);

            }
        });



    }
}
