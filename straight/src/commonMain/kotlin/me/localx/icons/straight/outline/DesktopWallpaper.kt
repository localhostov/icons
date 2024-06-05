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

public val Icons.Outline.DesktopWallpaper: ImageVector
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
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 23.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 2.35f, 1.35f, 1.0f, 3.0f, 1.0f)
                lineTo(21.0f, 1.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                lineTo(13.0f, 19.0f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(22.0f, 7.41f)
                lineToRelative(-7.0f, 7.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-6.59f, 6.59f)
                lineTo(22.0f, 17.0f)
                close()
                moveTo(2.0f, 4.0f)
                verticalLineToRelative(12.59f)
                lineTo(11.0f, 7.59f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(7.0f, -7.0f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _desktopWallpaper!!
    }

private var _desktopWallpaper: ImageVector? = null
