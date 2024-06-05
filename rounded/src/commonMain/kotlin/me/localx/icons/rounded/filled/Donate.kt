package me.localx.icons.rounded.filled

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

public val Icons.Filled.Donate: ImageVector
    get() {
        if (_donate != null) {
            return _donate!!
        }
        _donate = Builder(name = "Donate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-3.951f, -0.009f, -4.805f, -5.612f, -1.085f, -6.81f)
                curveToRelative(4.524f, 6.35f, 14.648f, 6.348f, 19.17f, 0.0f)
                curveToRelative(1.397f, 0.46f, 2.415f, 1.762f, 2.415f, 3.31f)
                close()
                moveTo(22.0f, 10.0f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                curveTo(-1.248f, 19.497f, -1.244f, 0.501f, 12.0f, 0.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveToRelative(0.0f, -1.359f, -0.974f, -2.51f, -2.315f, -2.733f)
                lineToRelative(-3.041f, -0.506f)
                curveToRelative(-1.087f, -0.211f, -0.641f, -1.826f, 0.356f, -1.761f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.356f, 0.0f, 0.688f, 0.191f, 0.867f, 0.501f)
                curveToRelative(0.277f, 0.478f, 0.89f, 0.643f, 1.366f, 0.364f)
                curveToRelative(0.479f, -0.276f, 0.642f, -0.888f, 0.365f, -1.366f)
                curveToRelative(-0.535f, -0.925f, -1.531f, -1.499f, -2.598f, -1.499f)
                horizontalLineToRelative(-0.268f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.006f, -1.308f, -1.995f, -1.307f, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-3.435f, -0.019f, -4.184f, 5.083f, -0.685f, 5.733f)
                lineToRelative(3.041f, 0.506f)
                curveToRelative(1.087f, 0.211f, 0.641f, 1.826f, -0.356f, 1.761f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.356f, 0.0f, -0.688f, -0.191f, -0.867f, -0.501f)
                curveToRelative(-0.277f, -0.478f, -0.89f, -0.643f, -1.366f, -0.364f)
                curveToRelative(-0.479f, 0.276f, -0.642f, 0.888f, -0.365f, 1.366f)
                curveToRelative(0.535f, 0.925f, 1.531f, 1.499f, 2.598f, 1.499f)
                horizontalLineToRelative(0.268f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.006f, 1.308f, 1.995f, 1.307f, 2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _donate!!
    }

private var _donate: ImageVector? = null
