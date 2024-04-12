package lang.clazz;

import java.util.*;

public class RandomLotto {
    public static void main(String[] args) {
        Random random = new Random();


        Set<Integer> set = new HashSet<>();

        while(set.size() != 6) {
            int randomNumber = random.nextInt(45) + 1; // 1 ~ 45
            set.add(randomNumber);
        }

        // set -> array
        Integer[] lottoNumbers = set.toArray(new Integer[0]);

        // array -> set
        Set<Integer> reSet = new HashSet<Integer>(Arrays.asList(lottoNumbers));
        System.out.println("로또번호 : " + reSet);

        System.out.println(Arrays.toString(lottoNumbers));



    }

}
