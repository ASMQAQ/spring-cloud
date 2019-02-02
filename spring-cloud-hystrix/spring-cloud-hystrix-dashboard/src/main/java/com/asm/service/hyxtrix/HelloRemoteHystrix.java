package com.asm.service.hyxtrix;

import com.asm.service.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String sayHello(final String name) {
        return "hello" + name + ", this messge send failed ";
    }
}
