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

public val Icons.Filled.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.1452f, 0.0607f)
                    curveTo(15.9209f, 0.3227f, 18.5182f, 1.5448f, 20.4896f, 3.5162f)
                    curveTo(22.4611f, 5.4876f, 23.6831f, 8.085f, 23.9452f, 10.8607f)
                    curveTo(22.4697f, 11.1178f, 20.9541f, 11.0161f, 19.5262f, 10.5643f)
                    curveTo(18.0983f, 10.1125f, 16.8001f, 9.3238f, 15.7411f, 8.2648f)
                    curveTo(14.682f, 7.2058f, 13.8934f, 5.9075f, 13.4416f, 4.4796f)
                    curveTo(12.9897f, 3.0517f, 12.8881f, 1.5361f, 13.1452f, 0.0607f)
                    close()
                    moveTo(8.2762f, 15.7237f)
                    curveTo(7.2163f, 14.6637f, 5.9153f, 13.8763f, 4.4846f, 13.4289f)
                    curveTo(3.0539f, 12.9815f, 1.5362f, 12.8874f, 0.0612f, 13.1547f)
                    curveTo(0.3258f, 15.9254f, 1.5471f, 18.5175f, 3.5152f, 20.4856f)
                    curveTo(5.4833f, 22.4538f, 8.0754f, 23.6751f, 10.8462f, 23.9397f)
                    curveTo(11.1131f, 22.4645f, 11.0187f, 20.9465f, 10.5711f, 19.5158f)
                    curveTo(10.1236f, 18.085f, 9.3361f, 16.7838f, 8.2762f, 15.7237f)
                    close()
                    moveTo(22.3572f, 13.0007f)
                    curveTo(20.7315f, 13.0014f, 19.1247f, 12.6524f, 17.6457f, 11.9774f)
                    curveTo(16.1668f, 11.3024f, 14.8503f, 10.3172f, 13.7857f, 9.0886f)
                    curveTo(12.7211f, 7.86f, 11.9333f, 6.4167f, 11.4756f, 4.8568f)
                    curveTo(11.0179f, 3.2968f, 10.9011f, 1.6567f, 11.1332f, 0.0477f)
                    curveTo(8.257f, 0.2463f, 5.5498f, 1.4792f, 3.512f, 3.5187f)
                    curveTo(1.4742f, 5.5582f, 0.2435f, 8.2663f, 0.0472f, 11.1427f)
                    curveTo(1.7903f, 10.878f, 3.5713f, 11.0268f, 5.2463f, 11.577f)
                    curveTo(6.9214f, 12.1272f, 8.4437f, 13.0635f, 9.6903f, 14.3103f)
                    curveTo(10.937f, 15.557f, 11.8731f, 17.0794f, 12.4232f, 18.7545f)
                    curveTo(12.9733f, 20.4296f, 13.122f, 22.2105f, 12.8572f, 23.9537f)
                    curveTo(15.7331f, 23.7586f, 18.4413f, 22.5294f, 20.4815f, 20.4931f)
                    curveTo(22.5218f, 18.4569f, 23.7564f, 15.7512f, 23.9572f, 12.8757f)
                    curveTo(23.4274f, 12.9547f, 22.8928f, 12.9964f, 22.3572f, 13.0007f)
                    close()
                }
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
