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

public val Icons.Bold.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 9.0f)
                    curveTo(18.0f, 6.613f, 17.0518f, 4.3239f, 15.364f, 2.636f)
                    curveTo(13.6761f, 0.9482f, 11.3869f, 0.0f, 9.0f, 0.0f)
                    curveTo(6.613f, 0.0f, 4.3239f, 0.9482f, 2.636f, 2.636f)
                    curveTo(0.9482f, 4.3239f, 0.0f, 6.613f, 0.0f, 9.0f)
                    lineTo(0.0f, 18.0f)
                    horizontalLineTo(9.0f)
                    curveTo(11.3861f, 17.9974f, 13.6738f, 17.0483f, 15.361f, 15.361f)
                    curveTo(17.0483f, 13.6738f, 17.9974f, 11.3861f, 18.0f, 9.0f)
                    close()
                    moveTo(9.0f, 15.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.0f)
                    curveTo(3.0f, 7.8133f, 3.3519f, 6.6533f, 4.0112f, 5.6666f)
                    curveTo(4.6705f, 4.6799f, 5.6075f, 3.9109f, 6.7039f, 3.4567f)
                    curveTo(7.8003f, 3.0026f, 9.0067f, 2.8838f, 10.1705f, 3.1153f)
                    curveTo(11.3344f, 3.3468f, 12.4035f, 3.9182f, 13.2426f, 4.7574f)
                    curveTo(14.0818f, 5.5965f, 14.6532f, 6.6656f, 14.8847f, 7.8295f)
                    curveTo(15.1162f, 8.9933f, 14.9974f, 10.1997f, 14.5433f, 11.2961f)
                    curveTo(14.0892f, 12.3925f, 13.3201f, 13.3295f, 12.3334f, 13.9888f)
                    curveTo(11.3467f, 14.6481f, 10.1867f, 15.0f, 9.0f, 15.0f)
                    close()
                    moveTo(24.0f, 16.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(16.0f)
                    curveTo(14.5971f, 23.9986f, 13.2192f, 23.6282f, 12.0047f, 22.9262f)
                    curveTo(10.7901f, 22.2241f, 9.7815f, 21.215f, 9.08f, 20.0f)
                    curveTo(10.2085f, 19.9921f, 11.3291f, 19.81f, 12.402f, 19.46f)
                    curveTo(12.8665f, 19.9465f, 13.4249f, 20.3338f, 14.0433f, 20.5985f)
                    curveTo(14.6617f, 20.8632f, 15.3273f, 20.9998f, 16.0f, 21.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(16.0f)
                    curveTo(20.9995f, 15.3267f, 20.8624f, 14.6605f, 20.5971f, 14.0417f)
                    curveTo(20.3317f, 13.4229f, 19.9435f, 12.8644f, 19.456f, 12.4f)
                    curveTo(19.8071f, 11.3279f, 19.9906f, 10.2081f, 20.0f, 9.08f)
                    curveTo(21.215f, 9.7815f, 22.2241f, 10.7901f, 22.9262f, 12.0047f)
                    curveTo(23.6282f, 13.2192f, 23.9986f, 14.5971f, 24.0f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
