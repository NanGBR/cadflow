package model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.DB.DB;
import model.classes.Pessoa;

public class PrincipalDao {
    
    private Connection con;
    
    public List<Pessoa> getAll() {
        List<Pessoa> list = new ArrayList<>();
        ResultSet res = null;
        PreparedStatement stmt = null;
        try {
            String sql = "select * from pessoa";
            stmt = con.prepareStatement(sql);

            res = stmt.executeQuery();
            while (res.next()) {
                Pessoa pessoa = new Pessoa(res.getInt("pk_cod_pessoa"),
                        res.getString("nome_completo"),
                        res.getInt("acolhido"));
                System.out.println(pessoa);
                list.add(pessoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(res);
            DB.closeStatement(stmt);
            return list;
        }
    }
}
