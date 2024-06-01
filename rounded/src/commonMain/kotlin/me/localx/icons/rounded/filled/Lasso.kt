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

public val Icons.Filled.Lasso: ImageVector
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
                    moveTo(13.0002f, 0.0f)
                    curveTo(6.9352f, 0.0f, 2.0002f, 4.037f, 2.0002f, 9.0f)
                    curveTo(2.005f, 10.0726f, 2.2385f, 11.1318f, 2.6852f, 12.107f)
                    curveTo(2.3333f, 12.5275f, 2.1061f, 13.0381f, 2.0293f, 13.5809f)
                    curveTo(1.9524f, 14.1238f, 2.0289f, 14.6773f, 2.2502f, 15.179f)
                    curveTo(0.8928f, 16.4257f, 0.0839f, 18.1589f, 2.0E-4f, 20.0f)
                    curveTo(-0.0153f, 20.5295f, 0.0776f, 21.0566f, 0.2731f, 21.5489f)
                    curveTo(0.4686f, 22.0412f, 0.7627f, 22.4883f, 1.1373f, 22.8629f)
                    curveTo(1.5118f, 23.2375f, 1.959f, 23.5315f, 2.4513f, 23.7271f)
                    curveTo(2.9436f, 23.9226f, 3.4707f, 24.0155f, 4.0002f, 24.0f)
                    curveTo(4.2654f, 24.0011f, 4.5202f, 23.8967f, 4.7084f, 23.7099f)
                    curveTo(4.8967f, 23.5232f, 5.0031f, 23.2692f, 5.0042f, 23.004f)
                    curveTo(5.0052f, 22.7388f, 4.9009f, 22.484f, 4.7141f, 22.2957f)
                    curveTo(4.5273f, 22.1074f, 4.2734f, 22.0011f, 4.0082f, 22.0f)
                    curveTo(3.7405f, 22.018f, 3.4721f, 21.9787f, 3.2208f, 21.8847f)
                    curveTo(2.9695f, 21.7907f, 2.7412f, 21.6441f, 2.5512f, 21.4548f)
                    curveTo(2.3611f, 21.2655f, 2.2136f, 21.0378f, 2.1186f, 20.7869f)
                    curveTo(2.0236f, 20.536f, 1.9832f, 20.2677f, 2.0002f, 20.0f)
                    curveTo(2.0903f, 18.6815f, 2.6947f, 17.4512f, 3.6832f, 16.574f)
                    curveTo(4.7958f, 16.9019f, 5.9539f, 17.0487f, 7.1132f, 17.009f)
                    curveTo(7.4132f, 17.009f, 7.6902f, 17.002f, 7.9562f, 16.993f)
                    curveTo(9.554f, 17.66f, 11.2687f, 18.0023f, 13.0002f, 18.0f)
                    curveTo(19.0652f, 18.0f, 24.0002f, 13.963f, 24.0002f, 9.0f)
                    curveTo(24.0002f, 4.037f, 19.0652f, 0.0f, 13.0002f, 0.0f)
                    close()
                    moveTo(13.0002f, 16.0f)
                    curveTo(11.6657f, 15.9991f, 10.3422f, 15.7579f, 9.0932f, 15.288f)
                    curveTo(8.5882f, 14.0648f, 7.9176f, 12.9167f, 7.1002f, 11.876f)
                    curveTo(6.7484f, 11.5372f, 6.3202f, 11.2881f, 5.8518f, 11.1497f)
                    curveTo(5.3834f, 11.0113f, 4.8886f, 10.9878f, 4.4092f, 11.081f)
                    curveTo(4.14f, 10.4202f, 4.0011f, 9.7135f, 4.0002f, 9.0f)
                    curveTo(4.0002f, 5.141f, 8.0372f, 2.0f, 13.0002f, 2.0f)
                    curveTo(17.9632f, 2.0f, 22.0002f, 5.141f, 22.0002f, 9.0f)
                    curveTo(22.0002f, 12.859f, 17.9632f, 16.0f, 13.0002f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
