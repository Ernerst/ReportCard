package com.codetribe.reportcard;

import java.io.Serializable;

/**
 * Created by CodeTribe on 2017/07/25.
 */

public class Student /*implements Serializable */{
    private long id;
    private String name;
    private String studentNo;
    private String password;
    private String sub1,sub2,sub3,sub4,sub5,sub6;
    private String mark1, mark2,mark3,mark4,mark5,mark6;






    public Student() {

        super();
    }

    public Student(String mark1, String mark2, String mark3, String mark4, String mark5, String mark6) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
        this.mark6 = mark6;
    }

    public String getMark1() {
        return mark1;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1;
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2;
    }

    public String getMark3() {
        return mark3;
    }

    public void setMark3(String mark3) {
        this.mark3 = mark3;
    }

    public String getMark4() {
        return mark4;
    }

    public void setMark4(String mark4) {
        this.mark4 = mark4;
    }

    public String getMark5() {
        return mark5;
    }

    public void setMark5(String mark5) {
        this.mark5 = mark5;
    }

    public String getMark6() {
        return mark6;
    }

    public void setMark6(String mark6) {
        this.mark6 = mark6;
    }
    //    public Student(long id, String name, int studentNo, String password, String sub1, String sub2, String sub3, String sub4, String sub5, String sub6) {
//        this.id = id;
//        this.name = name;
//        this.studentNo = studentNo;
//        this.password = password;
//        this.sub1 = sub1;
//        this.sub2 = sub2;
//        this.sub3 = sub3;
//        this.sub4 = sub4;
//        this.sub5 = sub5;
//        this.sub6 = sub6;
//    }

    public Student(String name, String studentNo, String password, String sub1, String sub2, String sub3, String sub4, String sub5, String sub6) {
        this.name = name;
        this.studentNo = studentNo;
        this.password = password;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
        this.sub6 = sub6;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }

    public String getSub4() {
        return sub4;
    }

    public void setSub4(String sub4) {
        this.sub4 = sub4;
    }

    public String getSub5() {
        return sub5;
    }

    public void setSub5(String sub5) {
        this.sub5 = sub5;
    }

    public String getSub6() {
        return sub6;
    }

    public void setSub6(String sub6) {
        this.sub6 = sub6;
    }

    @Override
    public String toString() {
        return name+" "+studentNo+
                "\n"+sub1+"="+mark1+
                "\n"+sub2+"="+mark2+
                "\n"+sub3+"="+mark3+
                "\n"+sub4+"="+mark4+
                "\n"+sub5+"="+mark5+
                "\n"+sub6+"="+mark6;
    }
}
