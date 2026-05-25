/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_prova2_m;

import java.util.ArrayList;

/**
 *
 * @author glbra
 */
public class PM_Prova2_M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Veiculo> veiculosLista = new ArrayList<>();
         ArrayList<Aluguel> AlguelLista = new ArrayList<>();
         
                Carro carro1 = new Carro(
                    "AAA-1111",
                    "Civic",
                    2020,
                    250,
                    50000,
                    StatusVeiculo.DISPONIVEL,
                    4
       );
                Moto moto1 = new Moto(
                    "BBB-2222",
                    "XRE 300",
                    2022,
                    120,
                    15000,
                    StatusVeiculo.DISPONIVEL,
                    300
                    );
                
                Van van1 = new Van(
                    "CCC-3333",
                    "Sprinter",
                    2021,
                    450,
                    80000,
                    StatusVeiculo.MANUTENCAO,
                    15
                    );
                veiculosLista.add(carro1);
                veiculosLista.add(moto1);
                veiculosLista.add(van1);
                
                AluguelBasico aluguel1 = new AluguelBasico();
                AluguelExecutivo aluguel2 = new AluguelExecutivo();

                AlguelLista.add(aluguel1);
                AlguelLista.add(aluguel2);
        
        
    }
    
}
