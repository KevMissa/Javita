package com.amigoscode;

import javax.swing.*;

public class Burbuja {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        rellenarArreglo(numeros);
        ordenarArreglo(numeros);
        mostrarArreglo(numeros);

    }

    private static void mostrarArreglo(int[] lista) {
        for (int numero: lista){
            System.out.println(numero);
        }
    }

    private static void ordenarArreglo(int[] lista) {
        for (int i = 0; i <lista.length-1 ; i++) {
            for (int j = 0; j <lista.length-1 ; j++) {
                if(lista[j]>lista[j+1]){
                        int aux = lista[j];
                        lista[j] = lista[j+1];
                        lista[j+1] = aux;
                }
            }
        }
    }

    private static void rellenarArreglo(int[] lista) {
        for (int i = 0; i <lista.length; i++) {
            String input = JOptionPane.showInputDialog("Ingresa el numero en la posicion " + i);
            lista[i] = Integer.parseInt(input);
        }
    }

}
