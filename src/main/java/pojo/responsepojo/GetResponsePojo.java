package pojo.responsepojo;

import com.google.gson.annotations.SerializedName;

public class GetResponsePojo {

    public Integer status;
    public Boolean showDeals;
    public Boolean showCommute;
    public Boolean showContactUs;
    public Boolean showPedlSubscription;
    @SerializedName("policy_url")
    public String policyUrl;
    public Boolean showLoyalty;
    public Boolean showReferral;
    public String listYourCarUrl;
    public Boolean showZoomAir;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getShowDeals() {
        return showDeals;
    }

    public void setShowDeals(Boolean showDeals) {
        this.showDeals = showDeals;
    }

    public Boolean getShowCommute() {
        return showCommute;
    }

    public void setShowCommute(Boolean showCommute) {
        this.showCommute = showCommute;
    }

    public Boolean getShowContactUs() {
        return showContactUs;
    }

    public void setShowContactUs(Boolean showContactUs) {
        this.showContactUs = showContactUs;
    }

    public Boolean getShowPedlSubscription() {
        return showPedlSubscription;
    }

    public void setShowPedlSubscription(Boolean showPedlSubscription) {
        this.showPedlSubscription = showPedlSubscription;
    }

    public String getPolicyUrl() {
        return policyUrl;
    }

    public void setPolicyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
    }

    public Boolean getShowLoyalty() {
        return showLoyalty;
    }

    public void setShowLoyalty(Boolean showLoyalty) {
        this.showLoyalty = showLoyalty;
    }

    public Boolean getShowReferral() {
        return showReferral;
    }

    public void setShowReferral(Boolean showReferral) {
        this.showReferral = showReferral;
    }

    public String getListYourCarUrl() {
        return listYourCarUrl;
    }

    public void setListYourCarUrl(String listYourCarUrl) {
        this.listYourCarUrl = listYourCarUrl;
    }

    public Boolean getShowZoomAir() {
        return showZoomAir;
    }

    public void setShowZoomAir(Boolean showZoomAir) {
        this.showZoomAir = showZoomAir;
    }
}
