package Homework5;

class Employee extends Person {
    private double daySalary;

    public Employee(String name, int age, Boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public double calculateOvertime() {
        double overtime = 0;
        if (super.getAge() > 18) {
            int workingHours = 8;
            double bonus = 1.5;
            int overtimeHours = 2;
            double sum = (((daySalary / workingHours) * bonus) * overtimeHours);
            System.out.printf("Pay for overtime is: %.2f\n", sum);
        }
        return overtime;
    }

    public void showEmployeeInfo() {
        System.out.println("\nName:" + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Is man: " + super.getMan());
        System.out.println("Salary: " + this.getDaySalary());
    }
}

/*
Класът Employee да наследява Person и да дефинира:
Полета:
– daySalary показва дневната заплата на работника
Конструктор които инициализира всичките му полета (собствени и
наследени)
Методи:
В случай че на работник се наложи да работи извън работно време,
на него му се дължи допълнителна сума пари (overtime) за часовете
които е работил. Сумата се пресмята по следния начин: ако работника, няма
навършени 18 години, дължимата сума е 0. В противен случай, за всеки
отработен час, на работника се заплаща сумата която получава на час
(зависи от дневната заплата) умножена по 1,5.
– метод calculateOvertime(double hours) който пресмята и връща
стойността на сумата която му се дължи при работа извън работно
време
– метод showEmployeeInfo(), който показва информация за човека,
както и информация за дневната му заплата

 */