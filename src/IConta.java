public interface IConta {
    //INTERFACE NÃO PRECISA DE DO PUBLI, POIS É JÁ É PUBLICA. SERIA REDUNDANTE

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}

