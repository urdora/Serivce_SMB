package com.smb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageInfoVO {
    private long pageNbr;
    private long pageSize;
    private long totalSize;
}
