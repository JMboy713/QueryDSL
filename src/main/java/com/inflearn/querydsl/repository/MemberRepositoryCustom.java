package com.inflearn.querydsl.repository;

import com.inflearn.querydsl.dto.MemberSearchCondition;
import com.inflearn.querydsl.dto.MemberTeamDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);


    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);

    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
}
