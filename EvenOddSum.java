class EvenOddSum{
  public static void main(String args[]){
    int arr[]={2,3,4,5,6,7};
    int esum=0,osum=0;
    
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        esum=esum+arr[i];
    
      }
      else{
        osum=osum+arr[i];
      }
    
    }
    System.out.println("Even Numbers Sum:"+esum);
    System.out.println("Odd Numbers Sum:"+osum);
  }
}