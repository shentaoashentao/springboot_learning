package com.shentao.domain;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private String phone;
    private String sex;
    private String id_number;
    private String avatar;
    private int status;

}
