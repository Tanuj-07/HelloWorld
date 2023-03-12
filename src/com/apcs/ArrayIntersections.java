package com.apcs;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersections {
    public static void main(String[] args) {
	int[] numsi = {1,2,3,8,9,10};
	int[] numsj = {2,3,4,5,6,8,10};
	int len = numsi.length + numsj.length;
	int i = 0;
	int j = 0;
    List<Integer> list = new ArrayList<>();

    for(int k = 0; k < len ; k++) {
        System.out.println("k = " + k);

        if(k>numsi.length-1 || k>numsj.length-1){
            break;
        }

        int iNum = numsi[i];
        int jNum = numsj[j];
        if ( iNum <  jNum  ){
            i++;
            continue;
        }
        if ( iNum >  jNum  ){
            j++;
            continue;
        }


        if ( numsi[i] ==  numsj[j] ){
            list.add(numsi[i]);
        }
        i++; j++;
    }

        System.out.println(list);
    }

}
