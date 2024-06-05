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

public val Icons.Bold.CloudDownloadAlt: ImageVector
    get() {
        if (_cloudDownloadAlt != null) {
            return _cloudDownloadAlt!!
        }
        _cloudDownloadAlt = Builder(name = "CloudDownloadAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(2.559f)
                lineToRelative(-3.159f, 3.583f)
                curveToRelative(-0.48f, 0.556f, -1.32f, 0.556f, -1.8f, 0.0f)
                lineToRelative(-3.159f, -3.583f)
                horizontalLineToRelative(2.559f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 14.295f)
                curveToRelative(0.0f, 4.249f, -3.456f, 7.705f, -7.705f, 7.705f)
                lineTo(5.318f, 22.0f)
                curveToRelative(-2.933f, 0.0f, -5.318f, -2.6f, -5.318f, -5.796f)
                curveToRelative(0.0f, -1.646f, 0.787f, -3.287f, 2.065f, -4.417f)
                curveToRelative(-0.043f, -0.349f, -0.065f, -0.695f, -0.065f, -1.037f)
                curveTo(2.0f, 5.925f, 5.925f, 2.0f, 10.75f, 2.0f)
                curveToRelative(3.366f, 0.0f, 6.439f, 1.967f, 7.883f, 4.968f)
                curveToRelative(3.154f, 1.006f, 5.367f, 3.968f, 5.367f, 7.327f)
                close()
                moveTo(21.0f, 14.295f)
                curveToRelative(0.0f, -2.216f, -1.581f, -4.147f, -3.76f, -4.594f)
                lineToRelative(-0.815f, -0.167f)
                lineToRelative(-0.29f, -0.781f)
                curveToRelative(-0.833f, -2.244f, -2.997f, -3.753f, -5.385f, -3.753f)
                curveToRelative(-3.17f, 0.0f, -5.75f, 2.579f, -5.75f, 5.75f)
                curveToRelative(0.0f, 0.431f, 0.055f, 0.881f, 0.164f, 1.337f)
                lineToRelative(0.253f, 1.062f)
                lineToRelative(-0.933f, 0.566f)
                curveToRelative(-0.888f, 0.54f, -1.484f, 1.54f, -1.484f, 2.488f)
                curveToRelative(0.0f, 1.542f, 1.04f, 2.796f, 2.318f, 2.796f)
                horizontalLineToRelative(10.977f)
                curveToRelative(2.594f, 0.0f, 4.705f, -2.11f, 4.705f, -4.705f)
                close()
            }
        }
        .build()
        return _cloudDownloadAlt!!
    }

private var _cloudDownloadAlt: ImageVector? = null
