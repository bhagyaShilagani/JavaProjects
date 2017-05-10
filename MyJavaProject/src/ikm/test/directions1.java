package ikm.test;

import java.util.*;
import java.lang.*;
import java.io.*;
 
class directions1{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        while(true){
            int n = Integer.parseInt(in.nextLine());
            if(n == 0){
                break;
            }
            ArrayList<Destination>arr = new ArrayList<Destination>();
            Destination avg = new Destination();
            for(int i = 0 ; i < n ; i++){
                Destination d = new Destination();
                arr.add(d);
                String s = in.nextLine();
                String []tokens = s.split(" ");
                double angle = 0;
                for(int j = 0 ; j < tokens.length ; j += 2){
                    if(j == 0){
                        d.x = Double.parseDouble(tokens[0]);
                        d.y = Double.parseDouble(tokens[1]);
                    }
                    else{
                        double arg = Double.parseDouble(tokens[j+1]);
                        if(tokens[j].equals("start")){
                            angle = arg;
                        }
                        else if(tokens[j].equals("turn")){
                            angle += arg;
                        }
                        else{
                            d.x += Math.cos(angle * Math.acos(-1) / 180) * arg;
                            d.y += Math.sin(angle * Math.acos(-1) / 180) * arg;
                            System.out.println("new coordinates for angle:" +angle+ ",  " + d.x + ", " + d.y);
                        }
                    }
                    //System.out.println(i+ " " + d.x + " " + d.y);
                }
                avg.x += d.x;
                avg.y += d.y;
                System.out.println(" Avg: " + avg.x + " " + avg.y);

            }
            avg.x /= n;
            avg.y /= n;
            double distance = 0.0;
            for(int i = 0 ; i < n ; i++){
                distance = Math.max(distance, avg.dist(arr.get(i)));
            }
            System.out.println(avg.x + " " + avg.y + " " + distance);
        }
	}
    static class Destination{
        public double x = 0, y = 0;
        public double dist(Destination other){
            return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
        }
    }
}