/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author 11alp
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cantNumeros = JOptionPane.showInputDialog("Ingrese la cantidad de numeros que quiere sumar: ");
        int n = Integer.parseInt(cantNumeros);
        
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            String valores = JOptionPane.showInputDialog("Ingrese el valor del mumero: "+(i+1));
            num[i]= Integer.parseInt(valores);
        }
        
        SumasRecursivas s = new SumasRecursivas();
        int resp = s.sumasRecursivas(num, n-1);
        System.out.println("La suma de todos los numeros es: "+resp);
    }
    
}
