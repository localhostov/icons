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

public val Icons.Filled.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.832f, 18.555f)
                    lineTo(21.0f, 18.3f)
                    verticalLineTo(8.861f)
                    curveTo(18.972f, 12.658f, 15.625f, 16.0f, 12.0f, 16.0f)
                    curveTo(8.375f, 16.0f, 5.028f, 12.658f, 3.0f, 8.861f)
                    verticalLineTo(18.3f)
                    lineTo(3.168f, 18.552f)
                    curveTo(3.5798f, 19.1031f, 4.0807f, 19.5817f, 4.65f, 19.968f)
                    lineTo(3.0f, 24.0f)
                    horizontalLineTo(5.162f)
                    lineTo(6.408f, 20.954f)
                    curveTo(8.1803f, 21.6834f, 10.0839f, 22.0395f, 12.0f, 22.0f)
                    curveTo(13.9161f, 22.0395f, 15.8197f, 21.6834f, 17.592f, 20.954f)
                    lineTo(18.838f, 24.0f)
                    horizontalLineTo(21.0f)
                    lineTo(19.35f, 19.968f)
                    curveTo(19.919f, 19.5826f, 20.4199f, 19.105f, 20.832f, 18.555f)
                    close()
                    moveTo(12.0f, 20.0f)
                    curveTo(11.8022f, 20.0f, 11.6089f, 19.9414f, 11.4444f, 19.8315f)
                    curveTo(11.28f, 19.7216f, 11.1518f, 19.5654f, 11.0761f, 19.3827f)
                    curveTo(11.0004f, 19.2f, 10.9806f, 18.9989f, 11.0192f, 18.8049f)
                    curveTo(11.0578f, 18.6109f, 11.153f, 18.4327f, 11.2929f, 18.2929f)
                    curveTo(11.4327f, 18.153f, 11.6109f, 18.0578f, 11.8049f, 18.0192f)
                    curveTo(11.9989f, 17.9806f, 12.2f, 18.0004f, 12.3827f, 18.0761f)
                    curveTo(12.5654f, 18.1518f, 12.7216f, 18.28f, 12.8315f, 18.4444f)
                    curveTo(12.9413f, 18.6089f, 13.0f, 18.8022f, 13.0f, 19.0f)
                    curveTo(13.0f, 19.2652f, 12.8946f, 19.5196f, 12.7071f, 19.7071f)
                    curveTo(12.5196f, 19.8946f, 12.2652f, 20.0f, 12.0f, 20.0f)
                    close()
                    moveTo(12.0f, 14.0f)
                    curveTo(15.779f, 14.0f, 20.081f, 8.05f, 20.863f, 3.407f)
                    curveTo(20.7315f, 2.9827f, 20.5064f, 2.5934f, 20.2044f, 2.2676f)
                    curveTo(19.9024f, 1.9419f, 19.5311f, 1.6881f, 19.118f, 1.525f)
                    curveTo(16.8576f, 0.5888f, 14.4456f, 0.0721f, 12.0f, 0.0f)
                    curveTo(9.5544f, 0.072f, 7.1424f, 0.5887f, 4.882f, 1.525f)
                    curveTo(4.4688f, 1.6881f, 4.0976f, 1.9419f, 3.7956f, 2.2676f)
                    curveTo(3.4935f, 2.5934f, 3.2685f, 2.9827f, 3.137f, 3.407f)
                    curveTo(3.919f, 8.05f, 8.221f, 14.0f, 12.0f, 14.0f)
                    close()
                    moveTo(9.0f, 3.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
