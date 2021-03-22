public class Pet {
    public int age;
    public String name;
    public String breed;
    public String colour;
    public String gender;



    public String introducePet() {
        return "Hello! This is " + name +
                ". She is a " + gender + " and " + breed +
                ". \nShe is " + colour + " and she will be " + age + " years old.";
    }


public class PetCat {
    private int age;
    public String name;
    public String gender;
    public String breed;
    public String colour;

}

        public String introducePetCat() {
            return "And this is  " + name + ". He is " + age +
                    " years old and a " + gender + ". \nHe is a big cat." +
                    " \nCharlies breed is a  " + breed + " and he is " + colour + ".";
        }

        void setAge(int ageToSet) {
            age = ageToSet;
        }
    }
