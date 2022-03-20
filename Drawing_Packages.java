import Shape.*;
class Drawing implements Parallelogram,Rhombus{
    public void Draw(){
        System.out.println("It Is Rhombus..!");
    }
    public void Draw1(){
        System.out.println("It Is Parallelogram..!");
    }
}
public class Drawing_Packages{
    public static void main(String args[]){
        Drawing d=new Drawing();
        d.Draw();
        d.Draw1();
    }
}