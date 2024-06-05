package me.localx.icons.rounded.bold

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

public val Icons.Bold.EclipseAlt: ImageVector
    get() {
        if (_eclipseAlt != null) {
            return _eclipseAlt!!
        }
        _eclipseAlt = Builder(name = "EclipseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.606f, 14.83f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, -0.151f, 0.941f)
                curveTo(7.889f, 17.5f, 5.64f, 9.3f, 11.361f, 8.051f)
                arcToRelative(4.393f, 4.393f, 0.0f, false, true, 1.683f, 0.068f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, 0.243f, 0.918f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 13.606f, 14.83f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(20.865f, 13.5f)
                arcToRelative(8.957f, 8.957f, 0.0f, false, true, -1.537f, 3.707f)
                lineToRelative(1.157f, 1.157f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.121f, 2.121f)
                lineToRelative(-1.157f, -1.157f)
                arcTo(8.957f, 8.957f, 0.0f, false, true, 13.5f, 20.865f)
                lineTo(13.5f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(10.5f, 20.865f)
                arcToRelative(8.957f, 8.957f, 0.0f, false, true, -3.707f, -1.537f)
                lineTo(5.636f, 20.485f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.121f, -2.121f)
                lineToRelative(1.157f, -1.157f)
                arcTo(8.957f, 8.957f, 0.0f, false, true, 3.135f, 13.5f)
                lineTo(1.5f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                lineTo(3.135f, 10.5f)
                arcTo(8.957f, 8.957f, 0.0f, false, true, 4.672f, 6.793f)
                lineTo(3.515f, 5.636f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.636f, 3.515f)
                lineTo(6.793f, 4.672f)
                arcTo(8.957f, 8.957f, 0.0f, false, true, 10.5f, 3.135f)
                lineTo(10.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(13.5f, 3.135f)
                arcToRelative(8.957f, 8.957f, 0.0f, false, true, 3.707f, 1.537f)
                lineToRelative(1.157f, -1.157f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.121f, 2.121f)
                lineTo(19.328f, 6.793f)
                arcTo(8.957f, 8.957f, 0.0f, false, true, 20.865f, 10.5f)
                lineTo(22.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveTo(17.748f, 4.071f, 6.251f, 4.072f, 6.0f, 12.0f)
                curveTo(6.252f, 19.929f, 17.749f, 19.928f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _eclipseAlt!!
    }

private var _eclipseAlt: ImageVector? = null
