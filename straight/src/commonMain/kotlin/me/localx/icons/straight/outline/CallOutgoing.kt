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

public val Icons.Outline.CallOutgoing: ImageVector
    get() {
        if (_callOutgoing != null) {
            return _callOutgoing!!
        }
        _callOutgoing = Builder(name = "CallOutgoing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.1999f, 16.262f)
                    curveTo(11.2886f, 15.0278f, 8.9733f, 12.7071f, 7.7459f, 9.793f)
                    lineTo(11.1519f, 6.387f)
                    lineTo(4.8869f, 0.122f)
                    lineTo(1.7159f, 3.293f)
                    curveTo(1.1657f, 3.8458f, 0.7307f, 4.5023f, 0.4362f, 5.2245f)
                    curveTo(0.1416f, 5.9466f, -0.0067f, 6.7201f, -1.0E-4f, 7.5f)
                    curveTo(-1.0E-4f, 14.748f, 9.2519f, 24.0f, 16.4999f, 24.0f)
                    curveTo(17.2798f, 24.0066f, 18.0533f, 23.8583f, 18.7754f, 23.5637f)
                    curveTo(19.4976f, 23.2692f, 20.1541f, 22.8342f, 20.7069f, 22.284f)
                    lineTo(23.8779f, 19.113f)
                    lineTo(17.6129f, 12.848f)
                    lineTo(14.1999f, 16.262f)
                    close()
                    moveTo(19.2939f, 20.87f)
                    curveTo(18.9261f, 21.2338f, 18.4898f, 21.521f, 18.0102f, 21.715f)
                    curveTo(17.5306f, 21.909f, 17.0172f, 22.0059f, 16.4999f, 22.0f)
                    curveTo(10.2669f, 22.0f, 1.9999f, 13.733f, 1.9999f, 7.5f)
                    curveTo(1.9942f, 6.9829f, 2.0911f, 6.4697f, 2.2851f, 5.9903f)
                    curveTo(2.479f, 5.5109f, 2.7662f, 5.0747f, 3.1299f, 4.707f)
                    lineTo(4.8869f, 2.95f)
                    lineTo(8.3239f, 6.387f)
                    lineTo(5.3889f, 9.322f)
                    lineTo(5.6349f, 9.936f)
                    curveTo(6.3559f, 11.8653f, 7.4833f, 13.617f, 8.9405f, 15.0725f)
                    curveTo(10.3977f, 16.528f, 12.1508f, 17.6533f, 14.0809f, 18.372f)
                    lineTo(14.6869f, 18.603f)
                    lineTo(17.6129f, 15.676f)
                    lineTo(21.0499f, 19.113f)
                    lineTo(19.2939f, 20.87f)
                    close()
                    moveTo(23.9999f, 2.5f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(3.443f)
                    lineTo(16.4089f, 9.034f)
                    lineTo(14.9999f, 7.62f)
                    lineTo(20.6149f, 2.0f)
                    horizontalLineTo(16.9999f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(21.5289f)
                    curveTo(22.1879f, 0.0045f, 22.8182f, 0.2703f, 23.2815f, 0.739f)
                    curveTo(23.7447f, 1.2076f, 24.0031f, 1.841f, 23.9999f, 2.5f)
                    close()
                }
            }
        }
        .build()
        return _callOutgoing!!
    }

private var _callOutgoing: ImageVector? = null
