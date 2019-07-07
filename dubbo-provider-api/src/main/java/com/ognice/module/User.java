package com.ognice.module;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>Title: User</p>
 * <p>Description:  </p>
 *
 * @author huangkaifu
 * @date 2019/7/7
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {
    private String username;
    private String password;
    private Integer age;
    private String idCard;
}
