public class Person {
    private int age;
    public String name;
    public float height;
    public String gender;

    public String introducePerson() {
        return "Hello I am " + name +
                "I am " + height + " cm tall" +
                " I am a" + gender;
    }

    void setAge(int ageToSet){
        age = ageToSet;
    }
}
