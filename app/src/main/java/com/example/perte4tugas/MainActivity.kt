package com.example.perte4tugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.perte4tugas.ui.theme.Perte4tugasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Perte4tugasTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.background_screen))
            .statusBarsPadding()
            .navigationBarsPadding()
            .padding(horizontal = dimensionResource(R.dimen.screen_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(dimensionResource(R.dimen.header_top)))

        Text(
            text = stringResource(R.string.title_main),
            color = colorResource(R.color.text_title),
            fontSize = spResource(R.dimen.title_size),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.subtitle_main),
            color = colorResource(R.color.text_title),
            fontSize = spResource(R.dimen.subtitle_size),
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(dimensionResource(R.dimen.header_bottom)))

        Column(verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))) {
            // Kartu 1 – abu-abu, nama cursive, tanpa nomor HP
            ProfileCard(
                name = R.string.name_bambang,
                address = R.string.address_bambang,
                containerColor = colorResource(R.color.card_gray),
                nameColor = colorResource(R.color.text_white),
                addressColor = colorResource(R.color.text_yellow),
                nameFontFamily = FontFamily.Cursive,
                nameFontStyle = FontStyle.Italic,
                nameFontWeight = FontWeight.Normal
            )

            // Kartu 2 – ungu
            ProfileCard(
                name = R.string.name_gibran,
                phone = R.string.phone_gibran,
                address = R.string.address_gibran,
                containerColor = colorResource(R.color.card_purple),
                nameColor = colorResource(R.color.text_white),
                phoneColor = colorResource(R.color.text_cyan),
                addressColor = colorResource(R.color.text_yellow)
            )
            // KARTU 3 DAN 4 DI SINI
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreenPreview() {
    Perte4tugasTheme {
        MainScreen()
    }
}