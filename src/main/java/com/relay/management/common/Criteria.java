package com.relay.management.common;

import lombok.Data;

@Data
public class Criteria {

    private int currentPageNo; // 현재 페이지 번호
    private int rowSize; // 출력 로우 개수
    private int startRow; // 시작 로우
    private int pageSize; // 하단에 노출할 페이지 사이즈
    private int totalPageSize; // 마지막 페이지 개수(총 페이지 개수)
    private int startPage; // 시작페이지
    private int endPage; // 마지막 페이지

    private String searchKeyword; // 검색어
    private String searchType;  // 검색유형
    private String filterType;
    private String orderType; //정렬기준


   public Criteria(){
       this.currentPageNo = 1;
       this.rowSize = 15;
       this.pageSize = 10;
       this.totalPageSize =1;
       this.startPage = 1;
       this.endPage = 1;
       this.searchKeyword = "";
       this.searchType = "";
       this.filterType = "";
       this.orderType = "";

   }

   public void setStartRow(){
       this.startRow = (currentPageNo -1) * rowSize;
   }

    public void setPaging(int totalRow){
        if(totalRow < 1){
            this.totalPageSize = 1;
            this.startPage = 1;
            this.endPage =1;
        }else{
            this.totalPageSize = totalRow / rowSize;
            if(totalPageSize % rowSize > 0){
                totalPageSize++;
            }
            setStartRow();
            setStartPage(totalRow);
            setEndPage(totalRow);
        }

    }

   public void setStartPage(int totalRow){
       this.startPage = ((currentPageNo-1)/pageSize)*pageSize+1;
   }
   public void setEndPage(int totalRow){
       this.endPage = startPage + pageSize - 1;
        if(endPage > totalPageSize){
            endPage = totalPageSize;
        }
    }
}
