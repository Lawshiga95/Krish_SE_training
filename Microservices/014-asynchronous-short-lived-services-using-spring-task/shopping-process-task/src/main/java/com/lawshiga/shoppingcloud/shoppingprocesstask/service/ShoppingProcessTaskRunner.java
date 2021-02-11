package com.lawshiga.shoppingcloud.shoppingprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class ShoppingProcessTaskRunner implements CommandLineRunner {

    @Autowired
    ShoppingProcessService shoppingProcessService;

    @Override
    public void run(String... args) throws Exception {

        if(args.length > 0) {
            System.out.println("task running with arguments");
            if(shoppingProcessService.validateZipcode(args[0])) {
                System.out.println("valid zipcode");
            } else {
                System.out.println("invalid zipcode");
            }
        } else {
            System.out.println("task running without arguments");
        }

    }
}
