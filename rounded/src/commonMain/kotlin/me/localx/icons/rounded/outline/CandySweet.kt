package me.localx.icons.rounded.outline

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

public val Icons.Outline.CandySweet: ImageVector
    get() {
        if (_candySweet != null) {
            return _candySweet!!
        }
        _candySweet = Builder(name = "CandySweet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.849f, 9.68f)
                curveToRelative(-0.104f, -0.759f, -1.015f, -1.087f, -1.587f, -0.578f)
                lineToRelative(-1.418f, 1.261f)
                curveToRelative(-0.773f, -4.182f, -4.441f, -7.362f, -8.843f, -7.362f)
                reflectiveCurveTo(3.93f, 6.179f, 3.157f, 10.362f)
                lineToRelative(-1.417f, -1.26f)
                curveToRelative(-0.573f, -0.509f, -1.484f, -0.18f, -1.587f, 0.579f)
                curveTo(0.068f, 10.303f, 0.0f, 11.085f, 0.0f, 12.0f)
                reflectiveCurveToRelative(0.067f, 1.697f, 0.152f, 2.319f)
                curveToRelative(0.103f, 0.759f, 1.014f, 1.088f, 1.587f, 0.579f)
                lineToRelative(1.418f, -1.26f)
                curveToRelative(0.773f, 4.182f, 4.441f, 7.361f, 8.843f, 7.361f)
                reflectiveCurveToRelative(8.07f, -3.18f, 8.843f, -7.362f)
                lineToRelative(1.418f, 1.261f)
                curveToRelative(0.572f, 0.509f, 1.483f, 0.18f, 1.587f, -0.578f)
                curveToRelative(0.085f, -0.623f, 0.152f, -1.404f, 0.152f, -2.32f)
                reflectiveCurveToRelative(-0.067f, -1.697f, -0.152f, -2.32f)
                close()
                moveTo(5.0f, 12.0f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.776f, 0.0f, 1.521f, 0.132f, 2.22f, 0.367f)
                lineTo(5.367f, 14.22f)
                curveToRelative(-0.234f, -0.698f, -0.367f, -1.443f, -0.367f, -2.219f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, -0.001f, 0.0f, -0.001f)
                close()
                moveTo(6.329f, 16.087f)
                lineToRelative(9.758f, -9.758f)
                curveToRelative(0.61f, 0.441f, 1.145f, 0.976f, 1.586f, 1.586f)
                lineToRelative(-9.758f, 9.758f)
                curveToRelative(-0.61f, -0.441f, -1.145f, -0.976f, -1.586f, -1.586f)
                close()
                moveTo(12.0f, 19.001f)
                curveToRelative(-0.776f, 0.0f, -1.52f, -0.132f, -2.219f, -0.366f)
                lineToRelative(8.852f, -8.852f)
                curveToRelative(0.234f, 0.698f, 0.366f, 1.443f, 0.366f, 2.219f)
                curveToRelative(0.0f, 3.859f, -3.141f, 7.0f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _candySweet!!
    }

private var _candySweet: ImageVector? = null
