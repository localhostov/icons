package me.localx.icons.rounded.outline

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

public val Icons.Outline.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.112f, 5.165f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, false, 0.0f, -4.279f)
                arcToRelative(3.094f, 3.094f, 0.0f, false, false, -4.276f, 0.0f)
                lineToRelative(-2.436f, 2.438f)
                curveToRelative(-1.012f, 1.013f, -3.123f, 0.789f, -4.579f, -0.013f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -3.057f, 4.144f)
                lineToRelative(1.416f, 1.416f)
                lineToRelative(-8.155f, 8.154f)
                arcToRelative(3.455f, 3.455f, 0.0f, false, false, -0.593f, 4.129f)
                lineToRelative(-1.139f, 1.139f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(1.139f, -1.139f)
                arcToRelative(3.455f, 3.455f, 0.0f, false, false, 4.129f, -0.593f)
                lineToRelative(8.154f, -8.155f)
                lineToRelative(1.416f, 1.416f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, 4.144f, -3.057f)
                curveToRelative(-0.8f, -1.456f, -1.025f, -3.568f, -0.013f, -4.58f)
                close()
                moveTo(5.56f, 20.561f)
                arcToRelative(1.536f, 1.536f, 0.0f, false, true, -2.121f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -2.121f)
                lineToRelative(8.155f, -8.154f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(19.26f, 6.185f)
                curveToRelative(-1.759f, 1.759f, -1.5f, 4.832f, -0.325f, 6.958f)
                arcToRelative(0.578f, 0.578f, 0.0f, false, true, -0.119f, 0.679f)
                arcToRelative(0.621f, 0.621f, 0.0f, false, true, -0.859f, 0.0f)
                lineToRelative(-7.779f, -7.781f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, true, 0.428f, -1.041f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, true, 0.251f, 0.063f)
                curveToRelative(2.126f, 1.17f, 5.2f, 1.434f, 6.958f, -0.325f)
                lineToRelative(2.439f, -2.438f)
                arcToRelative(1.045f, 1.045f, 0.0f, false, true, 1.446f, 0.0f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, true, 0.0f, 1.449f)
                close()
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
