package com.codetribe.reportcard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeTribe on 2017/07/25.
 */

public class RCDatabase extends SQLiteOpenHelper {

    private final static String DATABABE_NAME="report.db";

    private final static String TABLE_NAME="reportcard";
    private final static String COLUMN_ID="id";
    public final static String COLUMN_NAME="name";
    public final static String COLUMN_STUDNO="studno";
    public final static String COLUMN_PASSWORD="password";
    public final static String COLUMN_SUB1="sub1";
    public final static String COLUMN_SUB2="sub2";
    public final static String COLUMN_SUB3="sub3";
    public final static String COLUMN_SUB4="sub4";
    public final static String COLUMN_SUB5="sub5";
    public final static String COLUMN_SUB6="sub6";



    private final static String TABLE_NAME_MARK="reportmarkscard";
    private final static String COLUMN_MARK_ID="id";
    public final static String COLUMN_MARK1="sub6";
    public final static String COLUMN_MARK2="sub6";
    public final static String COLUMN_MARK3="sub6";
    public final static String COLUMN_MARK4="sub6";
    public final static String COLUMN_MARK5="sub6";
    public final static String COLUMN_MARK6="sub6";



    private  final static String DATABASE_CREATE="create table " +TABLE_NAME +"("
                                                +COLUMN_ID+ " integer primary key autoincrement,"
                                                +COLUMN_NAME+  " text,"
                                                +COLUMN_STUDNO+ " text,"
                                                +COLUMN_PASSWORD+ " text,"
                                                +COLUMN_SUB1+ " text,"
                                                +COLUMN_SUB2+ " text,"
                                                +COLUMN_SUB3+ " text,"
                                                +COLUMN_SUB4+ " text,"
                                                +COLUMN_SUB5+ " text,"
                                                +COLUMN_SUB6+ " text,"
                                                +COLUMN_MARK_ID+ " integer);";

    private  final static String DATABASE_CREATE_MARK="create table " +TABLE_NAME_MARK +"("
                                                +COLUMN_MARK_ID+ " integer primary key autoincrement,"
                                                +COLUMN_MARK1+  " text,"
                                                +COLUMN_MARK2+ " text,"
                                                +COLUMN_MARK3+ " text,"
                                                +COLUMN_MARK4+ " text,"
                                                +COLUMN_MARK5+ " text,"
                                                +COLUMN_MARK6+ " text);";




    public RCDatabase(Context context) {
        super(context, DATABABE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DATABASE_CREATE);
        db.execSQL(DATABASE_CREATE_MARK);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" +TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS" +TABLE_NAME_MARK);
        onCreate(db);
    }


    public void AddStudent(Student student)
    {

        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues cv= new ContentValues();

        cv.put(COLUMN_NAME,student.getName());
        cv.put(COLUMN_STUDNO,student.getStudentNo());
        cv.put(COLUMN_PASSWORD,student.getPassword());
        cv.put(COLUMN_SUB1,student.getSub1());
        cv.put(COLUMN_SUB2,student.getSub2());
        cv.put(COLUMN_SUB3,student.getSub3());
        cv.put(COLUMN_SUB4,student.getSub4());
        cv.put(COLUMN_SUB5,student.getSub5());
        cv.put(COLUMN_SUB6,student.getSub6());
        cv.put(COLUMN_MARK_ID,student.getId());

        db.insert(TABLE_NAME,null,cv);


    }

    public void AddMarks(Student student)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();

        cv.put(COLUMN_MARK1,student.getMark1());
        cv.put(COLUMN_MARK2,student.getMark1());
        cv.put(COLUMN_MARK3,student.getMark1());
        cv.put(COLUMN_MARK4,student.getMark1());
        cv.put(COLUMN_MARK5,student.getMark1());
        cv.put(COLUMN_MARK6,student.getMark1());
        db.insert(TABLE_NAME_MARK,null,cv);


    }

    public ArrayList<Student> getAllStudents()
    {
        ArrayList<Student> students= new ArrayList<Student>();
        String query="select * from "+ TABLE_NAME;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery(query,null);

        if(cursor.moveToFirst())
        {
            do{

                Student student= new Student();
                student.setId(Integer.parseInt(cursor.getString(0)));
                student.setName(cursor.getString(1));
                student.setStudentNo(cursor.getString(2));
                student.setPassword(cursor.getString(3));
                student.setSub1(cursor.getString(4));
                student.setSub2(cursor.getString(5));
                student.setSub3(cursor.getString(6));
                student.setSub4(cursor.getString(7));
                student.setSub5(cursor.getString(8));
                student.setSub6(cursor.getString(9));


                students.add(student);

            }while (cursor.moveToNext());

        }



        return students;
    }

    public  boolean upadateStudent(Integer id,String sub1,String sub2,String sub3,String sub4,String sub5,String sub6)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues cv= new ContentValues();

        cv.put(COLUMN_SUB1,sub1);
        cv.put(COLUMN_SUB1,sub1);
        cv.put(COLUMN_SUB1,sub1);
        cv.put(COLUMN_SUB1,sub1);
        cv.put(COLUMN_SUB1,sub1);
        cv.put(COLUMN_SUB1,sub1);
        cv.put(COLUMN_SUB1,sub1);

        db.update(TABLE_NAME,cv,"id=?",new String[]{
                Integer.toString(id)
        });
        return true;
    }

    public Integer deleteStudent(Integer id)
    {

        SQLiteDatabase db=this.getWritableDatabase();

        return db.delete(TABLE_NAME,"id=?",new String[]{Integer.toString(id)});
    }

    public Cursor getStudent(String studentNo)
    {
        SQLiteDatabase db= this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from "+TABLE_NAME+" where "+COLUMN_STUDNO+"="+studentNo+"",null);


        return cursor;
    }









}
