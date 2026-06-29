import java.util.List;
import java.util.Scanner;

public class Funcionario {
private String nomeFuncionario;
private int cpf;
private int idadeFuncionario;
private int numTelefone;

//construtor vazio
public Funcionario() {
}

//getters e setters
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

//metodo 1
public void adicionarFuncionario(List funcionarios,Scanner scanner){
if(funcionarios.size() < 10){
System.out.println("Nome do funcionário:");
String nomeFuncionario = scanner.nextLine();

String cargoFuncionario = scanner.nextLine();
funcionarios.add(new Funcionario());
}else{
    System.out.println("Máximo de vagas atendidas");
}
}

//metodo 2
public void removerFuncionario(List funcionarios,Scanner scanner){
    if(!funcionarios.isEmpty())
listarFuncionarios(List funcionarios);

System.out.println("Digite funcionário a remover: ");
int index = scanner.nextInt();
scanner.nextLine();

if(index >= 0 && index < funcionarios.size()){
    funcionarios.remove(index);
    System.out.println("Funcionario Removido!");
}else if (true) {
    System.out.println("Indice inválido, tente novamente");
}else{
    System.out.println("Não há funcionários na lista, tente cadastrar");
}
}

//metodo 3
public void gerenciarSalario(ArrayList funcionarios,Scanner scanner){
if(!funcionarios.isEmpty()){
    for(Funcionario f: funcionarios){
        f.gerenciarSalario(funcionarios, scanner);
    }
} else{
    System.out.println("Não há funcionarios na lista, tente cadastrar");
}
}


//metodo 4 
public void procurarFuncionario(ArrayList funcionarios,Scanner scanner){
if(!funcionarios.isEmpty()){
System.out.println("Digite o nome do Funcionario:");
String buscarNome = scanner.nextLine();

boolean encontrado = false;

for (Funcionario f: funcionarios){
    if (f.getNomeFuncionario().equalsIgnoreCase(buscarNome)){
        System.out.println(f);
        encontrado = true;
    }
}
if(!encontrado){
    System.out.println("Funcionario não encontrado");
}
}else{
    System.out.println("Não há funcionários na lista, tente cadastrar");
}
}

//metodo 5
public void listarFuncionarios(List funcionarios,Scanner scanner){
if(!funcionarios.isEmpty()){
for(int i = 0; i < funcionarios.size(); i++)
System.out.println(i + "-" + funcionarios.get(i));
}else{
 System.out.println("Não há funcionários na lista, tente cadastrar");   
}
}

public void chamarMenu(int botaoPressionado, List funcionarios, Scanner scanner){
switch (botaoPressionado) {
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




}