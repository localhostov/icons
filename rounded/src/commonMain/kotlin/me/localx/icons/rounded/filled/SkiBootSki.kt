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

public val Icons.Filled.SkiBootSki: ImageVector
    get() {
        if (_skiBootSki != null) {
            return _skiBootSki!!
        }
        _skiBootSki = Builder(name = "SkiBootSki", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 24.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(19.998f, 15.999f)
                curveToRelative(0.0f, 1.068f, -0.415f, 2.074f, -1.171f, 2.829f)
                curveToRelative(-0.755f, 0.756f, -1.76f, 1.172f, -2.829f, 1.172f)
                lineTo(4.0f, 20.0f)
                curveToRelative(-1.21f, 0.0f, -2.347f, -0.535f, -3.118f, -1.468f)
                curveTo(0.114f, 17.604f, -0.196f, 16.395f, 0.029f, 15.215f)
                curveToRelative(0.163f, -0.85f, 0.309f, -1.45f, 0.309f, -1.45f)
                lineTo(2.654f, 2.618f)
                curveTo(2.964f, 1.123f, 4.296f, 0.038f, 5.822f, 0.038f)
                horizontalLineToRelative(6.908f)
                curveToRelative(0.846f, 0.0f, 1.637f, 0.377f, 2.169f, 1.034f)
                curveToRelative(0.532f, 0.658f, 0.736f, 1.51f, 0.561f, 2.338f)
                lineToRelative(-0.134f, 0.59f)
                horizontalLineToRelative(-4.326f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.871f)
                lineToRelative(-0.455f, 2.0f)
                horizontalLineToRelative(-4.417f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.708f)
                lineToRelative(0.713f, 0.206f)
                curveToRelative(2.734f, 0.568f, 4.656f, 2.997f, 4.577f, 5.793f)
                close()
                moveTo(7.0f, 14.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _skiBootSki!!
    }

private var _skiBootSki: ImageVector? = null
