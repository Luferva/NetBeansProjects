
package conta;

import java.time.LocalDate;

public class Conta {
    private String numeroConta;
    private Double saldo;
    private LocalDate dataAbertura;
    private Cliente cliente;    

    public Conta() {
    }

    public Conta(String numeroConta, Double saldo, LocalDate dataAbertura, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.cliente = cliente;
        
    }

    public boolean deposito(Double valorDeposito){
        setSaldo(getSaldo() + valorDeposito);
        return true;
    }
    
    public boolean saque(Double valorSaque) {
        if (valorSaque <= getSaldo()){
          setSaldo(getSaldo() - valorSaque);  
           return true;
        }
        return false;
    }
    
    public boolean transferencia(Conta contaOrigem, Conta contaDestino, Double valorTransferencia){
        if (valorTransferencia <= contaOrigem.getSaldo()) {
        contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferencia);
        contaOrigem.setSaldo(contaOrigem.getSaldo() - valorTransferencia);
        return true;
        } 
        return false;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
