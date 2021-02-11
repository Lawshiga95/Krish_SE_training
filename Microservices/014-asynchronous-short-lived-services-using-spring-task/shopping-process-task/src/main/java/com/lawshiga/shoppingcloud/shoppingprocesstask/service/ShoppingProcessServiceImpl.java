package com.lawshiga.shoppingcloud.shoppingprocesstask.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ShoppingProcessServiceImpl implements ShoppingProcessService {

    @Override
    public boolean validateZipcode(String zipcode){
        return zipcode.length()>4;
    }
}
