package model.services;

import java.util.List;
import model.classes.Familiar;
import model.dao.FamiliarDao; // (A classe DAO que criamos anteriormente)
import model.exceptions.ValidacaoException;

public class FamiliarService {

    private FamiliarDao dao = new FamiliarDao();

    public List<Familiar> findAll() {
        return dao.listarTodos();
    }

    public void save(Familiar familiar) throws ValidacaoException {
        validate(familiar);
        dao.inserir(familiar);
    }

    private void validate(Familiar familiar) throws ValidacaoException {
        ValidacaoException exception = new ValidacaoException("Erros de validação do Familiar");

        // Regra: Nome do familiar é obrigatório
        if (familiar.getNome() == null || familiar.getNome().trim().isEmpty()) {
            exception.adicionarErro("txtFamiliarNome", "O nome do familiar é obrigatório."); // (Nota: o fx:id "txtFamiliarNome" é uma suposição)
        }

        if (!exception.getErrors().isEmpty()) {
            throw exception;
        }
    }
}