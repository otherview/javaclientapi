package com.trustev.domain.entities;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Represents a Transaction on a Trustev Case
 * 
 * @author jack.mcauliffe
 *
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Transaction extends BaseObject {
	
	/**
	 * 
	 * @return Total Value of the Transaction.
	 */
	public double getTotalTransactionValue() {
		return totalTransactionValue;
	}
	
	/**
	 * 
	 * @param totalTransactionValue Total Value of the Transaction.
	 */
	@JsonProperty("TotalTransactionValue")
	public void setTotalTransactionValue(double totalTransactionValue) {
		this.totalTransactionValue = totalTransactionValue;
	}
	
	/**
	 * 
	 * @return Currency Type Code. Standard Currency Type codes can be found at http://www.xe.com/currency
	 */
	public String getCurrency() {
		return currency;
	}
	
	/**
	 * 
	 * @param currency Currency Type Code. Standard Currency Type codes can be found at http://www.xe.com/currency
	 */
	@JsonProperty("Currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	/**
	 * 
	 * @return Current Timestamp.
	 */
	@JsonIgnore()
	public Date getTimestamp() {
		return timestamp;
	}
	
	@JsonProperty("Timestamp")
	String getTimestampString() {
		return FormatTimeStamp(timestamp);
	}
	
	/**
	 * 
	 * @param timestamp Current Timestamp.
	 */
	@JsonProperty("Timestamp")
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	/**
	 * 
	 * @return Addresses Object  Contains standard/delivery/billing information. Please see Address Object for further parameter information.
	 */
	public Collection<Address> getAddresses() {
		return addresses;
	}
	
	/**
	 * Addresses Object  Contains standard/delivery/billing information. Please see Address Object for further parameter information.
	 * 
	 * @param addresses
	 */
	@JsonProperty("Addresses")
	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}
	
	/**
	 * 
	 * @return Items Object  contains details on Item Name, Quantity and Item Value. Please see Items Object for further parameter information.
	 */
	public Collection<TransactionItem> getItems() {
		return items;
	}
	
	/**
	 * 
	 * @param items Items Object  contains details on Item Name, Quantity and Item Value. Please see Items Object for further parameter information.
	 */
	@JsonProperty("Items")
	public void setItems(Collection<TransactionItem> items) {
		this.items = items;
	}
	
	private double totalTransactionValue;
	
	private String currency;
	
	private Date timestamp;
	
	private Collection<Address> addresses;
	
	private Collection<TransactionItem> items;
	
}
