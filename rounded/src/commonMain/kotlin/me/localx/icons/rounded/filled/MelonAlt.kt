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

public val Icons.Filled.MelonAlt: ImageVector
    get() {
        if (_melonAlt != null) {
            return _melonAlt!!
        }
        _melonAlt = Builder(name = "MelonAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.617f, 20.335f)
                curveToRelative(-4.59f, 2.445f, -6.349f, 0.695f, -3.928f, -3.908f)
                curveToRelative(2.421f, -4.603f, 8.104f, -10.317f, 12.694f, -12.761f)
                curveToRelative(4.59f, -2.445f, 6.349f, -0.695f, 3.928f, 3.908f)
                curveToRelative(-2.421f, 4.603f, -8.104f, 10.316f, -12.694f, 12.761f)
                close()
                moveTo(1.918f, 15.496f)
                curveTo(4.537f, 10.517f, 10.478f, 4.545f, 15.442f, 1.9f)
                curveToRelative(0.91f, -0.485f, 1.714f, -0.811f, 2.43f, -1.023f)
                curveTo(13.559f, -0.959f, 8.011f, 0.164f, 4.087f, 4.087f)
                curveTo(0.144f, 8.031f, -0.972f, 13.619f, 0.906f, 17.941f)
                curveToRelative(0.208f, -0.72f, 0.531f, -1.528f, 1.013f, -2.445f)
                close()
                moveTo(23.098f, 6.05f)
                curveToRelative(-0.207f, 0.722f, -0.531f, 1.534f, -1.016f, 2.454f)
                curveToRelative(-2.619f, 4.979f, -8.56f, 10.951f, -13.524f, 13.595f)
                curveToRelative(-0.909f, 0.484f, -1.715f, 0.815f, -2.431f, 1.026f)
                curveToRelative(1.345f, 0.573f, 2.806f, 0.866f, 4.306f, 0.866f)
                curveToRelative(3.308f, 0.0f, 6.78f, -1.38f, 9.479f, -4.08f)
                curveToRelative(2.391f, -2.39f, 3.831f, -5.453f, 4.058f, -8.624f)
                curveToRelative(0.134f, -1.877f, -0.178f, -3.655f, -0.872f, -5.239f)
                close()
            }
        }
        .build()
        return _melonAlt!!
    }

private var _melonAlt: ImageVector? = null
