public class Repositor extends Funcionario {
private int salarioRepositor;

public Repositor(){
    super(nomeFuncionario, cpf, idadeFuncionario, numTelefone);
    this.salarioRepositor = salarioRepositor;
}

public int getSalarioRepositor() {
    return salarioRepositor;
}

public void setSalarioRepositor(int salarioRepositor) {
    this.salarioRepositor = salarioRepositor;
}

}