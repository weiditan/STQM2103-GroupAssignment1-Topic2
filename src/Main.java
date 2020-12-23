import java.util.*;

public class Main {

    public static void main(String[] args){

        System.out.println("TOPIC 2: Set – Union, Intersection and Not\n");

        System.out.println("Press 1: Union");
        System.out.println("Press 2: Intersection");
        System.out.println("Press 3: Not");
        System.out.println();



        Scanner sc=new Scanner(System.in);
        int index;
        boolean loop = true;

        Set<Integer> A,B;

        while (loop) {
            //reading the topic
            System.out.print("Enter the index: ");
            index = sc.nextInt();

            switch (index) {
                case 1:
                    loop = false;
                    A = getSet(sc,"A");
                    B = getSet(sc,"B");

                    //Union: Set of members that belong to set A "or" set B.
                    Set<Integer> union = new HashSet<>();
                    union.addAll(A);
                    union.addAll(B);

                    System.out.println();
                    System.out.println("A: " + sortAndPrintSet(A));
                    System.out.println("B: " + sortAndPrintSet(B));
                    System.out.println("union: " + sortAndPrintSet(union));

                    break;
                case 2:
                    loop = false;
                    A = getSet(sc,"A");
                    B = getSet(sc,"B");

                    //Intersection: Set of members that belong to set A "and" set B.
                    Set<Integer> intersection = new HashSet<>();
                    intersection.addAll(A);
                    intersection.retainAll(B);

                    System.out.println();
                    System.out.println("A: " + sortAndPrintSet(A));
                    System.out.println("B: " + sortAndPrintSet(B));
                    System.out.println("Intersection: " + sortAndPrintSet(intersection));
                    break;
                case 3:
                    loop = false;
                    A = getSet(sc,"A");
                    B = getSet(sc,"B");

                    //Complement: Set of members that belong to set B "and not" set A.
                    Set<Integer> complement = new HashSet<>();
                    complement.addAll(B);
                    complement.removeAll(A);

                    System.out.println();
                    System.out.println("A: " + sortAndPrintSet(A));
                    System.out.println("B: " + sortAndPrintSet(B));
                    System.out.println("Not: " + sortAndPrintSet(complement));
                    break;
                default:
                    System.out.println("Index found !\n");
            }
        }

        sc.close();
    }

    static Set<Integer> getSet(Scanner sc, String setName){
        int numberOfSet;
        Set<Integer> set = new HashSet<>();

        System.out.println();

        //Get set
        System.out.print("Enter the number of elements for "+setName+": ");

        //reading the number of elements from the that we want to enter
        numberOfSet =sc.nextInt();

        System.out.println("Enter the elements of the set "+setName+": ");
        for(int i=0; i<numberOfSet; i++)
        {
            //reading array elements from the user
            set.add(sc.nextInt());
        }
        return set;
    }

    static String sortAndPrintSet(Set<Integer> unSort) {
        List<Integer> list = new ArrayList<>(unSort);
        Collections.sort(list);
        return  list.toString();
    }
}