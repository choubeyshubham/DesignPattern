package StructuralDesignPattern.Decorator.Implementation.Example2;

import java.io.*;

public class Client {
    public static void main(String[] args)
    {
        int c;

        StringBuffer stringBuffer = new StringBuffer("Jason Fedin aaaBBBBcccDDDD");
        byte[] bytes = stringBuffer.toString().getBytes();

        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

