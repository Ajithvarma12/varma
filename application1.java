class application1
{ 
 public static void main(String args[])
  {
    String name = "Ajith";
    char section = 'a';
    int roll = 26;
    int s1=80,s2=79,s3=90,s4=99;
    double total= s1+s2+s3+s4;
    int max = 400;
    int scholarship=0;
    int Fee=30000;
    double percentage = total/max*100;
    System.out.println(percentage);
    if(percentage>75)
     {
      scholarship=15000;
     }
    System.out.println(Fee-scholarship);
   }
}