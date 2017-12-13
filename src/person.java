/**
 * Person class is a class to represent person with name and age
 */
class Person {
    String name;
    int age;

    /**
     * Person constructor is used to initialize name with "Abraham" and age with "22"
     */
    public Person() {
        name = "Abraham";
        age = 25;
    }

    /**
     * Person constructor initializes a person object with
     * @param name
     * @param age
     */
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    /**
     * getter method or accessor method
     * @return name of a person
     */
    public String getName(){
        return name;
    }

    /**setter method or mutator method for name
     * @param name
     */
    public void setName(String name){
        this.name= name;
    }

    /**
     * getter/accessor/ method for age
     * @return age
     */
    public int getAge(){
        return age;
    }

    /**
     * setter/muttator/ method for age
     * @param age
     */
    public void setAge(int age){
        this.age=age;
    }

    /**
     *toString method returns a string that  represents this object
     * @return name and age
     */
    public String toString(){
        return "Name "+ this.name +" Age "+this.age;
    }

}


class PersonDriver {
    public static void main(String []args){
        Person Sam=new Person();
        System.out.println(Sam);
        Sam.setName("Sam");
        Sam.setAge(22);
        System.out.println(Sam.getName());
        System.out.println(Sam.getAge());

        Person Hanna= new Person("Hanna", 14);
        if (Sam.getName().equals(Hanna.getName()) && (Sam.getAge()==Hanna.getAge())){
            System.out.println("Two persons have same name and age");
        }
        else if(Sam.getAge()>Hanna.getAge()){
            System.out.println("Beth is older than Hanna");
        }
        else if(Hanna.getAge()>Sam.getAge()){
            System.out.println("Hanna is older than Beth");
        }
        else{System.out.println("Two persons do not have same name and age");}
    }
}