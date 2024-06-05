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

public val Icons.Outline.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.121f, 16.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.008f, -4.25f)
                lineTo(12.0f, 9.8f)
                lineTo(9.879f, 11.878f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 4.244f)
                close()
                moveTo(12.707f, 14.707f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.414f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.008f, -1.406f)
                lineTo(12.0f, 12.6f)
                lineToRelative(0.707f, 0.691f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                close()
                moveTo(16.0f, 16.8f)
                lineToRelative(-2.121f, 2.074f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 4.244f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.008f, -4.25f)
                close()
                moveTo(16.707f, 21.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.414f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.008f, -1.406f)
                lineTo(16.0f, 19.6f)
                lineToRelative(0.707f, 0.691f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                close()
                moveTo(8.0f, 16.8f)
                lineTo(5.879f, 18.878f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 4.234f, -0.007f)
                close()
                moveTo(8.707f, 21.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.025f, 1.025f, 0.0f, false, true, -1.414f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.285f, 20.3f)
                lineTo(8.0f, 19.6f)
                lineToRelative(0.707f, 0.691f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                close()
                moveTo(24.0f, 12.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -3.512f, 6.341f)
                arcToRelative(5.105f, 5.105f, 0.0f, false, false, -0.976f, -1.4f)
                lineToRelative(-0.218f, -0.212f)
                arcTo(5.494f, 5.494f, 0.0f, false, false, 16.679f, 7.0f)
                lineToRelative(-0.721f, -0.023f)
                lineToRelative(-0.206f, -0.691f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.0f, 8.0f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, 0.391f, 2.134f)
                lineToRelative(0.319f, 0.838f)
                lineToRelative(-0.8f, 0.408f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, 0.317f, 6.372f)
                arcToRelative(4.937f, 4.937f, 0.0f, false, false, -0.979f, 1.761f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.984f, -9.463f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 17.44f, 5.059f)
                arcTo(7.461f, 7.461f, 0.0f, false, true, 24.0f, 12.5f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
