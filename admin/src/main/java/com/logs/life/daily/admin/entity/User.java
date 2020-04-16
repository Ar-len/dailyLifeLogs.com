package com.logs.life.daily.admin.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author
 *
 */
@Table(name="user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User implements Serializable {
    /**
     * 用户编码
     */
    @GeneratedValue(generator = "JDBC")
    private String id;

    private String name;

    private String nickName;

    private String password;

    private String phoneNumber;

    private static final long serialVersionUID = 1L;
}
