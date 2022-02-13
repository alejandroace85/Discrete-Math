import java.io.File;  

import java.io.FileNotFoundException;  

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Dictionary;

import java.util.Hashtable;

public class EuclidDistance {

    ArrayList<ArrayList<Double>> points = new ArrayList<>();

    public void readDataFromFile(String fileName){

        try{

            File file = new File(fileName);

            Scanner reader = new Scanner(file);

            while(reader.hasNextLine()) {

                String data = reader.nextLine();

                String[] coords = data.split(",");

                ArrayList<Double> point = new ArrayList<> (coords.length);

                for(int i = 0;i < coords.length ;i ++){

                    point.add(Double.parseDouble(coords[i]));

                }

                points.add(point);

            }

            reader.close();

        } catch(FileNotFoundException e){

            System.out.println("An Error Occured");

            e.printStackTrace();

        }

    }

    private double distance(ArrayList<Double> a,ArrayList<Double> b){

        int size ;

        if(a.size() == b.size()){

            size = a.size();

        }

        else{

            return 0.0;

        }

        double sum = 0;

        for(int i = 0; i< size; i++){

            double diff = a.get(i) - b.get(i);

            sum += diff*diff;

        }

        return Math.sqrt(sum);

    }

    public void findDistances(){

        double minDistance = 100000;

        double maxDistance = 0;

        ArrayList<ArrayList<ArrayList<Double>>> minDistancePoints = new ArrayList<>();

        ArrayList<ArrayList<ArrayList<Double>>> maxDistancePoints = new ArrayList<>();

        for(int i = 0; i < points.size(); i++){

            for(int j = i+1; j <points.size(); j++){

                Double dist = distance(points.get(i),points.get(j));   

                if( dist < minDistance){

                    minDistance = dist;

                    ArrayList<ArrayList<Double>> indices = new ArrayList<>(2);

                    indices.add(points.get(i));

                    indices.add(points.get(j));

                    minDistancePoints.clear();

                    minDistancePoints.add(indices);

                }  

                else if(dist == minDistance){

                    ArrayList<ArrayList<Double>> indices = new ArrayList<>(2);

                    indices.add(points.get(i));

                    indices.add(points.get(j));

                    minDistancePoints.add(indices);

                }

                if( dist > maxDistance){

                    maxDistance = dist;

                    ArrayList<ArrayList<Double>> indices = new ArrayList<>(2);

                    indices.add(points.get(i));

                    indices.add(points.get(j));

                    maxDistancePoints.clear();

                    maxDistancePoints.add(indices);

                }  

                else if(dist == maxDistance){

                    ArrayList<ArrayList<Double>> indices = new ArrayList<>(2);

                    indices.add(points.get(i));

                    indices.add(points.get(j));

                    maxDistancePoints.add(indices);

                }

            }

        }

        System.out.println("these pairs of points "+minDistancePoints.toString()+" are closest to each other at distance "+Double.toString(minDistance));

        System.out.println("these pairs of points "+maxDistancePoints.toString()+" are farthest to each other at distance "+Double.toString(maxDistance));

    }



    public static void main(String[] args){

        String fileName = "iris.txt";

        EuclidDistance ed = new EuclidDistance();

        ed.readDataFromFile(fileName);

        ed.findDistances();

    }

}
