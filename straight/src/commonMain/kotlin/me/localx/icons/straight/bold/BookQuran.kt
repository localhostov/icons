package me.localx.icons.straight.bold

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

public val Icons.Bold.BookQuran: ImageVector
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
                lineTo(3.5f, 0.0f)
                curveTo(2.122f, 0.0f, 1.0f, 1.122f, 1.0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(18.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(23.0f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(19.0f, 3.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(12.142f)
                curveToRelative(-0.322f, -0.084f, -0.653f, -0.142f, -1.0f, -0.142f)
                lineTo(4.0f, 16.0f)
                lineTo(4.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(7.0f, 9.5f)
                curveToRelative(0.0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
                curveToRelative(0.532f, 0.0f, 1.037f, 0.101f, 1.51f, 0.273f)
                curveToRelative(-1.749f, 0.617f, -3.01f, 2.267f, -3.01f, 4.227f)
                reflectiveCurveToRelative(1.26f, 3.609f, 3.007f, 4.227f)
                curveToRelative(-0.472f, 0.171f, -0.976f, 0.273f, -1.507f, 0.273f)
                curveToRelative(-2.485f, 0.0f, -4.5f, -2.015f, -4.5f, -4.5f)
                close()
                moveTo(11.969f, 9.0f)
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
