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

public val Icons.Bold.Treadmill: ImageVector
    get() {
        if (_treadmill != null) {
            return _treadmill!!
        }
        _treadmill = Builder(name = "Treadmill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.092f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(1.485f, 11.321f)
                curveToRelative(0.729f, 0.391f, 1.639f, 0.118f, 2.031f, -0.611f)
                lineToRelative(0.919f, -1.71f)
                horizontalLineToRelative(1.342f)
                lineToRelative(-0.647f, 1.581f)
                curveToRelative(-0.523f, 1.094f, -0.176f, 2.442f, 0.846f, 3.338f)
                lineToRelative(3.024f, 2.745f)
                verticalLineToRelative(1.836f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.423f, -0.179f, -0.826f, -0.492f, -1.11f)
                lineToRelative(-2.643f, -2.399f)
                lineToRelative(0.937f, -2.285f)
                lineToRelative(1.045f, 1.254f)
                curveToRelative(0.285f, 0.342f, 0.707f, 0.54f, 1.152f, 0.54f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.797f)
                lineToRelative(-1.151f, -1.381f)
                curveToRelative(-0.857f, -1.029f, -2.118f, -1.619f, -3.457f, -1.619f)
                horizontalLineToRelative(-3.958f)
                curveToRelative(-0.922f, 0.0f, -1.766f, 0.504f, -2.202f, 1.316f)
                lineToRelative(-1.061f, 1.974f)
                curveToRelative(-0.392f, 0.729f, -0.119f, 1.639f, 0.611f, 2.031f)
                close()
                moveTo(23.527f, 10.038f)
                curveToRelative(-0.469f, -0.649f, -1.227f, -1.038f, -2.028f, -1.038f)
                horizontalLineToRelative(-2.999f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.306f)
                lineToRelative(-2.43f, 7.29f)
                curveToRelative(-0.341f, 1.022f, -1.295f, 1.71f, -2.372f, 1.71f)
                lineTo(1.5f, 21.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(14.504f)
                curveToRelative(2.371f, 0.0f, 4.468f, -1.512f, 5.218f, -3.761f)
                lineToRelative(2.649f, -7.948f)
                curveToRelative(0.254f, -0.761f, 0.125f, -1.603f, -0.344f, -2.253f)
                close()
                moveTo(1.5f, 17.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                lineTo(1.5f, 14.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _treadmill!!
    }

private var _treadmill: ImageVector? = null
