package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DB.DB;
import model.classes.Acolhimento;

public class AcolhimentoDao {

    public void inserir(Acolhimento acolhimento) {
        String sql = "INSERT INTO acolhimento (dataAcolhimento, responsavel, detalhes, motivo) VALUES (?, ?, ?, ?)";

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDate(1, new java.sql.Date(acolhimento.getDataAcolhimento().getTime()));
            stmt.setString(2, acolhimento.getResponsavel());
            stmt.setString(3, acolhimento.getDetalhes());
            stmt.setString(4, acolhimento.getMotivo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Acolhimento> listarTodos() {
        String sql = "SELECT * FROM acolhimento";
        List<Acolhimento> acolhimentos = new ArrayList<>();

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Acolhimento acolhimento = new Acolhimento(
                        rs.getDate("dataAcolhimento"),
                        rs.getString("responsavel"),
                        rs.getString("detalhes"),
                        rs.getString("motivo")
                );
                acolhimentos.add(acolhimento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return acolhimentos;
    }
}