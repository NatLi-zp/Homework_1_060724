public class Main {
    public static void main(String[] args) {

        char myChar = 'G';
        int myInt = 89;
        byte myByte = 4;
        short myShort = 56;
        float myFloat = 4.7333436f;
        double MyDouble = 4.355453532;
        long myLong = 12121;

        System.out.println("char: " + myChar);
        System.out.println("int: " + myInt);
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + MyDouble);
        System.out.println("long: " + myLong);

        Character myChar2 = 'G';
        Integer myInt2 = 89;
        Byte myByte2 = 4;
        Short myShort2 = 56;
        Float myFloat2 = 4.7333436f;
        Double myDouble2 = 4.355453532;
        Long myLong2 = 12121L;

        System.out.println(" ");
        System.out.println("Character: " + myChar2);
        System.out.println("Integer: " + myInt2);
        System.out.println("Byte: " + myByte2);
        System.out.println("Short: " + myShort2);
        System.out.println("Float: " + myFloat2);
        System.out.println("Double: " + myDouble2);
        System.out.println("Long: " + myLong2);

        System.out.println(" ");
        int num = 345;
        int num1 = num / 100;
        int num3 = num % 10;
        int num2 = (num - num1 * 100) / 10;
        System.out.println(num1 + "," + num2 + "," + num3);
    }
}