/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1609470
 */
public class AluguelBasico extends Aluguel {
    
    private int limite = 100;
    
    public AluguelBasico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status,int limite){
        super(nomeCliente,quantidadeDias,valorTotal,status);
        this.limite = limite;
                }
   @Override
    public void exibirDetalhes() {
       
        System.out.println("Nome Cliente: "+ getNomeCliente()+""
                + "Quantidade Dias alugado: "+getQuantidadeDias()+""
                        + "Valor Total: "+ getValorTotal()+""
                                + "Status Alguel: "+ getStatus()+""
                                        + "Seguro : "+ possuiSeguroIncluso()+""
                                                + "Limite de KM: "+getLimite());
                                
        
    }

    @Override
    public boolean possuiSeguroIncluso() {
        System.out.println("Não possui seguro");
        return false;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    
}
