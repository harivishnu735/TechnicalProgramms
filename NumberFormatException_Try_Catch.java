class NumberFormatException_Try_Catch{
    public static void main(String args[]){
        String s="hari";
        try {
        int num=Integer.parseInt(s);
        System.out.println(num);
        }
        catch(Exception a)
        {
        System.out.println(a);
        }
        System.out.println("******Number Format*****");
    }
}