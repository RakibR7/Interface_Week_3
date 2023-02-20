package ie.atu.productv5;

public class Animal implements Printable{
    String type;
    String age;
    String breed;
    String price;

    public Animal (String breed, String vacc){
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "vacc='" + type + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
