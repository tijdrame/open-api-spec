# ProductsApi

All URIs are relative to *https://development.eazyshop-server.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllProducts**](ProductsApi.md#getAllProducts) | **GET** /products | List all Products
[**getProductDetails**](ProductsApi.md#getProductDetails) | **GET** /products/{productId} | Return Product etail

<a name="getAllProducts"></a>
# **getAllProducts**
> List&lt;Product&gt; getAllProducts(categoryId)

List all Products

Returns the list of categories supported by EasyShop 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


// Configure OAuth2 access token for authorization: oAuth2AuthCode
OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

ProductsApi apiInstance = new ProductsApi();
Integer categoryId = 56; // Integer | 
try {
    List<Product> result = apiInstance.getAllProducts(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getAllProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**|  | [optional]

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductDetails"></a>
# **getProductDetails**
> Product getProductDetails(productId)

Return Product etail

Returns the detail of product 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


// Configure OAuth2 access token for authorization: oAuth2AuthCode
OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

ProductsApi apiInstance = new ProductsApi();
Integer productId = 56; // Integer | 
try {
    Product result = apiInstance.getProductDetails(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProductDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Integer**|  |

### Return type

[**Product**](Product.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

