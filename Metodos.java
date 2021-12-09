/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Arreglo;

/**
 *
 * @author jais1
 */
public class Metodos {

    int filas = 12;//cantidad de meses
    int columanio = 167;//cantidad de datos, del total 10020(datos), divido entre 12 meses y esto divido para los 5 anios
    int anio = 5;//numero de anios
    boolean semaforo = false;
    private double[][][] matriz = new double[anio][filas][columanio];
    private double[][] matriz1 = new double[filas][columanio];
    private double[][] matriz2 = new double[filas][columanio];
    private double[][] matriz3 = new double[filas][columanio];
    private double[][] matriz4 = new double[filas][columanio];
    private double[][] matriz5 = new double[filas][columanio];

    public Metodos(double[][][] matriz) {
        this.matriz = matriz;
    }

    public double[][][] getMatriz() {
        return matriz;
    }

    public void setMatriz(double[][][] matriz) {
        this.matriz = matriz;
    }

    /*public void numaleatorios() {
        for (int i = 0; i <filas; i++) {
            for (int j = 0; j <columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
     */
 /*public void extraerdatos() throws InterruptedException {
        while (semaforo = true) {
            for (int i = 0; i < filas; i++) {
                int n = 0;
                int datos = 0;
                for (int j = 0; j < columnas; j++) {
                    if (n == 0) {
                        matriz1[i][datos] = matriz[i][j];
                        datos++;
                    } else if (n == 1) {
                        matriz2[i][datos] = matriz[i][j];
                        datos++;
                    } else if (n == 2) {
                        matriz3[i][datos] = matriz[i][j];
                        datos++;
                    } else if (n == 3) {
                        matriz4[i][datos] = matriz[i][j];
                        datos++;
                    } else if (n == 4) {
                        matriz5[i][datos] = matriz[i][j];
                        datos++;
                    }
                    if (datos == columanio) {
                        n++;
                        datos = 0;
                    }

                }
            }
            System.out.println("\n");
            for (int i = 0; i <filas; i++) {
                for (int j = 0; j <columanio; j++) {
                    System.out.println(matriz[i][j] +"\t");
                }
                System.out.println("\n");
            }
            Thread.sleep(1000);
            semaforo=false;
        }
    }
     */
    public void extraerdatos() throws InterruptedException {
        semaforo = true;
        int n = 0;
        int datos = 0;
        for (int i = 0; i < anio; i++) {
            for (int j = 0; j < filas; j++) {
                datos = 0;
                for (int k = 0; k < columanio; k++) {
                    if (i == 0) {
                        matriz1[j][datos] = matriz[i][j][k];
                        datos++;
                    } else if (i == 1) {
                        matriz2[j][datos] = matriz[i][j][k];
                        datos++;
                    } else if (i == 2) {
                        matriz3[j][datos] = matriz[i][j][k];
                        datos++;
                    } else if (i == 3) {
                        matriz4[j][datos] = matriz[i][j][k];
                        datos++;
                    } else if (i == 4) {
                        matriz5[j][datos] = matriz[i][j][k];
                        datos++;
                    }
                    if (datos == columanio) {
                        break;
                    }

                }
            }
        }
        
        System.out.println("\n");
        for (int i = 0; i < anio; i++) {
            for (int j = 0; j < filas; j++) {
                for (int k = 0; k < columanio; k++) {
                    System.out.print(matriz[i][j][k] + "       ");
                }

            }
            System.out.println("\n");
        }
        
        Thread.sleep(2000);
        semaforo = false;
    }

    public void media() throws InterruptedException {
        while (semaforo == true) {
            Thread.sleep(1000);
        }
        int num = 5;

        double[] media = new double[num];
        for (int i = 0; i < anio; i++) {
            for (int j = 0; j < filas; j++) {
                for (int k = 0; k < columanio; k++) {
                    if (i == 0) {
                        media[i] = media[i] + matriz1[j][k];

                    } else if (i == 1) {
                        media[i] = media[i] + matriz2[j][k];

                    } else if (i == 2) {
                        media[i] = media[i] + matriz3[j][k];

                    } else if (i == 3) {
                        media[i] = media[i] + matriz4[j][k];

                    } else if (i == 4) {
                        media[i] = media[i] + matriz5[j][k];
                    }
                }
            }
        }

        int cont = 0;
        for (int i = 0; i < media.length; i++) {
            System.out.println("La media del año  " + (cont + 1) + " es :" + (media[i] / 2004) + "\n");
            cont++;
            
        }
    }

    public void mediames() throws InterruptedException {
        while (semaforo == true) {
            Thread.sleep(1000);
        }
        int mes = 12;
        int anio = 5;
        int cont = 0;
        double[][] media = new double[mes][anio];
        for (int i = 0; i < anio; i++) {
            for (int j = 0; j < filas; j++) {
                for (int k = 0; k < columanio; k++) {
                    if (i == 0) {
                        media[j][i] = media[j][i] + matriz1[j][k];

                    } else if (i == 1) {
                        media[j][i] = media[j][i] + matriz2[j][k];

                    } else if (i == 2) {
                        media[j][i] = media[j][i] + matriz3[j][k];

                    } else if (i == 3) {
                        media[j][i] = media[j][i] + matriz4[j][k];

                    } else if (i == 4) {
                        media[j][i] = media[j][i] + matriz5[j][k];
                    }
                }

            }

        }
        int anios = 5;
        int n = 0;
        for (int i = 0; i < anios; i++) {
            System.out.println("\nmedia mes en el anio" + (i + 1) + "   "
                    + "\n" + media[0][i] / 167
                    + "\n" + media[1][i] / 167
                    + "\n" + media[2][i] / 167
                    + "\n" + media[3][i] / 167
                    + "\n" + media[4][i] / 167
                    + "\n" + media[5][i] / 167
                    + "\n" + media[6][i] / 167
                    + "\n" + media[7][i] / 167
                    + "\n" + media[8][i] / 167
                    + "\n" + media[9][i] / 167
                    + "\n" + media[10][i] / 167
                    + "\n" + media[11][i] / 167
                    + "\n");
            Thread.sleep(1000);
        }

    }

}
