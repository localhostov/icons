package me.localx.icons.rounded.outline

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

public val Icons.Outline.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.305f, 14.172f)
                lineToRelative(-0.175f, -0.042f)
                curveToRelative(-0.3f, -0.068f, -0.452f, -0.1f, -0.588f, -0.427f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.367f, 0.856f)
                arcToRelative(6.376f, 6.376f, 0.0f, false, false, -0.057f, 2.731f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.451f, 6.589f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 9.4f, 24.0f)
                curveToRelative(1.566f, 0.039f, 8.2f, 0.029f, 9.693f, 0.0f)
                arcToRelative(5.241f, 5.241f, 0.0f, false, false, 1.066f, -0.132f)
                curveTo(25.168f, 22.743f, 25.229f, 15.45f, 20.305f, 14.172f)
                close()
                moveTo(21.917f, 19.725f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, true, -2.2f, 2.192f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, true, -0.658f, 0.082f)
                curveToRelative(-1.655f, 0.032f, -8.258f, 0.037f, -9.6f, 0.0f)
                arcToRelative(1.654f, 1.654f, 0.0f, false, true, -0.382f, -0.055f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, true, -1.02f, -1.02f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, 0.85f, -1.8f)
                arcToRelative(2.019f, 2.019f, 0.0f, false, false, 1.18f, -2.306f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.305f, -4.778f)
                arcToRelative(4.028f, 4.028f, 0.0f, false, true, 4.3f, 2.427f)
                arcTo(2.725f, 2.725f, 0.0f, false, false, 19.785f, 16.1f)
                arcTo(3.022f, 3.022f, 0.0f, false, true, 21.917f, 19.725f)
                close()
                moveTo(5.261f, 17.613f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.177f)
                arcTo(9.914f, 9.914f, 0.0f, false, true, 0.064f, 8.881f)
                arcTo(10.035f, 10.035f, 0.0f, false, true, 8.361f, 0.126f)
                arcTo(10.756f, 10.756f, 0.0f, false, true, 12.522f, 0.3f)
                arcToRelative(2.216f, 2.216f, 0.0f, false, true, 1.6f, 1.6f)
                arcToRelative(2.194f, 2.194f, 0.0f, false, true, -0.619f, 2.153f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, false, -2.513f, 4.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.985f, -0.24f)
                arcToRelative(9.848f, 9.848f, 0.0f, false, true, 3.13f, -5.929f)
                arcToRelative(0.181f, 0.181f, 0.0f, false, false, 0.05f, -0.193f)
                arcToRelative(0.212f, 0.212f, 0.0f, false, false, -0.153f, -0.16f)
                arcTo(8.838f, 8.838f, 0.0f, false, false, 8.674f, 2.1f)
                arcTo(8.01f, 8.01f, 0.0f, false, false, 2.053f, 9.086f)
                arcTo(7.926f, 7.926f, 0.0f, false, false, 5.084f, 16.21f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.261f, 17.613f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
