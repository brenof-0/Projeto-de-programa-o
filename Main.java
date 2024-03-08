public class Main {
    public static void main(String[] args){
        Conta c2 = new Conta("Francisco", 2325);
        Conta c3 = new Conta("Glevson", 2425);
        Conta c4 = new Conta("Maria", 2323);
        int total = Conta.getTotalDeContas();
        System.out.println("O total de contas é: "+ total);

        System.out.println("Nome titular C02: "+ c2.titular);
        System.out.println("Nome titular C03: "+ c3.titular);
        System.out.println("Nome titular C04: "+ c4.titular);
    }
}



