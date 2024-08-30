package com.academy.sivillageclonebe.member.entity;

import com.academy.sivillageclonebe.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;
import java.util.*;

import java.time.LocalDate;

@Getter
@Entity
@ToString
@NoArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private Long roleId;

    @Column(nullable = false, length = 20)
    private Long oauthId;

    @Comment("이메일")
    @Column(nullable = false, length = 20, unique = true)
    private String username;

    @Column(length = 20)
    private String password;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(length = 20)
    private String phone;

    @Column(nullable = false)
    private boolean isDeleted;

    @Builder
    public Member(
            Long id,
            Long roleId,
            Long oauthId,
            String username,
            String password,
            String name,
            String phone,
            boolean isDeleted
    ) {
        this.id = id;
        this.roleId = roleId;
        this.oauthId = oauthId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.isDeleted = isDeleted;
    }

}
