package com.frogobox.research

import com.frogobox.dynamiccore.CoreDuo
import com.frogobox.frogopayment.Payment
import com.frogobox.frogosecurity.Security


/*
 * Created by faisalamir on 14/06/22
 * android-dynamic-feature
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

class CallModule {

    companion object {
        const val callCore = CoreDuo.TAG
        const val callPayment = Payment.PAYMENT_STATUS_SUCCESS
        const val callSecurity = Security.TAG
    }

}