package com.demo.random.randomservice;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BuildInRandomAlgo implements RandomAlgo {

    private Integer upBound = Integer.MAX_VALUE;

    public BuildInRandomAlgo(){}

    public BuildInRandomAlgo(int upBound){
        this.upBound = upBound;
    }

    public int getRandom(){
//        return new Random().nextInt();
        if(upBound !=null){
            System.out.println("upbound="+ upBound);
        }

        return new Random().nextInt(upBound);
    }

}
