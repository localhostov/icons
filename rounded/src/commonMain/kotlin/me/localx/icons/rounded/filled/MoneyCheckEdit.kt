package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.MoneyCheckEdit: ImageVector
    get() {
        if (_moneyCheckEdit != null) {
            return _moneyCheckEdit!!
        }
        _moneyCheckEdit = Builder(name = "MoneyCheckEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.27f, 19.48f)
                curveToRelative(-0.813f, 0.813f, -1.27f, 1.915f, -1.27f, 3.065f)
                verticalLineToRelative(1.455f)
                horizontalLineToRelative(1.455f)
                curveToRelative(1.15f, 0.0f, 2.252f, -0.457f, 3.065f, -1.27f)
                lineToRelative(6.807f, -6.807f)
                curveToRelative(0.897f, -0.897f, 0.897f, -2.353f, 0.0f, -3.25f)
                curveToRelative(-0.897f, -0.897f, -2.353f, -0.897f, -3.25f, 0.0f)
                lineToRelative(-6.807f, 6.807f)
                close()
                moveTo(11.856f, 18.066f)
                lineToRelative(5.067f, -5.066f)
                horizontalLineToRelative(-1.922f)
                curveToRelative(-1.308f, -0.006f, -1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineToRelative(3.978f)
                curveToRelative(1.369f, -1.188f, 3.513f, -1.328f, 5.022f, -0.326f)
                verticalLineToRelative(-3.674f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 2.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(5.027f)
                curveToRelative(0.126f, -1.486f, 0.762f, -2.867f, 1.829f, -3.934f)
                close()
                moveTo(15.001f, 7.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.308f, 0.006f, 1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.308f, -0.006f, -1.307f, -1.995f, 0.0f, -2.0f)
                close()
                moveTo(7.0f, 19.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.268f)
                curveToRelative(-1.067f, 0.0f, -2.063f, -0.574f, -2.598f, -1.499f)
                curveToRelative(-0.277f, -0.478f, -0.113f, -1.089f, 0.364f, -1.366f)
                curveToRelative(0.48f, -0.278f, 1.091f, -0.113f, 1.366f, 0.365f)
                curveToRelative(0.179f, 0.308f, 0.511f, 0.5f, 0.867f, 0.5f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.997f, 0.065f, 1.442f, -1.55f, 0.356f, -1.76f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-3.502f, -0.649f, -2.748f, -5.753f, 0.685f, -5.733f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.006f, -1.308f, 1.995f, -1.307f, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.268f)
                curveToRelative(1.067f, 0.0f, 2.063f, 0.575f, 2.598f, 1.5f)
                curveToRelative(0.277f, 0.478f, 0.113f, 1.089f, -0.364f, 1.366f)
                curveToRelative(-0.481f, 0.276f, -1.091f, 0.113f, -1.366f, -0.365f)
                curveToRelative(-0.179f, -0.309f, -0.511f, -0.5f, -0.867f, -0.5f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.997f, -0.065f, -1.442f, 1.55f, -0.356f, 1.76f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(3.502f, 0.649f, 2.748f, 5.753f, -0.685f, 5.733f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _moneyCheckEdit!!
    }

private var _moneyCheckEdit: ImageVector? = null
