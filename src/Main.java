import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int num, tent, dif, cont = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("JOGO DE ADIVINHAÇÃO");
        System.out.println("--------------------");
        System.out.println("ESCOLHA A DIFICULDADE: ");
        System.out.println("1 - FÁCIL ");
        System.out.println("2 - MÉDIO ");
        System.out.println("3 - DIFÍCIL");
        dif = sc.nextInt();

        if (dif == 1){
            System.out.println("Você escolheu a dificuldade fácil! ");
            num = random.nextInt(11);
            System.out.println("Digite um número de 1 a 10: ");
            tent = sc.nextInt();
            cont++;
            
            
            
            while (tent != num){
                System.out.println("Você errou, tente novamente!");
                System.out.println("Digite um número de 1 a 10: ");
                tent = sc.nextInt();
                cont++;
            }

            System.out.printf("Parabéns! Você acertou em %d tentativas", cont);


            
        }
        else if(dif == 2){
            System.out.println("Você escolheu a dificuldade média!");
            num = random.nextInt(26);

        }
        else if(dif == 3){
            System.out.println("Você escolheu a dificuldade difícil");
            num = random.nextInt(51);
        }
        else{
            System.out.println("Você escolheu uma opção inválida!");
        }



    }
}
