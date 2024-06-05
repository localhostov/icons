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

public val Icons.Filled.PepperAlt: ImageVector
    get() {
        if (_pepperAlt != null) {
            return _pepperAlt!!
        }
        _pepperAlt = Builder(name = "PepperAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.333f, 3.947f)
                curveToRelative(-1.45f, 0.0f, -2.796f, 0.795f, -3.666f, 1.986f)
                curveToRelative(-0.593f, -0.812f, -1.376f, -1.6f, -2.478f, -1.767f)
                curveToRelative(0.275f, -1.07f, 0.664f, -1.763f, 0.994f, -2.34f)
                lineToRelative(0.195f, -0.349f)
                curveToRelative(0.265f, -0.485f, 0.086f, -1.092f, -0.399f, -1.356f)
                reflectiveCurveToRelative(-1.092f, -0.085f, -1.356f, 0.399f)
                lineToRelative(-0.177f, 0.315f)
                curveToRelative(-0.399f, 0.7f, -0.977f, 1.72f, -1.316f, 3.363f)
                curveToRelative(-1.807f, 0.581f, -3.129f, 2.249f, -3.129f, 4.247f)
                curveToRelative(0.0f, 1.633f, 0.777f, 5.099f, 2.001f, 8.11f)
                curveToRelative(0.27f, 0.665f, -0.211f, 1.39f, -0.929f, 1.39f)
                curveToRelative(-0.41f, 0.0f, -0.786f, -0.244f, -0.94f, -0.624f)
                curveToRelative(-1.421f, -3.509f, -2.132f, -7.394f, -2.132f, -8.876f)
                curveToRelative(0.0f, -1.393f, 0.444f, -2.681f, 1.193f, -3.74f)
                curveToRelative(-0.726f, -0.479f, -1.592f, -0.76f, -2.526f, -0.76f)
                curveTo(2.093f, 3.947f, 0.0f, 6.041f, 0.0f, 8.614f)
                curveToRelative(0.0f, 2.917f, 2.813f, 15.239f, 8.438f, 15.329f)
                curveToRelative(0.036f, 0.003f, 0.062f, 0.004f, 0.062f, 0.004f)
                curveToRelative(1.421f, 0.0f, 2.675f, -0.675f, 3.5f, -1.706f)
                curveToRelative(0.825f, 1.032f, 2.079f, 1.706f, 3.5f, 1.706f)
                curveToRelative(0.0f, 0.0f, 0.024f, -0.001f, 0.06f, -0.004f)
                curveToRelative(5.725f, -0.086f, 8.44f, -12.306f, 8.44f, -15.33f)
                curveToRelative(0.0f, -2.573f, -2.094f, -4.667f, -4.667f, -4.667f)
                close()
            }
        }
        .build()
        return _pepperAlt!!
    }

private var _pepperAlt: ImageVector? = null
