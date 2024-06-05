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

public val Icons.Filled.CoinUpArrow: ImageVector
    get() {
        if (_coinUpArrow != null) {
            return _coinUpArrow!!
        }
        _coinUpArrow = Builder(name = "CoinUpArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, 2.686f, 6.0f, 6.0f, 6.0f)
                curveToRelative(3.314f, 0.0f, 6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(0.0f, 14.686f, 0.0f, 18.0f)
                close()
                moveTo(7.242f, 15.002f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.168f, 0.168f, 0.257f, 0.393f, 0.257f, 0.621f)
                curveToRelative(0.0f, 0.113f, -0.021f, 0.227f, -0.067f, 0.336f)
                curveToRelative(-0.136f, 0.328f, -0.456f, 0.541f, -0.812f, 0.541f)
                horizontalLineToRelative(-1.121f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.121f)
                curveToRelative(-0.355f, 0.0f, -0.676f, -0.213f, -0.812f, -0.541f)
                curveToRelative(-0.138f, -0.329f, -0.062f, -0.706f, 0.19f, -0.957f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.685f, -0.685f, 1.8f, -0.685f, 2.485f, 0.0f)
                close()
                moveTo(9.0f, 3.949f)
                curveTo(9.0f, 1.74f, 12.358f, -0.051f, 16.5f, -0.051f)
                reflectiveCurveToRelative(7.5f, 1.791f, 7.5f, 4.0f)
                reflectiveCurveToRelative(-3.358f, 4.0f, -7.5f, 4.0f)
                reflectiveCurveToRelative(-7.5f, -1.791f, -7.5f, -4.0f)
                close()
                moveTo(16.5f, 11.949f)
                curveToRelative(4.142f, 0.0f, 7.5f, -1.791f, 7.5f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.209f, -3.358f, 4.0f, -7.5f, 4.0f)
                reflectiveCurveToRelative(-7.5f, -1.791f, -7.5f, -4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.209f, 3.358f, 4.0f, 7.5f, 4.0f)
                close()
                moveTo(16.5f, 22.0f)
                curveToRelative(-1.202f, 0.0f, -2.338f, -0.151f, -3.345f, -0.419f)
                curveToRelative(-0.298f, 0.593f, -0.666f, 1.145f, -1.096f, 1.643f)
                curveToRelative(1.243f, 0.488f, 2.779f, 0.777f, 4.441f, 0.777f)
                curveToRelative(4.142f, 0.0f, 7.5f, -1.791f, 7.5f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.209f, -3.358f, 4.0f, -7.5f, 4.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveToRelative(-1.452f, 0.0f, -2.807f, -0.22f, -3.955f, -0.601f)
                curveToRelative(0.49f, 0.695f, 0.871f, 1.471f, 1.12f, 2.305f)
                curveToRelative(0.875f, 0.191f, 1.832f, 0.296f, 2.835f, 0.296f)
                curveToRelative(4.142f, 0.0f, 7.5f, -1.791f, 7.5f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.209f, -3.358f, 4.0f, -7.5f, 4.0f)
                close()
                moveTo(16.5f, 18.0f)
                curveToRelative(-0.878f, 0.0f, -1.72f, -0.081f, -2.503f, -0.229f)
                curveToRelative(0.002f, 0.076f, 0.003f, 0.152f, 0.003f, 0.229f)
                curveToRelative(0.0f, 0.596f, -0.066f, 1.176f, -0.189f, 1.735f)
                curveToRelative(0.835f, 0.171f, 1.741f, 0.265f, 2.689f, 0.265f)
                curveToRelative(4.142f, 0.0f, 7.5f, -1.791f, 7.5f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.209f, -3.358f, 4.0f, -7.5f, 4.0f)
                close()
            }
        }
        .build()
        return _coinUpArrow!!
    }

private var _coinUpArrow: ImageVector? = null
