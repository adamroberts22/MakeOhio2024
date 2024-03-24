
public final class Display {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Display() {

    }

    public static void main(String[] args) {

        Ram.populateFont();

        byte[] five = new byte[5];
        five = ProgramCounter.getFont('5');
        for (int i = 0; i < five.length; i++) {
            System.out.println(five[i]);
        }
    }

}//end
