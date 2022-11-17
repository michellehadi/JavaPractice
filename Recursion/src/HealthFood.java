import java.util.ArrayList;
import java.lang.*;
public class HealthFood {
    public int[] dietMeal(int[] protein, int[] carbs, int[] fat, String[] dietPlans, int[] index, int n) {
        // base case
        if (n == dietPlans.length) {
            return index;
        }
        int[] array = new int[protein.length];
        for (int i=0; i<array.length; i++) {
            array[i] = i;
        }

        for (int i=0; i<dietPlans[n].length(); i++) {
            if (dietPlans[n].charAt(i) == 'C') {
                array = maxValue(carbs, array);
                if (array.length == 1) {
                    break;
                }
            }
            else if (dietPlans[n].charAt(i) == 'F') {
                array = maxValue(fat, array);
                if (array.length == 1) {
                    break;
                }
            }
            else if (dietPlans[n].charAt(i) == 'P') {
                array = maxValue(protein, array);
                if (array.length == 1) {
                    break;
                }
            }
            else if (dietPlans[n].charAt(i) == 'T') {
                array = maxCalories(protein,carbs,fat,array);
                if (array.length == 1) {
                    break;
                }
            }
            else if (dietPlans[n].charAt(i) == 'c') {
                array = minValue(carbs, array);
                if (array.length == 1) {
                    break;
                }
            }
            else if (dietPlans[n].charAt(i) == 'f') {
                array = minValue(fat, array);
                if (array.length == 1) {
                    break;
                }
            }
            else if (dietPlans[n].charAt(i) == 'p') {
                array = minValue(protein, array);
                if (array.length == 1) {
                    break;
                }
            }
            else if (dietPlans[n].charAt(i) == 't') {
                array = minCalories(protein,carbs,fat,array);
                if (array.length == 1) {
                    break;
                }
            }
        }
        index[n] = array[0];
        return dietMeal(protein,carbs,fat,dietPlans,index,n+1);
    }
    public int[] maxValue(int[] array, int[] surviveArr) {  // { 4, 5, 6, 8, 10} {2, 4}
        int maxVal = 0;
        ArrayList<Integer> indexMaxVal = new ArrayList<>();
        for (int i=0; i<surviveArr.length; i++) {
            if (array[surviveArr[i]] > maxVal) {
                indexMaxVal.clear();
                indexMaxVal.add(surviveArr[i]);
                maxVal = array[surviveArr[i]];
            } else if (array[surviveArr[i]] == maxVal) {
                indexMaxVal.add(surviveArr[i]);
                maxVal = array[surviveArr[i]];
            }
        }
        int[] arrIndexVal = new int[indexMaxVal.size()];
        for (int i=0; i<indexMaxVal.size(); i++) {
            arrIndexVal[i] = indexMaxVal.get(i);
        }
        return arrIndexVal;
    }
    public int[] minValue(int[] array, int[] surviveArr) {  // { 4, 5, 6, 8, 10} {2, 4}
        int minVal = 101; // array[surviveArr[0]];
        ArrayList<Integer> indexMinVal = new ArrayList<>();
        for (int i=0; i<surviveArr.length; i++) { //i=1
            if (array[surviveArr[i]] < minVal) {
                indexMinVal.clear();
                indexMinVal.add(surviveArr[i]);
                minVal = array[surviveArr[i]];
            } else if (array[surviveArr[i]] == minVal) {
                indexMinVal.add(surviveArr[i]);
                minVal = array[surviveArr[i]];
            }
        }
        int[] arrIndexVal = new int[indexMinVal.size()];
        for (int i=0; i<indexMinVal.size(); i++) {
            arrIndexVal[i] = indexMinVal.get(i);
        }
        return arrIndexVal;
    }
    public int[] maxCalories(int[] protein, int[] carbs, int[]fat, int[] surviveArr) {
        int maxVal = 0;
        ArrayList<Integer> indexMaxVal = new ArrayList<>();
        for (int i=0; i<surviveArr.length; i++) {
            int maxCal = protein[surviveArr[i]] * 5 + carbs[surviveArr[i]] * 5 + fat[surviveArr[i]] * 9;
            if (maxCal > maxVal) {
                indexMaxVal.clear();
                indexMaxVal.add(surviveArr[i]);
                maxVal = maxCal;
            } else if (maxCal == maxVal) {
                indexMaxVal.add(surviveArr[i]);
            }
        }
        int[] arrIndexVal = new int[indexMaxVal.size()];
        for (int i=0; i<indexMaxVal.size(); i++) {
            arrIndexVal[i] = indexMaxVal.get(i);
        }
        return arrIndexVal;
    }
    public int[] minCalories(int[] protein, int[] carbs, int[]fat, int[] surviveArr) {
        int minVal = 9999;
        ArrayList<Integer> indexMinVal = new ArrayList<>();
        for (int i=0; i<surviveArr.length; i++) {
            int minCal = protein[surviveArr[i]] * 5 + carbs[surviveArr[i]] * 5 + fat[surviveArr[i]] * 9;
            if (minCal < minVal) {
                indexMinVal.clear();
                indexMinVal.add(surviveArr[i]);
                minVal = minCal;
            } else if (minCal == minVal) {
                indexMinVal.add(surviveArr[i]);
            }
        }
        int[] arrIndexVal = new int[indexMinVal.size()];
        for (int i=0; i<indexMinVal.size(); i++) {
            arrIndexVal[i] = indexMinVal.get(i);
        }
        return arrIndexVal;
    }
    public int[] selectMeals(int[] protein, int[] carbs, int[] fat, String[] dietPlans) {
        return dietMeal(protein, carbs, fat, dietPlans, new int[dietPlans.length], 0);
    }
}
