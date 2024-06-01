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
                    curveTo(21.4813f, 11.0002f, 21.0305f, 10.841f, 20.669f, 10.549f)
                    lineTo(19.5f, 9.613f)
                    lineTo(18.331f, 10.549f)
                    curveTo(18.0293f, 10.7899f, 17.6658f, 10.9408f, 17.2822f, 10.9844f)
                    curveTo(16.8986f, 11.0279f, 16.5105f, 10.9622f, 16.1625f, 10.795f)
                    curveTo(15.8145f, 10.6278f, 15.5209f, 10.3657f, 15.3152f, 10.039f)
                    curveTo(15.1095f, 9.7122f, 15.0003f, 9.3341f, 15.0f, 8.948f)
                    verticalLineTo(2.0f)
                    curveTo(15.0f, 1.4696f, 15.2107f, 0.9609f, 15.5858f, 0.5858f)
                    curveTo(15.9609f, 0.2107f, 16.4696f, 0.0f, 17.0f, 0.0f)
                    lineTo(22.0f, 0.0f)
                    curveTo(22.5304f, 0.0f, 23.0391f, 0.2107f, 23.4142f, 0.5858f)
                    curveTo(23.7893f, 0.9609f, 24.0f, 1.4696f, 24.0f, 2.0f)
                    verticalLineTo(8.948f)
                    curveTo(23.9987f, 9.4922f, 23.7818f, 10.0136f, 23.3968f, 10.3982f)
                    curveTo(23.0118f, 10.7828f, 22.4902f, 10.9992f, 21.946f, 11.0f)
                    close()
                    moveTo(12.0f, 15.422f)
                    curveTo(12.7955f, 15.4229f, 13.5588f, 15.1078f, 14.122f, 14.546f)
                    lineTo(15.869f, 12.8f)
                    curveTo(15.0257f, 12.577f, 14.2828f, 12.0747f, 13.7617f, 11.3751f)
                    curveTo(13.2407f, 10.6755f, 12.9721f, 9.8199f, 13.0f, 8.948f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.1432f, 3.0023f, 3.3015f, 3.2254f, 2.556f, 3.6477f)
                    curveTo(1.8105f, 4.07f, 1.1865f, 4.6773f, 0.744f, 5.411f)
                    lineTo(9.878f, 14.546f)
                    curveTo(10.4412f, 15.1078f, 11.2045f, 15.4229f, 12.0f, 15.422f)
                    close()
                    moveTo(23.7f, 12.6f)
                    curveTo(23.0286f, 12.9224f, 22.2812f, 13.0533f, 21.5402f, 12.9783f)
                    curveTo(20.7992f, 12.9033f, 20.0932f, 12.6254f, 19.5f, 12.175f)
                    curveTo(19.4604f, 12.154f, 19.4193f, 12.136f, 19.377f, 12.121f)
                    lineTo(15.536f, 15.96f)
                    curveTo(14.5972f, 16.896f, 13.3257f, 17.4216f, 12.0f, 17.4216f)
                    curveTo(10.6743f, 17.4216f, 9.4028f, 16.896f, 8.464f, 15.96f)
                    lineTo(0.046f, 7.542f)
                    curveTo(0.032f, 7.7f, 0.0f, 7.843f, 0.0f, 8.0f)
                    verticalLineTo(19.0f)
                    curveTo(0.0016f, 20.3256f, 0.5289f, 21.5964f, 1.4662f, 22.5338f)
                    curveTo(2.4036f, 23.4711f, 3.6744f, 23.9984f, 5.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9984f, 21.5964f, 23.4711f, 22.5338f, 22.5338f)
                    curveTo(23.4711f, 21.5964f, 23.9984f, 20.3256f, 24.0f, 19.0f)
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
