package week11_day5;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "batches")
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_id")
    private String batchId;

    @Column(name = "center")
    private String center;

    @Column(name = "technology")
    private String technology;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @OneToMany(mappedBy = "batch", cascade = CascadeType.ALL)
    private List<Student> students;

    // Constructors, getters, and setters
    public Batch() {}

    public Batch(String center, String technology, Date startDate, Date endDate) {
        this.center = center;
        this.technology = technology;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

