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
                moveToRelative(19.333f, 4.0f)
                curveToRelative(-1.45f, 0.0f, -2.796f, 0.795f, -3.666f, 1.986f)
                curveToRelative(-0.593f, -0.812f, -1.41f, -1.432f, -2.328f, -1.747f)
                curveToRelative(0.351f, -1.469f, 0.894f, -2.618f, 1.227f, -3.229f)
                lineTo(12.81f, 0.053f)
                curveToRelative(-0.415f, 0.762f, -1.117f, 2.242f, -1.513f, 4.138f)
                curveToRelative(-1.896f, 0.527f, -3.297f, 2.247f, -3.297f, 4.309f)
                curveToRelative(0.0f, 1.892f, 1.043f, 6.245f, 2.616f, 9.5f)
                horizontalLineToRelative(-2.222f)
                curveToRelative(-1.596f, -3.661f, -2.394f, -7.93f, -2.394f, -9.5f)
                curveToRelative(0.0f, -1.393f, 0.444f, -2.681f, 1.193f, -3.74f)
                curveToRelative(-0.726f, -0.479f, -1.592f, -0.76f, -2.526f, -0.76f)
                curveTo(2.093f, 4.0f, 0.0f, 6.093f, 0.0f, 8.667f)
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
