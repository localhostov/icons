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

public val Icons.Filled.ZoomOut: ImageVector
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
                    moveTo(23.7072f, 22.2931f)
                    lineTo(17.7412f, 16.3281f)
                    curveTo(19.3648f, 14.3417f, 20.1629f, 11.8073f, 19.9704f, 9.249f)
                    curveTo(19.7778f, 6.6907f, 18.6094f, 4.3043f, 16.7068f, 2.5833f)
                    curveTo(14.8042f, 0.8623f, 12.3129f, -0.0617f, 9.7482f, 0.0026f)
                    curveTo(7.1835f, 0.0668f, 4.7416f, 1.1143f, 2.9275f, 2.9284f)
                    curveTo(1.1134f, 4.7424f, 0.0659f, 7.1844f, 0.0017f, 9.7491f)
                    curveTo(-0.0625f, 12.3138f, 0.8614f, 14.8051f, 2.5824f, 16.7077f)
                    curveTo(4.3034f, 18.6103f, 6.6899f, 19.7787f, 9.2481f, 19.9712f)
                    curveTo(11.8064f, 20.1638f, 14.3408f, 19.3657f, 16.3272f, 17.7421f)
                    lineTo(22.2932f, 23.7071f)
                    curveTo(22.4818f, 23.8892f, 22.7344f, 23.99f, 22.9966f, 23.9877f)
                    curveTo(23.2588f, 23.9855f, 23.5096f, 23.8803f, 23.695f, 23.6949f)
                    curveTo(23.8804f, 23.5095f, 23.9856f, 23.2587f, 23.9879f, 22.9965f)
                    curveTo(23.9902f, 22.7343f, 23.8894f, 22.4817f, 23.7072f, 22.2931f)
                    close()
                    moveTo(13.0002f, 11.0001f)
                    horizontalLineTo(7.0002f)
                    curveTo(6.735f, 11.0001f, 6.4806f, 10.8947f, 6.2931f, 10.7072f)
                    curveTo(6.1056f, 10.5196f, 6.0002f, 10.2653f, 6.0002f, 10.0001f)
                    curveTo(6.0002f, 9.7348f, 6.1056f, 9.4805f, 6.2931f, 9.2929f)
                    curveTo(6.4806f, 9.1054f, 6.735f, 9.0001f, 7.0002f, 9.0001f)
                    horizontalLineTo(13.0002f)
                    curveTo(13.2654f, 9.0001f, 13.5198f, 9.1054f, 13.7073f, 9.2929f)
                    curveTo(13.8948f, 9.4805f, 14.0002f, 9.7348f, 14.0002f, 10.0001f)
                    curveTo(14.0002f, 10.2653f, 13.8948f, 10.5196f, 13.7073f, 10.7072f)
                    curveTo(13.5198f, 10.8947f, 13.2654f, 11.0001f, 13.0002f, 11.0001f)
                    close()
                }
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
