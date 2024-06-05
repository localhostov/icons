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

public val Icons.Bold.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.268f, 19.732f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -3.536f, 0.0f)
                lineTo(8.5f, 18.0f)
                close()
                moveTo(14.268f, 12.732f)
                lineTo(12.5f, 11.0f)
                lineToRelative(-1.768f, 1.729f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 3.536f, 0.0f)
                close()
                moveTo(16.5f, 18.058f)
                lineToRelative(-1.768f, 1.729f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 3.536f, 0.0f)
                close()
                moveTo(24.0f, 12.477f)
                lineTo(24.0f, 12.5f)
                arcToRelative(8.032f, 8.032f, 0.0f, false, true, -3.678f, 6.707f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, false, -0.656f, -0.85f)
                lineToRelative(-1.432f, -1.4f)
                arcTo(5.018f, 5.018f, 0.0f, false, false, 21.0f, 12.5f)
                verticalLineToRelative(-0.023f)
                horizontalLineToRelative(0.0f)
                arcTo(4.516f, 4.516f, 0.0f, false, false, 16.452f, 8.0f)
                lineTo(15.37f, 7.965f)
                lineToRelative(-0.308f, -1.038f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 10.091f, 3.0f)
                arcTo(4.935f, 4.935f, 0.0f, false, false, 5.0f, 8.0f)
                arcToRelative(5.935f, 5.935f, 0.0f, false, false, 0.247f, 2.025f)
                lineToRelative(0.479f, 1.258f)
                lineToRelative(-1.2f, 0.612f)
                arcTo(2.784f, 2.784f, 0.0f, false, false, 3.0f, 14.386f)
                arcToRelative(3.16f, 3.16f, 0.0f, false, false, 1.652f, 2.777f)
                lineToRelative(0.313f, 0.159f)
                lineToRelative(1.116f, 0.25f)
                lineToRelative(-0.763f, 0.746f)
                arcTo(4.454f, 4.454f, 0.0f, false, false, 4.212f, 20.2f)
                arcTo(6.161f, 6.161f, 0.0f, false, true, 0.0f, 14.386f)
                verticalLineToRelative(-0.01f)
                arcTo(5.769f, 5.769f, 0.0f, false, true, 2.133f, 9.892f)
                arcTo(11.93f, 11.93f, 0.0f, false, true, 2.0f, 8.0f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 8.091f, -8.0f)
                arcToRelative(8.294f, 8.294f, 0.0f, false, true, 7.493f, 5.1f)
                arcTo(7.411f, 7.411f, 0.0f, false, true, 24.0f, 12.477f)
                close()
                moveTo(0.005f, 14.386f)
                lineTo(0.0f, 14.386f)
                curveTo(0.0f, 14.4f, 0.0f, 14.405f, 0.005f, 14.386f)
                close()
                moveTo(2.999f, 14.386f)
                lineTo(3.0f, 14.386f)
                curveTo(3.0f, 14.405f, 3.0f, 14.4f, 3.0f, 14.386f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
