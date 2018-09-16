package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.println("Escolha um número de exercício... 1 a 4");
        int ex = c.nextInt();
        switch(ex){
            default:
                System.out.println("Nenhuma opção selecionada");
                break;
            case 1:
                ex1();
                break;
            case 2:
                ex2();;
                break;
        }
    }

    public static void ex1(){

        System.out.println("" +
                "Crie uma classe no padrão Singleton chamada de UserPreferences." +"\n"+
                "Ela deve armazenar informações da sessão atual, tal como nome de usuário, " +"\n"+
                "senha, timestamp da última entrada no sistema e perfil de usuário (administrador ou" +"\n"+
                "operador). Um método estático deve retornar todas as informações sobre a sessão" + "\n");


        UserPreferences uP = new UserPreferences();

        for (int i = 0; i< uP.getSession().length; i++){
            System.out.println(uP.getSession()[i]);
        }

    }

    public static  void ex2(){
        System.out.println(
                "Monte um modelo de classes em padrão Composite no qual " + "\n" +
                        "auxilia a montagem de projetos de equipamentos eletrônicos." + "\n" +
                        "Os mesmos podem ser formados por diferentes componentes (chip, resistor," + "\n" +
                        "capacitor, indutor) e também por outras placas, no qual estas podem agregar" + "\n" +
                        "outros componentes.");
    }

}
