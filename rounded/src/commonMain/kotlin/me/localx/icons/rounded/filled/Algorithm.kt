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

public val Icons.Filled.Algorithm: ImageVector
    get() {
        if (_algorithm != null) {
            return _algorithm!!
        }
        _algorithm = Builder(name = "Algorithm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 11.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.731f, 14.317f)
                curveToRelative(-0.376f, -0.404f, -1.01f, -0.424f, -1.414f, -0.048f)
                curveToRelative(-0.403f, 0.377f, -0.425f, 1.01f, -0.048f, 1.414f)
                lineToRelative(2.164f, 2.317f)
                horizontalLineTo(6.964f)
                curveToRelative(-0.22f, -1.53f, -1.434f, -2.744f, -2.964f, -2.964f)
                verticalLineTo(6.964f)
                curveToRelative(1.53f, -0.22f, 2.744f, -1.434f, 2.964f, -2.964f)
                horizontalLineToRelative(10.072f)
                curveToRelative(0.243f, 1.694f, 1.704f, 3.0f, 3.464f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.393f, 0.0f, -2.599f, 0.819f, -3.162f, 2.0f)
                horizontalLineTo(6.662f)
                curveToRelative(-0.563f, -1.181f, -1.769f, -2.0f, -3.162f, -2.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                curveToRelative(0.0f, 1.393f, 0.819f, 2.599f, 2.0f, 3.162f)
                verticalLineToRelative(8.677f)
                curveToRelative(-1.181f, 0.563f, -2.0f, 1.769f, -2.0f, 3.162f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.393f, 0.0f, 2.599f, -0.819f, 3.162f, -2.0f)
                horizontalLineToRelative(14.771f)
                lineToRelative(-2.163f, 2.317f)
                curveToRelative(-0.377f, 0.404f, -0.355f, 1.037f, 0.048f, 1.414f)
                curveToRelative(0.193f, 0.18f, 0.438f, 0.269f, 0.683f, 0.269f)
                curveToRelative(0.267f, 0.0f, 0.534f, -0.106f, 0.731f, -0.317f)
                lineToRelative(2.39f, -2.561f)
                curveToRelative(0.567f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.312f, -1.555f, -0.855f, -2.097f)
                lineToRelative(-2.414f, -2.586f)
                close()
            }
        }
        .build()
        return _algorithm!!
    }

private var _algorithm: ImageVector? = null
