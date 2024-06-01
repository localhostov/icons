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

public val Icons.Outline.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.124f, 0.8754f)
                    curveTo(22.8135f, 0.562f, 22.4368f, 0.3221f, 22.0215f, 0.1731f)
                    curveTo(21.6063f, 0.0241f, 21.1629f, -0.0301f, 20.724f, 0.0144f)
                    curveTo(18.452f, 0.2354f, 12.71f, 1.2145f, 8.461f, 5.4605f)
                    curveTo(4.7821f, 9.144f, 1.9738f, 13.6039f, 0.242f, 18.5134f)
                    lineTo(0.0f, 19.1214f)
                    lineTo(4.855f, 23.9764f)
                    lineTo(5.464f, 23.7384f)
                    curveTo(10.377f, 22.0121f, 14.8427f, 19.2106f, 18.535f, 15.5384f)
                    curveTo(22.783f, 11.2904f, 23.76f, 5.5475f, 23.981f, 3.2754f)
                    curveTo(24.0251f, 2.8369f, 23.9711f, 2.394f, 23.8229f, 1.9789f)
                    curveTo(23.6747f, 1.5638f, 23.4359f, 1.1869f, 23.124f, 0.8754f)
                    close()
                    moveTo(17.124f, 14.1244f)
                    curveTo(13.7968f, 17.4619f, 9.7761f, 20.0265f, 5.347f, 21.6364f)
                    lineTo(4.562f, 20.8514f)
                    lineTo(16.707f, 8.7065f)
                    lineTo(15.293f, 7.2924f)
                    lineTo(3.148f, 19.4374f)
                    lineTo(2.348f, 18.6374f)
                    curveTo(3.976f, 14.2179f, 6.5442f, 10.2044f, 9.875f, 6.8745f)
                    curveTo(13.667f, 3.0835f, 18.861f, 2.2055f, 20.919f, 2.0045f)
                    curveTo(21.0637f, 1.9911f, 21.2095f, 2.0097f, 21.3462f, 2.059f)
                    curveTo(21.4829f, 2.1082f, 21.6071f, 2.1869f, 21.71f, 2.2894f)
                    curveTo(21.814f, 2.3915f, 21.894f, 2.5155f, 21.9441f, 2.6523f)
                    curveTo(21.9943f, 2.7891f, 22.0134f, 2.9353f, 22.0f, 3.0805f)
                    curveTo(21.794f, 5.1385f, 20.916f, 10.3334f, 17.125f, 14.1244f)
                    horizontalLineTo(17.124f)
                    close()
                }
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
