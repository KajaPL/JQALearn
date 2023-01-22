package Homework5;

class Student extends Person {
private double score;
    public Student(String name, int age, Boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void showStudentInfo() {
        System.out.println("\nName: " + this.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Is man: " + super.getMan());
        System.out.println("Score: " + this.getScore());
    }
}
/*Класът Student наследяващ Person, репрезентиращ ученик да има
 Полета:
 – score - показва оценката на ученика (число между 2 и 6, не е
 задължително да е цяло)
 Единствен конструктор:
 – Student(String name, int age, boolean isMan, double score)
 задаващ стойности и на наследените полета

 Метод showStudentInfo() който показва информация за човека и
 информация за оценката му (чрез надписи на екрана)*/