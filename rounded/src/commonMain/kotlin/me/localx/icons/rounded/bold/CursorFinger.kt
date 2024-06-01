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

public val Icons.Bold.CursorFinger: ImageVector
    get() {
        if (_cursorFinger != null) {
            return _cursorFinger!!
        }
        _cursorFinger = Builder(name = "CursorFinger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.5782f, 9.053f)
                    lineTo(14.0002f, 8.337f)
                    verticalLineTo(4.0f)
                    curveTo(14.0002f, 2.9391f, 13.5788f, 1.9217f, 12.8287f, 1.1716f)
                    curveTo(12.0785f, 0.4214f, 11.0611f, 0.0f, 10.0002f, 0.0f)
                    curveTo(8.9394f, 0.0f, 7.9219f, 0.4214f, 7.1718f, 1.1716f)
                    curveTo(6.4216f, 1.9217f, 6.0002f, 2.9391f, 6.0002f, 4.0f)
                    verticalLineTo(8.45f)
                    lineTo(2.2782f, 12.973f)
                    curveTo(1.4151f, 13.9834f, 0.963f, 15.2811f, 1.0115f, 16.6091f)
                    curveTo(1.06f, 17.937f, 1.6056f, 19.1983f, 2.5402f, 20.143f)
                    lineTo(4.7402f, 22.367f)
                    curveTo(5.2528f, 22.8826f, 5.8619f, 23.2922f, 6.5328f, 23.5724f)
                    curveTo(7.2037f, 23.8526f, 7.9232f, 23.9979f, 8.6502f, 24.0f)
                    horizontalLineTo(16.5002f)
                    curveTo(17.9584f, 23.9984f, 19.3565f, 23.4184f, 20.3876f, 22.3873f)
                    curveTo(21.4187f, 21.3562f, 21.9986f, 19.9582f, 22.0002f, 18.5f)
                    verticalLineTo(14.446f)
                    curveTo(21.9977f, 13.1751f, 21.5562f, 11.9442f, 20.7504f, 10.9614f)
                    curveTo(19.9446f, 9.9787f, 18.824f, 9.3045f, 17.5782f, 9.053f)
                    close()
                    moveTo(19.0002f, 18.5f)
                    curveTo(19.0002f, 19.163f, 18.7368f, 19.7989f, 18.268f, 20.2678f)
                    curveTo(17.7992f, 20.7366f, 17.1633f, 21.0f, 16.5002f, 21.0f)
                    horizontalLineTo(8.6502f)
                    curveTo(7.9827f, 20.9978f, 7.3433f, 20.731f, 6.8722f, 20.258f)
                    lineTo(4.6722f, 18.028f)
                    curveTo(4.2662f, 17.6149f, 4.031f, 17.0639f, 4.0135f, 16.4849f)
                    curveTo(3.9961f, 15.906f, 4.1978f, 15.3417f, 4.5782f, 14.905f)
                    lineTo(6.0002f, 13.171f)
                    verticalLineTo(16.5f)
                    curveTo(6.0002f, 16.8978f, 6.1583f, 17.2794f, 6.4396f, 17.5607f)
                    curveTo(6.7209f, 17.842f, 7.1024f, 18.0f, 7.5002f, 18.0f)
                    curveTo(7.898f, 18.0f, 8.2796f, 17.842f, 8.5609f, 17.5607f)
                    curveTo(8.8422f, 17.2794f, 9.0002f, 16.8978f, 9.0002f, 16.5f)
                    verticalLineTo(4.0f)
                    curveTo(9.0002f, 3.7348f, 9.1056f, 3.4804f, 9.2931f, 3.2929f)
                    curveTo(9.4806f, 3.1054f, 9.735f, 3.0f, 10.0002f, 3.0f)
                    curveTo(10.2654f, 3.0f, 10.5198f, 3.1054f, 10.7073f, 3.2929f)
                    curveTo(10.8949f, 3.4804f, 11.0002f, 3.7348f, 11.0002f, 4.0f)
                    verticalLineTo(9.566f)
                    curveTo(11.0002f, 9.9128f, 11.1204f, 10.2489f, 11.3402f, 10.5171f)
                    curveTo(11.5601f, 10.7853f, 11.8661f, 10.969f, 12.2062f, 11.037f)
                    lineTo(16.9902f, 11.994f)
                    curveTo(17.5564f, 12.1087f, 18.0656f, 12.4153f, 18.4318f, 12.8621f)
                    curveTo(18.7981f, 13.3088f, 18.9988f, 13.8683f, 19.0002f, 14.446f)
                    verticalLineTo(18.5f)
                    close()
                }
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
