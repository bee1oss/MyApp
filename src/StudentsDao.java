
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author begah
 */
public interface StudentsDao {
    void createStudentTable(String name,String surname,String email);
        
    ArrayList<Students> selectAll();
    
    void delete(int id);
    
    void update(Students students,int id);
    
    
}
