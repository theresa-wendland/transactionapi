package com.theresafirstapi.bank.controller.model

import com.theresafirstapi.bank.repository.model.TransactionDBModel

class TransactionModel(
        val targetAccount: String,
        val valueone: Double,
        val description: String = "",
)

fun TransactionModel.convertToDBModel() = TransactionDBModel(
        accountIdentifier = this.targetAccount,
        valueone = this.valueone,
        description = this.description
)