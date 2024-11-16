// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i*2-1;k++)
            {
                if(k%2!=0)
                System.out.print(".");
                else
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}