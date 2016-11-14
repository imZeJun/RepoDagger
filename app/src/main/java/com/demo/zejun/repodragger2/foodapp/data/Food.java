package com.demo.zejun.repodragger2.foodapp.data;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
public class Food {

    private final String mName;

    private final int mPrice;

    public Food(String name, int price) {
        this.mName = name;
        this.mPrice = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "mName='" + mName + '\'' +
                ", mPrice=" + mPrice +
                '}';
    }
}
