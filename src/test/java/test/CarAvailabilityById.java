package test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "carId",
        "location",
        "hub",
        "starts",
        "ends"
})
public class CarAvailabilityById {
    //@JsonProperty("carId")
    private Integer carId;
    //@JsonProperty("location")
    private Integer location;
   // @JsonProperty("hub")
    private Integer hub;
   // @JsonProperty("starts")
    private Long starts;
   // @JsonProperty("ends")
    private Long ends;

  //  @JsonProperty("carId")
    public Integer getCarId() {
        return carId;
    }

  //  @JsonProperty("carId")
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

   // @JsonProperty("location")
    public Integer getLocation() {
        return location;
    }

  //  @JsonProperty("location")
    public void setLocation(Integer location) {
        this.location = location;
    }

  //  @JsonProperty("hub")
    public Integer getHub() {
        return hub;
    }

   // @JsonProperty("hub")
    public void setHub(Integer hub) {
        this.hub = hub;
    }

  //  @JsonProperty("starts")
    public Long getStarts() {
        return starts;
    }

  //  @JsonProperty("starts")
    public void setStarts(Long starts) {
        this.starts = starts;
    }

   // @JsonProperty("ends")
    public Long getEnds() {
        return ends;
    }

  //  @JsonProperty("ends")
    public void setEnds(Long ends) {
        this.ends = ends;
    }

        @Override
    public String toString() {
        return "CarAvailabilityById{" +
                "carId=" + carId +
                ", location=" + location +
                ", hub=" + hub +
                ", starts=" + starts +
                ", ends=" + ends +
                '}';
    }
}
