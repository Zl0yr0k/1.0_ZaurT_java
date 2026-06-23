package exception;

import java.util.Objects;

public class Tiger {

    void canEat(String meal) {
        if (meal.equals("myaso") || meal.equals("meat")) {
            System.out.println("Tiger have eating soon meat ");
        } else {
            throw new NyMyasoException("Tiger haven't eat " + meal);
        }
    }

    void canDrink (String drink) throws NeVodaException {
        if (drink.equals("water") || drink.equals("voda")) {
            System.out.println("Tiger can drink");
        } else {
            throw new NeVodaException("Tiger can't drink " + drink);
        }
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        return true;
    }
    @Override
    public int hashCode () {
        return 1;
    }

}
