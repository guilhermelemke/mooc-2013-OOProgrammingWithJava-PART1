
public class Main {

    public static void main(String[] args) {
        // write here test code 
        Reformatory eastHelsinkiReformatory = new Reformatory();
        
        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);
        
        /*
        System.out.println(brian.getName() + " weigth: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weigth: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
        
        eastHelsinkiReformatory.feed(brian);
        eastHelsinkiReformatory.feed(brian);
        eastHelsinkiReformatory.feed(brian);
        
        System.out.println("");
        
        System.out.println(brian.getName() + " weigth: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weigth: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
        */
        
        System.out.println("total weights measured " + eastHelsinkiReformatory.totalWeightsMeasured());
        
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(pekka);
        
        System.out.println("total weights measured " + eastHelsinkiReformatory.totalWeightsMeasured());
        
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        
        System.out.println("total weights measured " + eastHelsinkiReformatory.totalWeightsMeasured());
    }
}
