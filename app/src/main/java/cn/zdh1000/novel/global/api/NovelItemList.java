package cn.zdh1000.novel.global.api;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MewX on 2015/1/21.
 * Novel Item List.
 */
public class NovelItemList {


    List<Integer> l;
    int currentPage;
    int totalPage;
    int lastRecord; // this save the last add number for reversing operation

    // Variables
    private boolean parseStatus; // default false

    /**
     * Init the whole struct with the received XML string
     *
     * @param str only str[0] is available, because I use array for pass by reference
     */
    public NovelItemList(String[] str, int page) {
        setNovelItemList(str, page);
    }

    public NovelItemList() {
        // init all values
        parseStatus = false;
        currentPage = 1;
        totalPage = 1;
    }

    public void setNovelItemList(String[] str, int page) {
        parseStatus = parseNovelItemList(str, page);
    }

    /**
     * get parse status
     *
     * @return true - parsed, else failed.
     */
    public boolean getParseStatus() {
        return parseStatus;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public List<Integer> getNovelItemList() {
        return l;
    }

    private boolean parseNovelItemList(String[] str, int page) {

        return true;
    }

    public void requestForReverse(){
        for( int i = lastRecord; i < l.size(); i ++ )
            l.remove(lastRecord);
    }
}
