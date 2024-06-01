package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.VideoCamera: ImageVector
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
                    moveTo(21.0f, 10.2436f)
                    verticalLineTo(19.7556f)
                    lineTo(24.0f, 21.9926f)
                    verticalLineTo(8.0066f)
                    lineTo(21.0f, 10.2436f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0f, 5.9994f)
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
                    horizontalLineTo(19.0f)
                    verticalLineTo(8.9994f)
                    curveTo(19.0f, 8.2037f, 18.6839f, 7.4406f, 18.1213f, 6.878f)
                    curveTo(17.5587f, 6.3154f, 16.7956f, 5.9994f, 16.0f, 5.9994f)
                    close()
                }
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
