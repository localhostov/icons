package me.localx.icons.straight.bold

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

public val Icons.Bold.Banner: ImageVector
    get() {
        if (_banner != null) {
            return _banner!!
        }
        _banner = Builder(name = "Banner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.033f, 7.186f)
                lineToRelative(-2.855f, -0.404f)
                curveToRelative(-2.518f, -0.356f, -6.154f, -0.781f, -9.178f, -0.781f)
                reflectiveCurveToRelative(-6.66f, 0.425f, -9.178f, 0.781f)
                lineTo(-0.033f, 7.186f)
                lineToRelative(4.604f, 4.921f)
                lineTo(0.056f, 18.141f)
                lineToRelative(3.543f, -0.476f)
                curveToRelative(2.278f, -0.307f, 5.586f, -0.672f, 8.401f, -0.672f)
                reflectiveCurveToRelative(6.123f, 0.365f, 8.401f, 0.672f)
                lineToRelative(3.543f, 0.476f)
                lineToRelative(-4.516f, -6.034f)
                lineToRelative(4.604f, -4.921f)
                close()
                moveTo(17.311f, 14.286f)
                curveToRelative(-1.729f, -0.167f, -3.598f, -0.292f, -5.312f, -0.292f)
                reflectiveCurveToRelative(-3.583f, 0.125f, -5.312f, 0.292f)
                lineToRelative(1.791f, -2.393f)
                lineToRelative(-2.347f, -2.507f)
                curveToRelative(1.916f, -0.214f, 4.024f, -0.385f, 5.867f, -0.385f)
                reflectiveCurveToRelative(3.951f, 0.171f, 5.867f, 0.385f)
                lineToRelative(-2.347f, 2.507f)
                lineToRelative(1.791f, 2.393f)
                close()
            }
        }
        .build()
        return _banner!!
    }

private var _banner: ImageVector? = null
