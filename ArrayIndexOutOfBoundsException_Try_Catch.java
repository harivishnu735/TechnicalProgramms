class ArrayIndexOutOfBoundsException_Try_Catch{
    public static void main(String args[]){
        int ar[]={1,2,3,4,5,6};
        try{
        System.out.println(ar[7]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(ar[5]);
    }
}