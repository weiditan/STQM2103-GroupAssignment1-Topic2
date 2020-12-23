import java.util.*;

public class Main {

    public static void main(String[] args){



        System.out.println(
                "TOPIC 1: Set – Element and Not Element of, Subset and Not Subset of and Power Set\n" +
                "TOPIC 2: Set – Union, Intersection and Not\n" +
                "TOPIC 3: Set – Complement and Symmetric Difference,\n" +
                "TOPIC 4: Set – The additional principle of two set (disjoint set and not disjoint set)\n" +
                "TOPIC 5: Set – The additional principle of three set (disjoint set and not disjoint set)\n" +
                "TOPIC 6: Sequences – Recursive formula (insert formula, initial value, number of sequence), list all sequences based on number of sequences.\n" +
                "TOPIC 7: Sequences – Explicit formula (insert formula, number of sequence), list all sequences based on number of sequences.\n" +
                "TOPIC 8: Division in the Integer: Prime Number and Prime Factorization\n" +
                "TOPIC 9: Division in the Integer: GCD and LCM (using Prime Number Factor)\n" +
                "TOPIC 10: Division in the Integer: GCD using the Euclidean Algorithm\n" +
                "TOPIC 11: Matrices: Add, Subtract and Multiplication of Matrix\n" +
                "TOPIC 12: Matrices: Matrix Transposition and Matrix Symmetric\n" +
                "TOPIC 13: Matrices: And, Or and Multiplication of Boolean Matrix\n");

        Scanner sc=new Scanner(System.in);
        int topic;
        boolean loop = true;
        while (loop) {
            //reading the topic
            System.out.print("Enter the number of topic: ");
            topic = sc.nextInt();

            switch (topic) {
                case 2:
                    loop = false;

                    topic2(sc);
                    break;
                default:
                    System.out.print("Topic not found !\n\n");
            }
        }

        sc.close();
    }

    static void topic2(Scanner sc) {

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