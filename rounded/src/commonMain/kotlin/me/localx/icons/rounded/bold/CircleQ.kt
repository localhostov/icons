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

public val Icons.Bold.CircleQ: ImageVector
    get() {
        if (_circleQ != null) {
            return _circleQ!!
        }
        _circleQ = Builder(name = "CircleQ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.492f, 15.371f)
                curveToRelative(0.311f, -0.657f, 0.5f, -1.383f, 0.5f, -2.158f)
                verticalLineToRelative(-2.426f)
                curveToRelative(0.0f, -2.777f, -2.239f, -5.037f, -4.992f, -5.037f)
                reflectiveCurveToRelative(-5.008f, 2.26f, -5.008f, 5.037f)
                verticalLineToRelative(2.426f)
                curveToRelative(0.0f, 2.777f, 2.246f, 5.037f, 5.008f, 5.037f)
                curveToRelative(0.896f, 0.0f, 1.725f, -0.258f, 2.452f, -0.677f)
                lineToRelative(0.237f, 0.237f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-0.319f, -0.319f)
                close()
                moveTo(12.0f, 15.25f)
                curveToRelative(-1.126f, 0.0f, -2.008f, -0.895f, -2.008f, -2.037f)
                verticalLineToRelative(-2.426f)
                curveToRelative(0.0f, -1.143f, 0.882f, -2.037f, 2.008f, -2.037f)
                curveToRelative(1.117f, 0.0f, 1.992f, 0.895f, 1.992f, 2.037f)
                verticalLineToRelative(2.084f)
                lineToRelative(-0.182f, -0.182f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                reflectiveCurveToRelative(-0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(0.428f, 0.428f)
                curveToRelative(-0.04f, 0.002f, -0.077f, 0.012f, -0.117f, 0.012f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _circleQ!!
    }

private var _circleQ: ImageVector? = null
