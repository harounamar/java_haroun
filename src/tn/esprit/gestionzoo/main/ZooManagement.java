package tn.esprit.gestionzoo.main;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import tn.esprit.gestionzoo.entities.*;

class ZooManagement {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



            /*
            prosit 1:
            System.out.println("Enter tn.esprit.gestionzoo.entities.zoo name");
        Scanner myObj = new Scanner(System.in);
        do {
            System.out.println("Enter tn.esprit.gestionzoo.entities.zoo name:");
            zooName = myObj.nextLine();
        } while (!(zooName instanceof String) || zooName.trim().isEmpty());


        boolean isNumber=false;
        System.out.println("Enter nbre cages");
        do {
            if (myObj.hasNextInt()) {

                isNumber=true;
            } else {
                System.out.println("please type a number");
            }
            String nbrCages = myObj.nextLine();
        }while (!isNumber);
        System.out.println("Enter nom de tn.esprit.gestionzoo.entities.zoo");
        System.out.print(zooName+" comporte "+nbrCages);

*/
        /* intruction 5 :
        tn.esprit.gestionzoo.entities.animal lion = new tn.esprit.gestionzoo.entities.animal ();
        lion.family = "Felidae";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;*/
        //intruction 6 : le travail par construceur est plus facile
        //intruction 8 :lorsque on utilise Sos(myzoo) et Sos(myzoo.toString) on remarque affichage de @ memoire 
        zoo myzoo=new zoo("myzoo","tunis");
        animal lion=new animal("cat","lion",4,true);
        animal el=new animal("7ayawan","fil",4,true);
        animal dog=new animal("dog","dog",4,true);
        animal cat=new animal("cat","cat",4,true);
        System.out.println("tn.esprit.gestionzoo.entities.zoo name :"+myzoo.getName()+" city:"+myzoo.getCity()+" nbrCages:"+myzoo.getNbrCages());
        System.out.println(myzoo.toString());
        myzoo.display();
        /*System.out.println(lion);
        System.out.println("tn.esprit.gestionzoo.entities.animal name :"+lion.name +" age :"+lion.age +" isMammal :"+lion.isMammal);
        System.out.println(lion.toString());*/
        myzoo.addAnimal(lion);
        myzoo.addAnimal(el);
        myzoo.addAnimal(dog);
        myzoo.addAnimal(cat);
        myzoo.getAllAnimals();
        System.out.println(myzoo.getNbrAnimals());
        myzoo.removeAnimal(el);
        System.out.println(myzoo.getNbrAnimals());
        myzoo.getAllAnimals();
        zoo bel=new zoo("belvidere","tunis");
        animal dhib=new animal("dhib","dhib",4,true);
        animal karkadan=new animal("7ayawan","3antar",4,true);
        animal kalb=new animal("dog","blancge neige",4,true);
        animal gatoous=new animal("cat","7bicha",4,true);
        animal snoop= new animal("fakroun","snoopturtle",4 ,true );
        animal alinejma = new animal("thoour","alinejma",4,true);
        bel.addAnimal(dhib);
        bel.addAnimal(karkadan);
        bel.addAnimal(alinejma);
        bel.addAnimal(gatoous);
        bel.addAnimal(snoop);
        bel.addAnimal(kalb);
        System.out.println(bel.comparerZoo(bel,myzoo));
    }
}