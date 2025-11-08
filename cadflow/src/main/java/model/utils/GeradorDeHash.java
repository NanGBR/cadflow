package model.utils;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Esta é uma classe utilitária.
 * Clique com o botão direito nela e escolha "Run File" (Executar Arquivo)
 * para gerar um hash de senha no console.
 */
public class GeradorDeHash {

    public static void main(String[] args) {
        
        // --- Defina a senha que você quer ---
        String senhaTextoPuro = "admin123"; 
        
        // 3. O código que gera o hash
        String hashParaSalvar = BCrypt.hashpw(senhaTextoPuro, BCrypt.gensalt());

        // 4. Imprime o resultado no console
        System.out.println("--- GERADOR DE HASH ---");
        System.out.println("Senha: " + senhaTextoPuro);
        System.out.println("HASH (copie isso para o banco):");
        System.out.println(hashParaSalvar);
        System.out.println("-------------------------");
    }
}
