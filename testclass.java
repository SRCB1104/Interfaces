public class testclass implements aritmeticos{

    public static void main(String[] args) {
        System.out.println(new testclass().suma(2,6));
        System.out.println(new testclass().resta(9,1));
        System.out.println(new testclass().multiplicacion(4,2));
        System.out.println(new testclass().division(16,2));
    }

    public int suma(int x, int y)
    {return x+y;}
    public int resta(int x, int y)
    {return x-y;}
    public int multiplicacion(int x, int y)
    {return x*y;}
    public int division(int x, int y)
    {return x/y;}
}
interface aritmeticos{
    int suma (int x, int y);
    int resta (int x, int y);
    int multiplicacion (int x, int y);
    int division(int x, int y);
}
