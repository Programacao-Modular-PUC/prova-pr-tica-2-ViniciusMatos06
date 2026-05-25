
package pm_prova2_m;

public class Van extends Veiculo implements Avaliavel, Inspecionavel {
    private int passageirosMAX;

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status, int passageirosMAX){
        super(placa,modelo,anoFabricacao,valorDiaria,quilometragem,status);
        this.passageirosMAX = passageirosMAX;
    }
    
    @Override
    public void avaliar(int nota) {
        System.out.println("Nota:"+nota);
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
                                               + "Capacidade de passageiros:"+getPassageirosMAX());
    }

    @Override
    public boolean possuiSeguroEspecial() {
        System.out.println("Não");
        return false;
    }

    public int getPassageirosMAX() {
        return passageirosMAX;
    }


    public void setPassageirosMAX(int passageirosMAX) {
        this.passageirosMAX = passageirosMAX;
    }
    
    
}
