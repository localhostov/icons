package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.RouteInterstate: ImageVector
    get() {
        if (_routeInterstate != null) {
            return _routeInterstate!!
        }
        _routeInterstate = Builder(name = "RouteInterstate", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.274f, 1.99f)
                lineToRelative(-1.274f, 0.01f)
                curveToRelative(-1.058f, 0.0f, -1.585f, -0.376f, -2.316f, -0.897f)
                curveToRelative(-0.311f, -0.222f, -0.633f, -0.451f, -1.01f, -0.661f)
                curveToRelative(-1.059f, -0.589f, -2.32f, -0.588f, -3.377f, 0.0f)
                curveToRelative(-0.386f, 0.214f, -0.71f, 0.448f, -1.024f, 0.674f)
                curveToRelative(-0.712f, 0.513f, -1.227f, 0.884f, -2.272f, 0.884f)
                lineToRelative(-1.274f, -0.01f)
                curveToRelative(-2.193f, 0.0f, -3.726f, 1.455f, -3.726f, 3.538f)
                verticalLineToRelative(6.852f)
                curveToRelative(0.0f, 5.519f, 4.918f, 9.269f, 7.77f, 10.965f)
                curveToRelative(0.479f, 0.292f, 1.078f, 0.656f, 2.232f, 0.656f)
                curveToRelative(1.171f, 0.0f, 1.877f, -0.322f, 2.557f, -0.68f)
                curveToRelative(2.779f, -1.47f, 7.441f, -4.846f, 7.441f, -10.94f)
                lineTo(22.001f, 5.528f)
                curveToRelative(0.0f, -2.083f, -1.532f, -3.538f, -3.726f, -3.538f)
                close()
                moveTo(19.0f, 12.38f)
                curveToRelative(0.0f, 4.522f, -3.661f, 7.134f, -5.843f, 8.288f)
                curveToRelative(-0.477f, 0.251f, -0.671f, 0.333f, -1.155f, 0.333f)
                curveToRelative(-0.313f, 0.0f, -0.501f, -0.113f, -0.834f, -0.315f)
                curveToRelative(-2.304f, -1.37f, -6.168f, -4.271f, -6.168f, -8.305f)
                verticalLineToRelative(-1.379f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.379f)
                close()
                moveTo(19.0f, 8.001f)
                lineTo(5.0f, 8.001f)
                verticalLineToRelative(-2.472f)
                curveToRelative(0.0f, -0.252f, 0.0f, -0.538f, 0.726f, -0.538f)
                lineToRelative(1.274f, 0.01f)
                curveToRelative(2.014f, 0.0f, 3.177f, -0.838f, 4.026f, -1.451f)
                curveToRelative(0.238f, -0.171f, 0.471f, -0.343f, 0.728f, -0.486f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.148f, -0.084f, 0.308f, -0.084f, 0.46f, 0.0f)
                curveToRelative(0.255f, 0.142f, 0.488f, 0.312f, 0.727f, 0.482f)
                curveToRelative(0.861f, 0.614f, 2.041f, 1.455f, 4.058f, 1.455f)
                lineToRelative(1.274f, -0.01f)
                curveToRelative(0.726f, 0.0f, 0.726f, 0.286f, 0.726f, 0.538f)
                verticalLineToRelative(2.472f)
                close()
            }
        }
        .build()
        return _routeInterstate!!
    }

private var _routeInterstate: ImageVector? = null
