/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoparalelo;

import controlador.Metodos;
import modelo.Arreglo;

/**
 *
 * @author jais1
 */
public class Algoritmoparalelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        int a = 5, n = 12, m = 167;
        double[][][] numaletorio = new double[5][12][167];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    numaletorio[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        Metodos metodo = new Metodos(numaletorio);
        Arreglo extraerdatos = new Arreglo(1, metodo);
        Arreglo medianio = new Arreglo(2, metodo);
        Arreglo mediames = new Arreglo(3, metodo);
        extraerdatos.start();
        Thread.sleep(1000);
        medianio.start();
        Thread.sleep(2000);
        mediames.start();
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < m; k++) {
//                    System.out.print(numaletorio[i][j][k]+"      ");
//                }
//                
//            }
//            System.out.println("");
//        }
//        Metodos metodo = new Metodos(numaletorio);
//        metodo.extraerdatos();
       
    }

}
