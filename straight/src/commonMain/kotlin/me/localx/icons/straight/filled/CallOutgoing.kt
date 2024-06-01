package me.localx.icons.straight.filled

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

public val Icons.Filled.CallOutgoing: ImageVector
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
                    moveTo(17.6129f, 12.848f)
                    lineTo(23.8779f, 19.113f)
                    lineTo(20.7069f, 22.284f)
                    curveTo(20.1541f, 22.8342f, 19.4976f, 23.2692f, 18.7754f, 23.5637f)
                    curveTo(18.0533f, 23.8583f, 17.2798f, 24.0066f, 16.4999f, 24.0f)
                    curveTo(9.2519f, 24.0f, -1.0E-4f, 14.748f, -1.0E-4f, 7.5f)
                    curveTo(-0.0067f, 6.7201f, 0.1416f, 5.9466f, 0.4362f, 5.2245f)
                    curveTo(0.7307f, 4.5023f, 1.1657f, 3.8458f, 1.7159f, 3.293f)
                    lineTo(4.8869f, 0.122f)
                    lineTo(11.1519f, 6.387f)
                    lineTo(7.0269f, 10.512f)
                    curveTo(8.2538f, 13.4261f, 10.5688f, 15.7469f, 13.4799f, 16.981f)
                    lineTo(17.6129f, 12.848f)
                    close()
                    moveTo(21.5289f, 0.0f)
                    horizontalLineTo(16.9999f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(20.6149f)
                    lineTo(14.9999f, 7.62f)
                    lineTo(16.4139f, 9.034f)
                    lineTo(21.9999f, 3.443f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(2.5f)
                    curveTo(24.0031f, 1.841f, 23.7447f, 1.2076f, 23.2815f, 0.739f)
                    curveTo(22.8182f, 0.2703f, 22.1879f, 0.0045f, 21.5289f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _callOutgoing!!
    }

private var _callOutgoing: ImageVector? = null
