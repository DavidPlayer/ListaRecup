package jogodavelha;


class TicTacToe {
    private final String[][] matriz = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

    public String Mostrar(){
        for(int lin=0; lin<3; lin++){
            for(int col=0; col<3; col++){
                System.out.printf("      "+matriz[lin][col]);
            }
            System.out.println("\n");
        }
        return null;
    }
    
    public boolean Valido(String parametro){
        for(int lin=0; lin<3; lin++){
            for(int col=0; col<3; col++){
                if(matriz[lin][col].equals(parametro))
                    return true;
            }
        }    
        return false;
    }
    
    public void Movimento(String parametro, String jogador){
        if(parametro.equals("1"))
            matriz[0] [0] = jogador;
        else if (parametro.equals("2"))
            matriz [0][1] = jogador;
        else if (parametro.equals("3"))
            matriz [0][2] = jogador;
        else if (parametro.equals("4"))
            matriz [1][0] = jogador;
        else if (parametro.equals("5"))
            matriz [1][1] = jogador;
        else if (parametro.equals("6"))
            matriz [1][2] = jogador;
        else if (parametro.equals("7"))
            matriz [2][0] = jogador;
        else if (parametro.equals("8"))
            matriz [2][1] = jogador;
        else if (parametro.equals("9"))
            matriz [2][2] = jogador;
        
        }
        public String Ganhou(int movimento){
            String[] St = new String[8];
            String vencedor = "null";
            if(movimento == 9){
                vencedor = "Empate";                
            }
            St[0] = matriz[0] [0] + matriz [0] [1] + matriz [0] [2];
            St[1] = matriz[1] [0] + matriz [1] [1] + matriz [1] [2];
            St[2] = matriz[2] [0] + matriz [2] [1] + matriz [2] [2];
            
            St[3] = matriz[0] [0] + matriz [1] [0] + matriz [2] [0];
            St[4] = matriz[0] [1] + matriz [1] [1] + matriz [2] [1];
            St[5] = matriz[0] [2] + matriz [1] [2] + matriz [2] [2];
            
            St[6] = matriz[0] [0] + matriz [1] [1] + matriz [2] [2];
            St[7] = matriz[0] [2] + matriz [1] [1] + matriz [2] [0];
            
            for (int i = 0; i<St.length; i++){
                if(St[i].equals("XXX")){
                    vencedor = "Jogador 1";
                }else if (St[i].equals("OOO"))
                    vencedor = "Jogador 2";
            }
        
        return vencedor;
        }
}    
    



