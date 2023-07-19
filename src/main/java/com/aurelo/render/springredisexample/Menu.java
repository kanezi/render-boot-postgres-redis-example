package com.aurelo.render.springredisexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Menu")
public class Menu implements Serializable {
    @Id
    private int id;
    private String item;
    private long price;
}
