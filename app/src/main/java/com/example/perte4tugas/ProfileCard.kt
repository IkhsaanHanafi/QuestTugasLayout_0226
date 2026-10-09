package com.example.perte4tugas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun ProfileCard(
    containerColor: Color,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner)),
        colors = CardDefaults.cardColors(containerColor = containerColor)
    ) {
        Row(
            modifier = Modifier.padding(dimensionResource(R.dimen.card_padding)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.cd_logo_umy),
                modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
            )

            Spacer(Modifier.weight(integerResource(R.integer.weight_fill).toFloat()))

            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.cd_logo_umy),
                modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
            )
        }
    }
}