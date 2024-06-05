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

public val Icons.Filled.DesktopWallpaper: ImageVector
    get() {
        if (_desktopWallpaper != null) {
            return _desktopWallpaper!!
        }
        _desktopWallpaper = Builder(name = "DesktopWallpaper", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.39f, 9.98f)
                lineToRelative(0.63f, 0.64f)
                curveToRelative(0.54f, 0.54f, 1.41f, 0.54f, 1.95f, 0.0f)
                lineToRelative(7.26f, -7.26f)
                curveToRelative(-0.89f, -1.41f, -2.45f, -2.35f, -4.24f, -2.35f)
                lineTo(5.0f, 1.01f)
                curveTo(2.24f, 1.0f, 0.0f, 3.24f, 0.0f, 6.0f)
                lineTo(0.0f, 14.0f)
                curveToRelative(0.0f, 1.27f, 0.48f, 2.44f, 1.27f, 3.32f)
                lineToRelative(7.34f, -7.34f)
                curveToRelative(1.32f, -1.32f, 3.46f, -1.32f, 4.78f, 0.0f)
                close()
                moveTo(5.5f, 8.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
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
                curveToRelative(-0.76f, 0.0f, -1.47f, -0.17f, -2.12f, -0.47f)
                lineToRelative(7.14f, -7.14f)
                curveToRelative(0.54f, -0.54f, 1.41f, -0.54f, 1.95f, 0.0f)
                lineToRelative(0.63f, 0.64f)
                curveToRelative(1.32f, 1.32f, 3.46f, 1.32f, 4.78f, 0.0f)
                lineToRelative(6.58f, -6.58f)
                curveToRelative(0.02f, 0.18f, 0.03f, 0.37f, 0.03f, 0.55f)
                close()
            }
        }
        .build()
        return _desktopWallpaper!!
    }

private var _desktopWallpaper: ImageVector? = null
