public class Conta {
    int numero;

    String titular;
    double saldo;

    private static int totalDeContas;

    Conta(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
    
}
