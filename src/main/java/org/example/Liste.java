package org.example;
import java.util.ArrayList;


public class Liste {
   private ArrayList<Object> The_Liste = new ArrayList<Object>();
   private int place_dans_la_liste=0; ///Place dans la liste

    //CONSTRUCTEUR
    public Liste()
    {
       The_Liste=new ArrayList<Object>();
       place_dans_la_liste=0;
    }

    ///GETTEUR POUR ACCEDER A LA LISTE
    public ArrayList<Object> getThe_Liste() {

        return The_Liste;
    }

    public void Premier()
    {
        place_dans_la_liste=0;
    }
    public void Dernier()
    {
        if(The_Liste.isEmpty())
        {
            place_dans_la_liste=0;
        }
        else
        {
            place_dans_la_liste=The_Liste.size()-1;
        }
    }
    public Object Suivant()
    {
        Object My_Object= null ;
        if(The_Liste.isEmpty())
        {
            System.out.print("LA LISTE EST VIDE // FIN ");
        }
        else
        {
           // My_Object= The_Liste.remove(place_dans_la_liste);
            My_Object=Supprimer();
        }
        return My_Object ;
    }
    public Object Supprimer()
    {
        Object My_Object= null ;
        if(The_Liste.isEmpty())
        {
            return My_Object;
        }
        else
        {
            My_Object= The_Liste.remove(place_dans_la_liste);
        }
        return My_Object ;
    }
    public void Ajouter(Object nouveau)
    {
        The_Liste.add(place_dans_la_liste,nouveau);
    }

    public int taille()
    {
        return The_Liste.size();
    }


}
