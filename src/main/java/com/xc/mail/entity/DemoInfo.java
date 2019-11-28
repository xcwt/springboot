package com.xc.mail.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * on 2019/11/28 13:58
 *
 * @author zhuweitao
 */
@Entity
@Data
public class DemoInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String pwd;
}
