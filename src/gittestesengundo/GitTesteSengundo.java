/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittestesengundo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leonidas
 */
public class GitTesteSengundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testado e aprovado!
        //Certo valeu!
        int sorte, leo;
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        leo = random.nextInt(10)+1;
        System.out.println("O numero Sorteado foi: "+ leo);
        int x = 1;
        while(true){
            System.out.print("Digite um numero da sorte: ");
            sorte = input.nextInt();
            if(sorte == leo){
                System.out.println("Parabens vc acertou");
                break;
            }
            x += 1;
        
        
        }
        System.out.println("Vc acerto na: "+x+"ª Tentativa");
    }
    
}
