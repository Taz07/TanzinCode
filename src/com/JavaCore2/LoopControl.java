public class LoopControl {

    public static void main(String args[]) {
        int [] numbers = {23, 24, 30, 11};

        for(int x : numbers ) {
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"James", "Bryant", "Curry", "Irving"};

        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }
}
