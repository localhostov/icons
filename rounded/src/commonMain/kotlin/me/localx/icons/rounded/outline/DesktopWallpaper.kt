package me.localx.icons.rounded.outline

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
                moveTo(24.0f, 6.0f)
                lineTo(24.0f, 14.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(7.0f, 23.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 19.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 6.0f)
                curveTo(0.0f, 3.24f, 2.24f, 1.0f, 5.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
                moveTo(2.0f, 14.0f)
                curveToRelative(0.0f, 0.72f, 0.26f, 1.38f, 0.68f, 1.9f)
                lineToRelative(5.93f, -5.93f)
                curveToRelative(1.32f, -1.32f, 3.46f, -1.32f, 4.78f, 0.0f)
                lineToRelative(0.63f, 0.64f)
                curveToRelative(0.54f, 0.54f, 1.41f, 0.54f, 1.95f, 0.0f)
                lineToRelative(5.78f, -5.78f)
                curveToRelative(-0.46f, -1.07f, -1.52f, -1.83f, -2.76f, -1.83f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                lineTo(2.0f, 14.0f)
                close()
                moveTo(22.0f, 14.0f)
                lineTo(22.0f, 7.41f)
                lineToRelative(-4.61f, 4.61f)
                curveToRelative(-1.32f, 1.32f, -3.46f, 1.32f, -4.78f, 0.0f)
                lineToRelative(-0.63f, -0.64f)
                curveToRelative(-0.54f, -0.54f, -1.41f, -0.54f, -1.95f, 0.0f)
                lineToRelative(-5.56f, 5.56f)
                curveToRelative(0.17f, 0.03f, 0.35f, 0.05f, 0.54f, 0.05f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _desktopWallpaper!!
    }

private var _desktopWallpaper: ImageVector? = null
