package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DB.DB;
import model.classes.Familiar;

public class FamiliarDao {

    public void inserir(Familiar familiar) {
        String sql = "INSERT INTO familiar (nome, parentesco, idade, ocupacao) VALUES (?, ?, ?, ?)";

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, familiar.getNome());
            stmt.setString(2, familiar.getParentesco());
            stmt.setInt(3, familiar.getIdade());
            stmt.setString(4, familiar.getOcupacao());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Familiar> listarTodos() {
        String sql = "SELECT * FROM familiar";
        List<Familiar> familiares = new ArrayList<>();

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Familiar familiar = new Familiar(
                        rs.getString("nome"),
                        rs.getString("parentesco"),
                        rs.getInt("idade"),
                        rs.getString("ocupacao")
                );
                familiares.add(familiar);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return familiares;
    }
}