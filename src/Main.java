import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int numberOfA, numberOfB;
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();


        //Get set A
        System.out.print("Enter the number of elements for A: ");

        //reading the number of elements from the that we want to enter
        numberOfA =sc.nextInt();

        System.out.println("Enter the elements of the set A: ");
        for(int i=0; i<numberOfA; i++)
        {
        //reading array elements from the user
            A.add(sc.nextInt());
        }

        System.out.println();

        //Get set B
        System.out.print("Enter the number of elements for B: ");

        //reading the number of elements from the that we want to enter
        numberOfB =sc.nextInt();

        System.out.println("Enter the elements of the set B: ");
        for(int i=0; i<numberOfB; i++)
        {
            //reading array elements from the user
            B.add(sc.nextInt());
        }


    /*
      Union: Set of members that belong to set A "or" set B.
    */
        Set<Integer> union = new HashSet<>();
        union.addAll(A);
        union.addAll(B);
 
    /*
      Intersection: Set of members that belong to set A "and" set B.
    */
        Set<Integer> intersection = new HashSet<>();
        intersection.addAll(A);
        intersection.retainAll(B);
 
    /*
      Difference: Set of members that belong set A "and not" set B. 
    */
        Set<Integer> difference = new HashSet<>();
        difference.addAll(A);
        difference.removeAll(B);
 
    /*
      Complement: Set of members that belong to set B "and not" set A. 
    */
        Set<Integer> complement = new HashSet<>();
        complement.addAll(B);
        complement.removeAll(A);

        System.out.println();
        System.out.println("A: " + sortAndPrintSet(A));
        System.out.println("B: " + sortAndPrintSet(B));

        System.out.println();
        System.out.println("union: " + sortAndPrintSet(union));
        System.out.println("intersection: " + sortAndPrintSet(intersection));
        System.out.println("difference: " + sortAndPrintSet(difference));
        System.out.println("complement: " + sortAndPrintSet(complement));

    }

    static String sortAndPrintSet(Set<Integer> unSort) {
        List<Integer> list = new ArrayList<>(unSort);
        Collections.sort(list);
        return  list.toString();
    }
}