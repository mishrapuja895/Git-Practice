interface Bandar{
int getsum(int n1,int n2);


}
Class BandarImp implements Bandar{
public int getsum(int n1,int n2)
{
    return n1+n2;
}
}
public Class BandarDriver
{
    public static void main(string[] args)
    {
        Scanner s= new scanner(System.in);
        system.out.println("Enter 2 numbers to find sum");
        int n1=s.nextInt();
        int n2=s.nextInt();
        BandarImp b= new BandarImp();
        int sum= c.getSum(n1,n2);
        System.out.println("sum");
    }
}

