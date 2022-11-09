package org.example;

public class PileEntiers extends Pile {

 public PileEntiers()
 {
  super();
 }
 public PileEntiers(Pile MaPile)
 {
  super(MaPile);
 }

 @Override
 public Integer Depiler()
 {
  return (Integer) super.Depiler();
 }

 public void Empiler(Integer Variable)
 {
  super.Empiler(Variable);

 }

 public int taille()
 {
   return super.taille();
 }

}
