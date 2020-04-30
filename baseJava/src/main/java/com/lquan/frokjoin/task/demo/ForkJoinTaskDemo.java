package com.lquan.frokjoin.task.demo;/**
 * Created by 01370602 on 2020/5/1.
 */

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * ClassName ForkJoinTaskDemo
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class ForkJoinTaskDemo {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i <100 ; i++) {

            arr[i]=i+1;
        }

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> result = pool.submit(new SumTask(arr,0,arr.length));
        int res = result.invoke();
        System.out.println("最终计算结果: " + res);

        pool.shutdown();



    }
}
