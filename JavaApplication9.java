/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        char genero;
        int dura;
        String reparto;
        String clasi;

        Scanner captu = new Scanner(System.in);

        System.out.println("Nombre:");
        nombre = captu.nextLine();
        

        System.out.println("Género:");
        genero = captu.next().charAt(0);
        captu.nextLine(); // Consumir el salto de línea pendiente
        

        System.out.println("Duración:");
        dura = captu.nextInt();
        captu.nextLine(); // Consumir el salto de línea pendiente
        

        System.out.println("Reparto:");
        reparto = captu.nextLine();
        

        System.out.println("ClasificaciOn:");
        clasi = captu.nextLine();
        
    }
}
   
