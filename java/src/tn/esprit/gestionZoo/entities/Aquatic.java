package tn.esprit.gestionZoo.entities;

public abstract class  Aquatic extends Animal{

   protected String habitat ;
   public Aquatic(){}
    public abstract void swim();  // instruction 28
  public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
       super(family,name,age,isMammal);
       this.habitat=habitat;
   }

    //instruction 23
   @Override
    public String toString() {
        return super.toString()+" " +habitat;
    }
    // instruction 24
    /* public void swim(){
        System.out.println("This aquatic animal is swimming.");
    } */
    //instruction 31
    public boolean equals(Dolphin dolphin1) {
        if (this == dolphin1) return true;
        if (null == dolphin1) return false;
        if (dolphin1.getClass() == Dolphin.class){
            Dolphin dolphin =(Dolphin) dolphin1;
            return getAge() == dolphin.getAge() && getName().equals(dolphin.getName()) && habitat.equals(dolphin.habitat) ;
        }

        return false;
    }
}



