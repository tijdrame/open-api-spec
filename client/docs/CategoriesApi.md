# CategoriesApi

All URIs are relative to *https://development.eazyshop-server.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllCategories**](CategoriesApi.md#getAllCategories) | **GET** /categories | List all categories
[**getCategoryDetails**](CategoriesApi.md#getCategoryDetails) | **GET** /categories/{categoryId} | Select category by Id

<a name="getAllCategories"></a>
# **getAllCategories**
> List&lt;Category&gt; getAllCategories(categoryId)

List all categories

Returns the list of categories supported by EasyShop

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CategoriesApi apiInstance = new CategoriesApi();
Integer categoryId = 56; // Integer | 
try {
    List<Category> result = apiInstance.getAllCategories(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getAllCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**|  | [optional] [enum: ]

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCategoryDetails"></a>
# **getCategoryDetails**
> Category getCategoryDetails(categoryId)

Select category by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoriesApi;


CategoriesApi apiInstance = new CategoriesApi();
Integer categoryId = 56; // Integer | 
try {
    Category result = apiInstance.getCategoryDetails(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategoryDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**|  |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

