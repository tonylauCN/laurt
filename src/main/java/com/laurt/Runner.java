/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.laurt;

/**
 * <p>Title: Runner
 * <p>Description: laurt
 * <p>Copyright: 2017/9/2 上午4:53
 * <p>Company: rongshu
 * <p>author: LiuQingqing
 * <p>package: PACKAGE_NAME
 *
 * @version v1.0.0
 */
public class Runner {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {

            /**
             * When an object implementing interface <code>Runnable</code> is used
             * to create a thread, starting the thread causes the object's
             * <code>run</code> method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method <code>run</code> is that it may
             * take any action whatsoever.
             *
             * @see Thread#run()
             */
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        };

        int i = 50;
        while (i-- > 0) {
            Thread thread = new Thread(runnable);
            thread.run();
            Thread.sleep(2000);
        }
    }
}
