package oops;

import accessModifiers.Private;

public class Encapsul {
    private int age;
    private String name;
    private int rollno;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

   /* public void setName(String branch) {
       this.name = branch;
    }*/
   public void setName(String name) {
       this.name = name;
   }
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
