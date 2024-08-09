package springProject.coX.vo;

import lombok.*;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "File")
@Data
@NoArgsConstructor
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fileId;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @ManyToOne
    @JoinColumn(name = "uploaded_by")
    private User uploadedBy;

    @Column(nullable = false)
    private String filePath;

    private Timestamp uploadDate;
}