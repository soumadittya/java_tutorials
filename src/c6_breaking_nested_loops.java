// breaking nested loops

class c6_breaking_nested_loops{
    public static void main(String args[]) {
        int i = 0;
        int j = 0;
        int z = 0;

        loop_main:
        while (z < 10) {
            System.out.println("Main loop....");
            z += 1;
            loop_1:
            while (i < 2) {
                System.out.println("outer loop....");
                i += 1;
                while (j < 2) {
                    System.out.println("inner loop....");
                    if (z == 3) {
                        break loop_main;
                    }
                    j += 1;
                }
                j = 0;
            }
            i = 0;
        }
    }
}