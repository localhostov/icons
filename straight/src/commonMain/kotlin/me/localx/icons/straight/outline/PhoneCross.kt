package me.localx.icons.straight.outline

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

public val Icons.Outline.PhoneCross: ImageVector
    get() {
        if (_phoneCross != null) {
            return _phoneCross!!
        }
        _phoneCross = Builder(name = "PhoneCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.2001f, 16.2614f)
                    curveTo(11.2885f, 15.0276f, 8.9731f, 12.7068f, 7.7461f, 9.7924f)
                    lineTo(11.1521f, 6.3864f)
                    lineTo(4.8871f, 0.1214f)
                    lineTo(1.7161f, 3.2914f)
                    curveTo(1.1658f, 3.8442f, 0.7307f, 4.5009f, 0.4361f, 5.2233f)
                    curveTo(0.1415f, 5.9456f, -0.0067f, 6.7193f, 1.0E-4f, 7.4994f)
                    curveTo(1.0E-4f, 14.7474f, 9.2521f, 23.9994f, 16.5001f, 23.9994f)
                    curveTo(17.2801f, 24.0063f, 18.0536f, 23.8582f, 18.7759f, 23.5637f)
                    curveTo(19.4981f, 23.2691f, 20.1546f, 22.8339f, 20.7071f, 22.2834f)
                    lineTo(23.8781f, 19.1124f)
                    lineTo(17.6131f, 12.8484f)
                    lineTo(14.2001f, 16.2614f)
                    close()
                    moveTo(19.2921f, 20.8704f)
                    curveTo(18.9246f, 21.2339f, 18.4886f, 21.521f, 18.0093f, 21.7148f)
                    curveTo(17.53f, 21.9086f, 17.0171f, 22.0053f, 16.5001f, 21.9994f)
                    curveTo(10.2661f, 21.9994f, 2.0001f, 13.7324f, 2.0001f, 7.4994f)
                    curveTo(1.9942f, 6.9822f, 2.0911f, 6.469f, 2.2851f, 5.9896f)
                    curveTo(2.479f, 5.5101f, 2.7663f, 5.0739f, 3.1301f, 4.7064f)
                    lineTo(4.8871f, 2.9494f)
                    lineTo(8.3241f, 6.3864f)
                    lineTo(5.3881f, 9.3214f)
                    lineTo(5.6341f, 9.9354f)
                    curveTo(6.3554f, 11.8647f, 7.4829f, 13.6164f, 8.9403f, 15.0719f)
                    curveTo(10.3977f, 16.5274f, 12.1509f, 17.6526f, 14.0811f, 18.3714f)
                    lineTo(14.6871f, 18.6024f)
                    lineTo(17.6131f, 15.6764f)
                    lineTo(21.0491f, 19.1124f)
                    lineTo(19.2921f, 20.8704f)
                    close()
                    moveTo(20.9141f, 4.4994f)
                    lineTo(23.9571f, 7.5424f)
                    lineTo(22.5431f, 8.9564f)
                    lineTo(19.5001f, 5.9134f)
                    lineTo(16.4571f, 8.9564f)
                    lineTo(15.0431f, 7.5424f)
                    lineTo(18.0861f, 4.4994f)
                    lineTo(15.0431f, 1.4564f)
                    lineTo(16.4571f, 0.0424f)
                    lineTo(19.5001f, 3.0854f)
                    lineTo(22.5431f, 0.0424f)
                    lineTo(23.9571f, 1.4564f)
                    lineTo(20.9141f, 4.4994f)
                    close()
                }
            }
        }
        .build()
        return _phoneCross!!
    }

private var _phoneCross: ImageVector? = null
