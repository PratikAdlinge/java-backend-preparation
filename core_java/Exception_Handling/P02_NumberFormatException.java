package Exception_Handling;

class P02_NumberFormatException {
    public static void main(String[] args) {
        String str="Pratiksha";
        try {
            int a=Integer.parseInt(str);
            System.out.println(a);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("String name cannot parse in int ");
            System.out.println(e);
        }
        System.out.println(str);
       
        
        
    }
}