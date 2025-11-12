package model.services; 

import model.DB.DB; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

public class LoginService {

    //Valida as credenciais do usuário contra o banco de dados.

    public boolean validateUser(String nome, String senha) throws SQLException {
        
        String sql = "SELECT senha FROM profissional WHERE nome = ?";
        
        String storedHash = null;

        try (Connection conn = DB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nome);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                
                if (rs.next()) {
                    storedHash = rs.getString("senha");
                } else {
                    return false;
                }
            }
        }
        return BCrypt.checkpw(senha, storedHash);
    }
}