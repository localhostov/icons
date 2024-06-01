package me.localx.icons.rounded.filled

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

public val Icons.Filled.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.424f, 21.0f)
                    curveTo(7.8117f, 21.8914f, 8.4512f, 22.6502f, 9.2642f, 23.1831f)
                    curveTo(10.0771f, 23.716f, 11.028f, 23.9999f, 12.0f, 23.9999f)
                    curveTo(12.9721f, 23.9999f, 13.9229f, 23.716f, 14.7359f, 23.1831f)
                    curveTo(15.5488f, 22.6502f, 16.1884f, 21.8914f, 16.576f, 21.0f)
                    horizontalLineTo(7.424f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.3921f, 12.5491f)
                    lineTo(20.6561f, 6.826f)
                    curveTo(20.1001f, 4.8244f, 18.8914f, 3.0658f, 17.2219f, 1.8296f)
                    curveTo(15.5524f, 0.5933f, 13.5177f, -0.0498f, 11.441f, 0.0023f)
                    curveTo(9.3642f, 0.0545f, 7.3644f, 0.7989f, 5.759f, 2.1175f)
                    curveTo(4.1537f, 3.436f, 3.0348f, 5.253f, 2.58f, 7.28f)
                    lineTo(1.232f, 12.8171f)
                    curveTo(1.0529f, 13.5528f, 1.0432f, 14.3196f, 1.2037f, 15.0597f)
                    curveTo(1.3642f, 15.7998f, 1.6906f, 16.4937f, 2.1585f, 17.0891f)
                    curveTo(2.6263f, 17.6846f, 3.2233f, 18.166f, 3.9044f, 18.497f)
                    curveTo(4.5854f, 18.828f, 5.3328f, 19.0f, 6.0901f, 19.0001f)
                    horizontalLineTo(17.6071f)
                    curveTo(18.3878f, 19.0001f, 19.1577f, 18.8173f, 19.8551f, 18.4663f)
                    curveTo(20.5525f, 18.1153f, 21.158f, 17.6059f, 21.6231f, 16.9788f)
                    curveTo(22.0882f, 16.3517f, 22.4f, 15.6245f, 22.5335f, 14.8552f)
                    curveTo(22.6671f, 14.086f, 22.6186f, 13.2962f, 22.3921f, 12.5491f)
                    close()
                }
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
