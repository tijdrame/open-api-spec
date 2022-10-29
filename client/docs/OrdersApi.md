# OrdersApi

All URIs are relative to *https://development.eazyshop-server.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletedOrderDetails**](OrdersApi.md#deletedOrderDetails) | **DELETE** /orders | Delete Order
[**exampleAnyOf**](OrdersApi.md#exampleAnyOf) | **GET** /anyOfOrder | Get Order Details
[**exampleOneOf**](OrdersApi.md#exampleOneOf) | **POST** /oneOfOrder | Insert oneOf the Order Details
[**getOrderDetails**](OrdersApi.md#getOrderDetails) | **GET** /orders | Get Order
[**getOrderDetailsUsingPathParam**](OrdersApi.md#getOrderDetailsUsingPathParam) | **GET** /orders/{orderId} | Get Order
[**savedOrderDetails**](OrdersApi.md#savedOrderDetails) | **POST** /orders | Create Order
[**updatedOrderDetails**](OrdersApi.md#updatedOrderDetails) | **PUT** /orders | Update Order

<a name="deletedOrderDetails"></a>
# **deletedOrderDetails**
> deletedOrderDetails(orderId)

Delete Order

Delete order  for Eawyshop 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

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

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
try {
    apiInstance.deletedOrderDetails(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#deletedOrderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="exampleAnyOf"></a>
# **exampleAnyOf**
> InlineResponse2001 exampleAnyOf(orderId, fetchType)

Get Order Details

Get Order Details based on Order ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

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

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
String fetchType = "fetchType_example"; // String | Fetch Type:  * `summary` - Will provide Order Summary  * `details` - Will provide Order Summary & Order Address 
try {
    InlineResponse2001 result = apiInstance.exampleAnyOf(orderId, fetchType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#exampleAnyOf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |
 **fetchType** | **String**| Fetch Type:  * &#x60;summary&#x60; - Will provide Order Summary  * &#x60;details&#x60; - Will provide Order Summary &amp; Order Address  | [enum: summary, details]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="exampleOneOf"></a>
# **exampleOneOf**
> exampleOneOf(body)

Insert oneOf the Order Details

Insert oneOf the Order Details into EazyShop

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

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

OrdersApi apiInstance = new OrdersApi();
OneOfOrderBody body = new OneOfOrderBody(); // OneOfOrderBody | 
try {
    apiInstance.exampleOneOf(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#exampleOneOf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OneOfOrderBody**](OneOfOrderBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getOrderDetails"></a>
# **getOrderDetails**
> InlineResponse200 getOrderDetails(orderId)

Get Order

Get order  for Eawyshop 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

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

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
try {
    InlineResponse200 result = apiInstance.getOrderDetails(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderDetailsUsingPathParam"></a>
# **getOrderDetailsUsingPathParam**
> OrdersBody getOrderDetailsUsingPathParam(orderId)

Get Order

Get order  for Eawyshop 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

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

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
try {
    OrdersBody result = apiInstance.getOrderDetailsUsingPathParam(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrderDetailsUsingPathParam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**OrdersBody**](OrdersBody.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="savedOrderDetails"></a>
# **savedOrderDetails**
> InlineResponse201 savedOrderDetails(body)

Create Order

Post order details to Eawyshop for processing  and shipping 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

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

OrdersApi apiInstance = new OrdersApi();
OrdersBody1 body = new OrdersBody1(); // OrdersBody1 | 
try {
    InlineResponse201 result = apiInstance.savedOrderDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#savedOrderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrdersBody1**](OrdersBody1.md)|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatedOrderDetails"></a>
# **updatedOrderDetails**
> updatedOrderDetails(body)

Update Order

Update order details to Eawyshop for processing  and shipping 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

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

OrdersApi apiInstance = new OrdersApi();
OrdersBody body = new OrdersBody(); // OrdersBody | 
try {
    apiInstance.updatedOrderDetails(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#updatedOrderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrdersBody**](OrdersBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

