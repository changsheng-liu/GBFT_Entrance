package ucsc.gbft.entranceapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageItem {

    public boolean isViewChange() {
        return false;
    }
}
