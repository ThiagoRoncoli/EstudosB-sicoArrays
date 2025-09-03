

public class CursoJava{
    
    public static void main(String[] args){

                        /*       int[] num = new int[5]; 
                                aqui estou determinando  o tamanho do array, 
                                aonde um array do tipo int vai armazenar inteiros com
                                um novo objeto do tipo int com N posições

                                num[0] = 52;
                                num[1] = 100;
                                num[2] = 3;
                                num[3] = 15;
                                num[4] = 527;
                                */ 

        int[] num = {52, 100, 3, 15, 527};

        for(int i = 0; i < num.length; i++){
            System.out.printf("%d " , num[i]);
        }

                                /*System.out.printf("%d", num[1]);  aqui estou imprimindo o valor do array
                                        através do índice dele, usamos o 
                                        porcento d para mostrar que é um
                                        valor do tipo inteiro

                                        esse calcula de forma fixa pois eu escolho o valor do índice
                                         for(int i = 4; i >= 0; i--){

                                         esse não pois num.length é o tamanho do array
                                        for(int i = num.length-1; i >= 0; i--){
                                        System.out.printf("%d " , num[i]);
                                    }  aqui estou imprimindo o array de trás para frente
                                 */    
                                

    }

}