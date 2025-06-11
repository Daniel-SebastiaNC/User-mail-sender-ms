package dev.java10x.email.model;

import dev.java10x.email.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_email")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String emailSubject;
    @Column(columnDefinition = "BODY")
    private String body;
    private EmailStatus emailStatus;
    private LocalDateTime emailSentDate;


}
