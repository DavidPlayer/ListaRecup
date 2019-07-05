package jogodavelha;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
         TicTacToe game = new TicTacToe();
         String posicao;
         int valida = 0, Jogadas = 0;
         
        while (true) {
          System.out.println("********Jogo da Velha********");
          game.Mostrar();
          
            do {//para iniciar o jogador 1 
                System.out.print("Jogador 1, informe uma posição para jogar: ");
                posicao = sc.next();
                while(!game.Valido(posicao)){
                    System.out.print("Jogada inválida, tente novamente!");
                    System.out.print("Jogador 1, informe uma posição para jogar");
                    posicao = sc.next();
                    valida = 0;
                }
                game.Movimento(posicao, "X");
                valida = 1;

            }while(valida == 0);

            Jogadas++;
            valida = 0;
            game.Mostrar();

            if(!game.Ganhou(Jogadas).equals("null")){
                break;                      
            }
            
            do {//para iniciar o jogador 2 
                System.out.println("Jogador 2, informe uma posição para jogar: ");
                posicao = sc.next();
                while(!game.Valido(posicao)){
                    System.out.println("Jogada inválida, tente novamente!");
                    System.out.print("Jogador 2, informe uma posição para jogar");
                    posicao = sc.next();
                    valida = 0;
                }
                game.Movimento(posicao, "O");
                valida = 1;

            }while(valida == 0);
            
            Jogadas++;
            valida = 0;
            game.Mostrar();

            if(!game.Ganhou(Jogadas).equals("null")){
                break;                      
            }
        
        }
        System.out.println("O "+game.Ganhou(Jogadas)+" venceu!");
    }
}
 