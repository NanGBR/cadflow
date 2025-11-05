package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DB.DB;
import model.classes.PlanoAcao;

public class PlanoAcaoDao {

    public void inserir(PlanoAcao planoAcao) {
        String sql = "INSERT INTO plano_acao (objetivo, acoes, responsavel, prazoInicio, prazoFim, status) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, planoAcao.getObjetivo());
            stmt.setString(2, planoAcao.getAcoes());
            stmt.setString(3, planoAcao.getResponsavel());
            stmt.setDate(4, new java.sql.Date(planoAcao.getPrazoInicio().getTime()));
            stmt.setDate(5, new java.sql.Date(planoAcao.getPrazoFim().getTime()));
            stmt.setString(6, planoAcao.getStatus());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<PlanoAcao> listarTodos() {
        String sql = "SELECT * FROM plano_acao";
        List<PlanoAcao> planosAcao = new ArrayList<>();

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                PlanoAcao planoAcao = new PlanoAcao(
                        rs.getString("objetivo"),
                        rs.getString("acoes"),
                        rs.getString("responsavel"),
                        rs.getDate("prazoInicio"),
                        rs.getDate("prazoFim"),
                        rs.getString("status")
                );
                planosAcao.add(planoAcao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return planosAcao;
    }
}