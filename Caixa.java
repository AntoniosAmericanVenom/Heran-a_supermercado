public class Caixa extends Funcionario {
private int salarioCaixa;

public Caixa(){
    super(nomeFuncionario,  cpf,  idadeFuncionario,  numTelefone);
    this.salarioCaixa = salarioCaixa;
}

public int getSalarioCaixa() {
    return salarioCaixa;
}

public void setSalarioCaixa(int salarioCaixa) {
    this.salarioCaixa = salarioCaixa;
}  

}