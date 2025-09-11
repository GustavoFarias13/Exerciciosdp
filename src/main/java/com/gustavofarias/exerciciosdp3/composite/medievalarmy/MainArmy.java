package com.gustavofarias.exerciciosdp3.composite.medievalarmy;

public class MainArmy {
    public static void main(String[] args) {
        // Soldados individuais
        Soldier s1 = new Soldier("Arthur", 10);
        Soldier s2 = new Soldier("Lancelot", 12);
        Soldier s3 = new Soldier("Gawain", 8);
        Soldier s4 = new Soldier("Percival", 15);

        // Esquadrão com 2 soldados
        CompositeUnit squad1 = new CompositeUnit("Esquadrão Alfa");
        squad1.add(s1);
        squad1.add(s2);

        // Esquadrão com outros 2 soldados
        CompositeUnit squad2 = new CompositeUnit("Esquadrão Beta");
        squad2.add(s3);
        squad2.add(s4);

        // Batalhão que agrupa os dois esquadrões
        CompositeUnit battalion = new CompositeUnit("Batalhão Real");
        battalion.add(squad1);
        battalion.add(squad2);

        // Testando
        System.out.println(s1); // Soldado isolado
        System.out.println(squad1); // Esquadrão Alfa
        System.out.println(squad2); // Esquadrão Beta
        System.out.println(battalion); // Batalhão inteiro
    }
}
