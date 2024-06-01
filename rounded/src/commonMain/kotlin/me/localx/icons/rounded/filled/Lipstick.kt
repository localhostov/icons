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

public val Icons.Filled.Lipstick: ImageVector
    get() {
        if (_lipstick != null) {
            return _lipstick!!
        }
        _lipstick = Builder(name = "Lipstick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0001f, 24.0003f)
                    horizontalLineTo(10.0001f)
                    curveTo(8.6745f, 23.9987f, 7.4037f, 23.4714f, 6.4663f, 22.5341f)
                    curveTo(5.529f, 21.5967f, 5.0017f, 20.3259f, 5.0001f, 19.0003f)
                    verticalLineTo(17.0003f)
                    curveTo(5.0001f, 16.2046f, 5.3162f, 15.4416f, 5.8788f, 14.879f)
                    curveTo(6.4414f, 14.3164f, 7.2045f, 14.0003f, 8.0001f, 14.0003f)
                    horizontalLineTo(16.0001f)
                    curveTo(16.7958f, 14.0003f, 17.5588f, 14.3164f, 18.1214f, 14.879f)
                    curveTo(18.6841f, 15.4416f, 19.0001f, 16.2046f, 19.0001f, 17.0003f)
                    verticalLineTo(19.0003f)
                    curveTo(18.9985f, 20.3259f, 18.4712f, 21.5967f, 17.5339f, 22.5341f)
                    curveTo(16.5966f, 23.4714f, 15.3257f, 23.9987f, 14.0001f, 24.0003f)
                    close()
                    moveTo(17.0001f, 12.0003f)
                    verticalLineTo(10.0003f)
                    curveTo(17.0001f, 9.7351f, 16.8948f, 9.4807f, 16.7072f, 9.2932f)
                    curveTo(16.5197f, 9.1056f, 16.2653f, 9.0003f, 16.0001f, 9.0003f)
                    horizontalLineTo(8.0001f)
                    curveTo(7.7349f, 9.0003f, 7.4805f, 9.1056f, 7.293f, 9.2932f)
                    curveTo(7.1055f, 9.4807f, 7.0001f, 9.7351f, 7.0001f, 10.0003f)
                    verticalLineTo(12.0003f)
                    horizontalLineTo(17.0001f)
                    close()
                    moveTo(15.0001f, 7.0003f)
                    verticalLineTo(1.4143f)
                    curveTo(15.0002f, 1.1735f, 14.9387f, 0.9367f, 14.8214f, 0.7264f)
                    curveTo(14.7042f, 0.5162f, 14.5352f, 0.3393f, 14.3303f, 0.2128f)
                    curveTo(14.1255f, 0.0862f, 13.8917f, 0.0141f, 13.6512f, 0.0034f)
                    curveTo(13.4107f, -0.0074f, 13.1714f, 0.0435f, 12.9561f, 0.1513f)
                    lineTo(10.3341f, 1.4623f)
                    curveTo(9.9333f, 1.6626f, 9.5961f, 1.9706f, 9.3605f, 2.3517f)
                    curveTo(9.1249f, 2.7329f, 9.0001f, 3.1722f, 9.0001f, 3.6203f)
                    verticalLineTo(7.0003f)
                    horizontalLineTo(15.0001f)
                    close()
                }
            }
        }
        .build()
        return _lipstick!!
    }

private var _lipstick: ImageVector? = null
