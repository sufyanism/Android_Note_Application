package com.swancompany.journal.ui.presentation.aboutScreen

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.swancompany.journal.R

@Composable
fun AboutScreen(
    navigateBack: () -> Unit,
) {
    val context = LocalContext.current
    Scaffold(
        topBar = { AboutTopBar(navigateBack) },
        backgroundColor = colorScheme.surface
    ) {
        Surface(
            color = colorResource(id = R.color.colorBackground),
            shape = RoundedCornerShape(32.dp, 32.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {
                Image(
                    painter = painterResource(id = R.drawable.note_logo),
                    contentDescription = "logo",
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    color = colorScheme.onSurface,
                    textAlign = TextAlign.Center,
                    text = "Journal",
                    fontFamily = FontFamily(Font(R.font.playfair_display_regular)),
                    fontSize = 40.sp
                )




            }
        }
    }
}