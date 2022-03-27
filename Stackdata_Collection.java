import java.util.*;
class Stackdata_Collection{
    public static void main(String args[]){
        Stack <Integer> st=new Stack();
        st.push(12);
        st.push(55);
        st.push(65);
        st.push(55);
        st.push(10);
        st.pop();
        System.out.println("Elements are :"+st);
         System.out.println("Removed element Is :"+st.remove(2) );
    }
}