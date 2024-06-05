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

public val Icons.Bold.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.412f, 8.7f)
                arcToRelative(2.635f, 2.635f, 0.0f, false, false, -2.516f, 0.407f)
                lineToRelative(-1.085f, 0.808f)
                arcTo(5.335f, 5.335f, 0.0f, false, false, 14.725f, 6.1f)
                lineTo(10.146f, 1.525f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.672f, 0.5f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 3.5f)
                horizontalLineTo(7.672f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.354f, 0.146f)
                lineTo(10.38f, 6.0f)
                horizontalLineTo(5.318f)
                arcTo(5.318f, 5.318f, 0.0f, false, false, 0.0f, 11.318f)
                verticalLineToRelative(7.364f)
                arcTo(5.318f, 5.318f, 0.0f, false, false, 5.318f, 24.0f)
                horizontalLineToRelative(8.364f)
                arcToRelative(5.327f, 5.327f, 0.0f, false, false, 5.129f, -3.913f)
                lineToRelative(1.2f, 0.891f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.492f, 0.5f)
                arcTo(2.529f, 2.529f, 0.0f, false, false, 22.969f, 21.0f)
                arcTo(2.617f, 2.617f, 0.0f, false, false, 24.0f, 18.851f)
                verticalLineTo(11.027f)
                arcTo(2.491f, 2.491f, 0.0f, false, false, 22.412f, 8.7f)
                close()
                moveTo(16.0f, 18.682f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 13.682f, 21.0f)
                horizontalLineTo(5.318f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 3.0f, 18.682f)
                verticalLineTo(11.318f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 5.318f, 9.0f)
                horizontalLineToRelative(8.364f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 16.0f, 11.318f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
