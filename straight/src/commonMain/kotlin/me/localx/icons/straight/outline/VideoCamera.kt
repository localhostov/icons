package me.localx.icons.straight.outline

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

public val Icons.Outline.VideoCamera: ImageVector
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
                    moveTo(24.0f, 8.0064f)
                    lineTo(20.0f, 10.9884f)
                    verticalLineTo(8.9994f)
                    curveTo(20.0f, 8.2037f, 19.6839f, 7.4406f, 19.1213f, 6.878f)
                    curveTo(18.5587f, 6.3154f, 17.7956f, 5.9994f, 17.0f, 5.9994f)
                    horizontalLineTo(14.915f)
                    lineTo(9.915f, 0.9994f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(2.9994f)
                    horizontalLineTo(9.086f)
                    lineTo(12.086f, 5.9994f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 5.9994f, 1.4413f, 6.3154f, 0.8787f, 6.878f)
                    curveTo(0.3161f, 7.4406f, 0.0f, 8.2037f, 0.0f, 8.9994f)
                    lineTo(0.0f, 23.9994f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(19.0104f)
                    lineTo(24.0f, 21.9924f)
                    verticalLineTo(8.0064f)
                    close()
                    moveTo(18.0f, 21.9994f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(8.9994f)
                    curveTo(2.0f, 8.7341f, 2.1054f, 8.4798f, 2.2929f, 8.2922f)
                    curveTo(2.4804f, 8.1047f, 2.7348f, 7.9994f, 3.0f, 7.9994f)
                    horizontalLineTo(17.0f)
                    curveTo(17.2652f, 7.9994f, 17.5196f, 8.1047f, 17.7071f, 8.2922f)
                    curveTo(17.8946f, 8.4798f, 18.0f, 8.7341f, 18.0f, 8.9994f)
                    verticalLineTo(21.9994f)
                    close()
                    moveTo(22.0f, 18.0064f)
                    lineTo(20.0f, 16.5154f)
                    verticalLineTo(13.4834f)
                    lineTo(22.0f, 11.9924f)
                    verticalLineTo(18.0064f)
                    close()
                }
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
