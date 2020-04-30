package com.lquan.frokjoin.task.demo;/**
 * Created by 01370602 on 2020/5/1.
 */

import java.util.concurrent.RecursiveTask;

/**
 * ClassName SumTask
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class SumTask extends RecursiveTask<Integer> {


    private static final int THRESHOLD = 20;


    private  int arr[];
    private  int start;
    private  int end;



    public SumTask(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     *
     * 英 [ˌkɒmpjuˈteɪʃn]   美 [ˌkɑːmpjuˈteɪʃn]
     *  n.
     * 计算;计算过程
     */
    @Override
    protected Integer compute() {
        if ((end - start) <= THRESHOLD) {
            return subTotal();
        }else {
            int middle = (start + end) / 2;
            SumTask left = new SumTask(arr, start, middle);
            SumTask right = new SumTask(arr, middle, end);
            left.fork();
            right.fork();

            return left.join() + right.join();
        }
    }


    /**
     * 小计
     * @return
     */
    private  int subTotal(){
        int sum =0;
        for (int i = start; i < end; i++) {
               sum += arr[i];
           }
        System.out.println(Thread.currentThread().getName() + ": ∑(" + start + "~" + end + ")=" + sum);
        return sum;
    }




}
