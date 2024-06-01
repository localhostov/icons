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

public val Icons.Filled.CallIncoming: ImageVector
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
                    moveTo(17.6132f, 12.8481f)
                    lineTo(23.8782f, 19.1131f)
                    lineTo(20.7072f, 22.2841f)
                    curveTo(20.1544f, 22.8343f, 19.4979f, 23.2693f, 18.7757f, 23.5638f)
                    curveTo(18.0536f, 23.8584f, 17.2801f, 24.0067f, 16.5002f, 24.0001f)
                    curveTo(9.2522f, 24.0001f, 2.0E-4f, 14.7481f, 2.0E-4f, 7.5001f)
                    curveTo(-0.0061f, 6.7201f, 0.1422f, 5.9465f, 0.4368f, 5.2242f)
                    curveTo(0.7313f, 4.5019f, 1.1662f, 3.8452f, 1.7162f, 3.2921f)
                    lineTo(4.8872f, 0.1221f)
                    lineTo(11.1522f, 6.3871f)
                    lineTo(7.0272f, 10.5121f)
                    curveTo(8.2535f, 13.4264f, 10.5688f, 15.747f, 13.4802f, 16.9801f)
                    lineTo(17.6132f, 12.8481f)
                    close()
                    moveTo(17.5002f, 9.0001f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(7.0001f)
                    horizontalLineTo(18.4392f)
                    curveTo(19.0962f, 6.3401f, 23.3652f, 2.0491f, 23.9572f, 1.4571f)
                    lineTo(22.5432f, 0.0431f)
                    curveTo(21.9512f, 0.6351f, 17.6612f, 4.9481f, 17.0002f, 5.6111f)
                    verticalLineTo(2.0001f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(6.5291f)
                    curveTo(15.0047f, 7.1881f, 15.2704f, 7.8184f, 15.7391f, 8.2816f)
                    curveTo(16.2078f, 8.7449f, 16.8412f, 9.0033f, 17.5002f, 9.0001f)
                    close()
                }
            }
        }
        .build()
        return _callIncoming!!
    }

private var _callIncoming: ImageVector? = null
