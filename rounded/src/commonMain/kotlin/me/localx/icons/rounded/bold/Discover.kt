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

public val Icons.Bold.Discover: ImageVector
    get() {
        if (_discover != null) {
            return _discover!!
        }
        _discover = Builder(name = "Discover", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.416f, 19.295f)
                curveToRelative(0.361f, -0.691f, 0.584f, -1.463f, 0.584f, -2.295f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(0.831f, 0.0f, 1.604f, -0.223f, 2.295f, -0.584f)
                lineToRelative(2.145f, 2.145f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-2.145f, -2.145f)
                close()
                moveTo(17.0f, 19.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(18.5f, 1.0f)
                lineTo(5.5f, 1.0f)
                curveTo(2.462f, 1.0f, 0.0f, 3.462f, 0.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.038f, 2.462f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(4.499f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.501f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.499f, -1.5f, -1.499f)
                horizontalLineToRelative(-4.499f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.481f)
                curveToRelative(0.0f, 0.821f, 0.66f, 1.489f, 1.481f, 1.5f)
                curveToRelative(0.836f, 0.011f, 1.519f, -0.664f, 1.519f, -1.5f)
                verticalLineToRelative(-3.981f)
                curveToRelative(0.0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(4.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _discover!!
    }

private var _discover: ImageVector? = null
