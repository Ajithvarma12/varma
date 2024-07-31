class  application
{
  public static void main(String args[])
  {
   String name="Ajith";
   char section='A';
   int roll = 26;
   int s1=80,s2=80,s3=90;
   int max=300;
   double total = s1+s2+s3;
   double percentage = total/max*100;
   String status = "pass";
   System.out.println(percentage);
   if(percentage<35)
   {
    status="fail";
   }
   System.out.println(status);
  }
}