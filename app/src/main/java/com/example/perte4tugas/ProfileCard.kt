package com.example.perte4tugas

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ProfileCard(
    @StringRes name: Int,
    @StringRes address: Int,
    containerColor: Color,
    nameColor: Color,
    addressColor: Color,
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

            Column(
                modifier = Modifier
                    .weight(integerResource(R.integer.weight_fill).toFloat())
                    .padding(horizontal = dimensionResource(R.dimen.text_gap_horizontal)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(name),
                    color = nameColor,
                    fontSize = spResource(R.dimen.name_size),
                    fontWeight = FontWeight.Bold
                )

                Spacer(Modifier.height(dimensionResource(R.dimen.text_gap_vertical)))
                Text(
                    text = stringResource(address),
                    color = addressColor,
                    fontSize = spResource(R.dimen.detail_size)
                )
            }

            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.cd_logo_umy),
                modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
            )
        }
    }
}