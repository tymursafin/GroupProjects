/*We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code*/

class marksTester {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(66, 88, 99);
        System.out.println(studentA.getAvarage());

        StudentB studentB = new StudentB(60, 70, 80, 90);
        System.out.println(studentB.getAvarage());
    }
}

abstract class Marks {
    int mark1;
    int mark2;
    int mark3;

    public Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    abstract double getAvarage(); // I renamed method to "getAvarage" because "getPercentage" does not match the function it performs

}

class StudentA extends Marks {

    StudentA(int mark1, int mark2, int mark3) {
        super(mark1, mark2, mark3);

    }

    double getAvarage() {
        return (mark1 + mark2 + mark3) / 3;
    }
}

class StudentB extends Marks {
    int mark4;

    StudentB(int mark1, int mark2, int mark3, int mark4) {
        super(mark1, mark2, mark3);
        this.mark4 = mark4;
    }

    double getAvarage() {
        return (mark1 + mark2 + mark3 + mark4) / 4;
    }
}