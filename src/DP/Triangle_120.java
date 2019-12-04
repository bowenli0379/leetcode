package DP;

import java.util.List;

public class Triangle_120 {
    public static int minimumTotal(List<List<Integer>> triangle){
        if (triangle.size() == 0)
            return 0;
        if (triangle.get(0).size() == 0)
            return 0;
        for (int i = triangle.size()-2; i>=0; i--){
            for (int j = 0; j <= i; j++){
                triangle.get(i).set(j,triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
