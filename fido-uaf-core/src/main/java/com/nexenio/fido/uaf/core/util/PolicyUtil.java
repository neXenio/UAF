package com.nexenio.fido.uaf.core.util;

import com.google.common.collect.Lists;
import com.nexenio.fido.uaf.core.message.*;
import java.util.List;
import java.util.stream.*;

public abstract class PolicyUtil {

    public static Policy constructAuthenticationPolicy(List<String> acceptedAaids) {
        if (acceptedAaids == null) {
            return null;
        }
        Policy policy = new Policy();
        policy.setAccepted(createMatchCriteriaFromAaids(acceptedAaids));
        return policy;
    }

    public static List<List<MatchCriteria>> createMatchCriteriaFromAaids(List<String> aaids) {
        return aaids.stream()
                    .map(a -> Lists.newArrayList(new MatchCriteria().setAaids(Lists.newArrayList(a))))
                    .collect(Collectors.toList());
    }

}
