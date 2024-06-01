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

public val Icons.Filled.HeartArrow: ImageVector
    get() {
        if (_heartArrow != null) {
            return _heartArrow!!
        }
        _heartArrow = Builder(name = "HeartArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.9999f, 17.0004f)
                    curveTo(22.7347f, 17.0004f, 22.4803f, 17.1058f, 22.2928f, 17.2933f)
                    curveTo(22.1053f, 17.4808f, 21.9999f, 17.7352f, 21.9999f, 18.0004f)
                    verticalLineTo(20.5864f)
                    lineTo(19.0059f, 17.5924f)
                    curveTo(21.1999f, 15.2504f, 22.9999f, 12.5474f, 22.9999f, 9.9874f)
                    curveTo(23.0552f, 8.4703f, 22.5077f, 6.993f, 21.4771f, 5.8783f)
                    curveTo(20.4466f, 4.7636f, 19.0167f, 4.1021f, 17.4999f, 4.0384f)
                    curveTo(16.5979f, 4.0501f, 15.7132f, 4.2881f, 14.927f, 4.7305f)
                    curveTo(14.1408f, 5.1729f, 13.4782f, 5.8055f, 12.9999f, 6.5704f)
                    curveTo(12.5217f, 5.8055f, 11.8591f, 5.1729f, 11.0728f, 4.7305f)
                    curveTo(10.2866f, 4.2881f, 9.402f, 4.0501f, 8.4999f, 4.0384f)
                    curveTo(7.6519f, 4.0409f, 6.8176f, 4.2536f, 6.0719f, 4.6574f)
                    lineTo(1.7069f, 0.2934f)
                    curveTo(1.5183f, 0.1112f, 1.2657f, 0.0105f, 1.0035f, 0.0127f)
                    curveTo(0.7413f, 0.015f, 0.4905f, 0.1202f, 0.3051f, 0.3056f)
                    curveTo(0.1197f, 0.491f, 0.0145f, 0.7418f, 0.0122f, 1.004f)
                    curveTo(0.01f, 1.2662f, 0.1108f, 1.5188f, 0.2929f, 1.7074f)
                    lineTo(4.4999f, 5.9154f)
                    curveTo(3.5248f, 7.0472f, 2.992f, 8.4935f, 2.9999f, 9.9874f)
                    curveTo(2.9999f, 13.7784f, 6.9509f, 17.8874f, 10.2649f, 20.6634f)
                    curveTo(11.0306f, 21.3077f, 11.9992f, 21.661f, 12.9999f, 21.661f)
                    curveTo(14.0006f, 21.661f, 14.9692f, 21.3077f, 15.7349f, 20.6634f)
                    curveTo(16.3429f, 20.1534f, 16.9729f, 19.5984f, 17.5959f, 19.0094f)
                    lineTo(20.5859f, 22.0004f)
                    horizontalLineTo(17.9999f)
                    curveTo(17.7347f, 22.0004f, 17.4803f, 22.1058f, 17.2928f, 22.2933f)
                    curveTo(17.1053f, 22.4808f, 16.9999f, 22.7352f, 16.9999f, 23.0004f)
                    curveTo(16.9999f, 23.2656f, 17.1053f, 23.52f, 17.2928f, 23.7075f)
                    curveTo(17.4803f, 23.8951f, 17.7347f, 24.0004f, 17.9999f, 24.0004f)
                    horizontalLineTo(21.9999f)
                    curveTo(22.5304f, 24.0004f, 23.0391f, 23.7897f, 23.4141f, 23.4146f)
                    curveTo(23.7892f, 23.0395f, 23.9999f, 22.5308f, 23.9999f, 22.0004f)
                    verticalLineTo(18.0004f)
                    curveTo(23.9999f, 17.7352f, 23.8946f, 17.4808f, 23.707f, 17.2933f)
                    curveTo(23.5195f, 17.1058f, 23.2651f, 17.0004f, 22.9999f, 17.0004f)
                    close()
                }
            }
        }
        .build()
        return _heartArrow!!
    }

private var _heartArrow: ImageVector? = null
