
package pm_prova2_m;

public class Moto extends Veiculo implements Inspecionavel {
    private int cilindradas;
  public Moto(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status, int quantidadePortas, int nota,int cilindradas) {
        super(placa,modelo,anoFabricacao,valorDiaria,quilometragem,status);
        this.cilindradas = cilindradas;
  }
    

    @Override
    public void realizarInspecao() {
        System.out.println("Realizando inspeção...");
    }
    

    @Override
    public void exibirDetalhes() {
       System.out.println("Placa:"+getPlaca()+""
               + "Modelo"+getModelo()+""
                       + "Ano:"+getAnoFabricacao()+""
                               + "Valor da Diaria: "+getValorDiaria()+""
                                       + "Quilometragem: "+getQuilometragem()+""
                                               + "Cilindradas:"+getCilindradas());
    }

    
    @Override
    public boolean possuiSeguroEspecial() {
        System.out.println("Não");
        return false;
    }


    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
}
