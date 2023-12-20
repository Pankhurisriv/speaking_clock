package speakingclockproject.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import speakingclockproject.Service.SpeakingClockServiceImpl;


@Tag(name="Speaking Clock Application",
        description = "Speaking Clock which converts time into words"
)
@RestController
public class SpeakingClockController {


@Autowired
    private SpeakingClockServiceImpl speakingClockService;

    @Operation(
            summary = "Get time",
            description = "Get time in string"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping("/convert")
    public ResponseEntity<String> convertToWords(@RequestParam("time") String timeStr) {
        try {


            String wordTime=speakingClockService.convertTimeToWord(timeStr);
            String result = "It's " + wordTime;
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid time format");
        }
    }
}
