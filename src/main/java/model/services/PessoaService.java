package model.services;

import java.util.List;
import model.DB.DB;
import model.dao.PrincipalDao;

public class PessoaService {
    private PrincipalDao dao = new PrincipalDao(DB.getConnection());
    
    public List<Pessoa> getAll() {
        return dao.getAll();
    }

    public boolean inserir(Espacos espaco) {
        return dao.inserir(espaco);
    }

    public boolean editar(Espacos espaco) {
        return dao.editar(espaco);
    }

    public boolean excluir(Espacos espaco) {
        return dao.excluir(espaco);
    }
}