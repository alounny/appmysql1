package com.aln.appmysql;
import java.sql.*;
public class modelemployee implements ActionDB {
    private String empid;
    private String empname;
    private String empemail;
    private int salary;
    Connection c;

    public modelemployee(Connection c) {
        this.c = c;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public ResultSet selectData() throws Exception {
        String sql="select * from employee";
        ResultSet rs =c.createStatement().executeQuery(sql);
        return rs;
    }

    @Override
    public int insertData() throws Exception {
        String sql="insert into employee values(?,?,?,?)";
        PreparedStatement stm =c.prepareStatement(sql);
        stm.setString(1,empid);
        stm.setString(2,empname);
        stm.setString(3,empemail);
        stm.setInt(4,salary);
        int r =stm.executeUpdate();

        return r;
    }

    @Override
    public int UpdateData() throws Exception {
        return 0;
    }

    @Override
    public int DeleteData() throws Exception {
        return 0;
    }
}
