package project.utils;

import java.io.Serializable;
import java.util.List;

/**
 * @author yang
 * @date 2020-5-1
 * @description 传给前端的页面结果，封装类
 */
public class PageResult implements Serializable {

    //总记录数
    private Long totalCount;
    //页面大小
    private int pageSize;
    //总页数
    private int totalPage;
    //当前页数
    private int currentPage;
    //页面所有数据
    private List<?> list;

    /**
     * @param list 记录列表
     * @param totalCount 列表大小
     * @param pageSize 页面大小,一个页面的数据个数
     * @param currentPage 当前页数
     */
    public PageResult(List<?> list, Long totalCount, int pageSize, int currentPage){
        this.list = list;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.totalPage =(int)Math.ceil((double)totalCount/pageSize);
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "totalCount=" + totalCount +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                ", list=" + list +
                '}';
    }
}
