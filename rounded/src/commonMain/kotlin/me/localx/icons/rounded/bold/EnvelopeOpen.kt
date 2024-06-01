package me.localx.icons.rounded.bold

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
                    moveTo(22.306f, 7.8271f)
                    lineTo(15.761f, 1.5571f)
                    curveTo(14.7672f, 0.5636f, 13.4206f, 0.0037f, 12.0153f, -2.0E-4f)
                    curveTo(10.6101f, -0.0042f, 9.2604f, 0.5482f, 8.261f, 1.5361f)
                    lineTo(1.694f, 7.8271f)
                    curveTo(1.1594f, 8.3417f, 0.7339f, 8.9587f, 0.4428f, 9.6413f)
                    curveTo(0.1518f, 10.3239f, 0.0012f, 11.0581f, 0.0f, 11.8001f)
                    lineTo(0.0f, 18.5001f)
                    curveTo(0.0016f, 19.9583f, 0.5816f, 21.3563f, 1.6127f, 22.3874f)
                    curveTo(2.6438f, 23.4186f, 4.0418f, 23.9985f, 5.5f, 24.0001f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9582f, 23.9985f, 21.3562f, 23.4186f, 22.3873f, 22.3874f)
                    curveTo(23.4184f, 21.3563f, 23.9984f, 19.9583f, 24.0f, 18.5001f)
                    verticalLineTo(11.8001f)
                    curveTo(23.9988f, 11.0581f, 23.8482f, 10.3239f, 23.5571f, 9.6413f)
                    curveTo(23.2661f, 8.9587f, 22.8406f, 8.3417f, 22.306f, 7.8271f)
                    close()
                    moveTo(10.36f, 3.6801f)
                    curveTo(10.5778f, 3.4643f, 10.836f, 3.2936f, 11.1199f, 3.1778f)
                    curveTo(11.4038f, 3.0619f, 11.7078f, 3.0033f, 12.0144f, 3.0053f)
                    curveTo(12.321f, 3.0072f, 12.6242f, 3.0697f, 12.9066f, 3.1891f)
                    curveTo(13.189f, 3.3085f, 13.445f, 3.4825f, 13.66f, 3.7011f)
                    lineTo(19.042f, 8.8571f)
                    lineTo(13.766f, 14.2681f)
                    curveTo(13.2897f, 14.7229f, 12.6565f, 14.9767f, 11.998f, 14.9767f)
                    curveTo(11.3395f, 14.9767f, 10.7063f, 14.7229f, 10.23f, 14.2681f)
                    lineTo(4.887f, 8.9231f)
                    lineTo(10.36f, 3.6801f)
                    close()
                    moveTo(21.0f, 18.5001f)
                    curveTo(21.0f, 19.1632f, 20.7366f, 19.799f, 20.2678f, 20.2679f)
                    curveTo(19.7989f, 20.7367f, 19.163f, 21.0001f, 18.5f, 21.0001f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 21.0001f, 4.2011f, 20.7367f, 3.7322f, 20.2679f)
                    curveTo(3.2634f, 19.799f, 3.0f, 19.1632f, 3.0f, 18.5001f)
                    verticalLineTo(11.8001f)
                    curveTo(3.0007f, 11.6412f, 3.0171f, 11.4828f, 3.049f, 11.3271f)
                    lineTo(8.111f, 16.3901f)
                    curveTo(9.1478f, 17.4179f, 10.5493f, 17.9935f, 12.0092f, 17.991f)
                    curveTo(13.4691f, 17.9886f, 14.8686f, 17.4084f, 15.902f, 16.3771f)
                    lineTo(20.926f, 11.2261f)
                    curveTo(20.9732f, 11.4139f, 20.9981f, 11.6065f, 21.0f, 11.8001f)
                    verticalLineTo(18.5001f)
                    close()
                }
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
