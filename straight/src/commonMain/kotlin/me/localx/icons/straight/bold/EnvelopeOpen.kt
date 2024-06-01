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

public val Icons.Bold.EnvelopeOpen: ImageVector
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
                    moveTo(22.655f, 8.1619f)
                    lineTo(15.761f, 1.5619f)
                    curveTo(14.7673f, 0.5682f, 13.4208f, 0.0082f, 12.0155f, 0.0041f)
                    curveTo(10.6103f, -1.0E-4f, 9.2605f, 0.5521f, 8.261f, 1.5399f)
                    lineTo(1.346f, 8.1619f)
                    curveTo(0.9213f, 8.5696f, 0.5832f, 9.0588f, 0.3519f, 9.6002f)
                    curveTo(0.1207f, 10.1417f, 0.001f, 10.7242f, 0.0f, 11.3129f)
                    lineTo(0.0f, 23.9999f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(11.3129f)
                    curveTo(23.999f, 10.7242f, 23.8794f, 10.1418f, 23.6483f, 9.6005f)
                    curveTo(23.4172f, 9.0591f, 23.0794f, 8.5698f, 22.655f, 8.1619f)
                    close()
                    moveTo(10.36f, 3.6789f)
                    curveTo(10.5778f, 3.4631f, 10.8361f, 3.2925f, 11.12f, 3.1768f)
                    curveTo(11.404f, 3.061f, 11.708f, 3.0025f, 12.0146f, 3.0046f)
                    curveTo(12.3212f, 3.0066f, 12.6243f, 3.0692f, 12.9067f, 3.1887f)
                    curveTo(13.1891f, 3.3082f, 13.4451f, 3.4822f, 13.66f, 3.7009f)
                    lineTo(19.583f, 9.3759f)
                    lineTo(13.64f, 15.3209f)
                    curveTo(13.1981f, 15.7425f, 12.6108f, 15.9777f, 12.0f, 15.9777f)
                    curveTo(11.3892f, 15.9777f, 10.8019f, 15.7425f, 10.36f, 15.3209f)
                    lineTo(4.415f, 9.3759f)
                    lineTo(10.36f, 3.6789f)
                    close()
                    moveTo(3.0f, 20.9999f)
                    verticalLineTo(12.1999f)
                    lineTo(8.239f, 17.4399f)
                    curveTo(9.2366f, 18.4371f, 10.5894f, 18.9973f, 12.0f, 18.9973f)
                    curveTo(13.4106f, 18.9973f, 14.7634f, 18.4371f, 15.761f, 17.4399f)
                    lineTo(21.0f, 12.1999f)
                    verticalLineTo(20.9999f)
                    horizontalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
