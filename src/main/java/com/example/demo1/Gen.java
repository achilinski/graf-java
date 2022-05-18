package com.example.demo1;

import java.util.ArrayList;
import java.util.Random;

public class Gen {
    int y_in;
    int x_in;
    Double range_min;
    Double range_max;
    public Gen(int x_i, int y_i, Double range_min_in, Double range_max_in){
        x_in=x_i;
        y_in=y_i;
        range_min = range_min_in;
        range_max = range_max_in;

    }
    public Double getRandom(){
        Random rand = new Random();
        return range_min + (range_max - range_min) * rand.nextDouble();
    }

    public ArrayList<ArrayList<Double>> getPoints(){
        ArrayList<ArrayList<Double>> points = new ArrayList<ArrayList<Double>>();
        int x = 0;
        int y = 0;
        for(y=0; y<y_in; y++){
            for(x=0;x<x_in;x++) {
                ArrayList<Double> point = new ArrayList<>();
                Double this_id = (double) (y * x_in + x);
                if (y < y_in - 1) {
                    point.add(this_id + x_in);
                    point.add(getRandom());
                }
                if (y > 0) {
                    point.add(this_id - x_in);
                    point.add(getRandom());
                }
                if (x < x_in - 1) {
                    point.add(this_id + 1);
                    point.add(getRandom());
                }
                if (x > 0) {
                    point.add(this_id - 1);
                    point.add(getRandom());
                }
                points.add(point);
            }
        }
        return points;
    }
}
