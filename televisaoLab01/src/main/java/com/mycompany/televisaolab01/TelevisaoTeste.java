/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.televisaolab01;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class TelevisaoTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();

        System.out.print("Digite o modelo da TV 1: ");
        tv1.setModelo(scanner.nextLine());

        System.out.print("Digite o preço da TV 1: ");
        tv1.setPreco(scanner.nextFloat());

        System.out.print("Digite o tamanho da TV 1: ");
        tv1.setTamanho(scanner.nextFloat());

        System.out.println("Esta ligada(nao 0/ sim 1)?");
        int ligar = scanner.nextInt();
        tv1.setLigada(ligar == 1);

        System.out.print("Digite o volume inicial ");
        tv1.setVolume(scanner.nextInt());

        System.out.println("Em quantas unidades deseja aumentar ou diminuir o volume? (use +n para aumentar e -n para diminuir");
        int alteraVolume = scanner.nextInt();
        tv1.setVolume(tv1.getVolume() + alteraVolume);

        System.out.println("Se deseja aumentar um canal, digite +1, se deseja voltar 1 canal, digite -1");
        int novoCanal = scanner.nextInt();
        tv2.alteraCanal(novoCanal);
        scanner.nextLine();

        System.out.print("Digite o modelo da TV 2: ");
        tv2.setModelo(scanner.next());

        System.out.print("Digite o preço da TV 2: ");
        tv2.setPreco(scanner.nextFloat());

        System.out.print("Digite o tamanho da TV 2: ");
        tv2.setTamanho(scanner.nextFloat());

        System.out.println("a TV2 Esta ligada(nao 0/ sim 1)?");
        ligar = scanner.nextInt();
        tv2.setLigada(ligar == 1);

        System.out.print("Digite o volume inicial ");
        tv2.setVolume(scanner.nextInt());

        System.out.println("Em quantas unidades deseja aumentar ou diminuir o volume? (use +n para aumentar e -n para diminuir");
        alteraVolume = scanner.nextInt();
        tv2.setVolume(tv2.getVolume() + alteraVolume);

        System.out.println("Se deseja aumentar um canal, digite +1, se deseja voltar 1 canal, digite -1");
        int novoCanal = scanner.nextInt();
        tv2.alteraCanal(novoCanal);
        
        System.out.println("Informações da TV 1:");
        System.out.println("Modelo: " + tv1.getModelo());
        System.out.println("Preço: " + tv1.getPreco());
        System.out.println("Tamanho: " + tv1.getTamanho());
        System.out.println("Volume: " + tv1.getVolume());
        System.out.println("Canal: " + tv1.getCanal());
        System.out.println("Ligada: " + tv1.isLigada());

        System.out.println("\nInformações da TV 2:");
        System.out.println("Modelo: " + tv2.getModelo());
        System.out.println("Preço: " + tv2.getPreco());
        System.out.println("Tamanho: " + tv2.getTamanho());
        System.out.println("Volume: " + tv2.getVolume());
        System.out.println("Canal: " + tv2.getCanal());
        System.out.println("Ligada: " + tv2.isLigada());
    
    }

}


        

        
