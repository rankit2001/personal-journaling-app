package com.journal.writeIt.models;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JournalEntry {
    private Long id;
    private String content;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
