/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;


public class Carro extends Veiculo implements Avaliavel{
    private int quantidadePortas;
    
    
    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status, int quantidadePortas, int nota) {
        super(placa,modelo,anoFabricacao,valorDiaria,quilometragem,status);
        this.quantidadePortas = quantidadePortas;
        
       
    }

      @Override
    public void avaliar(int nota) {
        System.out.println("Nota:"+nota);
    }
    
    
     @Override
    public void exibirDetalhes() {
       System.out.println("Placa:"+getPlaca()+""
               + "Modelo"+getModelo()+""
                       + "Ano:"+getAnoFabricacao()+""
                               + "Valor da Diaria: "+getValorDiaria()+""
                                       + "Quilometragem: "+getQuilometragem()+""
                                               + "Quantidade de Portas:"+getQuantidadePortas());
    }

   @Override
    public boolean possuiSeguroEspecial() {
        System.out.println("Não");
        return false;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

        

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
    
    
}
