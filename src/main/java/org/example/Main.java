package org.example;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        int Nombre;
        int T1;
        int T2;
        int T3;
        System.out.println("Hello world!");
        Pile P1=new PileEntiers();
        Pile P2= new PileEntiers() ;
        Pile P3= new PileEntiers() ;
        Pile P1Copie=new PileEntiers();
        Pile P4= new PileEntiers() ;
        Pile P4Copie= new PileEntiers() ;
        for(int i=0;i<5;i++)
        {
            P1.Empiler((int)(Math.random() * (100)));
        }


        for(int j=0; j<5 ; j++)
        {
            Nombre=(Integer)P1.Depiler();
            P1Copie.Empiler(Nombre);
            if(Nombre%2==0)
            {
                P2.Empiler(Nombre);
            }
            else
            {
                P3.Empiler(Nombre);
            }
        }
        T1=P1Copie.taille();
        T2=P2.taille();
        T3= P3.taille();
        System.out.println("\nP1/----LA PILE DE BASE \n");
        for(int i=0 ; i<T1; i++)
        {

            System.out.println(P1Copie.Depiler());

        }

        System.out.println("\nP2/----LES NOMBRES PAIRES\n" );
        for(int i=0 ; i< T2 ; i++)
        {
            System.out.println(P2.Depiler());

        }
        System.out.println("\nP3/----LES NOMBRES IMPAIRES\n");
        for(int i=0 ; i<T3 ; i++)
        {
            System.out.println(P3.Depiler());
        }

        Scanner in = null;
        in = new Scanner(System.in);
        System.out.print("nombre de disque : ");
        int nbDisque = in.nextInt();

        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < nbDisque; ++i) {
            Random randomGenerator = new Random();
            int random = randomGenerator.nextInt(1,250);
            v.add(random);
        }
        System.out.println("vecteur avant le tri");
        System.out.println(v);
        Collections.sort(v);
        System.out.println("vecteur apres le tri");
        System.out.println(v);

        for (int i =0; i<nbDisque; i++){
            System.out.println("EMPILER "+v.get(i));
            P4.Empiler(v.get(i));
        }
        for(int j=0; j<nbDisque ; j++) {
            Nombre = (Integer) P4.Depiler();
            System.out.println("P4 dépiler "+Nombre);
            P4Copie.Empiler(Nombre);
        }
        System.out.println("\nP4/----LA PILE HANOI \n");

        for(int i=0 ; i<nbDisque; i++)
        {
            System.out.println(P4Copie.Depiler());
        }
        /*
        for (int i =0; i<nbDisque; i++){
            System.out.println("EMPILER "+v.get(i));
            P4.Empiler(v.get(i));
        }
        System.out.println("\nP4/----LA PILE HANOI \n");

        for(int i=0 ; i<nbDisque; i++)
        {
            System.out.println(P4.Depiler());
        }*/

    }

}