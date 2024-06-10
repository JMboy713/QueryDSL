package com.inflearn.querydsl.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.inflearn.querydsl.dto.QUserDto is a Querydsl Projection type for UserDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QUserDto extends ConstructorExpression<UserDto> {

    private static final long serialVersionUID = -1796447542L;

    public QUserDto(com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<Integer> age) {
        super(UserDto.class, new Class<?>[]{String.class, int.class}, name, age);
    }

}

