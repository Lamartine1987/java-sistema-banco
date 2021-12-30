public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato da conta poupança === ");
        System.out.println(String.format("Titular da conta: %s", super.cliente.getNome()));
        System.out.println(String.format("Agência: %d", super.agencia));
        System.out.println(String.format("Conta: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }
}
