package com.hdu.search.good;

/**
 * @author shkstart
 * @create 2022-11-28 19:55
 */
public class Good implements Comparable<Good>{
    private String name;
    private double price;
    private double score;
    private String taste;

    public Good() {
    }

    public Good(String name, double price, double score, String taste) {
        this.name = name;
        this.price = price;
        this.score = score;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", score=" + score +
                ", taste='" + taste + '\'' +
                '}';
    }

    @Override
    public int compareTo(Good o) {
        return o.getScore()>this.getScore()?1:-1;
    }
}
