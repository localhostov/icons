package me.localx.icons.rounded.filled

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

public val Icons.Filled.EnvelopeOpen: ImageVector
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
                    moveTo(1.225f, 8.4671f)
                    curveTo(1.331f, 8.3441f, 8.48f, 1.4491f, 8.48f, 1.4491f)
                    curveTo(9.4223f, 0.5246f, 10.6905f, 0.0079f, 12.0106f, 0.0108f)
                    curveTo(13.3307f, 0.0136f, 14.5966f, 0.5356f, 15.535f, 1.4641f)
                    curveTo(15.535f, 1.4641f, 22.669f, 8.3441f, 22.774f, 8.4641f)
                    lineTo(14.121f, 17.1181f)
                    curveTo(13.5493f, 17.6631f, 12.7898f, 17.9671f, 12.0f, 17.9671f)
                    curveTo(11.2102f, 17.9671f, 10.4507f, 17.6631f, 9.879f, 17.1181f)
                    lineTo(1.225f, 8.4671f)
                    close()
                    moveTo(15.535f, 18.5361f)
                    curveTo(14.5943f, 19.4676f, 13.3239f, 19.9902f, 12.0f, 19.9902f)
                    curveTo(10.6761f, 19.9902f, 9.4057f, 19.4676f, 8.465f, 18.5361f)
                    lineTo(0.229f, 10.3001f)
                    curveTo(0.0852f, 10.756f, 0.0081f, 11.2302f, 0.0f, 11.7081f)
                    lineTo(0.0f, 19.0001f)
                    curveTo(0.0016f, 20.3257f, 0.5289f, 21.5966f, 1.4662f, 22.5339f)
                    curveTo(2.4036f, 23.4712f, 3.6744f, 23.9985f, 5.0f, 24.0001f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9985f, 21.5964f, 23.4712f, 22.5338f, 22.5339f)
                    curveTo(23.4711f, 21.5966f, 23.9984f, 20.3257f, 24.0f, 19.0001f)
                    verticalLineTo(11.7081f)
                    curveTo(23.9919f, 11.2302f, 23.9148f, 10.756f, 23.771f, 10.3001f)
                    lineTo(15.535f, 18.5361f)
                    close()
                }
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
