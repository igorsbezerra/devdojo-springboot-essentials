package academy.devdojo.springboot2.client;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SpringClient {

    public static final String HTTP_LOCALHOST_8080_ANIMES = "http://localhost:8080/animes";

    public static void main(String[] args) {
        // GET
//        ResponseEntity<Anime> entity = new RestTemplate().getForEntity("http://localhost:8080/animes/{id}", Anime.class, 1);
//        log.info(entity);
//
//        Anime[] animes = new RestTemplate().getForObject("http://localhost:8080/animes/all", Anime[].class);
//        log.info(Arrays.toString(animes));
//
//        ResponseEntity<List<Anime>> exchange = new RestTemplate().exchange(
//                "http://localhost:8080/animes/all",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<>() {
//                });
//
//        log.info(exchange);


        // POST
//        Anime kingdom = Anime.builder().name("kingdom").build();
//        Anime kingdomSaved = new RestTemplate().postForObject(HTTP_LOCALHOST_8080_ANIMES, kingdom, Anime.class);
//        log.info("saved anime {}", kingdomSaved);
//
//        Anime samuraiChamploo = Anime.builder().name("Samurai Champloo").build();
//        ResponseEntity<Anime> samuraiChamplooSaved = new RestTemplate().exchange(
//                HTTP_LOCALHOST_8080_ANIMES,
//                HttpMethod.POST,
//                new HttpEntity<>(samuraiChamploo, createJsonHeader()),
//                Anime.class
//        );
//        log.info("saved anime {}", samuraiChamplooSaved);


        // PUT
//        Anime animeToBeUpdated = samuraiChamplooSaved.getBody();
//        animeToBeUpdated.setName("Samurai Champloo 2");
//
//        ResponseEntity<Void> samuraiChamplooUpdated = new RestTemplate().exchange(
//                HTTP_LOCALHOST_8080_ANIMES,
//                HttpMethod.PUT,
//                new HttpEntity<>(animeToBeUpdated, createJsonHeader()),
//                Void.class
//        );
//        log.info(samuraiChamplooUpdated);


        // DELETE
//        ResponseEntity<Void> samuraiChamplooDeleted = new RestTemplate().exchange(
//                "http://localhost:8080/animes/{id}",
//                HttpMethod.DELETE,
//                null,
//                Void.class,
//                animeToBeUpdated.getId()
//        );
//        log.info(samuraiChamplooDeleted);
    }

//    private static HttpHeaders createJsonHeader() {
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//        return httpHeaders;
//    }
}
