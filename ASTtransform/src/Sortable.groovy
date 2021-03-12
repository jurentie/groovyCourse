@groovy.transform.Sortable
class Dog {

    String breed
    String color
    Integer age
    BigDecimal weight

    Dog(String breed, String color, Integer age, BigDecimal weight){
        this.breed = breed
        this.color = color
        this.age = age
        this.weight = weight
    }

}

Dog dog1 = new Dog("Mastiff", "fawn", 2, 80.0)
Dog dog2 = new Dog("Mastiff", "fawn", 2, 80.0)
Dog dog3 = new Dog("Mastiff", "fawn", 1, 80.0)

println dog1 == dog2
println dog3 < dog1