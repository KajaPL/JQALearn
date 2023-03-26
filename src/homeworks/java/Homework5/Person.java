package Homework5;

class Person {
   private String name;
   private int age;
    private Boolean isMan;

    public Person(String name, int age, Boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getMan() {
        return isMan;
    }

    public void setMan(Boolean man) {
        isMan = man;
    }

    public void showPersonInfo() {
        System.out.println("\nName: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Is man: " + this.isMan);
    }

}
/*Да се направи иерархия от класовете Person, Student и Employee
 Класът Person репрезентиращ човек да има следните
 Полета:
 – name - име
 – age - години
 – isMan - поле, показващо пола

 Коструктори:
– Единствен конструктор, с параметри за всичките полета на класа
Метод:

– Метод showPersonInfo, който показва информация за човека
(изписва на конзолата стойността на всичките му полета по
подходящ начин)
 */
