package com.inflearn.querydsl.controller;

import com.inflearn.querydsl.dto.MemberSearchCondition;
import com.inflearn.querydsl.dto.MemberTeamDto;
import com.inflearn.querydsl.repository.MemberJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberJpaRepository memberJpaRepository;
    @GetMapping("/v1/members")
    public List<MemberTeamDto> searchMemberV1(MemberSearchCondition condition){
        return memberJpaRepository.searchByBuilder(condition);
    }
}
