package me.localx.icons.rounded.bold

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

public val Icons.Bold.BullseyePointer: ImageVector
    get() {
        if (_bullseyePointer != null) {
            return _bullseyePointer!!
        }
        _bullseyePointer = Builder(name = "BullseyePointer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.003f)
                curveToRelative(-0.209f, -8.623f, -12.438f, -9.493f, -13.911f, -1.062f)
                lineToRelative(-3.086f, 1.122f)
                curveTo(3.959f, 4.53f, 8.469f, 0.0f, 14.0f, 0.003f)
                curveToRelative(13.287f, 0.506f, 13.223f, 19.582f, -0.061f, 19.997f)
                lineToRelative(1.122f, -3.086f)
                curveToRelative(3.357f, -0.514f, 5.939f, -3.413f, 5.939f, -6.911f)
                close()
                moveTo(14.31f, 9.694f)
                curveToRelative(1.183f, 1.183f, 1.735f, 2.776f, 1.585f, 4.378f)
                curveToRelative(1.535f, -0.716f, 2.606f, -2.263f, 2.606f, -4.069f)
                curveToRelative(0.019f, -4.795f, -6.642f, -6.192f, -8.577f, -1.88f)
                curveToRelative(1.615f, -0.205f, 3.227f, 0.42f, 4.386f, 1.572f)
                close()
                moveTo(0.442f, 21.439f)
                lineToRelative(2.645f, -2.645f)
                lineToRelative(-1.666f, -1.666f)
                curveToRelative(-0.642f, -0.642f, -0.907f, -1.553f, -0.711f, -2.439f)
                curveToRelative(0.197f, -0.886f, 0.823f, -1.6f, 1.676f, -1.91f)
                lineToRelative(6.838f, -2.486f)
                curveToRelative(1.294f, -0.47f, 2.699f, -0.156f, 3.672f, 0.815f)
                curveToRelative(0.972f, 0.972f, 1.284f, 2.379f, 0.814f, 3.671f)
                lineToRelative(-2.486f, 6.838f)
                curveToRelative(-0.31f, 0.853f, -1.024f, 1.479f, -1.91f, 1.676f)
                curveToRelative(-0.873f, 0.196f, -1.798f, -0.066f, -2.439f, -0.711f)
                lineToRelative(-1.666f, -1.666f)
                lineToRelative(-2.645f, 2.645f)
                curveToRelative(-1.393f, 1.381f, -3.502f, -0.729f, -2.121f, -2.121f)
                close()
                moveTo(8.596f, 20.062f)
                lineToRelative(2.293f, -6.309f)
                curveToRelative(0.095f, -0.261f, -0.031f, -0.44f, -0.116f, -0.524f)
                curveToRelative(-0.083f, -0.085f, -0.262f, -0.215f, -0.524f, -0.116f)
                lineToRelative(-6.309f, 2.293f)
                lineToRelative(4.656f, 4.656f)
                close()
            }
        }
        .build()
        return _bullseyePointer!!
    }

private var _bullseyePointer: ImageVector? = null
