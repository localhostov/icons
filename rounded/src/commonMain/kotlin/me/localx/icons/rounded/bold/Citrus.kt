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

public val Icons.Bold.Citrus: ImageVector
    get() {
        if (_citrus != null) {
            return _citrus!!
        }
        _citrus = Builder(name = "Citrus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 16.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(22.554f, 6.285f)
                curveToRelative(-0.396f, -0.728f, -1.306f, -0.998f, -2.034f, -0.603f)
                reflectiveCurveToRelative(-0.998f, 1.306f, -0.603f, 2.034f)
                curveToRelative(0.708f, 1.306f, 1.083f, 2.787f, 1.083f, 4.285f)
                curveToRelative(0.0f, 4.962f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.962f, 3.0f, 12.0f)
                curveToRelative(0.0f, -2.872f, 1.389f, -5.596f, 3.716f, -7.287f)
                curveToRelative(0.67f, -0.487f, 0.818f, -1.425f, 0.332f, -2.095f)
                curveToRelative(-0.486f, -0.669f, -1.425f, -0.817f, -2.095f, -0.332f)
                curveTo(1.852f, 4.54f, 0.0f, 8.171f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -1.996f, -0.5f, -3.972f, -1.446f, -5.715f)
                close()
                moveTo(10.5f, 6.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.0f, 3.5f, 0.0f, 6.327f, -2.826f)
                curveToRelative(1.132f, -1.131f, 1.535f, -2.738f, 1.676f, -3.872f)
                curveToRelative(0.093f, -0.749f, -0.544f, -1.386f, -1.293f, -1.293f)
                curveToRelative(-1.134f, 0.141f, -2.741f, 0.545f, -3.872f, 1.676f)
                curveToRelative(-0.636f, 0.636f, -1.159f, 1.54f, -1.577f, 2.465f)
                curveToRelative(-0.366f, -1.74f, -1.073f, -2.821f, -1.513f, -3.482f)
                curveToRelative(-0.459f, -0.69f, -1.393f, -0.875f, -2.08f, -0.417f)
                curveToRelative(-0.689f, 0.459f, -0.876f, 1.391f, -0.417f, 2.08f)
                curveToRelative(0.497f, 0.746f, 1.249f, 1.874f, 1.249f, 4.168f)
                close()
                moveTo(12.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 12.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _citrus!!
    }

private var _citrus: ImageVector? = null
