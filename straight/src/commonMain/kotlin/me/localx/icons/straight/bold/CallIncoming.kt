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

public val Icons.Bold.CallIncoming: ImageVector
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
                    moveTo(14.3f, 14.9231f)
                    curveTo(11.9973f, 13.8536f, 10.15f, 12.0002f, 9.088f, 9.6941f)
                    lineTo(12.052f, 6.7311f)
                    lineTo(5.41f, 0.0901f)
                    lineTo(1.766f, 3.7341f)
                    curveTo(1.2f, 4.302f, 0.7525f, 4.9767f, 0.4493f, 5.7189f)
                    curveTo(0.1462f, 6.4612f, -0.0066f, 7.2563f, 0.0f, 8.0581f)
                    curveTo(0.0f, 15.2091f, 8.791f, 24.0001f, 15.942f, 24.0001f)
                    curveTo(16.7435f, 24.0065f, 17.5383f, 23.8538f, 18.2804f, 23.5508f)
                    curveTo(19.0225f, 23.2479f, 19.697f, 22.8006f, 20.265f, 22.2351f)
                    lineTo(23.91f, 18.5901f)
                    lineTo(17.269f, 11.9481f)
                    lineTo(14.3f, 14.9231f)
                    close()
                    moveTo(18.148f, 20.1141f)
                    curveTo(17.8582f, 20.4f, 17.5145f, 20.6256f, 17.1368f, 20.7776f)
                    curveTo(16.7592f, 20.9297f, 16.3551f, 21.0053f, 15.948f, 21.0001f)
                    curveTo(10.949f, 21.0001f, 3.0f, 13.9341f, 3.0f, 8.0581f)
                    curveTo(2.995f, 7.651f, 3.0707f, 7.247f, 3.2228f, 6.8694f)
                    curveTo(3.3749f, 6.4918f, 3.6003f, 6.148f, 3.886f, 5.8581f)
                    lineTo(5.41f, 4.3321f)
                    lineTo(7.81f, 6.7321f)
                    lineTo(5.541f, 9.0001f)
                    lineTo(5.91f, 9.9191f)
                    curveTo(6.6103f, 11.791f, 7.705f, 13.4905f, 9.1198f, 14.9022f)
                    curveTo(10.5347f, 16.3139f, 12.2365f, 17.4049f, 14.11f, 18.1011f)
                    lineTo(15.019f, 18.4471f)
                    lineTo(17.274f, 16.1911f)
                    lineTo(19.674f, 18.5911f)
                    lineTo(18.148f, 20.1141f)
                    close()
                    moveTo(15.0f, 8.0001f)
                    verticalLineTo(2.5001f)
                    lineTo(17.189f, 4.6891f)
                    lineTo(21.814f, 0.0641f)
                    lineTo(23.936f, 2.1861f)
                    lineTo(19.311f, 6.8111f)
                    lineTo(21.5f, 9.0001f)
                    horizontalLineTo(16.0f)
                    curveTo(15.7348f, 9.0001f, 15.4805f, 8.8947f, 15.2929f, 8.7072f)
                    curveTo(15.1054f, 8.5197f, 15.0f, 8.2653f, 15.0f, 8.0001f)
                    close()
                }
            }
        }
        .build()
        return _callIncoming!!
    }

private var _callIncoming: ImageVector? = null
