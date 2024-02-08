/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapro;

/**
 *
 * @author 11alp
 */
public class TablasDeMultiplicar {
    
    public void TablasDeMultiplicar(int i, int n){
        if(i<=10){
            System.out.print(i+"*"+ n + "=" + i*n + "\n" );
            TablasDeMultiplicar(i+1, n);
        }
    }
    
}

