package guru.springframework.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Class Customer
 * <p>
 * Description: [Add class description here]
 * <p>
 * Created by hasan on 10/29/2024.
 */
@Builder
@Data
public class CustomerDTO {
    private String customerName;
    private UUID id;
    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
