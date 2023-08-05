public class Employee {
    String name;
    int salary;// maaş
    int workhours;//haftalık çalışma saati
    int hireYear;// işe başlama yılı
    int nowYear=2021;
    int taxAmount;
    int extras;
    int yearWorked;
    int extraPay;
    Employee(String name, int salary, int workhours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workhours=workhours;
        this.hireYear=hireYear;
    }
    void infoString(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+salary);
        System.out.println("İşe başlama yılı: "+hireYear);
        System.out.println("Çalışma saati: "+workhours);
    }
   public void tax(){// maaşa uygun vergi hesaplayan metot
        if (salary>1000){
            taxAmount=(salary*3)/100;
            System.out.println("Vergi: "+taxAmount);
        }else{
            taxAmount=0;
            System.out.println("Vergi: uygulanmaz");
        }
    }
   public void bonus(){ //40 saatten fazla çalışmışsa çalıştığı her saat için 30 tl
        if (workhours>40){
            extras=workhours-40;
            int bonus=extras*30;
            System.out.println("Bonus: "+bonus);
        }else if(workhours<=40){
            int bonus=0;
            System.out.println("Bonus: 0");
        }
    }

   public void raiseSalary(){// çalıştığı seneye göre zam
        yearWorked =nowYear - hireYear;
        if (yearWorked<10){
             extraPay=(salary*5)/100;
            System.out.println("Maaş artışı: "+extraPay);
        }else if (9<yearWorked&&20>yearWorked){
            extraPay=(salary*10)/100;
            System.out.println("maaş artışı: "+extraPay);
        } else if (19<yearWorked){
            extraPay=(salary*15)/100;
            System.out.println("maaş artışı: "+extraPay);
        }


       }

    }
