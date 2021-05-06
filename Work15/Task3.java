package company.Work15;

public class Task3 {
    public static void main(String[] args) {
        char[] work = {'р', 'а', 'б', 'о', 'т', 'а', 'н', 'е', 'в', 'о', 'л', 'к'};
        char[] similar = new char[work.length];
        int count = work.length;
        for (int i = 0; i < work.length; i++) {
            for (int j = 0; j < work.length; j++) {
                if (i != j && work[i] == work[j]) {
                   similar[i] = work[i];
                   similar[j] = work[j];
                    count--;
                }
            }
        }
        char[] uniqe = new char[count];
        for (int i = 0; i < work.length; i++){
            boolean hasMet = false;
            for (int j = 0; j < similar.length; j++){
                if(work[i] == similar[j]){
                    hasMet = true;
                }
            }
            if (!hasMet){
                count = count - 1;
                uniqe[count] = work[i];
                System.out.printf(" %s ", work[i]);
            }
        }
    }
}
