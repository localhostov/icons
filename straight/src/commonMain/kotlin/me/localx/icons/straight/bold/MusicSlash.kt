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

public val Icons.Bold.MusicSlash: ImageVector
    get() {
        if (_musicSlash != null) {
            return _musicSlash!!
        }
        _musicSlash = Builder(name = "MusicSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 12.0f)
                curveToRelative(-3.0f, 0.0f, -5.5f, 2.5f, -5.5f, 5.5f)
                reflectiveCurveTo(2.5f, 23.0f, 5.5f, 23.0f)
                reflectiveCurveToRelative(5.5f, -2.5f, 5.5f, -5.5f)
                reflectiveCurveTo(8.5f, 12.0f, 5.5f, 12.0f)
                close()
                moveTo(5.5f, 20.0f)
                curveTo(4.1f, 20.0f, 3.0f, 18.9f, 3.0f, 17.5f)
                reflectiveCurveTo(4.1f, 15.0f, 5.5f, 15.0f)
                reflectiveCurveTo(8.0f, 16.1f, 8.0f, 17.5f)
                reflectiveCurveTo(6.9f, 20.0f, 5.5f, 20.0f)
                close()
                moveTo(24.0f, 4.5f)
                curveTo(24.0f, 2.6f, 22.4f, 1.0f, 20.5f, 1.0f)
                horizontalLineToRelative(-9.0f)
                curveTo(9.6f, 1.0f, 8.0f, 2.6f, 8.0f, 4.5f)
                verticalLineToRelative(1.4f)
                lineTo(2.2f, 0.0f)
                lineTo(0.0f, 2.2f)
                lineTo(21.8f, 24.0f)
                lineToRelative(2.1f, -2.1f)
                lineToRelative(-1.0f, -1.0f)
                curveToRelative(0.7f, -0.9f, 1.1f, -2.1f, 1.1f, -3.3f)
                lineTo(24.0f, 4.5f)
                lineTo(24.0f, 4.5f)
                close()
                moveTo(11.0f, 4.5f)
                curveTo(11.0f, 4.2f, 11.2f, 4.0f, 11.5f, 4.0f)
                horizontalLineToRelative(9.0f)
                curveTo(20.8f, 4.0f, 21.0f, 4.2f, 21.0f, 4.5f)
                verticalLineToRelative(8.1f)
                curveToRelative(-0.8f, -0.4f, -1.6f, -0.6f, -2.5f, -0.6f)
                curveToRelative(-1.2f, 0.0f, -2.4f, 0.4f, -3.3f, 1.1f)
                lineTo(11.0f, 8.9f)
                curveTo(11.0f, 8.9f, 11.0f, 4.5f, 11.0f, 4.5f)
                close()
                moveTo(20.7f, 18.6f)
                lineToRelative(-3.4f, -3.4f)
                curveToRelative(0.3f, -0.2f, 0.7f, -0.3f, 1.1f, -0.3f)
                curveToRelative(1.4f, 0.0f, 2.5f, 1.1f, 2.5f, 2.5f)
                curveTo(21.0f, 17.9f, 20.9f, 18.3f, 20.7f, 18.6f)
                lineTo(20.7f, 18.6f)
                close()
            }
        }
        .build()
        return _musicSlash!!
    }

private var _musicSlash: ImageVector? = null
