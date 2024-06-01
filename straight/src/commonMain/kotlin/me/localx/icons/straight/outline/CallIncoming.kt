package me.localx.icons.straight.outline

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

public val Icons.Outline.CallIncoming: ImageVector
    get() {
        if (_callIncoming != null) {
            return _callIncoming!!
        }
        _callIncoming = Builder(name = "CallIncoming", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.2002f, 16.2611f)
                    curveTo(11.2887f, 15.0281f, 8.9734f, 12.7074f, 7.7472f, 9.7931f)
                    lineTo(11.1472f, 6.3871f)
                    lineTo(4.8872f, 0.1221f)
                    lineTo(1.7162f, 3.2921f)
                    curveTo(1.1662f, 3.8452f, 0.7313f, 4.5019f, 0.4368f, 5.2242f)
                    curveTo(0.1422f, 5.9465f, -0.0061f, 6.7201f, 2.0E-4f, 7.5001f)
                    curveTo(2.0E-4f, 14.7481f, 9.2522f, 24.0001f, 16.5002f, 24.0001f)
                    curveTo(17.2801f, 24.0067f, 18.0536f, 23.8584f, 18.7757f, 23.5638f)
                    curveTo(19.4979f, 23.2693f, 20.1544f, 22.8343f, 20.7072f, 22.2841f)
                    lineTo(23.8782f, 19.1131f)
                    lineTo(17.6132f, 12.8481f)
                    lineTo(14.2002f, 16.2611f)
                    close()
                    moveTo(19.2942f, 20.8701f)
                    curveTo(18.9264f, 21.2339f, 18.4901f, 21.5211f, 18.0104f, 21.7151f)
                    curveTo(17.5308f, 21.9091f, 17.0175f, 22.0059f, 16.5002f, 22.0001f)
                    curveTo(10.2672f, 22.0001f, 2.0002f, 13.7331f, 2.0002f, 7.5001f)
                    curveTo(1.9943f, 6.9829f, 2.0912f, 6.4697f, 2.2851f, 5.9903f)
                    curveTo(2.4791f, 5.5108f, 2.7664f, 5.0747f, 3.1302f, 4.7071f)
                    lineTo(4.8872f, 2.9501f)
                    lineTo(8.3242f, 6.3871f)
                    lineTo(5.3892f, 9.3221f)
                    lineTo(5.6342f, 9.9361f)
                    curveTo(6.3554f, 11.8654f, 7.483f, 13.6171f, 8.9403f, 15.0726f)
                    curveTo(10.3977f, 16.5281f, 12.1509f, 17.6534f, 14.0812f, 18.3721f)
                    lineTo(14.6872f, 18.6031f)
                    lineTo(17.6132f, 15.6761f)
                    lineTo(21.0502f, 19.1131f)
                    lineTo(19.2942f, 20.8701f)
                    close()
                    moveTo(15.0002f, 6.5291f)
                    verticalLineTo(2.0001f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(5.6111f)
                    curveTo(17.6612f, 4.9481f, 18.4512f, 4.1531f, 19.2392f, 3.3611f)
                    curveTo(20.6052f, 1.9871f, 21.9512f, 0.6351f, 22.5392f, 0.0431f)
                    lineTo(23.9532f, 1.4571f)
                    curveTo(23.3612f, 2.0491f, 22.0172f, 3.3991f, 20.6532f, 4.7711f)
                    curveTo(19.8782f, 5.5551f, 19.1002f, 6.3401f, 18.4392f, 7.0001f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(9.0001f)
                    horizontalLineTo(17.5002f)
                    curveTo(16.8412f, 9.0033f, 16.2078f, 8.7449f, 15.7391f, 8.2816f)
                    curveTo(15.2704f, 7.8184f, 15.0047f, 7.1881f, 15.0002f, 6.5291f)
                    close()
                }
            }
        }
        .build()
        return _callIncoming!!
    }

private var _callIncoming: ImageVector? = null
