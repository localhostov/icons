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

public val Icons.Outline.FlyingDisc: ImageVector
    get() {
        if (_flyingDisc != null) {
            return _flyingDisc!!
        }
        _flyingDisc = Builder(name = "FlyingDisc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.952f, 2.048f)
                curveTo(20.113f, 0.208f, 17.329f, -0.424f, 14.113f, 0.272f)
                curveToRelative(-3.057f, 0.661f, -6.175f, 2.458f, -8.778f, 5.062f)
                curveTo(-0.152f, 10.823f, -1.627f, 18.277f, 2.048f, 21.952f)
                curveToRelative(1.352f, 1.352f, 3.213f, 2.051f, 5.381f, 2.051f)
                curveToRelative(0.782f, 0.0f, 1.605f, -0.091f, 2.458f, -0.276f)
                curveToRelative(3.057f, -0.661f, 6.175f, -2.458f, 8.778f, -5.062f)
                curveToRelative(5.487f, -5.488f, 6.962f, -12.942f, 3.287f, -16.617f)
                close()
                moveTo(6.749f, 6.749f)
                curveToRelative(2.336f, -2.335f, 5.101f, -3.941f, 7.787f, -4.522f)
                curveToRelative(0.687f, -0.149f, 1.345f, -0.224f, 1.966f, -0.228f)
                curveToRelative(0.201f, 0.121f, 0.385f, 0.264f, 0.547f, 0.426f)
                curveToRelative(0.975f, 0.975f, 1.212f, 2.629f, 0.669f, 4.659f)
                curveToRelative(-0.595f, 2.222f, -2.035f, 4.559f, -4.055f, 6.579f)
                curveToRelative(-3.964f, 3.964f, -9.108f, 5.514f, -11.239f, 3.385f)
                curveToRelative(-0.171f, -0.17f, -0.319f, -0.364f, -0.443f, -0.576f)
                curveToRelative(0.024f, -2.996f, 1.716f, -6.67f, 4.769f, -9.723f)
                close()
                moveTo(17.251f, 17.251f)
                curveToRelative(-2.336f, 2.335f, -5.101f, 3.941f, -7.787f, 4.522f)
                curveToRelative(-2.529f, 0.545f, -4.66f, 0.107f, -6.002f, -1.235f)
                curveToRelative(-0.287f, -0.287f, -0.531f, -0.608f, -0.733f, -0.955f)
                curveToRelative(0.721f, 0.285f, 1.526f, 0.424f, 2.385f, 0.424f)
                curveToRelative(3.043f, 0.0f, 6.776f, -1.743f, 9.963f, -4.93f)
                curveToRelative(2.265f, -2.264f, 3.889f, -4.919f, 4.572f, -7.476f)
                curveToRelative(0.496f, -1.853f, 0.466f, -3.52f, -0.066f, -4.869f)
                curveToRelative(0.351f, 0.202f, 0.671f, 0.446f, 0.955f, 0.73f)
                curveToRelative(2.895f, 2.896f, 1.42f, 9.081f, -3.287f, 13.789f)
                close()
            }
        }
        .build()
        return _flyingDisc!!
    }

private var _flyingDisc: ImageVector? = null
