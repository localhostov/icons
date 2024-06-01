package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9962f, 0.0f)
                    curveTo(12.8241f, 0.0f, 13.4953f, 0.6712f, 13.4953f, 1.4992f)
                    verticalLineTo(6.4963f)
                    curveTo(13.4953f, 7.3243f, 12.8241f, 7.9955f, 11.9962f, 7.9955f)
                    curveTo(11.1682f, 7.9955f, 10.497f, 7.3243f, 10.497f, 6.4963f)
                    verticalLineTo(1.4992f)
                    curveTo(10.497f, 0.6712f, 11.1682f, 0.0f, 11.9962f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.494f, 4.9374f)
                    curveTo(15.4867f, 5.4406f, 15.7404f, 5.9118f, 16.1646f, 6.1826f)
                    curveTo(19.9327f, 8.4849f, 21.121f, 13.4059f, 18.8187f, 17.174f)
                    curveTo(16.5164f, 20.942f, 11.5954f, 22.1304f, 7.8273f, 19.8281f)
                    curveTo(4.0592f, 17.5258f, 2.871f, 12.6048f, 5.1733f, 8.8367f)
                    curveTo(5.8311f, 7.76f, 6.7345f, 6.8543f, 7.8094f, 6.1936f)
                    curveTo(8.2409f, 5.9228f, 8.5015f, 5.4478f, 8.498f, 4.9383f)
                    curveTo(8.5003f, 4.1104f, 7.831f, 3.4373f, 7.003f, 3.435f)
                    curveTo(6.7187f, 3.4342f, 6.4399f, 3.5143f, 6.1993f, 3.666f)
                    curveTo(1.0416f, 6.8697f, -0.5425f, 13.6479f, 2.6611f, 18.8056f)
                    curveTo(5.8648f, 23.9633f, 12.643f, 25.5474f, 17.8007f, 22.3438f)
                    curveTo(22.9584f, 19.1402f, 24.5425f, 12.362f, 21.3388f, 7.2042f)
                    curveTo(20.4471f, 5.7686f, 19.2363f, 4.5578f, 17.8007f, 3.6661f)
                    curveTo(17.0981f, 3.2229f, 16.1692f, 3.4331f, 15.726f, 4.1357f)
                    curveTo(15.5746f, 4.3756f, 15.4942f, 4.6536f, 15.494f, 4.9374f)
                    close()
                }
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
