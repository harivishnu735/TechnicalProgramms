class Thread3 extends Thread{
  Object obj1="ABC";
  Object obj2="XYZ";
  public void run(){
    synchronized (obj1){
      System.out.println("Obj1 is locked by "+Thread.currentThread().getName());
    }
    try{
      Thread.sleep(1000);
    }
    catch(Exception e){
      System.out.println(e);
    }
    synchronized (obj2){
      System.out.println("Obj2 is locked by "+Thread.currentThread().getName());
    }
    
  }
}

class Thread4 extends Thread{
  Object obj1="ABC";
  Object obj2="XYZ";
  public void run(){
    synchronized (obj2){
      System.out.println("Obj2 is locked by "+Thread.currentThread().getName());
    }
      try{
      Thread.sleep(1000);
    }
    catch(Exception e){
      System.out.println(e);
    } 
    synchronized (obj1){
      System.out.println("Obj1 is locked by "+Thread.currentThread().getName());
    }
    
  }
}

class DeadLockExample{
  public static void main(String[] args){
    Thread3 t3=new Thread3();
    Thread4 t4=new Thread4();
    t3.start();
    t4.start();
  }
}