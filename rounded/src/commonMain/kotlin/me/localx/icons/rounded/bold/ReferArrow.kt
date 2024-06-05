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

public val Icons.Bold.ReferArrow: ImageVector
    get() {
        if (_referArrow != null) {
            return _referArrow!!
        }
        _referArrow = Builder(name = "ReferArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(8.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(10.984f, 15.785f)
                curveToRelative(-0.118f, 0.819f, -0.873f, 1.392f, -1.698f, 1.271f)
                curveToRelative(-0.258f, -0.037f, -0.522f, -0.056f, -0.786f, -0.056f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.468f, -5.5f, 5.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -4.687f, 3.813f, -8.5f, 8.5f, -8.5f)
                curveToRelative(0.405f, 0.0f, 0.813f, 0.029f, 1.214f, 0.087f)
                curveToRelative(0.819f, 0.117f, 1.389f, 0.878f, 1.271f, 1.698f)
                close()
                moveTo(22.974f, 18.974f)
                lineToRelative(-2.378f, 2.549f)
                curveToRelative(-0.296f, 0.316f, -0.696f, 0.477f, -1.097f, 0.477f)
                curveToRelative(-0.367f, 0.0f, -0.734f, -0.134f, -1.023f, -0.403f)
                curveToRelative(-0.605f, -0.565f, -0.639f, -1.515f, -0.073f, -2.12f)
                lineToRelative(1.378f, -1.477f)
                horizontalLineToRelative(-2.782f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(2.783f)
                lineToRelative(-1.379f, -1.477f)
                curveToRelative(-0.565f, -0.605f, -0.532f, -1.555f, 0.073f, -2.12f)
                curveToRelative(0.604f, -0.564f, 1.554f, -0.532f, 2.12f, 0.073f)
                lineToRelative(2.414f, 2.586f)
                curveToRelative(1.328f, 1.327f, 1.328f, 3.548f, -0.036f, 4.912f)
                close()
            }
        }
        .build()
        return _referArrow!!
    }

private var _referArrow: ImageVector? = null
