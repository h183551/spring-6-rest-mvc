package guru.springframework.spring6restmvc.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Class Customer
 * <p>
 * Description: [Add class description here]
 * <p>
 * Created by Hasan on 2024-11-14.
 */
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private UUID id;
    private String customerName;

    @Version
    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
