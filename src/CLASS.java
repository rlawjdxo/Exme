import java.util.Arrays;
import java.util.List;

public class CLASS {
    public static void main(String[] args) {
        class Student{
            private Student name;
            private  int a,b,c,d,e;

            public  Student(String name, int a, int b,int c,int d,int e) {
                this.name = name;
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.e = e;
            }
            public String getName(){
                return name;
            }
            public String getA(){
                return a;
            }
            public String getB(){
                return b;
            }
            public String getC(){
                return c;
            }
            public String getD(){
                return d;
            }
            public String getE(){
                return e;
            }
            static List<Student> student = Arrays.asList(
                    new Student("최인하", 100, 99, 100),
                    new Student("홍길동", 80, 81, 83)
            );

            public class StudentTest{
                public static void main(String[] args) {
                    System.out.println("입력 :" StudentTest.);
                }
            }
        }
    }
}
