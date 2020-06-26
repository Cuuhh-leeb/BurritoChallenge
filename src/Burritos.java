import java.util.ArrayList;

public class Burritos {
    public static void main(String[] args){

        //variables
        int counter = 1;
        int ingCounter = 0;

        //do while loop that continues until the counter variable equals 25
        do {
            //Burrito array
            ArrayList<String> burrito = new ArrayList<>();


            burrito.add(riceChoice());


            burrito.add(meatChoice());


            burrito.add(beanChoice());


            burrito.add(salsaChoice());

            burrito.add(veggieChoice());

            burrito.add(cheeseChoice());

            burrito.add(guacChoice());

            burrito.add(quesoChoice());

            burrito.add(sourCreamChoice());

            System.out.print("Burrito " + counter + ": ");
            for(int i = 0; i < burrito.size(); i++){


                if(burrito.get(i).contains("all")){
                    ingCounter ++;
                }else if(!burrito.get(i).contains("no")){
                    ingCounter++;
                }

                if(i < (burrito.size()-1)){
                    System.out.print(burrito.get(i) + ", ");

                }else{
                    System.out.print(burrito.get(i));
                }
            }
            cost(counter, ingCounter);

            System.out.println();

            burrito.clear();

            ingCounter = 0;

            counter++;

        }while(counter <= 25);

    }

    private static void cost(int count, int ingred){
        System.out.println("\nBurrito " + count + " costs: $" + (3 +(.50*ingred)) + "0");
    }

    //riceChoice Method
    private static String riceChoice(){
        //Rice array
        ArrayList<String> rice = new ArrayList<>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("all rice");
        rice.add("no rice");

        return rice.get((int) (Math.random()* rice.size()));
    }

    //meatChoice Method
    private static String meatChoice(){
        //Meat array
        ArrayList<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggie meat");
        meat.add("no meat");
            /*
            Meat random number generator.
            Whatever index is chosen the value is returned
            */
        return meat.get((int) (Math.random()* meat.size()));
    }

    //beanChoice Method
    private static String beanChoice(){
        //Beans array
        ArrayList<String> beans = new ArrayList<>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("all beans");
        beans.add("no beans");

        return beans.get((int) (Math.random()* beans.size()));
    }

    //salsaChoice method
    private static String salsaChoice(){
        //Salsa Array
        ArrayList<String> salsa = new ArrayList<>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("all salsa");
        salsa.add("no salsa");


        return salsa.get((int) (Math.random()* salsa.size()));
    }

    //veggieChoice Method
    private static String veggieChoice(){
        //Veggies Array
        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("diced tomato");
        veggies.add("all veggies");
        veggies.add("no veggies");

        return veggies.get((int) (Math.random()* veggies.size()));
    }

    //cheeseChoice Method
    private static String cheeseChoice(){
        //Cheese Array
        ArrayList<String> cheese = new ArrayList<>();
        cheese.add("cheese");
        cheese.add("no cheese");

        return cheese.get((int) (Math.random()* cheese.size()));
    }

    //guacChoice Method
    private static String guacChoice(){
        //Guac Array
        ArrayList<String> guac = new ArrayList<>();
        guac.add("guac");
        guac.add("no guac");

        return guac.get((int) (Math.random()* guac.size()));
    }

    //quesoChoice Method
    private static String quesoChoice(){
        //Queso Array
        ArrayList<String> queso = new ArrayList<>();
        queso.add("queso");
        queso.add("no queso");

        return queso.get((int) (Math.random()* queso.size()));
    }

    //sourCreamChoice Method
    private static String sourCreamChoice(){
        //Sour Cream Array
        ArrayList<String> sourCream = new ArrayList<>();
        sourCream.add("sour cream");
        sourCream.add("no sour cream");

        return sourCream.get((int) (Math.random()* sourCream.size()));
    }

}