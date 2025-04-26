package SelfLearningByHerbertSchildt.Chapter5.Switch;

// Demonstrate the "nested Switch-Case" example

public class NestedSwitch {
    public static void main(String[] args){
        int count =4, target =2;
        switch(count){
            case 1:
                switch (target){
                    case 0:
                        System.out.println("from count= 1,target is zero");
                        break;
                    case 1:
                        System.out.println("from count= 1, target is one");
                        break;
                    case 2:
                        System.out.println("from count= 1, target is two");
                        break;
                }
                System.out.println("call from zero");
                break;

            case 2:
                switch (target){
                    case 0:
                        System.out.println("from count= 2, target is zero");
                        break;
                    case 1:
                        System.out.println("from count= 2, target is one");
                        break;
                    case 2:
                        System.out.println("from count= 2, target is two");
                        break;
                }
                System.out.println("call from two");
                break;

            case 3:
                switch (target){
                    case 0:
                        System.out.println("from count= 3, target is zero");
                        break;
                    case 1:
                        System.out.println("from count= 3, target is one");
                        break;
                    case 2:
                        System.out.println("from count= 3, target is two");
                        break;
                }
                System.out.println("call from three");
                break;

            default:
                System.out.println("Out of the given cases.");
        }
    }
}
