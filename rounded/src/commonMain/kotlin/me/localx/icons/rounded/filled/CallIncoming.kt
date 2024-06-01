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
                    moveTo(14.9999f, 7.0001f)
                    verticalLineTo(3.0001f)
                    curveTo(14.9999f, 2.7348f, 15.1053f, 2.4805f, 15.2928f, 2.2929f)
                    curveTo(15.4803f, 2.1054f, 15.7347f, 2.0001f, 15.9999f, 2.0001f)
                    curveTo(16.2651f, 2.0001f, 16.5195f, 2.1054f, 16.707f, 2.2929f)
                    curveTo(16.8946f, 2.4805f, 16.9999f, 2.7348f, 16.9999f, 3.0001f)
                    verticalLineTo(5.613f)
                    curveTo(17.6299f, 4.9811f, 21.6999f, 0.8871f, 22.2929f, 0.3001f)
                    curveTo(22.4815f, 0.1179f, 22.7341f, 0.0171f, 22.9963f, 0.0194f)
                    curveTo(23.2585f, 0.0217f, 23.5093f, 0.1268f, 23.6947f, 0.3122f)
                    curveTo(23.8801f, 0.4976f, 23.9853f, 0.7485f, 23.9876f, 1.0107f)
                    curveTo(23.9899f, 1.2729f, 23.8891f, 1.5254f, 23.7069f, 1.7141f)
                    curveTo(23.1149f, 2.3001f, 19.0639f, 6.3731f, 18.4389f, 7.0001f)
                    horizontalLineTo(20.9999f)
                    curveTo(21.2651f, 7.0001f, 21.5195f, 7.1054f, 21.707f, 7.2929f)
                    curveTo(21.8946f, 7.4805f, 21.9999f, 7.7348f, 21.9999f, 8.0f)
                    curveTo(21.9999f, 8.2653f, 21.8946f, 8.5196f, 21.707f, 8.7072f)
                    curveTo(21.5195f, 8.8947f, 21.2651f, 9.0f, 20.9999f, 9.0f)
                    horizontalLineTo(16.9999f)
                    curveTo(16.4695f, 9.0f, 15.9608f, 8.7893f, 15.5857f, 8.4143f)
                    curveTo(15.2106f, 8.0392f, 14.9999f, 7.5305f, 14.9999f, 7.0001f)
                    close()
                    moveTo(20.6549f, 14.8551f)
                    curveTo(20.0775f, 14.3057f, 19.3107f, 13.9998f, 18.5137f, 14.0009f)
                    curveTo(17.7167f, 14.002f, 16.9508f, 14.3101f, 16.3749f, 14.8611f)
                    lineTo(14.4689f, 16.4671f)
                    curveTo(12.9132f, 15.8233f, 11.5f, 14.8785f, 10.3104f, 13.687f)
                    curveTo(9.1208f, 12.4955f, 8.1782f, 11.0808f, 7.5369f, 9.524f)
                    lineTo(9.1369f, 7.6241f)
                    curveTo(9.6865f, 7.047f, 9.9935f, 6.2811f, 9.9946f, 5.4843f)
                    curveTo(9.9957f, 4.6874f, 9.6908f, 3.9206f, 9.1429f, 3.3421f)
                    curveTo(9.1429f, 3.3421f, 7.2909f, 0.9391f, 7.2599f, 0.9081f)
                    curveTo(6.6894f, 0.3338f, 5.9158f, 0.0071f, 5.1063f, -0.0015f)
                    curveTo(4.2969f, -0.0101f, 3.5166f, 0.3001f, 2.9339f, 0.8621f)
                    lineTo(1.7839f, 1.8621f)
                    curveTo(-5.9351f, 10.0721f, 13.9839f, 30.0001f, 22.1839f, 22.1621f)
                    lineTo(23.0959f, 21.1121f)
                    curveTo(23.6751f, 20.531f, 24.0004f, 19.744f, 24.0004f, 18.9236f)
                    curveTo(24.0004f, 18.1031f, 23.6751f, 17.3161f, 23.0959f, 16.7351f)
                    curveTo(23.0629f, 16.7081f, 20.6549f, 14.8561f, 20.6549f, 14.8561f)
                    verticalLineTo(14.8551f)
                    close()
                }
            }
        }
        .build()
        return _callIncoming!!
    }

private var _callIncoming: ImageVector? = null
