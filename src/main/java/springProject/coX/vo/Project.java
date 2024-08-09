package springProject.coX.vo;

import lombok.*;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Project")
@Data
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    private String description;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
