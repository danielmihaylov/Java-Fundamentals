package JavaOOPAdvanced.Generics.listUtilitiesFlatMethod.listUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Collections.addAll(ints,1,3,36,61,34,88,null,11,null);

        System.out.println(ListUtils.getNullIndices(ints));
    }
}
