package academy.devdojo.springboot2.requests;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AnimePutRequestBody {

    private Long id;
    private String name;
}
