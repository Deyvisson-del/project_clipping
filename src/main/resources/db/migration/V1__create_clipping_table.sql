CREATE TABLE tb_clipping (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title_noticia VARCHAR(500) NOT NULL,
    autor_noticia VARCHAR(100),
    url TEXT NOT NULL,
    fonte_noticia VARCHAR(100),
    data_publicacao DATETIME,
    data_busca DATETIME NOT NULL,
    palavra_busca VARCHAR(100) NOT NULL
);

CREATE INDEX idx_palavra_busca ON tb_clipping(palavra_busca);
CREATE INDEX idx_data_busca ON tb_clipping(data_busca);