class StringOutOfBoundsException_Try_Catch{
    public static void main(String args[]){
        String a="Hari";
        try{
        System.out.println(a.charAt(4));
        }
        catch(Exception c)
        {
            System.out.println(c);
        }
         System.out.println(a);
    }
}