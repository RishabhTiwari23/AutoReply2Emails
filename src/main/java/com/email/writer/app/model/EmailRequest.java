package com.email.writer.app.model;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}