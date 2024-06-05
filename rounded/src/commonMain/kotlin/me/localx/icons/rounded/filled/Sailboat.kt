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

public val Icons.Filled.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 24.0f)
                horizontalLineToRelative(-5.039f)
                curveToRelative(-5.721f, 0.0f, -8.209f, -3.255f, -9.184f, -5.194f)
                curveToRelative(-0.408f, -0.812f, -0.364f, -1.762f, 0.116f, -2.54f)
                curveToRelative(0.489f, -0.792f, 1.335f, -1.266f, 2.265f, -1.266f)
                horizontalLineToRelative(18.679f)
                curveToRelative(0.934f, 0.0f, 1.782f, 0.477f, 2.271f, 1.274f)
                curveToRelative(0.479f, 0.783f, 0.518f, 1.734f, 0.103f, 2.546f)
                curveToRelative(-0.989f, 1.935f, -3.5f, 5.18f, -9.21f, 5.18f)
                close()
                moveTo(7.667f, 13.0f)
                lineTo(2.333f, 13.0f)
                curveToRelative(-0.92f, 0.0f, -1.757f, -0.543f, -2.131f, -1.385f)
                curveToRelative(-0.375f, -0.838f, -0.22f, -1.823f, 0.396f, -2.509f)
                lineTo(5.906f, 2.798f)
                curveToRelative(0.666f, -0.739f, 1.697f, -0.986f, 2.593f, -0.643f)
                curveToRelative(0.893f, 0.341f, 1.496f, 1.215f, 1.497f, 2.176f)
                lineToRelative(0.004f, 6.334f)
                curveToRelative(0.0f, 0.622f, -0.241f, 1.208f, -0.682f, 1.65f)
                curveToRelative(-0.442f, 0.441f, -1.028f, 0.685f, -1.652f, 0.685f)
                close()
                moveTo(21.667f, 13.0f)
                horizontalLineToRelative(-7.334f)
                curveToRelative(-0.623f, 0.0f, -1.209f, -0.243f, -1.649f, -0.684f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.441f, -0.443f, -0.683f, -1.03f, -0.682f, -1.651f)
                lineToRelative(0.004f, -8.333f)
                curveToRelative(0.001f, -0.962f, 0.605f, -1.837f, 1.501f, -2.178f)
                curveToRelative(0.889f, -0.343f, 1.923f, -0.096f, 2.566f, 0.617f)
                lineToRelative(7.338f, 8.344f)
                curveToRelative(0.607f, 0.677f, 0.763f, 1.661f, 0.39f, 2.5f)
                curveToRelative(-0.376f, 0.842f, -1.212f, 1.385f, -2.132f, 1.385f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
