package me.localx.icons.rounded.filled

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

public val Icons.Filled.Swatchbook: ImageVector
    get() {
        if (_swatchbook != null) {
            return _swatchbook!!
        }
        _swatchbook = Builder(name = "Swatchbook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 12.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(10.0f, 5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.0f)
                curveTo(1.567f, 0.0f, 0.0f, 1.567f, 0.0f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(10.0f, 14.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveTo(0.0f, 21.761f, 0.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(6.5f, 19.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(10.0f, 5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.0f)
                curveTo(1.567f, 0.0f, 0.0f, 1.567f, 0.0f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(10.0f, 14.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveTo(0.0f, 21.761f, 0.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(6.5f, 19.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(11.999f, 19.072f)
                lineToRelative(7.939f, -7.939f)
                curveToRelative(1.367f, -1.367f, 1.367f, -3.583f, 0.0f, -4.95f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(-1.367f, -1.367f, -3.583f, -1.367f, -4.95f, 0.0f)
                lineToRelative(-0.867f, 0.867f)
                reflectiveCurveToRelative(0.0f, 14.119f, 0.0f, 14.143f)
                close()
                moveTo(9.899f, 24.0f)
                horizontalLineToRelative(10.601f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-10.001f, 10.0f)
                close()
            }
        }
        .build()
        return _swatchbook!!
    }

private var _swatchbook: ImageVector? = null
