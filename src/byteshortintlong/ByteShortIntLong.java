
package byteshortintlong;


public class ByteShortIntLong {

  
    public static void main(String[] args) {
       int myValue = 1000;
       int myMinIntValue = Integer.MIN_VALUE;
       int myMaxIntValue = Integer.MAX_VALUE;
       System.out.println("Integer minimum Value =  " + myMinIntValue);
       System.out.println("Integer maximum Value =  " + myMaxIntValue);
       System.out.println(" Busted max value = " + (myMaxIntValue + 1));
       System.out.println("Busted min value =  " +(myMinIntValue - 1));
       
       int myMaxIntTest = 2_147_483_647;
       
       byte myMinByteValue = Byte.MIN_VALUE;
       byte myMaxByteValue = Byte.MAX_VALUE;
       System.out.println("Byte max value = " + (myMaxByteValue + 1));
       System.out.println("Byte min value =  " +(myMinByteValue - 1));
       
       
       short myMinShortValue = Short.MIN_VALUE;
       short myMaxShortValue = Short.MAX_VALUE;
       System.out.println("Short max value = " + (myMaxShortValue + 1));
       System.out.println("Short min value =  " +(myMinShortValue - 1));
       
       
       long myLongValue = 100L;   // stores upto 2^63
       long myMinLongValue = Long.MIN_VALUE;
       long myMaxLongValue = Long.MAX_VALUE;
       System.out.println("Short max value = " + (myMaxLongValue + 1));
       System.out.println("Short min value =  " +(myMinLongValue - 1));
       long bigLongLiteralValue = 2_147_438_647_234L;
       System.out.println(bigLongLiteralValue);
       
       short bigShortLittleValue = 32767;
       
       int myTotal = (myMinIntValue/2);
       byte myNewByteValue = (byte) (myMinByteValue /2);
       short myNewShortValue = (short) (myMinShortValue/2);
       
       
       
    }
    
}
