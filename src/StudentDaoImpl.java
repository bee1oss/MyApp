
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author begah
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDaoImpl implements StudentsDao{

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    @Override
    public void createStudentTable(String name,String surname,String email) {
        String query1 = "Insert Into student_basic_info(name,surname,email) VALUES(?,?,?)";
    try{
           preparedStatement = con.prepareStatement(query1);
           
           
           preparedStatement.setString(1, name);
           preparedStatement.setString(2, surname);
           preparedStatement.setString(3, email);

           preparedStatement.executeUpdate();
           
       }catch(SQLException ex){
           Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE,null,ex);
       }        
    }

    @Override
    public ArrayList<Students> selectAll() {
        ArrayList<Students> output = new ArrayList<>();
        try{
            statement = con.createStatement();
            String query = "SELECT * FROM student_basic_info";
            
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String create_date = rs.getDate("create_time").toString();
                
                
                output.add(new Students(id,name,surname,email,create_date));
            }
            return output;
        }catch(SQLException ex){
            
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Students students, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public StudentDaoImpl() {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_name;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Driver Bulunamadi...");
        }
        try{
            con = DriverManager.getConnection(url,Database.username,Database.password);
            System.out.println("sql.Baglanti Basarili...");
        }
        catch(SQLException e){
            System.out.println("sql.Baglanti Basarisiz...");
        }
    }
    
    
    
}
