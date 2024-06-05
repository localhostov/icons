package me.localx.icons.rounded.bold

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

public val Icons.Bold.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.5f)
                lineTo(24.0f, 1.5f)
                curveToRelative(0.0f, -0.568f, -0.321f, -1.087f, -0.829f, -1.342f)
                curveToRelative(-0.508f, -0.253f, -1.116f, -0.199f, -1.571f, 0.142f)
                lineToRelative(-1.33f, 0.998f)
                curveToRelative(-0.556f, -0.19f, -1.15f, -0.298f, -1.77f, -0.298f)
                reflectiveCurveToRelative(-1.214f, 0.108f, -1.77f, 0.298f)
                lineToRelative(-1.33f, -0.998f)
                curveToRelative(-0.454f, -0.341f, -1.062f, -0.395f, -1.571f, -0.142f)
                curveToRelative(-0.508f, 0.254f, -0.829f, 0.773f, -0.829f, 1.342f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.703f, 0.138f, 1.373f, 0.379f, 1.992f)
                curveToRelative(-6.61f, 2.155f, -8.647f, 8.049f, -8.863f, 11.864f)
                curveToRelative(-0.859f, -0.544f, -1.516f, -1.38f, -1.516f, -2.332f)
                curveToRelative(0.0f, -1.848f, 0.478f, -2.817f, 0.983f, -3.845f)
                curveToRelative(0.477f, -0.969f, 1.017f, -2.066f, 1.017f, -3.679f)
                curveToRelative(0.0f, -2.008f, -1.206f, -3.782f, -3.001f, -4.415f)
                curveToRelative(-0.781f, -0.275f, -1.638f, 0.134f, -1.914f, 0.916f)
                curveToRelative(-0.275f, 0.782f, 0.134f, 1.638f, 0.916f, 1.914f)
                curveToRelative(0.598f, 0.211f, 0.999f, 0.848f, 0.999f, 1.585f)
                curveToRelative(0.0f, 0.915f, -0.297f, 1.518f, -0.708f, 2.354f)
                curveToRelative(-0.575f, 1.169f, -1.292f, 2.624f, -1.292f, 5.17f)
                curveToRelative(0.0f, 3.522f, 3.456f, 5.977f, 6.558f, 5.977f)
                horizontalLineToRelative(15.942f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-10.261f)
                curveToRelative(1.221f, -1.01f, 2.0f, -2.535f, 2.0f, -4.239f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.607f, -1.682f, -5.095f, -4.0f, -5.914f)
                curveToRelative(-0.779f, -0.277f, -1.638f, 0.132f, -1.914f, 0.914f)
                curveToRelative(-0.276f, 0.781f, 0.133f, 1.638f, 0.914f, 1.914f)
                curveToRelative(1.122f, 0.396f, 2.0f, 1.752f, 2.0f, 3.086f)
                horizontalLineToRelative(-6.502f)
                curveToRelative(0.04f, -1.754f, 0.693f, -8.313f, 7.915f, -9.951f)
                curveToRelative(0.881f, 0.6f, 1.943f, 0.951f, 3.087f, 0.951f)
                curveToRelative(0.169f, 0.0f, 0.335f, -0.01f, 0.5f, -0.025f)
                verticalLineToRelative(9.025f)
                close()
                moveTo(18.5f, 9.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.122f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
