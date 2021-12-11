import java.util.Arrays;
import java.util.List;

public class CLASS {
    public static void main(String[] args) {
        class Student{
            private String name;
            private  int a,b,c,d,e;

            public  Student(String name, int a, int b,int c,int d,int e) {
                this.name = name;
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.e = e;
            }

            public Student(String 최인하, int a, int b, int c) {
            }

            public String getName(){
                return name;
            }
            public int getA(){
                return a;
            }
            public int getB(){
                return b;
            }
            public int getC(){
                return c;
            }
            public int getD(){
                return d;
            }
            public int getE(){
                return e;
            }
            static List<Student> student = Arrays.asList(
                    new Student("최인하", 100, 99, 100),
                    new Student("박인하", 80, 81, 83),
                    new Student("최인하", 90, 61, 93),
                    new Student("고인하", 78, 88, 88)
            );

            class StudentTest{
                public static void main(String[] args) {
                    System.out.println("1. 학생 성적 등록" );
                    System.out.println("2. 학생 조회" );
                    System.out.println("3. 성적 출력" );
                    System.out.println("4. 학생 삭제" );
                    System.out.println("8. 종료(종료 시 8 입력)" );
                }

            }
        }
    }
}
