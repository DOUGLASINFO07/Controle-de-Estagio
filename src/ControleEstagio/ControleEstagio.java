
package ControleEstagio;

import java.sql.Connection;
import java.sql.DriverManager;

public class ControleEstagio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/estagio","root","root");
        }catch(Exception e){
            System.out.println("Erro");
        }
        
        Login login = new Login(conn);
        login.setVisible(true);
        login.setTitle("Login");
        
    }
}
