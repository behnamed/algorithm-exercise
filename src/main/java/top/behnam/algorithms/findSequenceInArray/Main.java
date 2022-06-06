package top.behnam.algorithms.findSequenceInArray;

public class Main {

    public static void main(String[] args) {

        int[] array = {12, 98, 37, 42, 38, 65, 44, 128, 89, 18, 52, 449, 652};
        int[] sequence = {98, 42, 44, 89};

        int seqIndex = 0;
        for (int item : array) {
            if (seqIndex == sequence.length)    // check if the sequence has been found already
                break;
            if (seqIndex < sequence.length && item == sequence[seqIndex])   // check the array item with the sequence item
                seqIndex++;
        }

        if (seqIndex == sequence.length)
            System.out.println("\nSequence Found !");
        else
            System.out.println("\nSequence not Found !");

    }

}
