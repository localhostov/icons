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

public val Icons.Outline.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.459f, 8.1001f)
                    lineTo(15.535f, 1.4641f)
                    curveTo(14.5966f, 0.5356f, 13.3307f, 0.0136f, 12.0106f, 0.0108f)
                    curveTo(10.6905f, 0.0079f, 9.4223f, 0.5246f, 8.48f, 1.4491f)
                    lineTo(1.54f, 8.1001f)
                    curveTo(1.0546f, 8.5676f, 0.6682f, 9.1279f, 0.4036f, 9.7477f)
                    curveTo(0.1391f, 10.3675f, 0.0018f, 11.0342f, 0.0f, 11.7081f)
                    lineTo(0.0f, 19.0001f)
                    curveTo(0.0016f, 20.3257f, 0.5289f, 21.5966f, 1.4662f, 22.5339f)
                    curveTo(2.4036f, 23.4712f, 3.6744f, 23.9985f, 5.0f, 24.0001f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9985f, 21.5964f, 23.4712f, 22.5338f, 22.5339f)
                    curveTo(23.4711f, 21.5966f, 23.9984f, 20.3257f, 24.0f, 19.0001f)
                    verticalLineTo(11.7081f)
                    curveTo(23.9982f, 11.0341f, 23.8609f, 10.3673f, 23.5962f, 9.7475f)
                    curveTo(23.3314f, 9.1277f, 22.9447f, 8.5674f, 22.459f, 8.1001f)
                    close()
                    moveTo(9.879f, 2.8781f)
                    curveTo(10.446f, 2.3161f, 11.213f, 2.0021f, 12.0113f, 2.0051f)
                    curveTo(12.8097f, 2.0081f, 13.5742f, 2.3279f, 14.137f, 2.8941f)
                    lineTo(20.884f, 9.3581f)
                    lineTo(14.121f, 16.1221f)
                    curveTo(13.5493f, 16.6671f, 12.7898f, 16.9711f, 12.0f, 16.9711f)
                    curveTo(11.2102f, 16.9711f, 10.4507f, 16.6671f, 9.879f, 16.1221f)
                    lineTo(3.115f, 9.3581f)
                    lineTo(9.879f, 2.8781f)
                    close()
                    moveTo(22.0f, 19.0001f)
                    curveTo(22.0f, 19.7958f, 21.6839f, 20.5588f, 21.1213f, 21.1214f)
                    curveTo(20.5587f, 21.684f, 19.7956f, 22.0001f, 19.0f, 22.0001f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 22.0001f, 3.4413f, 21.684f, 2.8787f, 21.1214f)
                    curveTo(2.3161f, 20.5588f, 2.0f, 19.7958f, 2.0f, 19.0001f)
                    verticalLineTo(11.7081f)
                    curveTo(2.001f, 11.514f, 2.0208f, 11.3204f, 2.059f, 11.1301f)
                    lineTo(8.465f, 17.5361f)
                    curveTo(9.4057f, 18.4676f, 10.6761f, 18.9902f, 12.0f, 18.9902f)
                    curveTo(13.3239f, 18.9902f, 14.5943f, 18.4676f, 15.535f, 17.5361f)
                    lineTo(21.941f, 11.1301f)
                    curveTo(21.9792f, 11.3204f, 21.999f, 11.514f, 22.0f, 11.7081f)
                    verticalLineTo(19.0001f)
                    close()
                }
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
