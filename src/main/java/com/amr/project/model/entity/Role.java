package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

//@Entity
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//public class Role implements GrantedAuthority {
//
//
//
//    private Long id;
//
//
//    private String name;
//
//
//    @Override
//    public String getAuthority() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Role role1 = (Role) o;
//        return name.equals(role1.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
//}
