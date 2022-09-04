package conta;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numeroConta, Double saldo, LocalDate dataAbertura, Cliente cliente) {
        super(numeroConta, saldo, dataAbertura, cliente);
    }
    
}
