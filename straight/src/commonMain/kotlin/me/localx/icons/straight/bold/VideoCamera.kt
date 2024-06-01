package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 8.75f)
                    lineTo(21.0f, 10.987f)
                    verticalLineTo(9.0f)
                    curveTo(21.0f, 8.2044f, 20.6839f, 7.4413f, 20.1213f, 6.8787f)
                    curveTo(19.5587f, 6.3161f, 18.7956f, 6.0f, 18.0f, 6.0f)
                    horizontalLineTo(15.679f)
                    lineTo(10.159f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(8.842f)
                    lineTo(11.6f, 6.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 6.0f, 1.4413f, 6.3161f, 0.8787f, 6.8787f)
                    curveTo(0.3161f, 7.4413f, 0.0f, 8.2044f, 0.0f, 9.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(19.013f)
                    lineTo(24.0f, 21.25f)
                    verticalLineTo(8.75f)
                    close()
                    moveTo(18.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
