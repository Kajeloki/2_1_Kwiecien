class Main { 
  public static void main(String[] args) {
    char x='#';
    int spacja=5;
    for(int k=0;k<2;k++)
      {
        spacja=5;
    for (int i=1;i<10;i++) 
    {
      if(i<5)
      {
         for(int j=0;j<spacja;j++) 
        System.out.print(" ");
      for(int j=0;j<i;j++) 
        System.out.print(x); 
      System.out.println();
      spacja--;}
       
      if (i>5 && i<10)
      {
        spacja=5;
        for(int j=0;j<spacja;j++) 
        System.out.print(" ");
      for(int j=0;j<(i-5);j++) 
        System.out.print(x); 
      System.out.println();
    }
    }
        }
    }
}
        
      
//}

