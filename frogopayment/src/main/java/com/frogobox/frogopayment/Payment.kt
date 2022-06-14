package com.frogobox.frogopayment


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

class Payment {
    companion object {
        const val PAYMENT_STATUS_SUCCESS = "success"
        const val PAYMENT_STATUS_FAILED = "failed"
        const val PAYMENT_STATUS_CANCELED = "canceled"
        const val PAYMENT_STATUS_PENDING = "pending"
        const val PAYMENT_STATUS_EXPIRED = "expired"
        const val PAYMENT_STATUS_UNKNOWN = "unknown"
    }
}