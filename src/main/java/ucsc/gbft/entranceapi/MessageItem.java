package ucsc.gbft.entranceapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageItem {

    public boolean isViewChangeMessage;
    public int centerId;
    public double randomId;
    public String key;
    public String value;
    public int nextMaster;
}
