package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidacaoException extends RuntimeException {

    private Map<String, String> errors = new HashMap<>();

    public ValidacaoException(String msg) {
        super(msg);
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void adicionarErro(String campo, String mensagem) {
        errors.put(campo, mensagem);
    }

}
