/*
 * Copyright 2015 eBay Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nexenio.fido.uaf.core.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class MatchCriteria {

    /**
     * List of AAIDs, causing matching to be restricted to certain AAIDs. The match succeeds if at least one AAID entry
     * in this array matches AuthenticatorInfo.aaids [UAFASM]. Note: This field corresponds to MetadataStatement.aaids
     * [UAFAuthnrMetadata].
     */
    @SerializedName("aaid")
    @JsonProperty("aaid")
    private List<String> aaids = new ArrayList<>();

    @SerializedName("vendorID")
    @JsonProperty("vendorID")
    private List<String> vendorIds = new ArrayList<>();

    @SerializedName("keyIDs")
    @JsonProperty("keyIDs")
    private List<String> keyIds = new ArrayList<>();

    private long userVerification;

    private int keyProtection;

    private int matcherProtection;

    private long attachmentHint;

    private int tcDisplay;

    private List<Integer> authenticationAlgorithms = new ArrayList<>();

    private List<String> assertionSchemes = new ArrayList<>();

    private List<Integer> attestationTypes = new ArrayList<>();

    private int authenticatorVersion;

    @SerializedName("exts")
    @JsonProperty("exts")
    private List<Extension> extensions = new ArrayList<>();

}
