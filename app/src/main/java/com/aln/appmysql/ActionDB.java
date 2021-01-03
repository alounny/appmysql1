package com.aln.appmysql;

import java.sql.ResultSet;

public interface ActionDB {
    public ResultSet selectData() throws Exception;
    public int insertData() throws Exception;
    public int UpdateData() throws Exception;
    public int DeleteData() throws Exception;
}
