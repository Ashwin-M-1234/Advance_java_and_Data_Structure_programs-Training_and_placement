public class FloydsTriangle
{
   public static void main(String[] args)
   {
      int row=10, i, j, num=1;
      for(i=0; i<row; i++)
      {
         for(j=0; j<=i; j++)
         {
            System.out.print(num+ " ");
            num++;
         }
         
         System.out.print("\n");
      }
   }
}
