package com.jama.oslc.model.oauth;

/*
* Copyright (C) 2015 Ericsson AB. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions
* are met:
*
* 1. Redistributions of source code must retain the above copyright
*    notice, this list of conditions and the following disclaimer.
* 2. Redistributions in binary form must reproduce the above copyright
*    notice, this list of conditions and the following disclaimer
*    in the documentation and/or other materials provided with the
*    distribution.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
* "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
* LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
* A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
* OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
* SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
* LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
* DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
* THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
* OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/**
 * It represents a rootservices.
 *
 */
public class RootServices {
  private String oauthDomain;
  private String oauthRequestTokenURL;
  private String oauthRequestConsumerKeyURL;
  private String oauthAccessTokenURL;
  private String oauthUserAuthorizationURL;
  
  public String getOAuthDomain() {
    return oauthDomain;
  }
  public void setOAuthDomain(String oauthDomain) {
    this.oauthDomain = oauthDomain;
  }
  public String getOAuthRequestTokenURL() {
    return oauthRequestTokenURL;
  }
  public void setOAuthRequestTokenURL(String oauthRequestTokenURL) {
    this.oauthRequestTokenURL = oauthRequestTokenURL;
  }
  public String getOAuthRequestConsumerKeyURL() {
    return oauthRequestConsumerKeyURL;
  }
  public void setOAuthRequestConsumerKeyURL(String oauthRequestConsumerKeyURL) {
    this.oauthRequestConsumerKeyURL = oauthRequestConsumerKeyURL;
  }
  public String getOAuthAccessTokenURL() {
    return oauthAccessTokenURL;
  }
  public void setOAuthAccessTokenURL(String oauthAccessTokenURL) {
    this.oauthAccessTokenURL = oauthAccessTokenURL;
  }
  public String getOAuthUserAuthorizationURL() {
    return oauthUserAuthorizationURL;
  }
  public void setOAuthUserAuthorizationURL(String oauthUserAuthorizationURL) {
    this.oauthUserAuthorizationURL = oauthUserAuthorizationURL;
  }

}