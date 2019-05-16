package ucsc.gbft.entranceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EntranceapiApplication {
//https://gitee.com/sunnymore/asynchronous_task/tree/master/deferredresultdemo
//https://www.jianshu.com/p/062c2c6e21da
	public static void main(String[] args) {
		SpringApplication.run(EntranceapiApplication.class, args);
	}
//	@RequestMapping(value = "/gbft/{key}={value}")
//	public String updateKV(@PathVariable String key, @PathVariable String value) {
//		return key;
//	}
//	@RequestMapping("/gbft")
//	public String gbft() {
//		return "gbft";
//	}
}

