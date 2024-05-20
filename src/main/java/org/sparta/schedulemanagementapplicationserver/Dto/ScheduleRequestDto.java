package org.sparta.schedulemanagementapplicationserver.Dto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.time.LocalDate;

@Schema(description = "비밀번호를 포함한 일정 생성 요청 객체")
@Getter
public class ScheduleRequestDto {
    @Schema(example = "title", required = true)
    private String title;

    @Schema(required = true)
    private String contents;

    @Schema(example = "name", required = true)
    private String manager;

    @Schema( example = "1234", required = true)
    private String password;
}
