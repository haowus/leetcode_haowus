package algorithms.string.easy;

public class rotateNum {
    public int rotatedDigits(int N) {

        int count = 0;
        for (int i=1;i<=N;i++){
            if (isrd(i))
                count++;
        }
        return count;

    }
    public boolean isrd(int i){
        String s = String.valueOf(i);
        if (s.contains("3")||s.contains("4")||s.contains("7"))
            return false;
        else if (s.contains("2")||s.contains("5")||s.contains("6")||s.contains("9"))
            return true;
        return false;

    }
}
