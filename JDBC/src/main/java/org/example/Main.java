package org.example;
import java.sql.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        /*
        * import sql package
        *  load and register
        * create connection
        * create statement
        * execute statement
        * process result
        * close
        * */
        String url = "jdbc:postgresql://localhost:5432/College";
        String user = "postgres";
        String password = "8941";
        String sql = "select * from student";

        Class.forName("org.postgresql.Driver");  // optional
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established");

        Statement st = con.createStatement();

        // Read operation
//        ResultSet rs = st.executeQuery(sql);
////        rs.next(); // to point first row, initially it not
////        String result = rs.getString("student_name");  // or can be number instead of column name
//
//        while (rs.next()){
//            System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//        }

//        String sql2 = "insert into student values(5,'Lei',90)";
//        st.execute(sql2);


//        String sql3 = "update student set student_name='Jin' where student_id=5";
//        st.execute(sql3);

        String sql4 = "delete from student where student_id=5";
        st.execute(sql4);

        System.out.println("Connection closed");

    }
}