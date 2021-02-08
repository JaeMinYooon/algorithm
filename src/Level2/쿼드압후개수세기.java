package Level2;

public class 쿼드압축후개수세 {
    public static void main(String[] args) {
        int[][] arr ={{1,1,0,0}, {1,0,0,0}, {1,0,0,1}, {1,1,1,1}};

        solution(arr);
        System.out.println(zero  + " " + one);
    }
    static int zero;
    static int one;
    public int[] solution(int[][] arr) {
        zero = 0;
        one = 0;
        int arrLen = arr.length;

        recursize(arr, 0, 0, arrLen);

        return new int[] {zero, one};
    }

    public static void recursize(int[][]arr, int a, int b, int len){
        if(len == 1){
            if(arr[a][b] == 0){
                zero++;
            }else{
                one++;
            }
            return;
        }

        int value = arr[a][b];
        boolean flag = true;
        for(int i = a ; i < a+len; i++){
            if(flag){
                for(int j = b; j < b + len ; j++){
                    if(value != arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }else {
                break;
            }
        }

        if(flag){
            if(value == 1){
                one++;
            } else {
                zero++;
            }
        } else{
            len = len/2;

            recursize(arr, a, b, len);
            recursize(arr, a + len, b , len);
            recursize(arr, a, b+len, len);
            recursize(arr, a+len, b+len, len);
        }
    }
}
