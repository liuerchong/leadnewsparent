package com.liu.leadnews.article.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/****
 * @Author:liuerchong
 * @Description:
 * @Date 2020/6/01 10:18
 *****/
@ApiModel(description = "ApArticle",value = "ApArticle")
@Table(name="ap_article")
public class ApArticle implements Serializable{

	@ApiModelProperty(value = "",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//

	@ApiModelProperty(value = "标题",required = false)
    @Column(name = "title")
	private String title;//标题

	@ApiModelProperty(value = "文章作者的ID",required = false)
    @Column(name = "author_id")
	private Integer authorId;//文章作者的ID

	@ApiModelProperty(value = "作者昵称",required = false)
    @Column(name = "author_name")
	private String authorName;//作者昵称

	@ApiModelProperty(value = "文章所属频道ID",required = false)
    @Column(name = "channel_id")
	private Integer channelId;//文章所属频道ID

	@ApiModelProperty(value = "频道名称",required = false)
    @Column(name = "channel_name")
	private String channelName;//频道名称
  /*0 无图文章
            1 单图文章
            2 多图文章*/
	@ApiModelProperty(value = "文章布局",required = false)
    @Column(name = "layout")
	private String layout;//文章布局
           // 0 无图文章
           // 1 单图文章
          //  2 多图文章

	@ApiModelProperty(value = "文章标记",
           // 0 普通文章
           // 1 热点文章
           // 2 置顶文章
           // 3 精品文章
           // 4 大V 文章",
            required = false)
    @Column(name = "flag")
	private Integer flag;//文章标记
           /* 0 普通文章
            1 热点文章
            2 置顶文章
            3 精品文章
            4 大V 文章*/

	@ApiModelProperty(value = "文章图片",required = false)
    @Column(name = "images")
	private String images;//文章图片
           // 多张逗号分隔

	@ApiModelProperty(value = "文章标签最多3个 逗号分隔",required = false)
    @Column(name = "labels")
	private String labels;
            //文章标签最多3个 逗号分隔

	@ApiModelProperty(value = "点赞数量",required = false)
    @Column(name = "likes")
	private Integer likes;//点赞数量

	@ApiModelProperty(value = "收藏数量",required = false)
    @Column(name = "collection")
	private Integer collection;//收藏数量

	@ApiModelProperty(value = "评论数量",required = false)
    @Column(name = "comment")
	private Integer comment;//评论数量

	@ApiModelProperty(value = "阅读数量",required = false)
    @Column(name = "views")
	private Integer views;//阅读数量

	@ApiModelProperty(value = "省市",required = false)
    @Column(name = "province_id")
	private Integer provinceId;//省市

	@ApiModelProperty(value = "市区",required = false)
    @Column(name = "city_id")
	private Integer cityId;//市区

	@ApiModelProperty(value = "区县",required = false)
    @Column(name = "county_id")
	private Integer countyId;//区县

	@ApiModelProperty(value = "创建时间",required = false)
    @Column(name = "created_time")
	private Date createdTime;//创建时间

	@ApiModelProperty(value = "发布时间",required = false)
    @Column(name = "publish_time")
	private Date publishTime;//发布时间

	@ApiModelProperty(value = "同步状态",required = false)
    @Column(name = "sync_status")
	private String syncStatus;//同步状态

	@ApiModelProperty(value = "来源",required = false)
    @Column(name = "origin")
	private String origin;//来源



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public String getTitle() {
		return title;
	}

	//set方法
	public void setTitle(String title) {
		this.title = title;
	}
	//get方法
	public Integer getAuthorId() {
		return authorId;
	}

	//set方法
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	//get方法
	public String getAuthorName() {
		return authorName;
	}

	//set方法
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	//get方法
	public Integer getChannelId() {
		return channelId;
	}

	//set方法
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	//get方法
	public String getChannelName() {
		return channelName;
	}

	//set方法
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	//get方法
	public String getLayout() {
		return layout;
	}

	//set方法
	public void setLayout(String layout) {
		this.layout = layout;
	}
	//get方法
	public Integer getFlag() {
		return flag;
	}

	//set方法
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	//get方法
	public String getImages() {
		return images;
	}

	//set方法
	public void setImages(String images) {
		this.images = images;
	}
	//get方法
	public String getLabels() {
		return labels;
	}

	//set方法
	public void setLabels(String labels) {
		this.labels = labels;
	}
	//get方法
	public Integer getLikes() {
		return likes;
	}

	//set方法
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	//get方法
	public Integer getCollection() {
		return collection;
	}

	//set方法
	public void setCollection(Integer collection) {
		this.collection = collection;
	}
	//get方法
	public Integer getComment() {
		return comment;
	}

	//set方法
	public void setComment(Integer comment) {
		this.comment = comment;
	}
	//get方法
	public Integer getViews() {
		return views;
	}

	//set方法
	public void setViews(Integer views) {
		this.views = views;
	}
	//get方法
	public Integer getProvinceId() {
		return provinceId;
	}

	//set方法
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	//get方法
	public Integer getCityId() {
		return cityId;
	}

	//set方法
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	//get方法
	public Integer getCountyId() {
		return countyId;
	}

	//set方法
	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}
	//get方法
	public Date getCreatedTime() {
		return createdTime;
	}

	//set方法
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	//get方法
	public Date getPublishTime() {
		return publishTime;
	}

	//set方法
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	//get方法
	public String getSyncStatus() {
		return syncStatus;
	}

	//set方法
	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}
	//get方法
	public String getOrigin() {
		return origin;
	}

	//set方法
	public void setOrigin(String origin) {
		this.origin = origin;
	}


}
