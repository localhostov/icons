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

public val Icons.Filled.InputText: ImageVector
    get() {
        if (_inputText != null) {
            return _inputText!!
        }
        _inputText = Builder(name = "InputText", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.187f, 9.101f)
                lineToRelative(0.887f, 3.899f)
                horizontalLineToRelative(-2.045f)
                lineToRelative(0.887f, -3.899f)
                curveToRelative(0.01f, -0.045f, 0.024f, -0.108f, 0.135f, -0.108f)
                reflectiveCurveToRelative(0.125f, 0.063f, 0.135f, 0.108f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveTo(0.0f, 5.243f, 2.243f, 3.0f, 5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(10.757f, 15.778f)
                lineToRelative(-1.621f, -7.121f)
                curveToRelative(-0.227f, -0.996f, -1.065f, -1.665f, -2.085f, -1.665f)
                reflectiveCurveToRelative(-1.859f, 0.669f, -2.085f, 1.665f)
                lineToRelative(-1.621f, 7.121f)
                curveToRelative(-0.123f, 0.538f, 0.215f, 1.074f, 0.753f, 1.196f)
                curveToRelative(0.538f, 0.129f, 1.074f, -0.214f, 1.197f, -0.753f)
                lineToRelative(0.278f, -1.222f)
                horizontalLineToRelative(2.956f)
                lineToRelative(0.278f, 1.222f)
                curveToRelative(0.105f, 0.464f, 0.518f, 0.778f, 0.974f, 0.778f)
                curveToRelative(0.074f, 0.0f, 0.148f, -0.008f, 0.223f, -0.025f)
                curveToRelative(0.539f, -0.122f, 0.876f, -0.658f, 0.753f, -1.196f)
                close()
            }
        }
        .build()
        return _inputText!!
    }

private var _inputText: ImageVector? = null
