package com.example.hellospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {
    @Autowired
    public Outfit outfit;




    public GirlFriend(Outfit outfit) {
        this.outfit = outfit;
    }

    public GirlFriend() {
//        this.outfit = new Dress();
    }
}
