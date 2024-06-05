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

public val Icons.Filled.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.761f, 0.612f)
                arcToRelative(12.027f, 12.027f, 0.0f, false, true, 8.039f, 9.281f)
                arcToRelative(12.556f, 12.556f, 0.0f, false, true, -3.828f, 1.758f)
                arcToRelative(20.644f, 20.644f, 0.0f, false, false, -4.211f, -11.039f)
                close()
                moveTo(12.977f, 11.3f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, false, 5.015f, 0.7f)
                arcToRelative(19.039f, 19.039f, 0.0f, false, false, -5.311f, -11.966f)
                curveToRelative(-0.227f, -0.012f, -0.451f, -0.034f, -0.681f, -0.034f)
                arcToRelative(11.934f, 11.934f, 0.0f, false, false, -4.688f, 0.955f)
                arcToRelative(13.637f, 13.637f, 0.0f, false, true, 5.665f, 10.345f)
                close()
                moveTo(16.934f, 14.065f)
                arcToRelative(12.787f, 12.787f, 0.0f, false, true, -4.786f, -0.935f)
                arcToRelative(12.886f, 12.886f, 0.0f, false, false, -2.935f, 3.151f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 13.7f, 0.681f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 1.082f, -4.826f)
                arcToRelative(14.169f, 14.169f, 0.0f, false, true, -7.061f, 1.932f)
                close()
                moveTo(16.655f, 20.0f)
                arcToRelative(18.366f, 18.366f, 0.0f, false, true, -8.429f, -1.965f)
                arcToRelative(12.434f, 12.434f, 0.0f, false, false, -1.241f, 4.854f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 14.406f, -3.438f)
                arcToRelative(21.748f, 21.748f, 0.0f, false, true, -4.736f, 0.549f)
                close()
                moveTo(8.64f, 5.006f)
                arcToRelative(11.571f, 11.571f, 0.0f, false, false, -3.323f, -2.967f)
                arcToRelative(11.992f, 11.992f, 0.0f, false, false, -4.781f, 13.508f)
                arcToRelative(21.312f, 21.312f, 0.0f, false, true, 8.104f, -10.541f)
                close()
                moveTo(10.968f, 11.52f)
                arcToRelative(11.557f, 11.557f, 0.0f, false, false, -1.275f, -4.8f)
                arcToRelative(19.156f, 19.156f, 0.0f, false, false, -7.849f, 11.48f)
                lineToRelative(-0.118f, -0.027f)
                arcToRelative(12.067f, 12.067f, 0.0f, false, false, 3.346f, 3.613f)
                arcToRelative(15.707f, 15.707f, 0.0f, false, true, 5.896f, -10.266f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
