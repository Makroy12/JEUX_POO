package fr.pantheonsorbonne.cri;

public class GameGrid {
    private static final int SIZE = 3;

    private static final int EMPTY = 0; // Représente une case vide

    private static final int Player1 = 1 ;  // Représente le joueur 1
    private static final int Player2 = -1 ;  // Représente le joueur 2

    protected  int[][] grid ;// Le tableau contiendra 3x3 éléments.
    public GameGrid(){ // Creation du constructeur et initialisation de la map de jeu !
        grid = new int [SIZE][SIZE];
    }

    public void initMap(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = EMPTY;
            }
        }
    }

    // Afficher la grille
    public void displayGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GameGrid grid = new GameGrid();
        grid.displayGrid();
    }
}
