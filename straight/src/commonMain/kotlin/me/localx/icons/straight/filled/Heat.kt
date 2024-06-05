package me.localx.icons.straight.filled

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

public val Icons.Filled.Heat: ImageVector
    get() {
        if (_heat != null) {
            return _heat!!
        }
        _heat = Builder(name = "Heat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.981f, 24.005f)
                lineToRelative(-1.933f, -0.51f)
                curveToRelative(0.116f, -0.441f, 0.247f, -0.851f, 0.376f, -1.255f)
                curveToRelative(1.292f, -2.841f, 0.187f, -7.136f, -1.265f, -9.125f)
                arcTo(13.553f, 13.553f, 0.0f, false, true, 17.351f, 0.094f)
                lineToRelative(1.828f, 0.812f)
                arcToRelative(11.529f, 11.529f, 0.0f, false, false, 0.691f, 11.173f)
                curveToRelative(1.663f, 2.234f, 2.964f, 7.483f, 1.459f, 10.769f)
                curveTo(21.21f, 23.22f, 21.089f, 23.6f, 20.981f, 24.005f)
                close()
                moveTo(14.329f, 22.848f)
                curveToRelative(1.506f, -3.289f, 0.2f, -8.535f, -1.459f, -10.769f)
                arcTo(11.531f, 11.531f, 0.0f, false, true, 12.179f, 0.906f)
                lineTo(10.351f, 0.094f)
                arcToRelative(13.551f, 13.551f, 0.0f, false, false, 0.808f, 13.021f)
                curveToRelative(1.452f, 1.987f, 2.558f, 6.286f, 1.265f, 9.125f)
                curveToRelative(-0.129f, 0.4f, -0.26f, 0.814f, -0.376f, 1.255f)
                lineToRelative(1.933f, 0.51f)
                curveTo(14.089f, 23.6f, 14.21f, 23.22f, 14.329f, 22.848f)
                close()
                moveTo(7.329f, 22.848f)
                curveToRelative(1.506f, -3.289f, 0.2f, -8.535f, -1.459f, -10.769f)
                arcTo(11.531f, 11.531f, 0.0f, false, true, 5.179f, 0.906f)
                lineTo(3.351f, 0.094f)
                arcToRelative(13.551f, 13.551f, 0.0f, false, false, 0.808f, 13.021f)
                curveTo(5.611f, 15.1f, 6.717f, 19.4f, 5.424f, 22.24f)
                curveToRelative(-0.129f, 0.4f, -0.26f, 0.814f, -0.376f, 1.255f)
                lineToRelative(1.933f, 0.51f)
                curveTo(7.089f, 23.6f, 7.21f, 23.22f, 7.329f, 22.848f)
                close()
            }
        }
        .build()
        return _heat!!
    }

private var _heat: ImageVector? = null
