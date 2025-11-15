package model.services;

import java.util.List;
import model.DB.DB;
import model.classes.Pessoa;
import model.dao.PessoaDao;
import model.dao.PrincipalDao;

public class PessoaService {
    private PessoaDao dao = new PessoaDao(DB.getConnection());

    public List<Pessoa> getAll() {
        return dao.getAll();
    }
//
//    public boolean inserir(Espacos espaco) {
//        return dao.inserir(espaco);
//    }
//
//    public boolean editar(Espacos espaco) {
//        return dao.editar(espaco);
//    }
//
//    public boolean excluir(Espacos espaco) {
//        return dao.excluir(espaco);
//    }
}