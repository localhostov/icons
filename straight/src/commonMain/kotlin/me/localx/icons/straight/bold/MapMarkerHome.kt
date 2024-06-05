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

public val Icons.Bold.MapMarkerHome: ImageVector
    get() {
        if (_mapMarkerHome != null) {
            return _mapMarkerHome!!
        }
        _mapMarkerHome = Builder(name = "MapMarkerHome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.007f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 4.941f, 17.089f)
                lineTo(12.0f, 23.994f)
                lineToRelative(7.071f, -6.917f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 0.007f)
                close()
                moveTo(16.961f, 14.944f)
                lineTo(12.0f, 19.8f)
                lineTo(7.05f, 14.956f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 9.9f, -9.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.011f, 9.887f)
                close()
                moveTo(16.0f, 9.409f)
                lineTo(16.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                lineTo(13.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 13.0f)
                lineTo(8.0f, 9.409f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.589f, -1.192f)
                lineToRelative(2.5f, -1.909f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.822f, 0.0f)
                lineToRelative(2.5f, 1.909f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 9.409f)
                close()
            }
        }
        .build()
        return _mapMarkerHome!!
    }

private var _mapMarkerHome: ImageVector? = null
