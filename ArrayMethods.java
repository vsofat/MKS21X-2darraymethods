public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
     int sum = 0;
     if (x < 0 || x >= ary.length){
       return 0;
     }
     for (int i = 0; i < ary[x].length; i++){
       sum += ary[x][i];
     }
     return sum;
   }
   public static int columnSum(int[][] ary, int x){
     int sum = 0;
     if (ary.length == 0 || x < 0){
       return 0;
     }
     for (int i = 0; i < ary.length; i++){
       if (x < ary[i].length){
         sum += ary[i][x];
       }
     }
     return sum;
   }
   public static int[] allRowSums(int[][] ary){
     int[] result = new int[ary.length];
     for (int i = 0; i < result.length; i++){
       result[i] = rowSum(ary, i);
     }
     return result;
   }
   public static int[] allColSums(int[][] ary){
      int max = 0;
      for (int i = 0; i < ary.length; i++){
        if (ary[i].length - 1 > max){
          max = ary[i].length - 1;
        }
      }
      int[] result = new int[max + 1];
      for (int i = 0; i < max + 1; i++){
        result[i] = columnSum(ary, i);
      }
      return result;
    }
    public static boolean isRowMagic(int[][] ary){
     int[] sums = allRowSums(ary);
     for (int i = 0; i < sums.length - 1; i ++){
       if (sums[i] != sums[i + 1]){
         return false;
       }
     }
     return true;
   }
   public static boolean isColumnMagic(int[][] ary){
    int[] sums = allColSums(ary);
    for (int i = 0; i < sums.length - 1; i++){
      if (sums[i] != sums[i + 1]){
        return false;
      }
    }
    return true;
  }
// Alex Thompson (period 3) helped me with this lab. 
}
