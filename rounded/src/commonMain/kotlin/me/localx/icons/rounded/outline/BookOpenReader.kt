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

public val Icons.Outline.BookOpenReader: ImageVector
    get() {
        if (_bookOpenReader != null) {
            return _bookOpenReader!!
        }
        _bookOpenReader = Builder(name = "BookOpenReader", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveTo(17.934f, 8.844f, 17.933f, 0.155f, 12.0f, 0.0f)
                curveToRelative(-5.934f, 0.156f, -5.933f, 8.845f, 0.0f, 9.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.286f, 0.059f, 3.285f, 4.942f, 0.0f, 5.0f)
                curveToRelative(-3.285f, -0.059f, -3.285f, -4.942f, 0.0f, -5.0f)
                close()
                moveTo(22.204f, 11.162f)
                curveToRelative(-1.143f, -0.953f, -2.64f, -1.347f, -4.099f, -1.081f)
                lineToRelative(-3.821f, 0.695f)
                curveToRelative(-0.913f, 0.166f, -1.707f, 0.634f, -2.284f, 1.289f)
                curveToRelative(-0.578f, -0.655f, -1.371f, -1.123f, -2.285f, -1.289f)
                lineToRelative(-3.821f, -0.695f)
                curveToRelative(-1.461f, -0.264f, -2.956f, 0.128f, -4.098f, 1.081f)
                curveToRelative(-1.142f, 0.953f, -1.796f, 2.352f, -1.796f, 3.839f)
                verticalLineToRelative(2.793f)
                curveToRelative(0.0f, 2.417f, 1.727f, 4.486f, 4.106f, 4.919f)
                lineToRelative(6.284f, 1.143f)
                curveToRelative(1.068f, 0.194f, 2.151f, 0.194f, 3.219f, 0.0f)
                lineToRelative(6.285f, -1.143f)
                curveToRelative(2.379f, -0.433f, 4.105f, -2.502f, 4.105f, -4.919f)
                verticalLineToRelative(-2.793f)
                curveToRelative(0.0f, -1.487f, -0.654f, -2.886f, -1.796f, -3.838f)
                close()
                moveTo(11.0f, 21.929f)
                curveToRelative(-0.084f, -0.012f, -0.168f, -0.026f, -0.252f, -0.041f)
                lineToRelative(-6.284f, -1.143f)
                curveToRelative(-1.428f, -0.26f, -2.464f, -1.501f, -2.464f, -2.952f)
                verticalLineToRelative(-2.793f)
                curveToRelative(0.0f, -0.892f, 0.393f, -1.731f, 1.078f, -2.303f)
                curveToRelative(0.685f, -0.573f, 1.59f, -0.808f, 2.459f, -0.648f)
                lineToRelative(3.821f, 0.695f)
                curveToRelative(0.952f, 0.173f, 1.642f, 1.0f, 1.642f, 1.968f)
                verticalLineToRelative(7.217f)
                close()
                moveTo(22.0f, 17.794f)
                curveToRelative(0.0f, 1.451f, -1.036f, 2.692f, -2.463f, 2.952f)
                lineToRelative(-6.285f, 1.143f)
                curveToRelative(-0.084f, 0.015f, -0.168f, 0.029f, -0.252f, 0.041f)
                verticalLineToRelative(-7.217f)
                curveToRelative(0.0f, -0.967f, 0.69f, -1.795f, 1.642f, -1.968f)
                lineToRelative(3.821f, -0.695f)
                curveToRelative(0.875f, -0.16f, 1.774f, 0.077f, 2.46f, 0.648f)
                curveToRelative(0.685f, 0.572f, 1.077f, 1.411f, 1.077f, 2.303f)
                verticalLineToRelative(2.793f)
                close()
            }
        }
        .build()
        return _bookOpenReader!!
    }

private var _bookOpenReader: ImageVector? = null
