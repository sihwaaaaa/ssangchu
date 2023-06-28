package kr.co.poetrypainting.crawl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author 함준혁
 * 당근마켓 상품정보 크롤링
 * @since 2023-04-06
 * To do list : 카테고리 정보 가져와야함.
 */
public class Crawl {

    public static void main(String[] args) throws Exception {
        // 크롤링할 페이지 URL
        String url = "https://www.daangn.com/hot_articles";

        // Jsoup을 사용하여 페이지를 가져오기
        Document doc = Jsoup.connect(url).get();

        // 상품 정보가 있는 요소를 찾기
        Elements items = doc.select(".cards-wrap .card-top");

        // 각 상품 정보에 대해 반복문 실행
        for (Element item : items) {

            // 상품 상세 정보 주소 찾기
            String detail = item.selectFirst("a.card-link").attr("href");

            // 상품 상세 정보 주소 URL
            String detUrl = "https://www.daangn.com" + detail;

            // Jsoup을 사용하여 상세페이지 가져오기
            Document doc2 = Jsoup.connect(detUrl).get();


            // 제목 추출
            String title = doc2.select("#article-title").text();

            // 카테고리, 등록일 추출
            String catReg = doc2.select("#article-category").text();
            // 구분자를 이용하여 분리
            String[] val = catReg.split("\\s*∙\\s*");
            // 카테고리 추출
            String category = val[0];
            // 등록일 추출
            String regDate = val[1];

            // 닉네임 추출
            String nickname = doc2.select("#nickname").text();
            // 주소 추출
            String address = doc2.select("#region-name").text();

            // 섬네일 추출
            String thumbnail = item.selectFirst("img").attr("src");
            // 원본 이미지 추출
            String img = doc2.select(".portrait").attr("src");

            // 상품 가격 추출
            String price = doc2.select("#article-price").text().replaceAll("[^0-9]", "");

            // 상품 설명 추출
            String content = doc2.select("#article-detail").text();

            // 관심,채팅,조회 추출
            String counts = doc2.select("#article-counts").text();

            // 구분자를 이용하여 분리
            String[] val2 = counts.split("\\s*∙\\s*");

            // 관심수 추출
            String like = val2[0].replaceAll("[^0-9]", "");
            // 댓글수 추출
            String reply = val2[1].replaceAll("[^0-9]", "");
            // 조회수 추출
            String hit = val2[2].replaceAll("[^0-9]", "");

            // 출력
            System.out.println("제목: " + title);
            System.out.println("카테고리: " + category);
            System.out.println("작성시간: " + regDate);
            System.out.println("가격: " + price);
            System.out.println("섬네일: " + thumbnail);
            System.out.println("원본이미지: " + img);
            System.out.println("내용: " + content);
            System.out.println("관심수: " + like);
            System.out.println("댓글수: " + reply);
            System.out.println("조회수: " + hit);
            System.out.println("닉네임: " + nickname);
            System.out.println("주소: " + address);
            System.out.println("------------------------");
        }
    }
}

