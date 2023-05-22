package com.qkmall.common.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.FastDateFormat;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ODDGenerator {
    private static final FastDateFormat pattern = FastDateFormat.getInstance("yyyyMMddHHmmss");
    private static final AtomicInteger atomicInteger = new AtomicInteger(1);
    private static ThreadLocal<StringBuilder> threadLocal = new ThreadLocal<StringBuilder>();

    /**
     * 【长码生成策略】
     *
     * @时间20180511231532
     * @二位随机数
     * @lock的hash-code编码
     * @param lock 生成的UUID32位参数
     * @return 长码机制
     */
    public static String getC(String lock) {
        StringBuilder builder = new StringBuilder(pattern.format(Instant.now().toEpochMilli()));// 取系统当前时间作为订单号前半部分
        builder.append(Math.abs(lock.hashCode()));// HASH-CODE
        builder.append(atomicInteger.getAndIncrement());// 自增顺序
        threadLocal.set(builder);
        return threadLocal.get().toString();
    }

    public static String getItemNo() {
        return getD(StringUtils.replace(UUID.randomUUID().toString(), "-", ""));
    }

    /**
     * 【短码生成策略】
     *
     * @param lock
     * @return
     */
    public static String getD(String lock) {
        StringBuilder builder = new StringBuilder(ThreadLocalRandom.current().nextInt(0,999));// 随机数
        builder.append(Math.abs(lock.hashCode()));// HASH-CODE
        builder.append(atomicInteger.getAndIncrement());// 自增顺序
        threadLocal.set(builder);
        return threadLocal.get().toString();
    }

    /**
     * 1000个线程并发测试
     *
     * @param args
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /*Set<String> set = new HashSet<String>();
        FutureTask<String> task = null;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <1; i++) {
            Callable<String> callable = new Callable<String>() {
                @Override
                public String call() throws Exception {
                    // System.out.println("当前线程:>>>>> ".concat(Thread.currentThread().getName()));
                    // return getC(StringUtils.replace(UUID.randomUUID().toString(), "-", ""));
                    return getD(StringUtils.replace(UUID.randomUUID().toString(), "-", ""));
                }
            };
            task = new FutureTask<String>(callable);
            new Thread(task).start();
            //System.out.println(task.get());
            set.add(task.get());
        }
        System.out.println("总共耗时:" + ((System.currentTimeMillis() - startTime)) + "ms");
        System.out.println("*************** " + set.size());*/

        String d = getC(StringUtils.replace(UUID.randomUUID().toString(), "-", ""));
        System.out.println(d);
    }
}
