import java.util.List;
import java.util.Scanner;

public class Funcionario {
    private String nomeFuncionario;
    private int cpf;
    private int idadeFuncionario;
    private int numTelefone;
    private String cargo;

    public Funcionario(String nomeFuncionario, int cpf, int idadeFuncionario, int numTelefone, String cargo) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpf = cpf;
        this.idadeFuncionario = idadeFuncionario;
        this.numTelefone = numTelefone;
        this.cargo = cargo;
    }

    public Funcionario() {
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdadeFuncionario() {
        return idadeFuncionario;
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void adicionarFuncionario(List<Funcionario> funcionarios, Scanner scanner) {
        System.out.println("Nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("CPF:");
        int cpfFuncionario = scanner.nextInt();

        System.out.println("Idade:");
        int idadeFuncionario = scanner.nextInt();

        System.out.println("Numero de telefone:");
        int numTelefoneFuncionario = scanner.nextInt();

        System.out.println("Cargo do funcionario:");
        String cargoFuncionario = scanner.nextLine();

        funcionarios.add(new Funcionario(nomeFuncionario, cpfFuncionario, idadeFuncionario, numTelefoneFuncionario,
                cargoFuncionario));
    }

    public void removerFuncionario(List<Funcionario> funcionarios, Scanner scanner) {

        System.out.println("Digite o index do funcionário a remover: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        funcionarios.remove(index);
    }

    public void gerenciarSalario(List<Funcionario> funcionarios, Scanner scanner) {
        for (Funcionario f : funcionarios) {
            f.gerenciarSalario(funcionarios, scanner);
        }
    }

    public void procurarFuncionario(List<Funcionario> funcionarios, Scanner scanner) {
        System.out.println("Digite o nome do Funcionario:");
        String buscarNome = scanner.nextLine();

        for (Funcionario f : funcionarios) {
            if (f.getNomeFuncionario().equalsIgnoreCase(buscarNome)) {
                System.out.println("funcionario encontrado!");

                f.toString();

            }
        }
    }

    public void listarFuncionarios(List<Funcionario> funcionarios, Scanner scanner) {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(i + "-" + funcionarios.get(i).toString());
        }
    }

    public void chamarMenu(int botaoPressionado, List<Funcionario> funcionarios, Scanner scanner) {
        switch (botaoPressionado) {
            case 0:
                System.out.println("fim do programa!");
                return;
            case 1:
                adicionarFuncionario(funcionarios, scanner);
                break;
            case 2:
                removerFuncionario(funcionarios, scanner);
                break;
            case 3:
                procurarFuncionario(funcionarios, scanner);
                break;
            case 4:
                listarFuncionarios(funcionarios, scanner);
                break;
            case 5:
                gerenciarSalario(funcionarios, scanner);
                break;

            default:
                System.out.println("Número inválido, tente novamente");
        }
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.println("==========");
        System.out.println("NOME: " + nomeFuncionario);
        System.out.println("CPF: " + cpf);
        System.out.println("IDADE: " + idadeFuncionario);
        System.out.println("NUMERO DE TELEFONE: " + numTelefone);
        System.out.println("CARGO: " + cargo);
        System.out.println("==========");
        System.out.println();
        return super.toString();
    }

}