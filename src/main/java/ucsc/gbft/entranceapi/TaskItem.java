package ucsc.gbft.entranceapi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.context.request.async.DeferredResult;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskItem {
    public TargetKV kvItem;
    public double randomNo;
    public DeferredResult<String> result;
}
