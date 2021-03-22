public class Main {
    public static void main(String[] args) {
        Pet Neda = new Pet();
        {

            Neda.name = "Neda";
            Neda.gender = "female";
            Neda.breed = "german shepard mix";
            Neda.colour = "brown with black spots";
            Neda.age = (10);

            Neda.introducePet();

            System.out.println(Neda.introducePet());
        }

        Pet Charlie = new Pet();
        {

            Charlie.name ="Charlie";
            Charlie.gender ="male";
            Charlie.breed ="maine coon";
            Charlie.colour ="grey";
            Charlie.setAge(4);
        }

        Charlie.introducePet();

        System.out.println(Charlie.introducePetCat());
    }}