package org.example;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/13 10:33
 */

/**
 * 频繁项集
 */

public class FrequentItem implements Comparable<FrequentItem>{
    // 频繁项集的集合ID
    private String[] idArray;
    // 频繁项集的支持度计数
    private int count;
    //频繁项集的长度，1项集或是2项集，亦或是3项集
    private int length;

    public FrequentItem(String[] idArray, int count){
        this.idArray = idArray;
        this.count = count;
        length = idArray.length;
    }

    public String[] getIdArray() {
        return idArray;
    }

    public void setIdArray(String[] idArray) {
        this.idArray = idArray;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public int compareTo(FrequentItem o) {
        // TODO Auto-generated method stub
        Integer int1 = Integer.parseInt(this.getIdArray()[0]);
        Integer int2 = Integer.parseInt(o.getIdArray()[0]);

        return int1.compareTo(int2);
    }

}

