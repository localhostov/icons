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

public val Icons.Bold.InputText: ImageVector
    get() {
        if (_inputText != null) {
            return _inputText!!
        }
        _inputText = Builder(name = "InputText", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 2.0f)
                lineTo(5.5f, 2.0f)
                curveTo(2.467f, 2.0f, 0.0f, 4.468f, 0.0f, 7.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 16.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 19.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 7.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(10.316f, 8.657f)
                curveToRelative(-0.226f, -0.995f, -1.064f, -1.665f, -2.085f, -1.665f)
                reflectiveCurveToRelative(-1.859f, 0.67f, -2.085f, 1.665f)
                lineToRelative(-1.621f, 7.121f)
                curveToRelative(-0.123f, 0.538f, 0.215f, 1.074f, 0.753f, 1.196f)
                curveToRelative(0.537f, 0.129f, 1.074f, -0.214f, 1.197f, -0.753f)
                lineToRelative(0.278f, -1.222f)
                horizontalLineToRelative(2.955f)
                lineToRelative(0.278f, 1.222f)
                curveToRelative(0.105f, 0.464f, 0.518f, 0.778f, 0.974f, 0.778f)
                curveToRelative(0.074f, 0.0f, 0.148f, -0.008f, 0.223f, -0.025f)
                curveToRelative(0.539f, -0.122f, 0.876f, -0.658f, 0.753f, -1.196f)
                lineToRelative(-1.621f, -7.121f)
                close()
                moveTo(7.208f, 13.0f)
                lineToRelative(0.887f, -3.899f)
                curveToRelative(0.01f, -0.046f, 0.024f, -0.108f, 0.135f, -0.108f)
                reflectiveCurveToRelative(0.125f, 0.062f, 0.135f, 0.108f)
                lineToRelative(0.887f, 3.899f)
                horizontalLineToRelative(-2.045f)
                close()
            }
        }
        .build()
        return _inputText!!
    }

private var _inputText: ImageVector? = null
