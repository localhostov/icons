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

public val Icons.Outline.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.229f, 0.771f)
                    curveTo(22.7564f, 0.3008f, 22.1234f, 0.027f, 21.4571f, 0.0048f)
                    curveTo(20.7908f, -0.0175f, 20.1409f, 0.2134f, 19.638f, 0.651f)
                    lineTo(5.472f, 13.133f)
                    curveTo(3.137f, 13.573f, 0.0f, 14.874f, 0.0f, 17.6f)
                    curveTo(0.0019f, 19.2968f, 0.6767f, 20.9236f, 1.8766f, 22.1234f)
                    curveTo(3.0764f, 23.3233f, 4.7032f, 23.9981f, 6.4f, 24.0f)
                    curveTo(9.125f, 24.0f, 10.427f, 20.864f, 10.867f, 18.529f)
                    lineTo(23.352f, 4.358f)
                    curveTo(23.7887f, 3.8553f, 24.0188f, 3.2058f, 23.996f, 2.5403f)
                    curveTo(23.9732f, 1.8748f, 23.6991f, 1.2426f, 23.229f, 0.771f)
                    close()
                    moveTo(10.141f, 16.327f)
                    lineTo(7.673f, 13.859f)
                    lineTo(9.678f, 12.092f)
                    lineTo(11.908f, 14.322f)
                    lineTo(10.141f, 16.327f)
                    close()
                    moveTo(6.4f, 22.0f)
                    curveTo(5.2334f, 21.9987f, 4.1151f, 21.5347f, 3.2902f, 20.7098f)
                    curveTo(2.4653f, 19.8849f, 2.0013f, 18.7665f, 2.0f, 17.6f)
                    curveTo(2.0f, 16.092f, 4.639f, 15.313f, 6.049f, 15.063f)
                    lineTo(8.937f, 17.95f)
                    curveTo(8.686f, 19.361f, 7.908f, 22.0f, 6.4f, 22.0f)
                    close()
                    moveTo(21.849f, 3.04f)
                    lineTo(13.233f, 12.818f)
                    lineTo(11.181f, 10.767f)
                    lineTo(20.956f, 2.154f)
                    curveTo(21.0764f, 2.0507f, 21.2312f, 1.9965f, 21.3897f, 2.0023f)
                    curveTo(21.5482f, 2.008f, 21.6988f, 2.0732f, 21.8114f, 2.1849f)
                    curveTo(21.924f, 2.2966f, 21.9904f, 2.4466f, 21.9973f, 2.6051f)
                    curveTo(22.0043f, 2.7636f, 21.9513f, 2.9188f, 21.849f, 3.04f)
                    close()
                }
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
