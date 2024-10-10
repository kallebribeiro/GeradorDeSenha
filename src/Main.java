import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    // Conjunto de caracteres para gerar a senha
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input do utilizador para o número de caracteres da senha
        System.out.println("Digite o número de caracteres: ");
        int tamanhoDaSenha = scanner.nextInt();

        // Gerar a senha
        String senhaGerada = gerarSenha(tamanhoDaSenha);

        // Exibir a senha gerada
        System.out.println("Senha gerada: " + senhaGerada);
    }

    // Método para gerar a senha
    public static String gerarSenha(int tamanhoDaSenha) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // Laço para gerar cada caractere da senha
        for (int i = 0; i < tamanhoDaSenha; i++) {
            int index = secureRandom.nextInt(CARACTERES.length());
            sb.append(CARACTERES.charAt(index));
        }

        return sb.toString();  // Retorna a senha gerada
    }
}
