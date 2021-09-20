package com.huanjulu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[]= new int[]{2,0,2,1,1,0};
        quickSortHelper(arr,0,5);
        System.out.println("Array.asarr.toString() = " + Arrays.toString(arr));
    }
    private static void quickSortHelper(int arr[], int s, int e){
        if(s>=e) return;
        int k=arr[s];
        int i=s,j=e;
        while(i!=j){
            while(j>i && arr[j]>=k){
                j--;
            }
            swap(arr,i,j);
            while(i<j && arr[i]<=k){
                i++;
            }
            swap(arr,i,j);
        }
        quickSortHelper(arr,s,i-1);
        quickSortHelper(arr,i+1,e);
    }

    private static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
