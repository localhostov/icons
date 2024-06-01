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

public val Icons.Filled.Bulb: ImageVector
    get() {
        if (_bulb != null) {
            return _bulb!!
        }
        _bulb = Builder(name = "Bulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.8682f, 15.5831f)
                    curveTo(4.8136f, 14.6089f, 4.0091f, 13.3949f, 3.5229f, 12.044f)
                    curveTo(3.0368f, 10.6931f, 2.8832f, 9.2449f, 3.0752f, 7.8221f)
                    curveTo(3.2651f, 6.3793f, 3.802f, 5.0041f, 4.6398f, 3.8144f)
                    curveTo(5.4777f, 2.6246f, 6.5915f, 1.6557f, 7.8859f, 0.9908f)
                    curveTo(9.1803f, 0.3259f, 10.6166f, -0.0152f, 12.0717f, -0.0034f)
                    curveTo(13.5269f, 0.0085f, 14.9574f, 0.373f, 16.2408f, 1.059f)
                    curveTo(17.5241f, 1.745f, 18.622f, 2.7318f, 19.4404f, 3.9351f)
                    curveTo(20.2587f, 5.1384f, 20.773f, 6.5222f, 20.9393f, 7.9678f)
                    curveTo(21.1056f, 9.4135f, 20.9189f, 10.8779f, 20.3952f, 12.2355f)
                    curveTo(19.8714f, 13.5932f, 19.0263f, 14.8036f, 17.9322f, 15.7631f)
                    curveTo(17.2277f, 16.3687f, 16.6807f, 17.1364f, 16.3382f, 18.0001f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(10.8161f)
                    curveTo(13.5831f, 10.61f, 14.0881f, 10.2288f, 14.4461f, 9.7247f)
                    curveTo(14.8041f, 9.2207f, 14.9977f, 8.6183f, 15.0002f, 8.0f)
                    curveTo(15.0002f, 7.7348f, 14.8949f, 7.4805f, 14.7073f, 7.2929f)
                    curveTo(14.5198f, 7.1054f, 14.2655f, 7.0001f, 14.0002f, 7.0001f)
                    curveTo(13.735f, 7.0001f, 13.4807f, 7.1054f, 13.2931f, 7.2929f)
                    curveTo(13.1056f, 7.4805f, 13.0002f, 7.7348f, 13.0002f, 8.0f)
                    curveTo(13.0002f, 8.2653f, 12.8949f, 8.5196f, 12.7073f, 8.7072f)
                    curveTo(12.5198f, 8.8947f, 12.2655f, 9.0f, 12.0002f, 9.0f)
                    curveTo(11.735f, 9.0f, 11.4807f, 8.8947f, 11.2931f, 8.7072f)
                    curveTo(11.1056f, 8.5196f, 11.0002f, 8.2653f, 11.0002f, 8.0f)
                    curveTo(11.0002f, 7.7348f, 10.8949f, 7.4805f, 10.7073f, 7.2929f)
                    curveTo(10.5198f, 7.1054f, 10.2655f, 7.0001f, 10.0002f, 7.0001f)
                    curveTo(9.735f, 7.0001f, 9.4807f, 7.1054f, 9.2931f, 7.2929f)
                    curveTo(9.1056f, 7.4805f, 9.0002f, 7.7348f, 9.0002f, 8.0f)
                    curveTo(9.0028f, 8.6183f, 9.1963f, 9.2207f, 9.5543f, 9.7247f)
                    curveTo(9.9123f, 10.2288f, 10.4173f, 10.61f, 11.0002f, 10.8161f)
                    verticalLineTo(18.0001f)
                    horizontalLineTo(7.5632f)
                    curveTo(7.1809f, 17.0806f, 6.6025f, 16.2557f, 5.8682f, 15.5831f)
                    close()
                    moveTo(8.0002f, 20.0001f)
                    verticalLineTo(20.3101f)
                    curveTo(8.0013f, 21.2884f, 8.3904f, 22.2263f, 9.0822f, 22.9181f)
                    curveTo(9.774f, 23.6099f, 10.7119f, 23.999f, 11.6902f, 24.0001f)
                    horizontalLineTo(12.3102f)
                    curveTo(13.2886f, 23.999f, 14.2265f, 23.6099f, 14.9183f, 22.9181f)
                    curveTo(15.6101f, 22.2263f, 15.9992f, 21.2884f, 16.0002f, 20.3101f)
                    verticalLineTo(20.0001f)
                    horizontalLineTo(8.0002f)
                    close()
                }
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
