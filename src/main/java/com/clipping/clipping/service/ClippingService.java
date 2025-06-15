package com.clipping.clipping.service;

import com.clipping.clipping.model.ClippingModel;
import com.clipping.clipping.repository.ClippingRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClippingService {

    @Value("${newsapi.key}")
    private String apiKey;

    private final String API_URL = "https://newsapi.org/v2/everything";
    private final ClippingRepository clippingRepository;
    private final RestTemplate restTemplate;

    public ClippingService(ClippingRepository clippingRepository, RestTemplate restTemplate) {
        this.clippingRepository = clippingRepository;
        this.restTemplate = restTemplate;
    }

    @Transactional
    public List<ClippingModel> buscarESalvarNoticias(String palavraBusca) {
        List<ClippingModel> noticias = buscarNaAPI(palavraBusca);
        return clippingRepository.saveAll(noticias);
    }

    private List<ClippingModel> buscarNaAPI(String palavraBusca) {
        String url = construirUrlAPI(palavraBusca);
        NewsApiResponse response = restTemplate.getForObject(url, NewsApiResponse.class);

        return Arrays.stream(response.getArticles())
                .map(article -> criarClipping(article, palavraBusca))
                .collect(Collectors.toList());
    }

    private String construirUrlAPI(String palavraBusca) {
        return UriComponentsBuilder.fromHttpUrl(API_URL)
                .queryParam("q", palavraBusca)
                .queryParam("apiKey", apiKey)
                .queryParam("language", "pt")
                .toUriString();
    }

    private ClippingModel criarClipping(Article article, String palavraBusca) {
        LocalDateTime dataPublicacao = parseData(article.getPublishedAt());

        return new ClippingModel(
                article.getTitle(),
                article.getAuthor(),
                article.getUrl(),
                article.getSource().getName(),
                dataPublicacao,
                palavraBusca
        );
    }

    private LocalDateTime parseData(String publishedAt) {
        String dataFormatada = publishedAt.replace("Z", "");
        return LocalDateTime.parse(dataFormatada, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    // Classes para mapear a resposta da API
    private static class NewsApiResponse {
        private Article[] articles;

        public Article[] getArticles() {
            return articles;
        }

        public void setArticles(Article[] articles) {
            this.articles = articles;
        }
    }

    private static class Article {
        private String title;
        private String author;
        private String url;
        private String publishedAt;
        private Source source;

        // Getters e Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public Source getSource() {
            return source;
        }

        public void setSource(Source source) {
            this.source = source;
        }
    }

    private static class Source {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}