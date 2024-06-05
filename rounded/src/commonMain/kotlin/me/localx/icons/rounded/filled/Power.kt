package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.301f, viewportHeight = 512.301f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.119f, 82.112f)
                lineTo(320.119f, 82.112f)
                curveToRelative(0.137f, 8.67f, 5.409f, 16.432f, 13.419f, 19.755f)
                curveToRelative(71.67f, 31.535f, 117.01f, 103.433f, 114.581f, 181.696f)
                curveToRelative(-1.72f, 106.039f, -89.076f, 190.605f, -195.115f, 188.885f)
                curveToRelative(-106.039f, -1.72f, -190.606f, -89.076f, -188.885f, -195.115f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.101f, -76.006f, 45.028f, -144.798f, 114.581f, -175.445f)
                curveToRelative(8.013f, -3.343f, 13.282f, -11.117f, 13.419f, -19.797f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.019f, -11.782f, -9.518f, -21.348f, -21.3f, -21.367f)
                curveToRelative(-2.745f, -0.004f, -5.466f, 0.521f, -8.012f, 1.548f)
                curveTo(43.898f, 113.824f, -10.705f, 252.01f, 40.848f, 370.919f)
                reflectiveCurveTo(230.586f, 544.43f, 349.495f, 492.878f)
                curveToRelative(118.909f, -51.552f, 173.511f, -189.738f, 121.959f, -308.647f)
                curveToRelative(-23.698f, -54.66f, -67.299f, -98.261f, -121.959f, -121.959f)
                curveToRelative(-10.913f, -4.442f, -23.36f, 0.804f, -27.802f, 11.716f)
                curveTo(320.643f, 76.568f, 320.108f, 79.327f, 320.119f, 82.112f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.119f, 0.0f)
                lineTo(256.119f, 0.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                verticalLineToRelative(-128.0f)
                curveTo(234.785f, 9.551f, 244.337f, 0.0f, 256.119f, 0.0f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
