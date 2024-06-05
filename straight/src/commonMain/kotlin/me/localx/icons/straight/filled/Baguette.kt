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

public val Icons.Filled.Baguette: ImageVector
    get() {
        if (_baguette != null) {
            return _baguette!!
        }
        _baguette = Builder(name = "Baguette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.036f, 0.964f)
                curveToRelative(-1.194f, -1.194f, -3.355f, -1.284f, -6.089f, -0.254f)
                curveToRelative(-1.38f, 0.52f, -2.814f, 1.3f, -4.183f, 2.259f)
                lineToRelative(3.633f, 3.633f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.819f, -3.819f)
                curveToRelative(-0.501f, 0.421f, -0.985f, 0.864f, -1.446f, 1.324f)
                lineToRelative(-1.391f, 1.391f)
                lineToRelative(3.879f, 3.879f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.879f, -3.879f)
                lineToRelative(-1.391f, 1.391f)
                curveToRelative(-0.442f, 0.442f, -0.867f, 0.906f, -1.273f, 1.385f)
                lineToRelative(3.823f, 3.823f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.643f, -3.643f)
                curveToRelative(-0.981f, 1.389f, -1.778f, 2.847f, -2.306f, 4.249f)
                curveToRelative(-1.03f, 2.733f, -0.94f, 4.896f, 0.254f, 6.09f)
                curveToRelative(0.644f, 0.644f, 1.567f, 0.967f, 2.711f, 0.967f)
                curveToRelative(0.979f, 0.0f, 2.118f, -0.237f, 3.378f, -0.713f)
                curveToRelative(2.464f, -0.929f, 5.098f, -2.683f, 7.228f, -4.812f)
                lineToRelative(4.197f, -4.196f)
                curveToRelative(2.13f, -2.13f, 3.884f, -4.765f, 4.813f, -7.228f)
                curveToRelative(1.03f, -2.733f, 0.94f, -4.896f, -0.254f, -6.09f)
                close()
            }
        }
        .build()
        return _baguette!!
    }

private var _baguette: ImageVector? = null
