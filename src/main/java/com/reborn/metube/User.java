package com.reborn.metube;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: User.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/9/13 23:41
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    private Integer id;

    private String username;
}
