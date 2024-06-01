package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

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
                    moveTo(22.9f, 8.9556f)
                    curveTo(22.2246f, 8.6134f, 21.4133f, 8.6847f, 20.808f, 9.1396f)
                    lineTo(18.975f, 10.5006f)
                    curveTo(18.7151f, 7.9473f, 16.5666f, 6.0039f, 14.0f, 6.0006f)
                    horizontalLineTo(13.915f)
                    lineTo(9.793f, 1.8796f)
                    curveTo(9.2321f, 1.3147f, 8.4682f, 0.9981f, 7.672f, 1.0006f)
                    horizontalLineTo(1.0f)
                    curveTo(0.4477f, 1.0006f, 0.0f, 1.4484f, 0.0f, 2.0007f)
                    curveTo(0.0f, 2.5529f, 0.4477f, 3.0006f, 1.0f, 3.0006f)
                    horizontalLineTo(7.672f)
                    curveTo(7.9371f, 3.0013f, 8.1911f, 3.1066f, 8.379f, 3.2937f)
                    lineTo(11.086f, 6.0006f)
                    horizontalLineTo(5.0f)
                    curveTo(2.24f, 6.004f, 0.0033f, 8.2406f, 0.0f, 11.0007f)
                    verticalLineTo(19.0007f)
                    curveTo(0.0033f, 21.7607f, 2.24f, 23.9974f, 5.0f, 24.0006f)
                    horizontalLineTo(14.0f)
                    curveTo(16.5666f, 23.9974f, 18.7151f, 22.054f, 18.975f, 19.5006f)
                    lineTo(20.805f, 20.8647f)
                    curveTo(21.6886f, 21.5274f, 22.9423f, 21.3483f, 23.605f, 20.4647f)
                    curveTo(23.8646f, 20.1185f, 24.005f, 19.6974f, 24.005f, 19.2647f)
                    verticalLineTo(10.7436f)
                    curveTo(24.0076f, 9.9857f, 23.5791f, 9.2923f, 22.9f, 8.9556f)
                    close()
                    moveTo(17.0f, 19.0006f)
                    curveTo(17.0f, 20.6575f, 15.6569f, 22.0006f, 14.0f, 22.0006f)
                    horizontalLineTo(5.0f)
                    curveTo(3.3432f, 22.0006f, 2.0f, 20.6575f, 2.0f, 19.0006f)
                    verticalLineTo(11.0007f)
                    curveTo(2.0f, 9.3438f, 3.3432f, 8.0007f, 5.0f, 8.0007f)
                    horizontalLineTo(14.0f)
                    curveTo(15.6569f, 8.0007f, 17.0f, 9.3438f, 17.0f, 11.0007f)
                    verticalLineTo(19.0006f)
                    close()
                    moveTo(22.0f, 19.2576f)
                    lineTo(19.0f, 17.0217f)
                    verticalLineTo(12.9797f)
                    lineTo(22.0f, 10.7437f)
                    verticalLineTo(19.2576f)
                    close()
                }
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
