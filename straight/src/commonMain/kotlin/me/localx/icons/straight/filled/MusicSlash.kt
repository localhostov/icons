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

public val Icons.Filled.MusicSlash: ImageVector
    get() {
        if (_musicSlash != null) {
            return _musicSlash!!
        }
        _musicSlash = Builder(name = "MusicSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveToRelative(0.0f, -1.7f, -1.3f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(11.0f)
                curveTo(9.3f, 1.0f, 8.0f, 2.3f, 8.0f, 4.0f)
                verticalLineToRelative(2.6f)
                lineTo(1.5f, 0.0f)
                lineTo(0.0f, 1.5f)
                lineTo(22.5f, 24.0f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(-1.2f, -1.2f)
                curveToRelative(0.8f, -0.9f, 1.3f, -2.1f, 1.3f, -3.3f)
                curveToRelative(0.0f, -0.2f, 0.0f, -0.3f, -0.1f, -0.5f)
                horizontalLineTo(24.0f)
                curveTo(24.0f, 17.5f, 24.0f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(22.0f, 14.0f)
                curveToRelative(-0.8f, -0.6f, -1.9f, -1.0f, -3.0f, -1.0f)
                curveToRelative(-1.2f, 0.0f, -2.4f, 0.5f, -3.3f, 1.3f)
                lineTo(10.0f, 8.6f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.6f, 0.4f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.6f, 0.0f, 1.0f, 0.4f, 1.0f, 1.0f)
                curveTo(22.0f, 4.0f, 22.0f, 14.0f, 22.0f, 14.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveToRelative(-0.8f, -0.6f, -1.9f, -1.0f, -3.0f, -1.0f)
                curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f)
                verticalLineToRelative(-3.8f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(14.0f)
                lineTo(8.0f, 14.0f)
                close()
            }
        }
        .build()
        return _musicSlash!!
    }

private var _musicSlash: ImageVector? = null
