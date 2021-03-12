import groovy.transform.ToString

@groovy.transform.AutoClone
@ToString
class Person {

    String name
    Integer age
    String gender

    Person(String name, Integer age, String gender){
        this.name = name
        this.age = age
        this.gender = gender
    }

}

Person justin1 = new Person("Justin", 24, "M")
Person justin2 = justin1.clone()

println justin2
