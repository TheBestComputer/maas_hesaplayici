
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    double tax(){
        if(this.salary < 1000){
            return this.salary;
        }else{
            return this.salary*0.03;
        }
    }
    
    double bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40)*30;
        }else{
            return 0;
        }
    }
    
    double raiseSalary(){
        int yil = (2021 - this.hireYear);
        if(yil < 10){
            return this.salary*0.5;
        }else if(yil > 9 && yil < 20){
            return this.salary*0.1;
        }else{
            return salary*0.15;
        }
    }
    
    void toString1(){
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas Artisi : " + raiseSalary());
        System.out.println("Vergi ve Bonus ile birlikte maas : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maas : " + (this.salary - tax() + bonus() + raiseSalary()));
    }
}
