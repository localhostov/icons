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

public val Icons.Bold.GlassCitrus: ImageVector
    get() {
        if (_glassCitrus != null) {
            return _glassCitrus!!
        }
        _glassCitrus = Builder(name = "GlassCitrus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.75f)
                curveToRelative(0.0f, -3.722f, -3.028f, -6.75f, -6.75f, -6.75f)
                curveToRelative(-3.116f, 0.0f, -5.738f, 2.125f, -6.512f, 5.0f)
                lineTo(0.0f, 5.0f)
                lineToRelative(1.878f, 15.911f)
                curveToRelative(0.208f, 1.761f, 1.703f, 3.089f, 3.476f, 3.089f)
                horizontalLineToRelative(8.433f)
                curveToRelative(1.773f, 0.0f, 3.268f, -1.328f, 3.476f, -3.089f)
                lineToRelative(1.878f, -15.911f)
                horizontalLineToRelative(-5.187f)
                curveToRelative(0.631f, -1.184f, 1.864f, -2.0f, 3.296f, -2.0f)
                curveToRelative(2.068f, 0.0f, 3.75f, 1.682f, 3.75f, 3.75f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.26f, 0.128f, 0.993f, -0.093f, 2.629f)
                lineToRelative(-0.518f, 3.411f)
                curveToRelative(2.105f, -1.144f, 3.611f, -3.48f, 3.611f, -6.04f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(13.787f, 21.0f)
                lineTo(5.354f, 21.0f)
                curveToRelative(-0.253f, 0.0f, -0.467f, -0.19f, -0.497f, -0.441f)
                lineToRelative(-0.774f, -6.559f)
                horizontalLineToRelative(8.273f)
                curveToRelative(-1.135f, -0.769f, -2.078f, -1.799f, -2.748f, -3.0f)
                lineTo(3.729f, 11.0f)
                lineToRelative(-0.354f, -3.0f)
                horizontalLineToRelative(7.246f)
                curveToRelative(0.458f, 2.433f, 2.222f, 4.406f, 4.536f, 5.164f)
                lineToRelative(-0.873f, 7.394f)
                curveToRelative(-0.03f, 0.252f, -0.243f, 0.442f, -0.497f, 0.442f)
                close()
                moveTo(15.523f, 10.059f)
                curveToRelative(-0.831f, -0.436f, -1.474f, -1.165f, -1.793f, -2.059f)
                horizontalLineToRelative(2.036f)
                lineToRelative(-0.243f, 2.059f)
                close()
            }
        }
        .build()
        return _glassCitrus!!
    }

private var _glassCitrus: ImageVector? = null
