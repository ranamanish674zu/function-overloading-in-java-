class adder {
   static   int add(int a , int b)
    {
        return a+b;

    }
   static int add (int a,int b,int c)
    {
        return a+b+c;
    }

}
class funoverloading {
    public static void main (String args[])
    { 
    System.out.println(adder.add(12,21));
    System.out.println(adder.add(12,12,122));
    }
    
}
