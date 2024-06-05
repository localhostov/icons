package me.localx.icons.straight.outline

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

public val Icons.Outline.Rent: ImageVector
    get() {
        if (_rent != null) {
            return _rent!!
        }
        _rent = Builder(name = "Rent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.427f, 6.513f)
                curveToRelative(-0.486f, -3.67f, -3.627f, -6.513f, -7.427f, -6.513f)
                curveToRelative(-3.23f, 0.0f, -6.015f, 2.039f, -7.057f, 5.028f)
                curveToRelative(-2.772f, 0.28f, -4.943f, 2.628f, -4.943f, 5.472f)
                curveToRelative(0.0f, 2.043f, 1.118f, 3.883f, 2.93f, 4.844f)
                lineToRelative(0.156f, 0.156f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(3.915f, 3.914f)
                lineToRelative(3.499f, -3.5f)
                verticalLineToRelative(-5.673f)
                curveToRelative(1.262f, -1.041f, 2.0f, -2.589f, 2.0f, -4.241f)
                curveToRelative(0.0f, -2.51f, -1.693f, -4.629f, -3.996f, -5.286f)
                curveToRelative(0.878f, -1.932f, 2.8f, -3.214f, 4.996f, -3.214f)
                curveToRelative(2.745f, 0.0f, 5.021f, 2.025f, 5.429f, 4.657f)
                lineToRelative(-4.429f, 4.429f)
                verticalLineToRelative(12.914f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-12.914f)
                lineToRelative(-4.573f, -4.573f)
                close()
                moveTo(9.0f, 10.5f)
                curveToRelative(0.0f, 1.169f, -0.582f, 2.256f, -1.557f, 2.909f)
                lineToRelative(-0.443f, 0.298f)
                verticalLineToRelative(5.879f)
                lineToRelative(-1.499f, 1.5f)
                lineToRelative(-1.087f, -1.086f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-1.799f, -1.799f)
                lineToRelative(-0.148f, -0.073f)
                curveToRelative(-1.213f, -0.597f, -1.967f, -1.796f, -1.967f, -3.128f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-10.086f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(3.5f, 3.5f)
                verticalLineToRelative(10.086f)
                close()
                moveTo(5.5f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _rent!!
    }

private var _rent: ImageVector? = null
