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

public val Icons.Bold.EnvelopeMarker: ImageVector
    get() {
        if (_envelopeMarker != null) {
            return _envelopeMarker!!
        }
        _envelopeMarker = Builder(name = "EnvelopeMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 15.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.5f)
                    curveTo(0.0f, 5.5717f, 0.3687f, 4.6815f, 1.0251f, 4.0251f)
                    curveTo(1.6815f, 3.3688f, 2.5717f, 3.0f, 3.5f, 3.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(3.5f)
                    curveTo(3.3674f, 6.0f, 3.2402f, 6.0527f, 3.1465f, 6.1465f)
                    curveTo(3.0527f, 6.2402f, 3.0f, 6.3674f, 3.0f, 6.5f)
                    verticalLineTo(6.96f)
                    lineTo(10.361f, 14.321f)
                    curveTo(10.8025f, 14.7427f, 11.3895f, 14.978f, 12.0f, 14.978f)
                    curveTo(12.6105f, 14.978f, 13.1975f, 14.7427f, 13.639f, 14.321f)
                    lineTo(13.966f, 13.994f)
                    curveTo(14.277f, 14.3128f, 14.6487f, 14.5661f, 15.0592f, 14.7389f)
                    curveTo(15.4697f, 14.9117f, 15.9106f, 15.0005f, 16.356f, 15.0f)
                    horizontalLineTo(17.203f)
                    lineTo(15.76f, 16.442f)
                    curveTo(15.2662f, 16.936f, 14.68f, 17.3278f, 14.0348f, 17.5952f)
                    curveTo(13.3895f, 17.8625f, 12.6979f, 18.0001f, 11.9995f, 18.0001f)
                    curveTo(11.3011f, 18.0001f, 10.6095f, 17.8625f, 9.9642f, 17.5952f)
                    curveTo(9.319f, 17.3278f, 8.7328f, 16.936f, 8.239f, 16.442f)
                    lineTo(3.0f, 11.2f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(15.0f, 0.0f)
                    verticalLineTo(11.647f)
                    curveTo(15.0003f, 11.9011f, 15.0723f, 12.15f, 15.2077f, 12.3651f)
                    curveTo(15.3432f, 12.5801f, 15.5366f, 12.7525f, 15.7656f, 12.8625f)
                    curveTo(15.9947f, 12.9725f, 16.2502f, 13.0156f, 16.5027f, 12.9869f)
                    curveTo(16.7552f, 12.9581f, 16.9945f, 12.8587f, 17.193f, 12.7f)
                    lineTo(19.5f, 10.856f)
                    lineTo(21.807f, 12.7f)
                    curveTo(22.0055f, 12.8587f, 22.2448f, 12.9581f, 22.4973f, 12.9869f)
                    curveTo(22.7498f, 13.0156f, 23.0053f, 12.9725f, 23.2344f, 12.8625f)
                    curveTo(23.4634f, 12.7525f, 23.6568f, 12.5801f, 23.7923f, 12.3651f)
                    curveTo(23.9277f, 12.15f, 23.9997f, 11.9011f, 24.0f, 11.647f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(15.0f)
                    close()
                }
            }
        }
        .build()
        return _envelopeMarker!!
    }

private var _envelopeMarker: ImageVector? = null
