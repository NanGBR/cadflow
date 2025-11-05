package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.DB.DB;
import model.classes.Acolhido;

public class AcolhidoDao {

    public void inserir(Acolhido acolhido) {
        String sql = "INSERT INTO acolhido (nome, dataNascimento, sexo, cor, planoDeAcao, infoSaude) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, acolhido.getNome());
            stmt.setDate(2, new java.sql.Date(acolhido.getDataNascimento().getTime()));
            stmt.setString(3, String.valueOf(acolhido.getSexo()));
            stmt.setString(4, acolhido.getCor());
            stmt.setString(5, acolhido.getPlanoDeAcao());
            stmt.setString(6, acolhido.getInfoSaude());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        acolhido.setIdAcolhido(rs.getInt(1));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Acolhido buscarPorId(int id) {
        String sql = "SELECT * FROM acolhido WHERE idAcolhido = ?";
        Acolhido acolhido = null;

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    acolhido = new Acolhido(
                            rs.getInt("idAcolhido"),
                            rs.getString("nome"),
                            rs.getDate("dataNascimento"),
                            rs.getString("sexo").charAt(0),
                            rs.getString("cor"),
                            rs.getString("planoDeAcao"),
                            rs.getString("infoSaude")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return acolhido;
    }

    public List<Acolhido> listarTodos() {
        String sql = "SELECT * FROM acolhido";
        List<Acolhido> acolhidos = new ArrayList<>();

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Acolhido acolhido = new Acolhido(
                        rs.getInt("idAcolhido"),
                        rs.getString("nome"),
                        rs.getDate("dataNascimento"),
                        rs.getString("sexo").charAt(0),
                        rs.getString("cor"),
                        rs.getString("planoDeAcao"),
                        rs.getString("infoSaude")
                );
                acolhidos.add(acolhido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return acolhidos;
    }

    public void atualizar(Acolhido acolhido) {
        String sql = "UPDATE acolhido SET nome = ?, dataNascimento = ?, sexo = ?, cor = ?, planoDeAcao = ?, infoSaude = ? WHERE idAcolhido = ?";

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, acolhido.getNome());
            stmt.setDate(2, new java.sql.Date(acolhido.getDataNascimento().getTime()));
            stmt.setString(3, String.valueOf(acolhido.getSexo()));
            stmt.setString(4, acolhido.getCor());
            stmt.setString(5, acolhido.getPlanoDeAcao());
            stmt.setString(6, acolhido.getInfoSaude());
            stmt.setInt(7, acolhido.getIdAcolhido());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM acolhido WHERE idAcolhido = ?";

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}