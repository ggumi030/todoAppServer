package org.sparta.schedulemanagementapplicationserver.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.sparta.schedulemanagementapplicationserver.Dto.ScheduleCheckPasswordRequestDto;
import org.sparta.schedulemanagementapplicationserver.Dto.ScheduleRequestDto;

@Entity
@Getter
@Setter
@Table(name = "schedule")
@NoArgsConstructor
public class Schedule extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="title", nullable=false)
    private String title;
    @Column(name="contents", nullable=false, length=1000)
    private String contents;
    @Column(name="manager",nullable = false)
    private String manager;
    @Column(name = "password", nullable = false)
    private String password;


    public Schedule(ScheduleRequestDto scheduleRequestDto){
        this.title = scheduleRequestDto.getTitle();
        this.contents = scheduleRequestDto.getContents();
        this.manager = scheduleRequestDto.getManager();
        this.password = scheduleRequestDto.getPassword();
    }

    public void update(ScheduleCheckPasswordRequestDto checkPasswordRequestDto){
        this.title = checkPasswordRequestDto.getTitle();
        this.contents = checkPasswordRequestDto.getContents();
        this.manager = checkPasswordRequestDto.getManager();
    }

}