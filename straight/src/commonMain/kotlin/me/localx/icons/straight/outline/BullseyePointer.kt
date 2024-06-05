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

public val Icons.Outline.BullseyePointer: ImageVector
    get() {
        if (_bullseyePointer != null) {
            return _bullseyePointer!!
        }
        _bullseyePointer = Builder(name = "BullseyePointer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.795f, 0.0f, -3.3f, 1.196f, -3.804f, 2.828f)
                lineToRelative(-2.176f, 0.791f)
                curveToRelative(0.198f, -3.131f, 2.801f, -5.619f, 5.981f, -5.619f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 3.18f, -2.488f, 5.783f, -5.619f, 5.981f)
                lineToRelative(0.791f, -2.176f)
                curveToRelative(1.631f, -0.505f, 2.828f, -2.009f, 2.828f, -3.804f)
                close()
                moveTo(14.0f, 0.0f)
                curveTo(8.486f, 0.0f, 4.0f, 4.486f, 4.0f, 10.0f)
                curveToRelative(0.0f, 0.358f, 0.021f, 0.711f, 0.058f, 1.06f)
                lineToRelative(1.96f, -0.713f)
                curveToRelative(-0.005f, -0.116f, -0.018f, -0.23f, -0.018f, -0.347f)
                curveTo(6.0f, 5.589f, 9.589f, 2.0f, 14.0f, 2.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-0.117f, 0.0f, -0.231f, -0.013f, -0.347f, -0.018f)
                lineToRelative(-0.713f, 1.96f)
                curveToRelative(0.348f, 0.037f, 0.702f, 0.058f, 1.06f, 0.058f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(19.514f, 0.0f, 14.0f, 0.0f)
                close()
                moveTo(9.221f, 24.0f)
                lineToRelative(-3.903f, -3.903f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.793f, -2.793f)
                lineTo(0.0f, 14.779f)
                lineToRelative(10.462f, -3.804f)
                curveToRelative(0.734f, -0.266f, 1.549f, -0.083f, 2.098f, 0.467f)
                curveToRelative(0.555f, 0.552f, 0.733f, 1.355f, 0.466f, 2.095f)
                lineToRelative(-3.805f, 10.463f)
                close()
                moveTo(8.414f, 20.365f)
                lineToRelative(2.73f, -7.509f)
                lineToRelative(-7.51f, 2.73f)
                lineToRelative(4.779f, 4.779f)
                close()
            }
        }
        .build()
        return _bullseyePointer!!
    }

private var _bullseyePointer: ImageVector? = null
