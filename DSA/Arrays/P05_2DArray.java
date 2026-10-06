public class P05_2DArray {
    public static void main(String[] args) {
        int [][] integerarray=new int [2][2];
        integerarray[0][0]=1;
        integerarray[0][1]=2;
        integerarray[1][0]=3;
        integerarray[1][1]=4;
        
        System.out.println("2D Array elements is:");
        for(int i=0;i<integerarray.length;i++) {
            for(int j=0;j<integerarray.length;j++){
                System.out.print(integerarray[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
