package fr.pantheonsorbonne.cri;

import java.util.Random;
import java.util.Scanner;

public class RandomDraw {
    
    static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int joueur1 = random.nextInt(2);
        int joueur2 = 1- joueur1;
        System.out.println("Le joueur " + joueur1 + " commence. donne des coordonnées x et y ainsi que le nombre que tu veux mettre sur la case:");
        int x = sc.nextInt();
        int y= sc.nextInt();
        int nbplace= sc.nextInt();
    }       
}
