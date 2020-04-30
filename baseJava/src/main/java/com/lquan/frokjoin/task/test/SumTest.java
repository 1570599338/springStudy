package com.lquan.frokjoin.task.test;/**
 * Created by 01370602 on 2020/5/1.
 */


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * ClassName SumTest
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class SumTest {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> result = pool.submit(new SumTask1(arr, 0, arr.length));
        System.out.println("最终计算结果: " + result.invoke());
        pool.shutdown();
    }
}
