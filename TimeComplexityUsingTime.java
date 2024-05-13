//It is just a rough estimate on how the time complexity works in the basic Java program. 
// But this is not exactly how the complexity is, but it varies from machine to machine.
//A design of algo could be useful in such a case on determining the exact time complexity.

// There are particularly some mathematical models that enables us. to find the time complexity and space complexity.
//  So altogether they are referred as asymptotic notations,That generally means the sense where there is no particular. 
// value like round of values. It is like a notations like big O and etc.

public class TimeComplexityUsingTime {
    public static void main(String[] args) {

        double now = System.currentTimeMillis();

        SampleAlogosToFindSumOfNums s = new SampleAlogosToFindSumOfNums();
        System.out.println(s.sum(9999));

        System.out.println("Time in Milli Sec= " + (System.currentTimeMillis() - now));

        // bro just look how much time you took
        System.out.println(s.sum2(9999));
        System.out.println("Time in Milli Sec= " + (System.currentTimeMillis() - now));

    }
}

class SampleAlogosToFindSumOfNums {
    public int sum(int n) {
        return n + (n + 1) / 2;
    }

    public int sum2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + 1;
        }
        return sum;

    }
}