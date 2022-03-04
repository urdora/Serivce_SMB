package com.smb.generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author wangyihang
 * @date 2021/10/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Generic<T> {

    private T key;

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }

    public <E> E getProduct (List<E> list) {
        return list.get(new Random().nextInt(list.size()));
    }
}
