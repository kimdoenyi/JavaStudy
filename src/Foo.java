public class Foo {
    /*
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        // 함수형 인터페이스를 구현할때 쓸 수 있는 구문식을 람다식이라고 함. 코드를 줄일 수 있음
        RunSomething runSomething = () -> {
            // 실행해야 할 내용이 한줄이 아닌 경우 {} 로 묶어서 사용 가능
            // 특수한 형태의 오브젝트이다 람다는
            // 함수가 함수를 매개변수로 받을 수 있고 함수리턴도 가능(고차함수)
            System.out.println("Hello");
            System.out.println("Test");
        };
        runSomething.doIt();
    }

     */

    // 람다 : 함수형 인터페이스의 인스턴스를 만드는 방법으로 쓰임
    // 메소드 매개변수, 리턴 타입, 변수로 만들어서 사용가능
    public static void main(String[] args) {
        // 입력받은 값이 동일한 경우 결과값이 같아야 함

        /*
        RunSomething runSomething = new RunSomething() {
            @Override
            public int doIt(int num) {
                return num+1;
            }
        };
        */


        // 위 주석 부분을 아래처럼 표현한게 람다식
        RunSomething runSomething = num -> {
            System.out.println("num = " + num);
            System.out.println("num = " + num);
        };



    }
}
