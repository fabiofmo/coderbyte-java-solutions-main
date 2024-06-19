import static java.lang.System.out;

import java.lang.reflect.Array;

// Her basamak için tırmanma yollarını saklamak için bir dizi oluştur

// 0 basamak tırmanıldığında yol sayısı 1'tir (hiçbir şey yapma)

// 1 basamak tırmanıldığında yol sayısı 1'tir (1 adım atma)

// Geri kalan basamaklar için döngü oluştur

// i basamak tırmanıldığında yol sayısı, i - 1 basamak tırmanıldığında yol sayısına
// ve i - 2 basamak tırmanıldığında yol sayısına eşittir

// Son basamak tırmanıldığında yol sayısını döndür (bu, basamak sayısıdır)

// Abdullah Tas

//youtu.be/jtM_RdkEzAM
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.function.Function;

class TetrisMove {
      public static int I(int[][] arr){
        int count=0;
        int max=0;
        for(int k=0;k<9;k++) {
            for (int m = 3; m < 12; m++) {
                if (arr[k][m - 3] == 1 && arr[k][m - 2] == 1 && arr[k][m - 1] == 1 && arr[k][m] == 1) {
                    if (reduction(k, 4, arr) == 1) {
                        max = 1;
                    }
                }
            }
        }
        for(int n=0;n<6;n++) {
            for (int m = 0; m < 12; m++) {
                if (arr[n][m] == 1 && arr[n + 1][m] == 1 && arr[n + 2][m] == 1 && arr[n + 3][m] == 1) {
                    count = 0;
                    if (reduction(n, 1, arr) == 1) {
                        count++;
                    }
                    if (reduction(n + 1, 1, arr) == 1) {
                        count++;
                    }
                    if (reduction(n + 2, 1, arr) == 1) {
                        count++;
                    }
                    if (reduction(n + 3, 1, arr) == 1) {
                        count++;
                    }
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }
    public static int L(int[][] arr){
        int count=0;
        int max=0;
        for(int k=0;k<7;k++){
            for(int m=0;m<11;m++){
                if(arr[k][m]==1&&arr[k][m+1]==1&&arr[k+1][m]==1&&arr[k+2][m]==1){

                    if(reduction(k,2,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,1,arr)==1){
                       count++;
                    }
                    if(reduction(k+2,1,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }

            }
        }
        for(int k=0;k<7;k++){
            for(int m=0;m<11;m++){
                count=0;
                if(arr[k][m+1]==1&&arr[k+1][m+1]==1&&arr[k+2][m]==1&&arr[k+2][m+1]==1){

                    if(reduction(k,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+2,2,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }
        for(int k=0;k<8;k++){
            for(int m=0;m<10;m++){
                count=0;
                if(arr[k][m]==1&&arr[k][m+1]==1&&arr[k][m+2]==1&&arr[k+1][m+2]==1){

                    if(reduction(k,3,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,1,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }
        for(int k=0;k<8;k++){
            for(int m=0;m<10;m++){
                count=0;
                if(arr[k][m]==1&&arr[k+1][m]==1&&arr[k+1][m+1]==1&&arr[k+1][m+2]==1){

                    if(reduction(k,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,3,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }
        return max;
    }
    public static int J(int[][] arr){
        int count=0;
        int max=0;

        for(int k=0;k<7;k++){
            for(int m=0;m<11;m++){
                if(arr[k][m]==1&&arr[k+1][m]==1&&arr[k+2][m]==1&&arr[k+2][m+1]==1){

                    if(reduction(k,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+2,2,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }

            }
        }
        for(int k=0;k<7;k++){
            for(int m=0;m<11;m++){
                count=0;
                if(arr[k][m]==1&&arr[k][m+1]==1&&arr[k+1][m+1]==1&&arr[k+2][m+1]==1){

                    if(reduction(k,2,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+2,1,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }
        for(int k=0;k<8;k++){
            for(int m=0;m<10;m++){
                count=0;
                if(arr[k][m+2]==1&&arr[k+1][m]==1&&arr[k+1][m+1]==1&&arr[k+1][m+2]==1){

                    if(reduction(k,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,3,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }
        for(int k=0;k<8;k++){
            for(int m=0;m<10;m++){
                count=0;
                if(arr[k][m]==1&&arr[k][m+1]==1&&arr[k][m+2]==1&&arr[k+1][m]==1){

                    if(reduction(k,3,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,1,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }

        return max;
    }
    public static int O(int[][] arr){
        int count=0;
        int max=0;

        for(int k=0;k<8;k++){
            for(int m=0;m<11;m++){
                if(arr[k][m]==1&&arr[k][m+1]==1&&arr[k+1][m]==1&&arr[k+1][m+1]==1){

                    if(reduction(k,2,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,2,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }

            }
        }
        return max;

    }
    public static int S(int[][] arr){
        int count=0;
        int max=0;

        for(int k=0;k<8;k++){
            for(int m=0;m<10;m++){
                if(arr[k][m]==1&&arr[k][m+1]==1&&arr[k+1][m+1]==1&&arr[k+1][m+2]==1){

                    if(reduction(k,2,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,2,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }

            }
        }
        for(int k=0;k<7;k++){
            for(int m=0;m<11;m++){
                count=0;
                if(arr[k][m+1]==1&&arr[k+1][m]==1&&arr[k+1][m+1]==1&&arr[k+2][m]==1){

                    if(reduction(k,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,2,arr)==1){
                        count++;
                    }
                    if(reduction(k+2,1,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }
        return max;
    }
    public static int T(int[][] arr){
        int count=0;
        int max=0;

        for(int k=0;k<7;k++){
            for(int m=0;m<11;m++){
                if(arr[k][m]==1&&arr[k+1][m]==1&&arr[k+1][m+1]==1&&arr[k+2][m]==1){

                    if(reduction(k,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,2,arr)==1){
                        count++;
                    }
                    if(reduction(k+2,1,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }

            }
        }
        for(int k=0;k<7;k++){
            for(int m=0;m<11;m++){
                count=0;
                if(arr[k][m+1]==1&&arr[k+1][m]==1&&arr[k+1][m+1]==1&&arr[k+2][m+1]==1){

                    if(reduction(k,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,2,arr)==1){
                        count++;
                    }
                    if(reduction(k+2,1,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }
        for(int k=0;k<8;k++){
            for(int m=0;m<10;m++){
                count=0;
                if(arr[k][m+1]==1&&arr[k+1][m]==1&&arr[k+1][m+1]==1&&arr[k+1][m+2]==1){

                    if(reduction(k,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,3,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }
        for(int k=0;k<8;k++){
            for(int m=0;m<10;m++){
                count=0;
                if(arr[k][m]==1&&arr[k][m+1]==1&&arr[k][m+2]==1&&arr[k+1][m+1]==1){

                    if(reduction(k,3,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,1,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }

        return max;
    }
    public static int Z(int[][] arr){
        int count=0;
        int max=0;

        for(int k=0;k<8;k++){
            for(int m=0;m<10;m++){
                if(arr[k][m+1]==1&&arr[k][m+2]==1&&arr[k+1][m]==1&&arr[k+1][m+1]==1){

                    if(reduction(k,2,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,2,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }

            }
        }
        for(int k=0;k<7;k++){
            for(int m=0;m<11;m++){
                count=0;
                if(arr[k][m]==1&&arr[k+1][m]==1&&arr[k+1][m+1]==1&&arr[k+2][m+1]==1){

                    if(reduction(k,1,arr)==1){
                        count++;
                    }
                    if(reduction(k+1,2,arr)==1){
                        count++;
                    }
                    if(reduction(k+2,1,arr)==1){
                        count++;
                    }
                    if(count>max){
                        max=count;
                    }
                }
            }
        }

        return max;
    }
    public static int reduction(int row, int ones,int[][] arr){
        int one=0;
        int total=0;
        for(int i=0;i<12;i++){
            total+=arr[row][i];
        }
        if(total==ones){
            one=1;
        }
        return one;
    }


  public static int ArrayChallenge(String[] strArr) {
    // code goes here  
     int[][] arr= new int[9][12];
        int result=0;
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<10;i++){
            sb.delete(0,sb.length());
            for(int j=1;j<13;j++){

                if((Integer.parseInt(strArr[j]))<i){
                    sb.append(j);
                    arr[i-1][j-1]=1;
                }
                else arr[i-1][j-1]=0;
            }
        }

        if(strArr[0]=="I") {
            result = I(arr);
        }
        if(strArr[0]=="J") {
            result = J(arr);
        }
        if(strArr[0]=="L") {
            result = L(arr);
        }
        if(strArr[0]=="O") {
            result = O(arr);
        }
        if(strArr[0]=="S") {
            result = S(arr);
        }
        if(strArr[0]=="T") {
            result = T(arr);
        }
        if(strArr[0]=="Z") {
            result = Z(arr);
        }

        return result;

  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    
//    System.out.print(ArrayChallenge(s.nextLine()));    
    System.out.print(ArrayChallenge(new String[] {s.nextLine()}));
  }

}