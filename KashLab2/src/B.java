/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-08-25 10:05

 "Put description here..."

*/
public class B extends A {
    int k;

    B(int a,int b,int c){
        super(a, b);
        this.k=c;

    }


    @Override
    void show(){
        System.out.println("k="+k);
    }

}
