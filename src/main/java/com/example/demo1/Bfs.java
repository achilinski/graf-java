package com.example.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Bfs {
    ArrayList<ArrayList<Double>> graf = new ArrayList<ArrayList<Double>>();
    int x;
    int y;
    public Bfs(ArrayList<ArrayList<Double>> graf_in, int x_in, int y_in){
        graf = graf_in;
        x = x_in;
        y = y_in;
    }
    public Integer[] get_visited(){
        for(int i=0; i<graf.size();i++){
            Iterator<Double> itr = graf.get(i).iterator();
            int u =0;
            while(itr.hasNext()){
                if(u%2!=0){
                    itr.remove();
                }
                u++;
            }
        }
        System.out.println(graf);
        Integer [] visited = new Integer[x*y];
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(0);
        int v;
//        while(!queue.isEmpty()){
//            v =queue.remove();
//            for(int j =0;j<graf.size();j++){
//                if(visited[graf.get(v).get(j)] == 1){
//
//                }
//            }
//        }
        return visited;
    }
}
