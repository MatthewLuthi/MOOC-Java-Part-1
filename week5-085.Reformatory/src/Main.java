
public class Main {

    public static void main(String[] args) {
        Person jason = new Person("Jason", 15, 180, 80);
        Reformatory eastTamakiReformatory = new Reformatory();
        System.out.println(jason.getName()+" weight: "+eastTamakiReformatory.weight(jason));
        eastTamakiReformatory.weight(jason);
        eastTamakiReformatory.weight(jason);
        System.out.println(eastTamakiReformatory.totalWeightsMeasured());
        
    }
}
