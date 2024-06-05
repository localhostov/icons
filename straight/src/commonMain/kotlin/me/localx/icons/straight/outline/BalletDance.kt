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

public val Icons.Outline.BalletDance: ImageVector
    get() {
        if (_balletDance != null) {
            return _balletDance!!
        }
        _balletDance = Builder(name = "BalletDance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(12.264f, 16.37f)
                curveToRelative(-0.417f, 0.169f, -0.84f, 0.324f, -1.264f, 0.47f)
                verticalLineToRelative(7.16f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.561f)
                curveToRelative(-1.387f, 0.35f, -2.737f, 0.554f, -3.92f, 0.554f)
                curveToRelative(-1.864f, 0.0f, -3.317f, -0.493f, -3.869f, -1.664f)
                curveToRelative(-0.802f, -1.703f, 0.657f, -3.863f, 3.915f, -5.877f)
                curveTo(2.591f, 7.548f, 0.0f, 3.684f, 0.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.718f, 0.778f, 3.778f, 2.226f, 6.0f)
                horizontalLineToRelative(5.428f)
                curveToRelative(1.652f, -1.245f, 3.346f, -4.474f, 3.346f, -6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.976f, -1.738f, 5.565f, -3.827f, 7.356f)
                curveToRelative(0.057f, 0.139f, 0.126f, 0.296f, 0.215f, 0.478f)
                lineToRelative(0.009f, -0.003f)
                curveToRelative(0.909f, -0.273f, 1.939f, -0.584f, 3.475f, -0.782f)
                curveToRelative(3.31f, -0.281f, 4.497f, 0.726f, 4.917f, 1.617f)
                curveToRelative(0.194f, 0.413f, 0.353f, 1.093f, 0.003f, 1.987f)
                curveToRelative(-0.061f, 0.155f, -0.158f, 0.315f, -0.247f, 0.474f)
                lineToRelative(3.732f, -1.089f)
                lineToRelative(0.56f, 1.92f)
                lineToRelative(-7.275f, 2.122f)
                curveToRelative(-1.211f, 0.835f, -2.668f, 1.625f, -4.298f, 2.288f)
                close()
                moveTo(5.676f, 8.0f)
                curveToRelative(0.934f, 1.173f, 2.033f, 2.375f, 3.283f, 3.581f)
                curveToRelative(0.297f, 0.0f, 1.004f, -0.081f, 2.041f, -0.699f)
                curveToRelative(-0.947f, -1.16f, -1.459f, -2.205f, -1.724f, -2.882f)
                horizontalLineToRelative(-3.6f)
                close()
                moveTo(11.512f, 14.517f)
                curveToRelative(3.609f, -1.465f, 5.961f, -3.418f, 6.418f, -4.59f)
                curveToRelative(0.041f, -0.105f, 0.102f, -0.297f, 0.05f, -0.407f)
                curveToRelative(-0.127f, -0.27f, -1.027f, -0.642f, -2.896f, -0.481f)
                curveToRelative(-1.055f, 0.137f, -1.84f, 0.337f, -2.558f, 0.545f)
                curveToRelative(0.205f, 0.254f, 1.473f, 1.582f, 1.473f, 1.582f)
                lineToRelative(-0.886f, 0.687f)
                curveToRelative(-1.869f, 1.449f, -3.322f, 1.723f, -4.153f, 1.723f)
                curveToRelative(-0.428f, 0.0f, -0.981f, -0.165f, -0.981f, -0.165f)
                curveToRelative(0.0f, 0.0f, -1.009f, -0.976f, -1.466f, -1.449f)
                curveToRelative(-2.841f, 1.688f, -3.658f, 3.163f, -3.492f, 3.516f)
                curveToRelative(0.294f, 0.625f, 3.539f, 1.051f, 8.492f, -0.96f)
                close()
            }
        }
        .build()
        return _balletDance!!
    }

private var _balletDance: ImageVector? = null
