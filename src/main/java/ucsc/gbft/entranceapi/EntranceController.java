package ucsc.gbft.entranceapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class EntranceController {

    @Autowired
    private TaskList taskList;

    @RequestMapping(value = "/gbft/{key}={value}")
    public DeferredResult<String> updateKV(@PathVariable String key, @PathVariable String value) {
        TargetKV item = new TargetKV(key, value);
        DeferredResult<String> result = new DeferredResult<>(10000L);
        result.onTimeout(new Thread(()->{
            result.setResult("time out");
        }));
        synchronized (taskList) {
            taskList.insert(new TaskItem(item, Math.random(), result));
        }
        return result;
    }
}