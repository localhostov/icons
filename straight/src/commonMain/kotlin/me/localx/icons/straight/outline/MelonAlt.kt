package me.localx.icons.straight.outline

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

public val Icons.Outline.MelonAlt: ImageVector
    get() {
        if (_melonAlt != null) {
            return _melonAlt!!
        }
        _melonAlt = Builder(name = "MelonAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.019f, 2.981f)
                curveTo(16.654f, -1.381f, 9.061f, -0.886f, 4.087f, 4.087f)
                curveTo(-0.885f, 9.061f, -1.381f, 16.656f, 2.981f, 21.019f)
                curveToRelative(1.995f, 1.995f, 4.665f, 2.974f, 7.451f, 2.974f)
                curveToRelative(3.308f, 0.0f, 6.78f, -1.38f, 9.479f, -4.08f)
                curveToRelative(2.391f, -2.39f, 3.831f, -5.453f, 4.058f, -8.624f)
                curveToRelative(0.229f, -3.225f, -0.818f, -6.175f, -2.951f, -8.308f)
                close()
                moveTo(18.942f, 7.634f)
                curveToRelative(-2.078f, 4.157f, -7.151f, 9.229f, -11.307f, 11.307f)
                curveToRelative(-2.056f, 1.029f, -3.019f, 0.884f, -3.239f, 0.663f)
                curveToRelative(-0.221f, -0.22f, -0.366f, -1.181f, 0.663f, -3.239f)
                curveToRelative(2.078f, -4.157f, 7.15f, -9.229f, 11.307f, -11.307f)
                curveToRelative(1.266f, -0.633f, 2.116f, -0.822f, 2.635f, -0.822f)
                curveToRelative(0.325f, 0.0f, 0.52f, 0.074f, 0.604f, 0.159f)
                curveToRelative(0.221f, 0.221f, 0.366f, 1.182f, -0.663f, 3.239f)
                close()
                moveTo(5.502f, 5.501f)
                curveToRelative(3.287f, -3.286f, 7.881f, -4.29f, 11.441f, -2.849f)
                curveToRelative(-0.452f, 0.157f, -0.931f, 0.347f, -1.472f, 0.617f)
                curveToRelative(-4.485f, 2.243f, -9.958f, 7.716f, -12.201f, 12.201f)
                curveToRelative(-0.271f, 0.541f, -0.46f, 1.02f, -0.617f, 1.472f)
                curveToRelative(-1.441f, -3.56f, -0.438f, -8.154f, 2.849f, -11.441f)
                close()
                moveTo(21.975f, 11.147f)
                curveToRelative(-0.191f, 2.691f, -1.427f, 5.302f, -3.477f, 7.352f)
                curveToRelative(-3.288f, 3.287f, -7.881f, 4.29f, -11.44f, 2.849f)
                curveToRelative(0.452f, -0.157f, 0.931f, -0.347f, 1.471f, -0.617f)
                curveToRelative(4.484f, -2.242f, 9.958f, -7.715f, 12.201f, -12.201f)
                curveToRelative(0.272f, -0.543f, 0.462f, -1.024f, 0.619f, -1.477f)
                curveToRelative(0.505f, 1.242f, 0.73f, 2.629f, 0.625f, 4.095f)
                close()
            }
        }
        .build()
        return _melonAlt!!
    }

private var _melonAlt: ImageVector? = null
