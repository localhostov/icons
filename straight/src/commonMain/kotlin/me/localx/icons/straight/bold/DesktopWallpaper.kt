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
                moveTo(13.5f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(20.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(13.5f, 19.0f)
                close()
                moveTo(21.0f, 16.0f)
                verticalLineToRelative(-6.88f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.88f, 4.88f)
                horizontalLineToRelative(14.88f)
                close()
                moveTo(3.0f, 3.5f)
                lineTo(3.0f, 14.88f)
                lineTo(11.0f, 6.88f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(6.0f, -6.0f)
                verticalLineToRelative(-1.38f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _desktopWallpaper!!
    }

private var _desktopWallpaper: ImageVector? = null
