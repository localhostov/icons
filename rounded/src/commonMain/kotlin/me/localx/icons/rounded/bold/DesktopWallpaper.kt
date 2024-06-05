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

public val Icons.Bold.DesktopWallpaper: ImageVector
    get() {
        if (_desktopWallpaper != null) {
            return _desktopWallpaper!!
        }
        _desktopWallpaper = Builder(name = "DesktopWallpaper", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 5.5f)
                lineTo(24.0f, 13.5f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.5f, 19.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.47f, 2.47f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(3.0f, 13.5f)
                curveToRelative(0.0f, 0.4f, 0.1f, 0.78f, 0.26f, 1.12f)
                lineToRelative(4.99f, -4.99f)
                curveToRelative(1.51f, -1.51f, 3.97f, -1.51f, 5.49f, 0.0f)
                lineToRelative(0.63f, 0.64f)
                curveToRelative(0.34f, 0.34f, 0.9f, 0.34f, 1.24f, 0.0f)
                lineToRelative(5.31f, -5.31f)
                curveToRelative(-0.25f, -1.11f, -1.25f, -1.94f, -2.44f, -1.94f)
                lineTo(5.5f, 3.02f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(3.0f, 13.5f)
                close()
                moveTo(21.0f, 13.5f)
                verticalLineToRelative(-4.38f)
                lineToRelative(-3.26f, 3.26f)
                curveToRelative(-1.51f, 1.51f, -3.97f, 1.51f, -5.49f, 0.0f)
                lineToRelative(-0.63f, -0.64f)
                curveToRelative(-0.34f, -0.34f, -0.9f, -0.34f, -1.24f, 0.0f)
                lineToRelative(-4.26f, 4.26f)
                horizontalLineToRelative(12.38f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _desktopWallpaper!!
    }

private var _desktopWallpaper: ImageVector? = null
