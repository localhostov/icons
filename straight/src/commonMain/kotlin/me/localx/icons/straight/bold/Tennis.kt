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

public val Icons.Bold.Tennis: ImageVector
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
                    moveTo(20.4849f, 3.5159f)
                    curveTo(18.8071f, 1.8396f, 16.6699f, 0.6984f, 14.3436f, 0.2365f)
                    curveTo(12.0173f, -0.2253f, 9.6063f, 0.0128f, 7.4154f, 0.921f)
                    curveTo(5.2244f, 1.8291f, 3.3519f, 3.3664f, 2.0344f, 5.3386f)
                    curveTo(0.717f, 7.3107f, 0.0139f, 9.6292f, 0.0139f, 12.0009f)
                    curveTo(0.0139f, 14.3726f, 0.717f, 16.6911f, 2.0344f, 18.6632f)
                    curveTo(3.3519f, 20.6354f, 5.2244f, 22.1727f, 7.4154f, 23.0808f)
                    curveTo(9.6063f, 23.989f, 12.0173f, 24.2271f, 14.3436f, 23.7653f)
                    curveTo(16.6699f, 23.3034f, 18.8071f, 22.1622f, 20.4849f, 20.4859f)
                    curveTo(22.732f, 18.2338f, 23.994f, 15.1823f, 23.994f, 12.0009f)
                    curveTo(23.994f, 8.8195f, 22.732f, 5.768f, 20.4849f, 3.5159f)
                    close()
                    moveTo(20.7609f, 9.9929f)
                    curveTo(18.9964f, 9.911f, 17.326f, 9.1733f, 16.077f, 7.9241f)
                    curveTo(14.8281f, 6.675f, 14.0905f, 5.0045f, 14.0089f, 3.2399f)
                    curveTo(15.6585f, 3.6103f, 17.1688f, 4.4417f, 18.3642f, 5.6373f)
                    curveTo(19.5596f, 6.8328f, 20.3907f, 8.3433f, 20.7609f, 9.9929f)
                    close()
                    moveTo(3.2389f, 14.0099f)
                    curveTo(5.0035f, 14.0913f, 6.674f, 14.8288f, 7.923f, 16.0778f)
                    curveTo(9.1721f, 17.3269f, 9.9095f, 18.9974f, 9.9909f, 20.7619f)
                    curveTo(8.3415f, 20.3915f, 6.8312f, 19.5603f, 5.6359f, 18.3649f)
                    curveTo(4.4405f, 17.1696f, 3.6093f, 15.6593f, 3.2389f, 14.0099f)
                    close()
                    moveTo(18.3639f, 18.3649f)
                    curveTo(16.9176f, 19.8125f, 15.0187f, 20.7207f, 12.9839f, 20.9379f)
                    curveTo(12.9528f, 18.3163f, 11.8976f, 15.8108f, 10.0438f, 13.9568f)
                    curveTo(8.1899f, 12.1028f, 5.6846f, 11.0473f, 3.0629f, 11.0159f)
                    curveTo(3.2813f, 8.9815f, 4.1893f, 7.0832f, 5.6362f, 5.6365f)
                    curveTo(7.0831f, 4.1898f, 8.9815f, 3.282f, 11.0159f, 3.0639f)
                    curveTo(11.0488f, 5.6857f, 12.1041f, 8.1909f, 13.9571f, 10.046f)
                    curveTo(15.8101f, 11.901f, 18.3142f, 12.9591f, 20.9359f, 12.9949f)
                    curveTo(20.7167f, 15.026f, 19.8091f, 16.921f, 18.3639f, 18.3649f)
                    close()
                }
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
