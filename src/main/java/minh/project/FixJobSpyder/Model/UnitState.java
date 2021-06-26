package minh.project.FixJobSpyder.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitState {
    private UUID id;
    private String combatLevelCode;
    private String combatReadinessStatusCode;
    private String name;
    private String parentId;
    private String type;
    protected UUID createdBy;
    protected Date createdAt;
    protected UUID modifiedBy;
    protected Date modifiedAt;
}

