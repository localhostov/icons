package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.BookQuran: ImageVector
    get() {
        if (_bookQuran != null) {
            return _bookQuran!!
        }
        _bookQuran = Builder(name = "BookQuran", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(22.0f, 3.0f)
                verticalLineToRelative(15.765f)
                curveToRelative(-0.549f, -0.494f, -1.262f, -0.766f, -2.0f, -0.765f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 2.0f)
                curveTo(2.0f, 0.896f, 2.895f, 0.0f, 4.0f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveTo(20.657f, 0.0f, 22.0f, 1.343f, 22.0f, 3.0f)
                close()
                moveTo(13.675f, 13.696f)
                curveToRelative(-1.942f, -0.687f, -3.341f, -2.52f, -3.341f, -4.696f)
                reflectiveCurveToRelative(1.401f, -4.011f, 3.344f, -4.697f)
                curveToRelative(-0.525f, -0.19f, -1.087f, -0.303f, -1.678f, -0.303f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.239f, 5.0f, 5.0f, 5.0f)
                curveToRelative(0.59f, 0.0f, 1.15f, -0.114f, 1.675f, -0.304f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineToRelative(-1.802f)
                lineToRelative(-0.49f, -1.875f)
                horizontalLineToRelative(-0.404f)
                lineToRelative(-0.491f, 1.875f)
                horizontalLineToRelative(-1.812f)
                verticalLineToRelative(0.384f)
                lineToRelative(1.384f, 0.77f)
                lineToRelative(-0.543f, 1.698f)
                lineToRelative(0.301f, 0.226f)
                lineToRelative(1.364f, -1.055f)
                lineToRelative(1.359f, 1.051f)
                lineToRelative(0.312f, -0.218f)
                lineToRelative(-0.552f, -1.679f)
                lineToRelative(1.375f, -0.796f)
                verticalLineToRelative(-0.382f)
                close()
            }
        }
        .build()
        return _bookQuran!!
    }

private var _bookQuran: ImageVector? = null
