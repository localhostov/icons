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

public val Icons.Bold.ExitAlt: ImageVector
    get() {
        if (_exitAlt != null) {
            return _exitAlt!!
        }
        _exitAlt = Builder(name = "ExitAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 4.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(17.736f, 14.372f)
                lineToRelative(-1.094f, -2.371f)
                horizontalLineToRelative(1.395f)
                reflectiveCurveToRelative(0.742f, 1.623f, 0.742f, 1.623f)
                curveToRelative(0.345f, 0.753f, 1.235f, 1.087f, 1.988f, 0.74f)
                curveToRelative(0.753f, -0.345f, 1.084f, -1.234f, 0.74f, -1.988f)
                lineToRelative(-0.742f, -1.621f)
                curveToRelative(-0.486f, -1.066f, -1.557f, -1.755f, -2.729f, -1.755f)
                horizontalLineToRelative(-3.606f)
                curveToRelative(-1.038f, 0.0f, -2.007f, 0.426f, -2.658f, 1.169f)
                curveToRelative(-0.066f, 0.076f, -1.646f, 2.831f, -1.646f, 2.831f)
                horizontalLineToRelative(-1.628f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.628f)
                curveToRelative(1.005f, 0.0f, 1.927f, -0.521f, 2.481f, -1.35f)
                lineToRelative(0.98f, 2.125f)
                lineToRelative(-2.761f, 1.384f)
                curveToRelative(-0.508f, 0.254f, -0.828f, 0.773f, -0.828f, 1.341f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.074f)
                reflectiveCurveToRelative(3.352f, -1.683f, 3.393f, -1.709f)
                curveToRelative(1.439f, -0.909f, 2.014f, -2.712f, 1.343f, -4.345f)
                close()
                moveTo(16.999f, 5.498f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.499f, 1.5f, 1.499f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.828f, 0.0f, 1.499f, -0.673f, 1.499f, -1.501f)
                curveToRelative(-0.002f, -3.03f, -2.47f, -5.496f, -5.5f, -5.496f)
                horizontalLineToRelative(-7.999f)
                curveTo(3.467f, 0.0f, 1.0f, 2.468f, 1.0f, 5.5f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(4.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.999f)
                curveToRelative(1.377f, 0.0f, 2.499f, 1.121f, 2.5f, 2.498f)
                close()
                moveTo(21.5f, 19.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _exitAlt!!
    }

private var _exitAlt: ImageVector? = null
