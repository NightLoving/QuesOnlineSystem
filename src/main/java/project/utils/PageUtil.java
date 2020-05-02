package project.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author yang
 * @date 2020-5-1
 * @description 分页工具类，传入含有页码和每页条数的Map。告知Dao层该从哪里取数据
 */
public class PageUtil extends LinkedHashMap<String, Object> {

    //页码，第几页的数据
    private int page;
    //每页的数据个数
    private int limit;


    public PageUtil(Map<String, Object> params){
        this.putAll(params);

        this.page = Integer.parseInt(this.get("page").toString());
        this.limit = Integer.parseInt(this.get("limit").toString());
        this.put("start",(page-1)*limit);
        this.put("page",page);
        this.put("limit",limit);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "PageUtil{" +
                "page=" + page +
                ", limit=" + limit +
                '}';
    }
}
