package academy.devdojo.springboot2.integration;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.repository.AnimeRepository;
import academy.devdojo.springboot2.util.AnimeCreator;
import academy.devdojo.springboot2.wrapper.PageableResponse;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase
class AnimeControllerIT {

    @Autowired
    private TestRestTemplate testRestTemplate;
    @Autowired
    private AnimeRepository animeRepository;

    @Test
    @DisplayName("list returns List of anime inside page object when successfully")
    void list_ReturnsListOfAnimeInsidePageObject_whenSuccessfully() {
        Anime savedAnime = animeRepository.save(AnimeCreator.createValidAnime());
        String expectedName = savedAnime.getName();

        PageableResponse<Anime> anime = testRestTemplate.exchange(
                "/animes", HttpMethod.GET, null,
                new ParameterizedTypeReference<PageableResponse<Anime>>() {
                }).getBody();

        Assertions.assertThat(anime).isNotNull();
        Assertions.assertThat(anime.toList()).isNotEmpty().hasSize(1);
        Assertions.assertThat(anime.toList().get(0).getName()).isEqualTo(expectedName);
    }
}
