/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

import java.util.ArrayList;

/**
 *
 * @author glbra
 */
public abstract class Aluguel {

    private String nomeCliente;
    private int quantidadeDias;
    private double valorTotal;
    private StatusAluguel status;
    
    ArrayList<Veiculo> veiculosDisponiveis = new ArrayList<>();
     ArrayList<Aluguel> alugueisDisponiveis = new ArrayList<>();
     ArrayList<Aluguel> tiposAlugueis = new ArrayList<>();
    // public Van(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status, int passageirosMAX)

    public Aluguel(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {

        this.nomeCliente = nomeCliente;
        this.quantidadeDias = quantidadeDias;
        this.valorTotal = valorTotal;
        this.status = status;
        
    }
    
    public void adicionaAlguel(Aluguel a){
        tiposAlugueis.add(new AluguelBasico());
        tiposAlugueis.add(new AluguelExecutivo());
        tiposAlugueis.add(new AluguelPremium());
    }
    
    public void alugarVeiculo(Veiculo veiculo){
        veiculosDisponiveis.add(veiculo);
        veiculosDisponiveis.setStatus(StatusVeiculo.DISPONIVEL);
    }
    
    public void alugueisCadastrados(){
        for(Aluguel aluguel: alugueisDisponiveis ){
            System.out.println(aluguel);
        }
    }
    
    

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusAluguel getStatus() {
        return status;
    }

    public void setStatus(StatusAluguel status) {
        this.status = status;
    }

    public abstract void exibirDetalhes();

    public abstract boolean possuiSeguroIncluso();
    
}
