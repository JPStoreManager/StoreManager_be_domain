package manage.store.domain.model.common.commonCode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import manage.store.domain.model.common.value.CommonCodeCd;
import manage.store.domain.model.common.value.CommonCodeGrpCd;
import manage.store.domain.model.common.value.SortOrder;
import manage.store.domain.model.common.value.UseYn;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonCode {

    private CommonCodeGrpCd grpCd;
    private String grpCdDesc;
    private CommonCodeCd cd;
    private String cdVal;
    private String cdDesc;
    private UseYn useYn;
    private SortOrder sortOrder;
    private String createdBy;
    private String createdDate;
    private String lastUpdatedBy;
    private String lastUpdatedDate;

}
