package model.services;

import java.util.List;
import model.classes.Acolhido;
import model.dao.AcolhidoDao; // (A classe DAO que criamos anteriormente)
import model.exceptions.ValidacaoException;

public class AcolhidoService {

    private AcolhidoDao dao = new AcolhidoDao();

    /**
     * Busca todos os acolhidos no banco de dados.
     * Chamado pela tela principal para preencher a tabela.
     * @return Lista de todos os Acolhidos
     */
    public List<Acolhido> findAll() {
        return dao.listarTodos();
    }

    /**
     * Busca um acolhido específico pelo seu ID.
     * @param id O ID do acolhido a ser buscado
     * @return O objeto Acolhido encontrado ou null
     */
    public Acolhido findById(int id) {
        return dao.buscarPorId(id);
    }
    
    /**
     * Salva ou atualiza um acolhido no banco de dados.
     * Este método decide se deve inserir um novo registro ou atualizar um existente.
     * @param acolhido O objeto Acolhido a ser salvo
     * @throws ValidacaoException Se algum campo obrigatório não for preenchido
     */
    public void save(Acolhido acolhido) throws ValidacaoException {
        // 1. Executa as validações
        validate(acolhido);

        // 2. Decide se é um novo registro (inserir) ou um registro existente (atualizar)
        if (acolhido.getIdAcolhido() == 0) { // Assumindo que 0 significa novo
            dao.inserir(acolhido);
        } else {
            dao.atualizar(acolhido);
        }
    }

    /**
     * Remove um acolhido do banco de dados com base no ID.
     * @param id O ID do acolhido a ser removido
     */
    public void remove(int id) {
        dao.deletar(id);
    }

    /**
     * Método privado para centralizar toda a lógica de validação do Acolhido.
     * Lança uma ValidacaoException se uma regra de negócio for violada.
     * @param acolhido O objeto Acolhido a ser validado
     */
    private void validate(Acolhido acolhido) throws ValidacaoException {
        ValidacaoException exception = new ValidacaoException("Erros de validação");

        // Regra 1: Nome não pode ser vazio
        if (acolhido.getNome() == null || acolhido.getNome().trim().isEmpty()) {
            // O nome do campo ("nome") deve ser o mesmo usado no seu FXML (fx:id) 
            // ou um nome genérico para o controller identificar.
            exception.adicionarErro("txtDadosNome", "O nome completo é obrigatório.");
        }

        // Regra 2: Data de nascimento não pode ser nula
        if (acolhido.getDataNascimento() == null) {
            exception.adicionarErro("dateDadosNascimento", "A data de nascimento é obrigatória.");
        }
        
        // Adicione mais regras aqui...
        // Ex: if (acolhido.getCor() == null || acolhido.getCor().trim().isEmpty()) {
        //     exception.adicionarErro("txtDadosCor", "A cor é obrigatória.");
        // }

        // Se houver algum erro na lista, lança a exceção
        if (!exception.getErrors().isEmpty()) {
            throw exception;
        }
    }
}