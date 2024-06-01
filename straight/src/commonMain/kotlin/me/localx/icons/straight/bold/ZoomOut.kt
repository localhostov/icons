package me.localx.icons.straight.bold

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

public val Icons.Bold.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 9.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9135f, 16.7981f)
                    curveTo(22.386f, 12.1575f, 21.4391f, 5.5805f, 16.7985f, 2.108f)
                    curveTo(12.1579f, -1.3645f, 5.5809f, -0.4176f, 2.1084f, 4.223f)
                    curveTo(-1.3641f, 8.8637f, -0.4172f, 15.4406f, 4.2234f, 18.9131f)
                    curveTo(7.9511f, 21.7025f, 13.0708f, 21.7025f, 16.7985f, 18.9131f)
                    lineTo(21.877f, 23.9916f)
                    lineTo(23.992f, 21.8806f)
                    lineTo(18.9135f, 16.7981f)
                    close()
                    moveTo(10.5489f, 18.0169f)
                    curveTo(6.4243f, 18.0169f, 3.0805f, 14.6732f, 3.0805f, 10.5485f)
                    curveTo(3.0805f, 6.4239f, 6.4243f, 3.0801f, 10.5489f, 3.0801f)
                    curveTo(14.6736f, 3.0801f, 18.0173f, 6.4239f, 18.0173f, 10.5485f)
                    curveTo(18.0135f, 14.6716f, 14.672f, 18.0131f, 10.5489f, 18.0169f)
                    close()
                }
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
