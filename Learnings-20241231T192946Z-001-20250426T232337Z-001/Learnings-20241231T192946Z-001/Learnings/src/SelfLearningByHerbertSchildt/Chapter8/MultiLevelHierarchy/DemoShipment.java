package SelfLearningByHerbertSchildt.Chapter8.MultiLevelHierarchy;

// Extend bowWeight to include the shopping cost

// Start the box
class box10{
    private double height;
    private double width;
    private double depth;

    // Construct clone of an object
    box10(box10 ob){
        height=ob.height;
        width=ob.width;
        depth=ob.depth;
    }

    // Constructor when all dimensions are specified
    box10(double w, double h, double d){
        height=w;
        width=h;
        depth=d;
    }

    // Constructor used when no dimensions are specified
    box10(){
        height=-1;
        width=-1;
        depth=1;
    }

    // constructor when cube is created
    box10(double len){
        height=width=depth=len;
    }

    // Compute and return the value
    double volume(){
        return height*width*depth;
    }
}

// Add weight
class BoxWeight extends box10{
    double weight; // weight of thr box

    // Constructor clone of an object
    BoxWeight(BoxWeight ob){
        super(ob);
        weight=ob.weight;
    }

    // Constructor when all dimensions are specified
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight=m;
    }

    // Default constructor
    BoxWeight(){
        super();
        weight=-1;
    }

    // Constructor used when cube is created
    BoxWeight(double len,double m){
        super(len);
        weight=m;
    }
}


// Add shipping cost
class shipMent extends BoxWeight{
    double cost;

    shipMent(shipMent ob){
        super(ob);
        cost=ob.cost;
    }

    shipMent(double w, double h, double d, double m, double c){
        super(w,h,d,m);
        cost=c;
    }

    shipMent(double len, double m, double c) {
        super(len,m);
        cost=c;
    }

    shipMent(){
        super();
        cost=2;
    }
}
public class DemoShipment {
    public static void main(String[] args){
        shipMent ship1=new shipMent(10,20,15,10,3.41);
        shipMent ship2=new shipMent(2,3,4,0.76,1.28);
        double vol;
        vol=ship1.volume();
        System.out.println("Volume of shipment1: "+vol);
        System.out.println("Weight of shipment1: "+ship1.weight);
        System.out.println("Shipping cost: $"+ship1.cost);
        System.out.println();

        vol=ship2.volume();
        System.out.println("Volume of shipment2: "+vol);
        System.out.println("Weight of shipment2: "+ship2.weight);
        System.out.println("Cost of shipment: $"+ship2.cost);
    }
}
