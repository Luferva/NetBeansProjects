package conta;

import java.time.LocalDate;


public class ContaCorrente extends Conta{
 
    private double taxaMovimentacao;
    
    public ContaCorrente(String numeroConta, Double saldo, LocalDate dataAbertura, Cliente cliente) {
        super(numeroConta, saldo, dataAbertura, cliente);        
        this.taxaMovimentacao = 1.0;
    }
    
    @Override
    public boolean saque(Double valorSaque){
        if ( (valorSaque + this.taxaMovimentacao) <= this.getSaldo()){
        this.setSaldo(this.getSaldo() - valorSaque - this.taxaMovimentacao);
        return true;
        }
        return false;
    }
        
    @Override
    public boolean deposito(Double valorDeposito){
        this.setSaldo(this.getSaldo() + valorDeposito - this.taxaMovimentacao);
        return true;        
    }
    
   
}
