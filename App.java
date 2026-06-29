import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int botaoPressionado;

        System.out.println("=====MENU=====");
        System.out.println("    ");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Excluir");
        System.out.println("3 - Buscar");
        System.out.println("4 - Listar");
        System.out.println("5 - Gerenciar");
        System.out.println("0 - Sair");
        System.out.println("    ");
        System.out.println("Escolha uma opção: ");

        botaoPressionado = scanner.nextInt();
        scanner.nextLine();
        Funcionario funcionario = new Funcionario();

        funcionario.chamarMenu(botaoPressionado, funcionarios, scanner);

    }

}