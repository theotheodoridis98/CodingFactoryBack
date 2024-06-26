package org.endofusion.endoserver.dto;

import org.endofusion.endoserver.request.GenericRequest;
import org.endofusion.endoserver.request.InstrumentRequest;
import java.util.Collection;
import java.util.Date;

public class InstrumentDto extends GenericRequest {

    private Long instrumentSeriesId;

    private String instrumentRef;

    private String instrumentLot;

    private String instrumentManufacturer;

    private Date instrumentPurchaseDate;

    private String instrumentNotes;

    private String instrumentSeriesCode;

    private Collection<String> instrumentSeriesCodesList;

    private Date purchaseDateFrom;

    private Date purchaseDateTo;

    private String instrumentSeriesQrCode;

    private Long instrumentsCount;


    public InstrumentDto() {
    }

    public InstrumentDto(String name, Date purchaseDateFrom, Date purchaseDateTo, Collection<String> instrumentSeriesCodesList) {
        this.name = name;
        this.purchaseDateFrom = purchaseDateFrom;
        this.purchaseDateTo = purchaseDateTo;
        this.instrumentSeriesCodesList = instrumentSeriesCodesList;
    }

    public InstrumentDto(InstrumentRequest request, Long id, boolean isUpdate) {
        this.setName(request.getName());
        this.setDescription(request.getDescription());
        this.setInstrumentRef(request.getInstrumentRef());
        this.setInstrumentLot(request.getInstrumentLot());
        this.setInstrumentManufacturer(request.getInstrumentManufacturer());
        this.setInstrumentPurchaseDate(request.getInstrumentPurchaseDate());
        this.setInstrumentNotes(request.getInstrumentNotes());
        if (isUpdate) {
            this.setId(id);
        }
    }

    public Long getInstrumentSeriesId() {
        return instrumentSeriesId;
    }

    public void setInstrumentSeriesId(Long instrumentSeriesId) {
        this.instrumentSeriesId = instrumentSeriesId;
    }

    public String getInstrumentRef() {
        return instrumentRef;
    }

    public void setInstrumentRef(String instrumentRef) {
        this.instrumentRef = instrumentRef;
    }

    public String getInstrumentLot() {
        return instrumentLot;
    }

    public void setInstrumentLot(String instrumentLot) {
        this.instrumentLot = instrumentLot;
    }

    public String getInstrumentManufacturer() {
        return instrumentManufacturer;
    }

    public void setInstrumentManufacturer(String instrumentManufacturer) {
        this.instrumentManufacturer = instrumentManufacturer;
    }

    public Date getInstrumentPurchaseDate() {
        return instrumentPurchaseDate;
    }

    public void setInstrumentPurchaseDate(Date instrumentPurchaseDate) {
        this.instrumentPurchaseDate = instrumentPurchaseDate;
    }

    public String getInstrumentNotes() {
        return instrumentNotes;
    }

    public void setInstrumentNotes(String instrumentNotes) {
        this.instrumentNotes = instrumentNotes;
    }

    public String getInstrumentSeriesCode() {
        return instrumentSeriesCode;
    }

    public void setInstrumentSeriesCode(String instrumentSeriesCode) {
        this.instrumentSeriesCode = instrumentSeriesCode;
    }

    public Collection<String> getInstrumentSeriesCodesList() {
        return instrumentSeriesCodesList;
    }

    public void setInstrumentSeriesCodesList(Collection<String> instrumentSeriesCodesList) {
        this.instrumentSeriesCodesList = instrumentSeriesCodesList;
    }

    public Date getPurchaseDateFrom() {
        return purchaseDateFrom;
    }

    public void setPurchaseDateFrom(Date purchaseDateFrom) {
        this.purchaseDateFrom = purchaseDateFrom;
    }

    public Date getPurchaseDateTo() {
        return purchaseDateTo;
    }

    public void setPurchaseDateTo(Date purchaseDateTo) {
        this.purchaseDateTo = purchaseDateTo;
    }

    public String getInstrumentSeriesQrCode() {
        return instrumentSeriesQrCode;
    }

    public void setInstrumentSeriesQrCode(String instrumentSeriesQrCode) {
        this.instrumentSeriesQrCode = instrumentSeriesQrCode;
    }

    public Long getInstrumentsCount() {
        return instrumentsCount;
    }

    public void setInstrumentsCount(Long instrumentsCount) {
        this.instrumentsCount = instrumentsCount;
    }
}
