/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1609470
 */
public class AluguelExecutivo extends Aluguel implements Avaliavel {
    private boolean motoristaParticular = true;
    
     AluguelExecutivo(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status, boolean motoristaParticular){
        super(nomeCliente,quantidadeDias,valorTotal,status);
        this.motoristaParticular = motoristaParticular;
    }

    @Override
    public void exibirDetalhes() {
       
        System.out.println("Nome Cliente: "+ getNomeCliente()+""
                + "Quantidade Dias alugado: "+getQuantidadeDias()+""
                        + "Valor Total: "+ getValorTotal()+""
                                + "Status Alguel: "+ getStatus()+""
                                        + "Seguro : "+ possuiSeguroIncluso()+""
                                                + "Motorista Particular: "+possuiSeguroIncluso());
                                
        
    }

    @Override
    public boolean possuiSeguroIncluso() {
        System.out.println("Possui seguro");
        return true;
    }

    @Override
    public void avaliar(int nota) {
        System.out.println("Nota da Locação: "+ nota);
    }
    
    
}
