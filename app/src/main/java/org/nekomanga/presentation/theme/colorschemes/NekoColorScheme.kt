package org.nekomanga.presentation.theme.colorschemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

internal object NekoColorScheme : BaseColorScheme() {
    override val lightScheme =
        lightColorScheme(
            primary = Color(0xFF101820),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFF101820),
            onPrimaryContainer = Color(0xFFFFFFFF),
            secondary = Color(0xFF374049),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFF374049),
            onSecondaryContainer = Color(0xFFFFFFFF),
            tertiary = Color(0xFF312617),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF312617),
            onTertiaryContainer = Color(0xFFFFFFFF),
            error = Color(0xFFC14033),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFFFFFFF),
            onErrorContainer = Color(0xFFFFFFFF),
            background = Color(0xFFFFFFFF),
            onBackground = Color(0xFF101820),
            surface = Color(0xFFFFFFFF),
            onSurface = Color(0xFF101820),
            surfaceVariant = Color(0xFFFFFFFF),
            onSurfaceVariant = Color(0xFF101820),
            outline = Color(0xFF9FA3A6),
            outlineVariant = Color(0xFFCFD1D2),
            scrim = Color(0xFFFFFFFF),
            inverseSurface = Color(0xFF101820),
            inverseOnSurface = Color(0xFFFFFFFF),
            inversePrimary = Color(0xFFFFFFFF),
            surfaceDim = Color(0xFFFFFFFF),
            surfaceBright = Color(0xFFFFFFFF),
            surfaceContainerLowest = Color(0xFFFFFFFF),
            surfaceContainerLow = Color(0xFFFFFFFF),
            surfaceContainer = Color(0xFFFFFFFF),
            surfaceContainerHigh = Color(0xFFe6e6e6),
            surfaceContainerHighest = Color(0xFFCCCCCC),
        )

    override val darkScheme =
        darkColorScheme(
            primary = Color(0xFF63E59C),
            onPrimary = Color(0xFF000000),
            primaryContainer = Color(0xFF8EF1B9),
            onPrimaryContainer = Color(0xFF000000),
            secondary = Color(0xFF3DDA83),
            onSecondary = Color(0xFF000000),
            secondaryContainer = Color(0xFF1BCE69),
            onSecondaryContainer = Color(0xFF000000),
            tertiary = Color(0xFF7CE800),
            onTertiary = Color(0xFF000000),
            tertiaryContainer = Color(0xFF96EA34),
            onTertiaryContainer = Color(0xFF000000),
            error = Color(0xFFC14033),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFDC6559),
            onErrorContainer = Color(0xFF000000),
            background = Color(0xFF292929),
            onBackground = Color(0xFFFFFFFF),
            surface = Color(0xFF292929),
            onSurface = Color(0xFFFFFFFF),
            surfaceVariant = Color(0xFF292929),
            onSurfaceVariant = Color(0xFFFFFFFF),
            outline = Color(0xFFC1F5D7),
            outlineVariant = Color(0xFFE0FAEB),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFFFFFFFF),
            inverseOnSurface = Color(0xFF000000),
            inversePrimary = Color(0xFF000000),
            surfaceDim = Color(0xFF292929),
            surfaceBright = Color(0xFF292929),
            surfaceContainerLowest = Color(0xFF212121),
            surfaceContainerLow = Color(0xFF252525),
            surfaceContainer = Color(0xFF292929),
            surfaceContainerHigh = Color(0xFF3E3E3E),
            surfaceContainerHighest = Color(0xFF545454),
        )
}
