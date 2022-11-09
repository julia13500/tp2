package org.example;

public class Pile   {
    protected Liste La_Liste;

    public Pile()
    {
        this.La_Liste= new Liste();
    }
    public Pile(Pile p)
    {
        this.La_Liste= p.La_Liste;
    }

    public Liste getLa_Liste() {
        return La_Liste;
    }
    public void Empiler(Object objetP)
    {
        this.getLa_Liste().Dernier();
        this.getLa_Liste().Ajouter(objetP);
    }
    public Object Depiler()
    {
        this.getLa_Liste().Dernier(); // on part de la dernière position
        return this.getLa_Liste().Supprimer(); // on supprime le dernier objet et on le récupère
    }
    public int taille()
    {
        return this.getLa_Liste().taille();
    }
}
