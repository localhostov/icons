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

public val Icons.Filled.PineappleAlt: ImageVector
    get() {
        if (_pineappleAlt != null) {
            return _pineappleAlt!!
        }
        _pineappleAlt = Builder(name = "PineappleAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.015f, 7.315f)
                curveToRelative(0.751f, -0.475f, 1.458f, -0.945f, 1.988f, -1.342f)
                curveToRelative(-1.5f, -1.271f, -2.0f, -1.476f, -2.0f, -1.476f)
                curveToRelative(0.0f, 0.0f, 0.997f, -1.996f, 0.997f, -3.496f)
                curveToRelative(-1.5f, 0.0f, -3.5f, 1.0f, -3.5f, 1.0f)
                curveToRelative(0.0f, 0.0f, -0.206f, -0.5f, -1.476f, -2.0f)
                curveToRelative(-0.398f, 0.53f, -0.867f, 1.237f, -1.342f, 1.988f)
                curveToRelative(-0.378f, -0.311f, -1.095f, -0.854f, -2.181f, -1.488f)
                curveToRelative(-0.493f, 1.572f, -0.716f, 4.195f, -0.812f, 5.805f)
                curveToRelative(-4.236f, -2.767f, -7.529f, -0.547f, -10.24f, 2.164f)
                curveToRelative(-3.164f, 3.164f, -5.679f, 7.116f, -0.355f, 12.439f)
                curveToRelative(2.24f, 2.24f, 4.237f, 3.092f, 6.035f, 3.092f)
                curveToRelative(2.475f, 0.0f, 4.572f, -1.615f, 6.405f, -3.447f)
                curveToRelative(2.712f, -2.711f, 4.932f, -6.006f, 2.161f, -10.244f)
                curveToRelative(1.61f, -0.096f, 4.236f, -0.319f, 5.81f, -0.812f)
                curveToRelative(-0.634f, -1.086f, -1.177f, -1.803f, -1.488f, -2.181f)
                close()
                moveTo(6.0f, 18.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(3.5f, 3.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(6.0f, 13.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(3.5f, 3.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(3.5f, 3.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(11.0f, 13.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(3.5f, 3.5f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _pineappleAlt!!
    }

private var _pineappleAlt: ImageVector? = null
