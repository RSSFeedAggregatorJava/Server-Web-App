/*
 * RSS Feed Aggregator
 * This is an api for \"RSS Feed Aggregator\".  [View Subject](https://intra.epitech.eu/module/2016/M-EAP-650/PAR-9-1/acti-235029/project/file/RSS-feed-aggregator.pdf) or [Messenger group](https://www.messenger.com/t/552069568251252)  A successfull login or signup generate a key usable to authenticate request  This key is owned by one account, a request providing an apiKey should get result for the user owning this key. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;

/**
 * Feed
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-26T20:43:45.780Z")
public class Feed   {
	private Integer id = null;
	private Integer userId = null;
	private String feedUrl = "";
	private String category = "";
	private String copyright = "";
	private String description = "";
	private String docs = "";
	private String generator = "";
	private String image = "";
	private String language = "";
	private String lastBuildDate = "";
	private String link = "";
	private String managingEditor = "";
	private String pubDate = "";
	private String rating = "";
	private String title = "";
	private String webMaster = "";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFeedUrl() {
		return feedUrl;
	}

	public void setFeedUrl(String feedUrl) {
		this.feedUrl = feedUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocs() {
		return docs;
	}

	public void setDocs(String docs) {
		this.docs = docs;
	}

	public String getGenerator() {
		return generator;
	}

	public void setGenerator(String generator) {
		this.generator = generator;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getManagingEditor() {
		return managingEditor;
	}

	public void setManagingEditor(String managingEditor) {
		this.managingEditor = managingEditor;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWebMaster() {
		return webMaster;
	}

	public void setWebMaster(String webMaster) {
		this.webMaster = webMaster;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Feed feed = (Feed) o;
		return Objects.equals(this.id, feed.id) &&
				Objects.equals(this.feedUrl, feed.feedUrl) &&
				Objects.equals(this.category, feed.category) &&
				Objects.equals(this.copyright, feed.copyright) &&
				Objects.equals(this.description, feed.description) &&
				Objects.equals(this.docs, feed.docs) &&
				Objects.equals(this.generator, feed.generator) &&
				Objects.equals(this.image, feed.image) &&
				Objects.equals(this.language, feed.language) &&
				Objects.equals(this.lastBuildDate, feed.lastBuildDate) &&
				Objects.equals(this.link, feed.link) &&
				Objects.equals(this.managingEditor, feed.managingEditor) &&
				Objects.equals(this.pubDate, feed.pubDate) &&
				Objects.equals(this.rating, feed.rating) &&
				Objects.equals(this.title, feed.title) &&
				Objects.equals(this.webMaster, feed.webMaster);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, feedUrl, category, copyright, description, docs, generator, image, language, lastBuildDate, link, managingEditor, pubDate, rating, title, webMaster);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");
		if (id != null)
			sb.append("    \"id\": \"").append(toIndentedString(id)).append("\",\n");
		if (title != null)
			sb.append("    \"title\": \"").append(toIndentedString(title)).append("\",\n");
		if (description != null)
			sb.append("    \"description\": \"").append(toIndentedString(description)).append("\",\n");
		if (feedUrl != null)
			sb.append("    \"url\": \"").append(toIndentedString(feedUrl)).append("\",\n");
		if (link != null)
			sb.append("    \"link\": \"").append(toIndentedString(link)).append("\",\n");
		if (pubDate != null)
			sb.append("    \"pubDate\": \"").append(toIndentedString(pubDate)).append("\",\n");
		if (image != null)
			sb.append("    \"image\": \"").append(toIndentedString(image)).append("\",\n");
		if (category != null)
			sb.append("    \"category\": \"").append(toIndentedString(category)).append("\",\n");
		if (copyright != null)
			sb.append("    \"copyright\": \"").append(toIndentedString(copyright)).append("\",\n");
		if (docs != null)
			sb.append("    \"docs\": \"").append(toIndentedString(docs)).append("\",\n");
		if (generator != null)
			sb.append("    \"generator\": \"").append(toIndentedString(generator)).append("\",\n");
		if (language != null)
			sb.append("    \"language\": \"").append(toIndentedString(language)).append("\",\n");
		if (lastBuildDate != null)
			sb.append("    \"lastBuildDate\": \"").append(toIndentedString(lastBuildDate)).append("\",\n");
		if (managingEditor != null)
			sb.append("    \"managingEditor\": \"").append(toIndentedString(managingEditor)).append("\",\n");
		if (rating != null)
			sb.append("    \"rating\": \"").append(toIndentedString(rating)).append("\",\n");
		if (webMaster != null)
			sb.append("    \"webMaster\": \"").append(toIndentedString(webMaster)).append("\",\n");
		sb.append("}");
		sb = new StringBuilder(sb).replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, "");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

