import java.util.ArrayList;
public class TopographicalImage {
    // Find highest ASCII value-----------Find the smallest coordinate------- = Peak(x,y)
    // Recurse surrounding, when x-1,x+1,y-1,y+1 value < Peak(x,y) -- = count number, save coordinate
    // When total coordinate - save coordinate > 0, recurse to find the highest ASCII value again.

    public static int[][] visited = new int[50][50];

    public static int[] calcPeakAreas(String[] topoData) {

        ArrayList<Integer> res = new ArrayList<>();
        res = getResult(topoData,res);
        int[] result = new int[res.size()];
        for (int i=0; i<result.length; i++) {
            result[i] = res.get(i);
        }
        visited = new int[50][50];
        return result;
    }

    public static ArrayList<Integer> getResult(String[] topoData, ArrayList<Integer> res) {
        int x = 0;
        int y = 0;
        int ascii = 0;
        // looping to find the highest value ascii
        for (int i=0; i<topoData.length; i++) {
            for (int j=0; j<topoData[0].length(); j++) {
                if ((int) topoData[i].charAt(j) > ascii && visited[i][j] == 0) {
                    x = i;
                    y = j;
                    ascii = (int) topoData[i].charAt(j);
                }
                else if ((int) topoData[i].charAt(j) == ascii && visited[i][j] == 0) {
                    if (x > i) {
                        x = i;
                        y = j;
                    }
                }
            }
        }
        res.add(countArea(topoData, x, y, ascii));
        if (checkAvailable(topoData)) {
            getResult(topoData,res);
        }
        return res;
    }

    public static int countArea(String[] topoData, int x, int y, int ascii) {
        // base case
        if (x < 0 || y < 0 || x > topoData.length-1 || y > topoData[0].length()-1 || visited[x][y] == 1) {
            return 0;
        }
        if (topoData[x].charAt(y) <= ascii) {
            ascii = topoData[x].charAt(y);
            visited[x][y] = 1;
            return 1 + countArea(topoData, x+1, y, ascii) + countArea(topoData, x-1, y, ascii) +
                    countArea(topoData, x, y+1, ascii) + countArea(topoData, x, y-1, ascii) +
                    countArea(topoData,x+1, y+1, ascii) + countArea(topoData, x-1, y-1, ascii) +
                    countArea(topoData, x-1, y+1, ascii) + countArea(topoData, x+1, y-1, ascii);
        }
        return 0;
    }
    public static boolean checkAvailable(String[] topoData) {
        for (int i=0; i<topoData.length; i++) {
            for (int j=0; j<topoData[i].length(); j++) {
                if (visited[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
