package com.parthbhayana.Registration.Portal.email;

import org.springframework.scheduling.annotation.Async;

public abstract class EmailSender {
    @Async
    public abstract void send(String to, String email);
}
