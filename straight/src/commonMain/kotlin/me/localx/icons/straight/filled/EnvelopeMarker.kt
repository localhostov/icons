package me.localx.icons.straight.filled

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

public val Icons.Filled.EnvelopeMarker: ImageVector
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
                    moveTo(21.946f, 11.0f)
                    curveTo(21.4814f, 10.9997f, 21.0308f, 10.8406f, 20.669f, 10.549f)
                    lineTo(19.5f, 9.613f)
                    lineTo(18.331f, 10.549f)
                    curveTo(18.0293f, 10.7899f, 17.6658f, 10.9408f, 17.2822f, 10.9844f)
                    curveTo(16.8986f, 11.0279f, 16.5105f, 10.9622f, 16.1625f, 10.795f)
                    curveTo(15.8145f, 10.6278f, 15.5209f, 10.3657f, 15.3152f, 10.039f)
                    curveTo(15.1095f, 9.7122f, 15.0003f, 9.3341f, 15.0f, 8.948f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(8.948f)
                    curveTo(23.9987f, 9.4922f, 23.7818f, 10.0136f, 23.3968f, 10.3982f)
                    curveTo(23.0118f, 10.7828f, 22.4902f, 10.9992f, 21.946f, 11.0f)
                    close()
                    moveTo(12.0f, 15.422f)
                    curveTo(12.7955f, 15.4229f, 13.5588f, 15.1078f, 14.122f, 14.546f)
                    lineTo(15.853f, 12.815f)
                    curveTo(15.6637f, 12.7568f, 15.4789f, 12.685f, 15.3f, 12.6f)
                    curveTo(14.6088f, 12.2732f, 14.0253f, 11.756f, 13.6179f, 11.1091f)
                    curveTo(13.2105f, 10.4622f, 12.9961f, 9.7125f, 13.0f, 8.948f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.4012f, 3.0009f, 1.8163f, 3.181f, 1.3207f, 3.5171f)
                    curveTo(0.8251f, 3.8532f, 0.4414f, 4.33f, 0.219f, 4.886f)
                    lineTo(9.878f, 14.546f)
                    curveTo(10.4412f, 15.1078f, 11.2045f, 15.4229f, 12.0f, 15.422f)
                    close()
                    moveTo(23.7f, 12.6f)
                    curveTo(23.0272f, 12.9167f, 22.2809f, 13.0444f, 21.5411f, 12.9696f)
                    curveTo(20.8013f, 12.8947f, 20.0957f, 12.6201f, 19.5f, 12.175f)
                    lineTo(19.394f, 12.104f)
                    lineTo(15.536f, 15.96f)
                    curveTo(14.5974f, 16.8963f, 13.3257f, 17.422f, 12.0f, 17.422f)
                    curveTo(10.6743f, 17.422f, 9.4026f, 16.8963f, 8.464f, 15.96f)
                    lineTo(0.0f, 7.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(12.43f)
                    curveTo(23.9f, 12.487f, 23.808f, 12.548f, 23.7f, 12.6f)
                    close()
                }
            }
        }
        .build()
        return _envelopeMarker!!
    }

private var _envelopeMarker: ImageVector? = null
