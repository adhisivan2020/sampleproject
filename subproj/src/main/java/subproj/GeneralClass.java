/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package subproj;

public class GeneralClass {

    public int addnum(int a, int b){
        return (a+b);
    }

    public int subnum(int a, int b){
        return (a-b);
    }

    public int multiply(int a, int b){
        return (a*b);
    }

    public float divide(int a, int b){
        if (b!=0)
            return a/b;
        else
            return 0;
    }
}
