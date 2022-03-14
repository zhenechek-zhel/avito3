package com.amr.project.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@Getter
@AllArgsConstructor
public enum Roles implements GrantedAuthority{
    USER,
    MODERATOR,
    ADMIN,
    ANONYMOUS;

    @Override
    public String getAuthority() {
        return null;
    }
}
