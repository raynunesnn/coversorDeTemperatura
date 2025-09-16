import java.util.Scanner;

public class appTemp {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Que temperatura voce deseja converter? \n 1- Fahrenheit \n 2- Kelvin");
        int temperaturaCliente = scan.nextInt();

        System.out.println("Qual valor da sua temperatura:");
        int valorTemperatura = scan.nextInt();

        while(true){
            if(temperaturaCliente == 1){
                var tempConvertida = ((valorTemperatura * 1.8)+32);
                System.out.println("O valor de " + valorTemperatura + "Em Fahrenheit é de; " + tempConvertida );
                break;
            }else if(temperaturaCliente == 2){
                var tempConvertida = (valorTemperatura + 273.15);
                System.out.println("O valor de " + valorTemperatura + "Em Kelvin é de; " + tempConvertida);
                break;
            }else{
                System.out.println("Digite uma temperatura valida");
                temperaturaCliente = scan.nextInt();
            }

            scan.close();
        }


    }


    
    
}
