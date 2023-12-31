package com.me.wodada.pet.dto.request;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdatePetInfoReq {

    @NotBlank(message = "반려동물의 이름을 입력하세요")
    private String name;

    @NotBlank(message = "반려동물의 성별을 입력하세요")
    private String gender;

    @NotNull(message = "반려동물의 중성화 여부를 입력하세요")
    private Boolean isNeutered;

    @NotNull(message = "반려동물의 몸무게를 입력하세요")
    private Double weight;

    @NotNull(message = "반려동물의 나이를 입력하세요")
    private int age;

    private String personality;

    @Builder
    public UpdatePetInfoReq(String name, String gender,
                            Boolean isNeutered, Double weight, int age, String personality) {
        this.name = name;
        this.gender = gender;
        this.isNeutered = isNeutered;
        this.weight = weight;
        this.age = age;
        this.personality = personality;
    }
}
