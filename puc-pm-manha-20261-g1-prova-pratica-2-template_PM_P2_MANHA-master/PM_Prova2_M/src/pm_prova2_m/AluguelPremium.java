/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

public class AluguelPremium extends Aluguel{
    
    AluguelPremium(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status){
        super(nomeCliente,quantidadeDias,valorTotal,status);
    }

    @Override
    public void exibirDetalhes() {
       
        System.out.println("Nome Cliente: "+ getNomeCliente()+""
                + "Quantidade Dias alugado: "+getQuantidadeDias()+""
                        + "Valor Total: "+ getValorTotal()+""
                                + "Status Alguel: "+ getStatus()+""
                                        + "Seguro : "+ possuiSeguroIncluso());
                                
        
    }

    @Override
    public boolean possuiSeguroIncluso() {
        System.out.println("Possui Seguro");
        return true;
            }
    
}
