package com.bercut.dz2;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleProperties {

    public  static int FindMin(List<Double> mas)
    {
        double min=mas.get(0);

        for (Double var:mas) {
            if (var<=min)
            {
                min=var;
            }

        }
        return mas.indexOf(min);
    }

    public static void main(String[] args) {

        String[] input;
        input=args[0].replace('=',';').split(";");
        List<String> params=new ArrayList<String>();
        List<Double> values=new ArrayList<Double>();

        for (int i = 0; i < input.length; i++) {
            if (i%2==0){
               params.add(input[i]);

            }
            else {
                values.add(Double.parseDouble(input[i]));

            }
        }
        System.out.println("Список переданных аргументов:");
        for (int i = 0; i < params.size(); i++) {
            System.out.println(params.get(i)+"="+values.get(i));

        }

        System.out.println("Параметр с минимальным значением: "+params.get(FindMin(values))+" = " + values.get(FindMin(values))); // Java


    }
}
