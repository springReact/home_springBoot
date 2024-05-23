package org.zerock.apiserver.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.apiserver.dto.TodoDTO;

import java.time.LocalDate;

@SpringBootTest
@Log4j2
class TodoServiceImplTest {

    @Autowired
    TodoService todoService;

    @Test
    @DisplayName("Get Test")
    void testGet() {
        Long tno = 50L;

        log.info(todoService.get(tno));
    }

    @Test
    @DisplayName("Save Test")
    void testRegister() {
        TodoDTO todoDTO = TodoDTO.builder()
                .title("Title...")
                .content("Content..........")
                .dueDate(LocalDate.of(2024, 05, 23))
                .build();

        log.info(todoService.register(todoDTO));
    }


}