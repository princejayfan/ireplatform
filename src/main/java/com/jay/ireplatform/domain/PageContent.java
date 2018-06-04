package com.jay.ireplatform.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;

/**
 * Created by Jay
 * date : 2018/6/3
 * des :
 */
@Entity
@Table(name="CONTENT")
public class PageContent implements Serializable {

    private static final long serialVersionUID = 1589546778948893733L;

    /**
     * 唯一标识
     */
    private String id;
    /**
     * 顶端标题
     */
    private String title;

    /**
     * 日期
     */
    private String contentDate;

    /**
     * 主要内容
     */
    private String contentText;

    /**
     * 图片标题
     */
    private String imageText;

    /**
     * 脚步标题
     */
    private String footText;

    /**
     * 图片
     */
    private Blob imgFile;

    /**
     * 发布时间
     */
    private String releaseDateTime;

    /**
     * 状态
     */
    private Integer type;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(length = 500)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentDate() {
        return contentDate;
    }

    public void setContentDate(String contentDate) {
        this.contentDate = contentDate;
    }

    @Column(length = 500)
    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public String getImageText() {
        return imageText;
    }

    public void setImageText(String imageText) {
        this.imageText = imageText;
    }

    @Column(length = 500)
    public String getFootText() {
        return footText;
    }

    public void setFootText(String footText) {
        this.footText = footText;
    }

    @Lob
    public Blob getImgFile() {
        return imgFile;
    }

    public void setImgFile(Blob imgFile) {
        this.imgFile = imgFile;
    }

    public String getReleaseDateTime() {
        return releaseDateTime;
    }

    public void setReleaseDateTime(String releaseDateTime) {
        this.releaseDateTime = releaseDateTime;
    }

    public Integer getType() {
        return type;
    }

    @Column(length = 2)
    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PageContent pageContent = (PageContent) o;

        if (title != null ? !title.equals(pageContent.title) : pageContent.title != null) return false;
        if (contentDate != null ? !contentDate.equals(pageContent.contentDate) : pageContent.contentDate != null) return false;
        if (contentText != null ? !contentText.equals(pageContent.contentText) : pageContent.contentText != null) return false;
        if (imageText != null ? !imageText.equals(pageContent.imageText) : pageContent.imageText != null) return false;
        if (footText != null ? !footText.equals(pageContent.footText) : pageContent.footText != null) return false;
        if (imgFile != null ? !imgFile.equals(pageContent.imgFile) : pageContent.imgFile != null) return false;
        if (releaseDateTime != null ? !releaseDateTime.equals(pageContent.releaseDateTime) : pageContent.releaseDateTime != null)
            return false;
        return type != null ? type.equals(pageContent.type) : pageContent.type == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (contentDate != null ? contentDate.hashCode() : 0);
        result = 31 * result + (contentText != null ? contentText.hashCode() : 0);
        result = 31 * result + (imageText != null ? imageText.hashCode() : 0);
        result = 31 * result + (footText != null ? footText.hashCode() : 0);
        result = 31 * result + (imgFile != null ? imgFile.hashCode() : 0);
        result = 31 * result + (releaseDateTime != null ? releaseDateTime.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PageContent{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", contentDate='" + contentDate + '\'' +
                ", contentText='" + contentText + '\'' +
                ", imageText='" + imageText + '\'' +
                ", footText='" + footText + '\'' +
                ", imgFile=" + imgFile +
                ", releaseDateTime='" + releaseDateTime + '\'' +
                ", type=" + type +
                '}';
    }
}
