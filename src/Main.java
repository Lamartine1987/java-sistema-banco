public class Main {
    public static void main(String[] args) {
        Cliente lamartine = new Cliente();
        lamartine.setNome("Lamartine Cezar");

        Conta ccorrente = new ContaCorrente(lamartine);
        //DEPOSITANDO 100,00 NA CONTA CORRENTE
        ccorrente.depositar(100);

        Conta cpoupanca = new ContaPoupança(lamartine);

        //TRANSFERINDO 100 PARA CONTA POUPANÇA
        ccorrente.transferir(100, cpoupanca);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();
    }
}
