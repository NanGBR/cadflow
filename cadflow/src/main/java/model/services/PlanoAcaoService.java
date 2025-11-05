package model.services;

import java.util.List;
import model.classes.PlanoAcao;
import model.dao.PlanoAcaoDao; // (A classe DAO que criamos anteriormente)
import model.exceptions.ValidacaoException;

public class PlanoAcaoService {

    private PlanoAcaoDao dao = new PlanoAcaoDao();

    public List<PlanoAcao> findAll() {
        return dao.listarTodos();
    }

    /**
     * Salva um novo plano de ação.
     * @param planoAcao O objeto PlanoAcao a ser salvo
     * @throws ValidacaoException Se o objetivo estiver vazio
     */
    public void save(PlanoAcao planoAcao) throws ValidacaoException {
        validate(planoAcao);
        dao.inserir(planoAcao);
    }

    private void validate(PlanoAcao planoAcao) throws ValidacaoException {
        ValidacaoException exception = new ValidacaoException("Erros de validação do Plano de Ação");

        // Regra: Objetivo não pode ser vazio
        // Baseado no seu FXML (txtPlanoObjetivo)
        if (planoAcao.getObjetivo() == null || planoAcao.getObjetivo().trim().isEmpty()) {
            exception.adicionarErro("txtPlanoObjetivo", "O objetivo do plano de ação é obrigatório.");
        }

        if (!exception.getErrors().isEmpty()) {
            throw exception;
        }
    }
}