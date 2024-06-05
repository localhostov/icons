package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.PlugAlt: ImageVector
    get() {
        if (_plugAlt != null) {
            return _plugAlt!!
        }
        _plugAlt = Builder(name = "PlugAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.003f, 3.058f)
                curveTo(17.465f, 0.785f, 14.053f, -0.298f, 10.638f, 0.075f)
                curveTo(5.126f, 0.684f, 0.684f, 5.126f, 0.075f, 10.639f)
                curveToRelative(-0.67f, 6.064f, 3.155f, 11.765f, 8.897f, 13.257f)
                curveToRelative(0.27f, 0.07f, 0.542f, 0.104f, 0.813f, 0.104f)
                curveToRelative(0.701f, 0.0f, 1.386f, -0.231f, 1.958f, -0.674f)
                curveToRelative(0.798f, -0.617f, 1.256f, -1.549f, 1.256f, -2.557f)
                verticalLineToRelative(-2.77f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                verticalLineToRelative(2.77f)
                curveToRelative(0.0f, 0.384f, -0.175f, 0.738f, -0.479f, 0.974f)
                curveToRelative(-0.301f, 0.232f, -0.681f, 0.311f, -1.045f, 0.217f)
                curveToRelative(-4.709f, -1.225f, -7.965f, -6.101f, -7.412f, -11.103f)
                curveTo(2.57f, 6.269f, 6.269f, 2.57f, 10.857f, 2.063f)
                curveToRelative(2.891f, -0.316f, 5.665f, 0.562f, 7.812f, 2.484f)
                curveToRelative(2.117f, 1.896f, 3.331f, 4.612f, 3.331f, 7.452f)
                curveToRelative(0.0f, 4.469f, -2.948f, 8.261f, -7.0f, 9.539f)
                verticalLineToRelative(2.066f)
                curveToRelative(5.167f, -1.337f, 9.0f, -6.026f, 9.0f, -11.605f)
                curveToRelative(0.0f, -3.408f, -1.457f, -6.667f, -3.997f, -8.942f)
                close()
            }
        }
        .build()
        return _plugAlt!!
    }

private var _plugAlt: ImageVector? = null
