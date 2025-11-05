package model.services;

import java.util.List;
import model.classes.Acolhimento;
import model.dao.AcolhimentoDao; // (A classe DAO que criamos anteriormente)
import model.exceptions.ValidacaoException;

public class AcolhimentoService {

    private AcolhimentoDao dao = new AcolhimentoDao();

    public List<Acolhimento> findAll() {
        return dao.listarTodos();
    }

    public void save(Acolhimento acolhimento) throws ValidacaoException {
        validate(acolhimento);
        dao.inserir(acolhimento);
    }

    private void validate(Acolhimento acolhimento) throws ValidacaoException {
        ValidacaoException exception = new ValidacaoException("Erros de validação do Acolhimento");

        // Regra: Data do acolhimento é obrigatória
        if (acolhimento.getDataAcolhimento() == null) {
            exception.adicionarErro("dateAcolhimentoData", "A data do acolhimento é obrigatória.");
        }

        // Regra: Responsável é obrigatório
        // Baseado no FXML (txtAcolhimentoResponsavel)
        if (acolhimento.getResponsavel() == null || acolhimento.getResponsavel().trim().isEmpty()) {
            exception.adicionarErro("txtAcolhimentoResponsavel", "O responsável pelo acolhimento é obrigatório.");
        }

        if (!exception.getErrors().isEmpty()) {
            throw exception;
        }
    }
}