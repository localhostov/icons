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

public val Icons.Outline.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.007f)
                lineToRelative(-4.0f, 2.982f)
                lineTo(20.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(14.915f, 6.0f)
                lineToRelative(-5.0f, -5.0f)
                lineTo(0.0f, 1.0f)
                lineTo(0.0f, 3.0f)
                lineTo(9.086f, 3.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(3.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 9.0f)
                lineTo(0.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 19.011f)
                lineToRelative(4.0f, 2.982f)
                close()
                moveTo(18.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 18.007f)
                lineTo(20.0f, 16.516f)
                lineTo(20.0f, 13.484f)
                lineToRelative(2.0f, -1.491f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
