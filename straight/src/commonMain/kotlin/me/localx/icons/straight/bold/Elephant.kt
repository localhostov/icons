package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Elephant: ImageVector
    get() {
        if (_elephant != null) {
            return _elephant!!
        }
        _elephant = Builder(name = "Elephant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.99f, 18.004f)
                verticalLineToRelative(1.501f)
                curveToRelative(0.0f, 1.929f, -1.569f, 3.499f, -3.499f, 3.499f)
                curveToRelative(-0.938f, 0.0f, -1.815f, -0.367f, -2.473f, -1.032f)
                curveToRelative(-0.651f, -0.66f, -1.01f, -1.537f, -1.009f, -2.47f)
                verticalLineToRelative(-0.498f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.002f)
                lineToRelative(-5.01f, -0.006f)
                verticalLineToRelative(-3.998f)
                horizontalLineToRelative(-4.994f)
                lineToRelative(-0.01f, 3.998f)
                lineToRelative(-4.986f, 0.006f)
                verticalLineToRelative(-13.507f)
                curveTo(0.01f, 5.916f, 2.926f, 3.0f, 6.51f, 3.0f)
                horizontalLineToRelative(0.982f)
                curveToRelative(1.074f, -1.245f, 2.682f, -1.998f, 4.576f, -1.998f)
                curveToRelative(1.929f, 0.0f, 3.886f, 1.236f, 4.922f, 3.025f)
                curveToRelative(1.868f, 1.19f, 3.023f, 3.257f, 3.02f, 5.479f)
                verticalLineToRelative(9.998f)
                curveToRelative(0.0f, 0.188f, 0.09f, 0.307f, 0.144f, 0.361f)
                curveToRelative(0.063f, 0.063f, 0.173f, 0.14f, 0.338f, 0.14f)
                curveToRelative(0.275f, 0.0f, 0.499f, -0.224f, 0.499f, -0.499f)
                verticalLineToRelative(-1.501f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(17.01f, 16.004f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.25f, -0.673f, -2.414f, -1.758f, -3.04f)
                lineToRelative(-0.554f, -0.327f)
                lineToRelative(-0.015f, 0.008f)
                curveToRelative(-0.558f, -1.317f, -1.639f, -2.144f, -2.615f, -2.144f)
                curveToRelative(-2.214f, 0.0f, -3.0f, 1.616f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.468f, 0.816f, 2.658f, 1.933f, 2.937f)
                verticalLineToRelative(3.036f)
                curveToRelative(-2.803f, -0.273f, -4.933f, -2.797f, -4.933f, -5.973f)
                curveToRelative(0.0f, -0.332f, 0.03f, -0.652f, 0.075f, -0.965f)
                curveToRelative(-1.755f, 0.187f, -3.132f, 1.659f, -3.132f, 3.463f)
                verticalLineToRelative(6.502f)
                lineToRelative(14.0f, 0.002f)
                close()
            }
        }
        .build()
        return _elephant!!
    }

private var _elephant: ImageVector? = null
