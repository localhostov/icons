package me.localx.icons.straight.outline

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

public val Icons.Outline.BookQuran: ImageVector
    get() {
        if (_bookQuran != null) {
            return _bookQuran!!
        }
        _bookQuran = Builder(name = "BookQuran", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(15.172f)
                curveToRelative(-0.313f, -0.111f, -0.649f, -0.172f, -1.0f, -0.172f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 2.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(7.0f, 10.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                curveToRelative(0.591f, 0.0f, 1.153f, 0.113f, 1.678f, 0.303f)
                curveToRelative(-1.943f, 0.686f, -3.344f, 2.519f, -3.344f, 4.697f)
                reflectiveCurveToRelative(1.4f, 4.01f, 3.341f, 4.696f)
                curveToRelative(-0.524f, 0.19f, -1.084f, 0.304f, -1.675f, 0.304f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 9.0f)
                horizontalLineToRelative(1.812f)
                lineToRelative(0.491f, -1.875f)
                horizontalLineToRelative(0.404f)
                lineToRelative(0.49f, 1.875f)
                horizontalLineToRelative(1.802f)
                verticalLineToRelative(0.382f)
                lineToRelative(-1.375f, 0.796f)
                lineToRelative(0.552f, 1.679f)
                lineToRelative(-0.312f, 0.218f)
                lineToRelative(-1.359f, -1.051f)
                lineToRelative(-1.364f, 1.055f)
                lineToRelative(-0.301f, -0.226f)
                lineToRelative(0.543f, -1.698f)
                lineToRelative(-1.384f, -0.77f)
                verticalLineToRelative(-0.384f)
                close()
            }
        }
        .build()
        return _bookQuran!!
    }

private var _bookQuran: ImageVector? = null
