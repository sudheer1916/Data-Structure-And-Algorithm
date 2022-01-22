import java.util.Stack;

public class LargestRectangleWithAll_1s {

    static int largestHist(int R,int C,int arr[]){  //efficient theta(R*C)
        Stack<Integer> result = new Stack<>();
        
        int topVal;
        int maxArea = 0;
        int area = 0;

        int i=0;
        while (i<C) {
            if(result.empty() || arr[result.peek()] <= arr[i])
            result.push(i++);
            else{ 
                topVal = arr[result.peek()]; 
                result.pop(); 
                area = topVal * i; 
  
                if (!result.empty()) 
                    area = topVal * (i - result.peek() - 1); 
                maxArea = Math.max(area, maxArea);     
            }
        }
        while (!result.empty()) {
            topVal = arr[result.peek()]; 
            result.pop(); 
            area = topVal * i; 
            if (!result.empty()) 
                area = topVal * (i - result.peek() - 1); 
  
            maxArea = Math.max(area, maxArea);    
        }
        return maxArea;
    }

    static int maxRectangle(int R,int C,int mat[][]){
        int res = largestHist(R,C,mat[0]);
        for(int i = 1; i < R; i++){
            for (int j = 0; j < C; j++) {
                if(mat[i][j] == 1)
                mat[i][j] += mat[i-1][j];
            }
            res = Math.max(res, largestHist(R,C,mat[i]));
        }
        return res;
    }
    public static void main(String[] args) {
        int R = 4; 
        int C = 4; 
  
        int A[][] = { 
            { 0, 1, 1, 0 }, 
            { 1, 1, 1, 1 }, 
            { 1, 1, 1, 1 }, 
            { 1, 1, 0, 0 }, 
        }; 
        System.out.print("Area of maximum rectangle is " + maxRectangle(R, C, A));
    }
}
