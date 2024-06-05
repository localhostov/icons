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

public val Icons.Bold.H2: ImageVector
    get() {
        if (_h2 != null) {
            return _h2!!
        }
        _h2 = Builder(name = "H2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 17.0f)
                horizontalLineToRelative(-4.77f)
                curveToRelative(0.367f, -0.329f, 0.788f, -0.682f, 1.222f, -1.045f)
                curveToRelative(2.247f, -1.881f, 5.043f, -4.222f, 5.043f, -7.158f)
                curveToRelative(0.0f, -2.645f, -2.241f, -4.797f, -4.996f, -4.797f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.082f, 0.0f, 1.996f, 0.823f, 1.996f, 1.797f)
                curveToRelative(0.0f, 1.535f, -2.201f, 3.378f, -3.969f, 4.858f)
                curveToRelative(-0.935f, 0.782f, -1.818f, 1.522f, -2.429f, 2.243f)
                curveToRelative(-0.639f, 0.754f, -0.779f, 1.776f, -0.365f, 2.669f)
                curveToRelative(0.409f, 0.884f, 1.27f, 1.433f, 2.246f, 1.433f)
                horizontalLineToRelative(6.022f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _h2!!
    }

private var _h2: ImageVector? = null
