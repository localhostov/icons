package me.localx.icons.rounded.outline

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

public val Icons.Outline.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.246f, 6.193f)
                    curveTo(18.24f, 5.1048f, 18.8501f, 3.7209f, 18.983f, 2.253f)
                    curveTo(19.0215f, 1.9503f, 18.9903f, 1.6428f, 18.8917f, 1.3541f)
                    curveTo(18.7931f, 1.0653f, 18.6298f, 0.803f, 18.4142f, 0.587f)
                    curveTo(18.1986f, 0.3711f, 17.9364f, 0.2074f, 17.6478f, 0.1085f)
                    curveTo(17.3592f, 0.0095f, 17.0517f, -0.0221f, 16.749f, 0.016f)
                    curveTo(15.8385f, 0.0875f, 14.9544f, 0.3555f, 14.1575f, 0.8016f)
                    curveTo(13.3606f, 1.2477f, 12.6699f, 1.8613f, 12.133f, 2.6f)
                    curveTo(11.793f, 1.7494f, 11.3123f, 0.962f, 10.711f, 0.271f)
                    curveTo(10.5244f, 0.086f, 10.2725f, -0.0181f, 10.0097f, -0.0188f)
                    curveTo(9.747f, -0.0195f, 9.4945f, 0.0832f, 9.3069f, 0.2671f)
                    curveTo(9.1193f, 0.4511f, 9.0116f, 0.7015f, 9.0071f, 0.9642f)
                    curveTo(9.0027f, 1.2269f, 9.1017f, 1.4808f, 9.283f, 1.671f)
                    curveTo(10.2743f, 2.9054f, 10.8545f, 4.4192f, 10.942f, 6.0f)
                    horizontalLineTo(8.5f)
                    curveTo(6.1809f, 6.0709f, 3.9843f, 7.0577f, 2.3912f, 8.7445f)
                    curveTo(0.7982f, 10.4313f, -0.0617f, 12.6807f, -0.0f, 15.0f)
                    curveTo(-0.161f, 20.6f, 5.644f, 25.773f, 10.75f, 23.385f)
                    curveTo(11.1399f, 23.1371f, 11.5932f, 23.007f, 12.0553f, 23.0103f)
                    curveTo(12.5174f, 23.0137f, 12.9687f, 23.1504f, 13.355f, 23.404f)
                    curveTo(14.0078f, 23.7815f, 14.746f, 23.9866f, 15.5f, 24.0f)
                    curveTo(25.764f, 23.716f, 27.066f, 8.582f, 17.246f, 6.193f)
                    close()
                    moveTo(14.223f, 3.168f)
                    curveTo(14.9987f, 2.4897f, 15.9727f, 2.08f, 17.0f, 2.0f)
                    curveTo(16.918f, 3.0252f, 16.5089f, 3.9969f, 15.833f, 4.772f)
                    curveTo(15.0566f, 5.4499f, 14.0825f, 5.8595f, 13.055f, 5.94f)
                    curveTo(13.1362f, 4.9145f, 13.5458f, 3.9424f, 14.223f, 3.168f)
                    close()
                    moveTo(15.5f, 22.0f)
                    curveTo(15.0593f, 21.9831f, 14.6306f, 21.8518f, 14.256f, 21.619f)
                    curveTo(13.5695f, 21.2226f, 12.7926f, 21.0094f, 12.0f, 21.0f)
                    curveTo(11.2495f, 21.0175f, 10.5151f, 21.2212f, 9.863f, 21.593f)
                    curveTo(6.005f, 23.261f, 1.9f, 19.141f, 2.0f, 15.0f)
                    curveTo(1.9383f, 13.211f, 2.5875f, 11.4704f, 3.8055f, 10.1587f)
                    curveTo(5.0235f, 8.847f, 6.7113f, 8.0709f, 8.5f, 8.0f)
                    horizontalLineTo(15.5f)
                    curveTo(24.1f, 8.321f, 24.1f, 21.682f, 15.5f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
