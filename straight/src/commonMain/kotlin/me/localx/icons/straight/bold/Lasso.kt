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

public val Icons.Bold.Lasso: ImageVector
    get() {
        if (_lasso != null) {
            return _lasso!!
        }
        _lasso = Builder(name = "Lasso", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0f, 0.0f)
                    curveTo(6.729f, 0.0f, 2.0f, 4.084f, 2.0f, 9.5f)
                    curveTo(2.0024f, 10.0601f, 2.0587f, 10.6187f, 2.168f, 11.168f)
                    curveTo(1.6075f, 11.7286f, 1.2269f, 12.4437f, 1.0749f, 13.2218f)
                    curveTo(0.923f, 13.9999f, 1.0066f, 14.8057f, 1.315f, 15.536f)
                    curveTo(0.4591f, 16.6802f, -0.0023f, 18.0712f, 0.0f, 19.5f)
                    curveTo(-0.0176f, 20.0957f, 0.0868f, 20.6887f, 0.3068f, 21.2426f)
                    curveTo(0.5267f, 21.7966f, 0.8575f, 22.2997f, 1.2789f, 22.7211f)
                    curveTo(1.7004f, 23.1425f, 2.2035f, 23.4733f, 2.7574f, 23.6933f)
                    curveTo(3.3113f, 23.9132f, 3.9043f, 24.0176f, 4.5f, 24.0f)
                    lineTo(4.518f, 21.0f)
                    curveTo(4.3149f, 21.0217f, 4.1095f, 20.9979f, 3.9168f, 20.9304f)
                    curveTo(3.724f, 20.863f, 3.5486f, 20.7535f, 3.4033f, 20.61f)
                    curveTo(3.258f, 20.4664f, 3.1465f, 20.2923f, 3.0767f, 20.1004f)
                    curveTo(3.007f, 19.9084f, 2.9808f, 19.7033f, 3.0f, 19.5f)
                    curveTo(3.0001f, 18.8096f, 3.196f, 18.1335f, 3.565f, 17.55f)
                    curveTo(4.8808f, 17.8934f, 6.2386f, 18.0493f, 7.598f, 18.013f)
                    curveTo(7.732f, 18.013f, 7.857f, 18.004f, 7.991f, 18.002f)
                    curveTo(9.5764f, 18.6687f, 11.2802f, 19.0082f, 13.0f, 19.0f)
                    curveTo(19.271f, 19.0f, 24.0f, 14.916f, 24.0f, 9.5f)
                    curveTo(24.0f, 4.084f, 19.271f, 0.0f, 13.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(13.0f, 16.0f)
                    curveTo(12.1294f, 16.002f, 11.2621f, 15.8931f, 10.419f, 15.676f)
                    curveTo(9.7606f, 14.0598f, 8.8812f, 12.5426f, 7.806f, 11.168f)
                    curveTo(7.063f, 10.4442f, 6.0662f, 10.0401f, 5.029f, 10.042f)
                    curveTo(5.012f, 9.863f, 5.0f, 9.682f, 5.0f, 9.5f)
                    curveTo(5.0f, 5.794f, 8.439f, 3.0f, 13.0f, 3.0f)
                    curveTo(17.561f, 3.0f, 21.0f, 5.794f, 21.0f, 9.5f)
                    curveTo(21.0f, 13.206f, 17.561f, 16.0f, 13.0f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
