package org.neo4j.sdnlegacy.movie;

import org.springframework.data.annotation.Version;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * @author Gerrit Meier
 */
@Node("Movie")
public class MovieEntity {

	@Id
	private String title;

	private Tagline tagline;

	@Property("released")
	private Integer yearOfRelease;

	public MovieEntity(String title, String tagline, Integer yearOfRelease) {
		this.title = title;
		this.tagline = Tagline.of(tagline);
		this.yearOfRelease = yearOfRelease;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Tagline getTagline() {
		return tagline;
	}

	public void setTagline(Tagline tagline) {
		this.tagline = tagline;
	}

	public Integer getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(Integer yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	@Override
	public String toString() {
		return "MovieEntity{" +
			"title='" + title + '\'' +
			", tagline='" + tagline + '\'' +
			", yearOfRelease=" + yearOfRelease +
			'}';
	}
}
