package com.smb.service.serviceImpl;


import com.google.common.collect.Lists;
import com.smb.generic.Generic;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author wangyihang
 * @date 2021/10/20
 */
public class PersonServiceImplTest {
    @Test
    public void 自由测试案例() {
        List<String> strList = Lists.newArrayList("1", "2", "3", "4", "5");
        List<Integer> intLists = Lists.newArrayList(1, 2, 3, 4, 5);
        Generic<String> stringGeneric = new Generic<>();
        Integer product = stringGeneric.getProduct(intLists);
    }
}
