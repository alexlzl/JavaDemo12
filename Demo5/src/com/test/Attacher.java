package com.test;

import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;
import java.lang.management.ManagementFactory;

public class Attacher {
    public static void main(String[] args) throws Exception {
        // 在windows上，获取到得name格式为 1234@userName
        // 1234为PID，@为分隔符，userName为当前用户
        String pid = ManagementFactory.getRuntimeMXBean().getName();
        int indexOf = pid.indexOf('@');
        if (indexOf > 0)
        {
            pid = pid.substring(0, indexOf);
        }

        System.out.println("当前JVM Process ID: " + pid);
        VirtualMachine vm = VirtualMachine.attach(pid); // 目标 JVM pid
        vm.loadAgent("/path/to/agent.jar");


    }
}
