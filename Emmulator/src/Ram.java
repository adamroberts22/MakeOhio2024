public final class Ram {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Ram() {

    }//private memory

    public static byte[] memory = new byte[4096];

    public static void populateFont() {

        int i = 0;

        //0 (0-4)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //1 (5-9)
        memory[i] = (byte) 0x20;
        i++;
        memory[i] = (byte) 0x60;
        i++;
        memory[i] = (byte) 0x20;
        i++;
        memory[i] = (byte) 0x20;
        i++;
        memory[i] = (byte) 0x70;
        i++;

        //2 (10-14)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x10;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //3 (15-19)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x10;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x10;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //3 (20-24)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x10;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x10;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //4 (25-29)
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x10;
        i++;
        memory[i] = (byte) 0x10;
        i++;

        //5 (30-34)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x10;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //6 (35-39)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //7 (30-34)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x10;
        i++;
        memory[i] = (byte) 0x20;
        i++;
        memory[i] = (byte) 0x40;
        i++;
        memory[i] = (byte) 0x40;
        i++;

        //8 (35-39)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //9 (40-44)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x10;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //A (45-49)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0x90;
        i++;

        //B (50-54)
        memory[i] = (byte) 0xE0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xE0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xE0;
        i++;

        //C (55-59)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //D (60-64)
        memory[i] = (byte) 0xE0;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0x90;
        i++;
        memory[i] = (byte) 0xE0;
        i++;

        //E (65-69)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0xF0;
        i++;

        //F (70-74)
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0xF0;
        i++;
        memory[i] = (byte) 0x80;
        i++;
        memory[i] = (byte) 0x80;
        i++;

    }

    /**
     * Main method.
     *
     * @pamemory args the command line arguments
     */
    public static void main(String[] args) {
        

        
    }//main

}//end
