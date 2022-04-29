package tech.tresearchgroup.libraries.ipfscluster.model;

import com.jsoniter.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ipfs{

	@JsonProperty("addresses")
	private List<String> addresses;

	@JsonProperty("id")
	private String id;

	@JsonProperty("error")
	private String error;
}