package util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {


    public static BigDecimal randomBigDecimal() {
        int range = 100000;
        BigDecimal max = new BigDecimal(range);
        BigDecimal randFromDouble = new BigDecimal(Math.random());
        BigDecimal actualRandomDec = randFromDouble.multiply(max);
        actualRandomDec = actualRandomDec
                .setScale(2, RoundingMode.DOWN);
        System.out.println(actualRandomDec);

        return actualRandomDec;
    }
    public static Date randomDate() {
        LocalDate startDate = LocalDate.of(1990, 1, 1); //start date
        long start = startDate.toEpochDay();


        LocalDate endDate = LocalDate.now(); //end date
        long end = endDate.toEpochDay();


        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        LocalDate randomLocalDate = LocalDate.ofEpochDay(randomEpochDay);
        Date randomDate = Date.from(randomLocalDate.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());

        return randomDate;
    }

    public static int getRandomInt(int min, int max){
        int x = (int) ((Math.random()*((max-min)+1))+min);
        return x;
    }

    public static String getCEP(){
        int max = 9,min = 0;
        String cep = "";
        for (int i =0; i<9; i++){
            cep += getRandomInt(min, max);
        }


        return cep;
    }

}

