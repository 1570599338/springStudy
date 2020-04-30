package com.lquan.frokjoin.task.test;/**
 * Created by 01370602 on 2020/5/1.
 */

import com.lquan.frokjoin.task.demo.SumTask;

import java.util.concurrent.RecursiveTask;

/**
 * ClassName SumTask1
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class SumTask1 extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 20;

    private int arr[];
    private int start;
    private int end;

    public SumTask1(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    /**
     * 小计
     */
    private Integer subtotal() {
        Integer sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        System.out.println(Thread.currentThread().getName() + ": ∑(" + start + "~" + end + ")=" + sum);
        return sum;
    }

    @Override
    protected Integer compute() {

        if ((end - start) <= THRESHOLD) {
            return subtotal();
        }else {
            int middle = (start + end) / 2;
            SumTask left = new SumTask(arr, start, middle);
            SumTask right = new SumTask(arr, middle, end);
            left.fork();
            right.fork();

            return left.join() + right.join();
        }
    }
}
