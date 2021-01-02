package com.wx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author wang xing
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest implements Serializable {

    private static final long serialVersionUID = -6364471560646130015L;

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String role;

}
