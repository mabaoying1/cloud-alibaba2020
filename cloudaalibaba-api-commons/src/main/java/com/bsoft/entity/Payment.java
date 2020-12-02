package com.bsoft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor //全参
@NoArgsConstructor //空参
@Accessors(chain = true)
public class Payment implements Serializable {
    private Long id;
    private String serial;
}