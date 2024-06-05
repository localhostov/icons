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

public val Icons.Filled.Peanuts: ImageVector
    get() {
        if (_peanuts != null) {
            return _peanuts!!
        }
        _peanuts = Builder(name = "Peanuts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.014f, 18.08f)
                curveToRelative(-0.068f, 1.709f, 0.391f, 3.322f, 1.309f, 4.66f)
                curveTo(1.83f, 21.95f, 0.004f, 19.452f, 0.004f, 16.5f)
                curveTo(0.004f, 15.477f, 0.218f, 14.498f, 0.639f, 13.59f)
                curveToRelative(0.625f, -1.348f, 0.625f, -2.833f, 0.0f, -4.181f)
                curveTo(0.218f, 8.502f, 0.004f, 7.523f, 0.004f, 6.5f)
                curveTo(0.004f, 2.916f, 2.695f, 0.0f, 6.004f, 0.0f)
                curveToRelative(3.143f, 0.0f, 5.729f, 2.632f, 5.98f, 5.968f)
                curveToRelative(0.001f, 0.004f, 0.002f, 0.009f, 0.003f, 0.013f)
                curveToRelative(-0.709f, 0.809f, -1.264f, 1.718f, -1.632f, 2.723f)
                curveToRelative(-0.289f, 0.789f, -0.859f, 1.359f, -1.647f, 1.647f)
                curveToRelative(-1.188f, 0.435f, -2.252f, 1.117f, -3.162f, 2.027f)
                curveToRelative(-1.549f, 1.548f, -2.448f, 3.573f, -2.532f, 5.702f)
                close()
                moveTo(22.048f, 15.207f)
                curveToRelative(-0.703f, 0.703f, -1.522f, 1.229f, -2.436f, 1.563f)
                curveToRelative(-1.339f, 0.49f, -2.348f, 1.499f, -2.839f, 2.838f)
                curveToRelative(-0.334f, 0.913f, -0.859f, 1.732f, -1.562f, 2.436f)
                curveToRelative(-1.296f, 1.296f, -2.978f, 1.952f, -4.61f, 1.952f)
                curveToRelative(-1.472f, 0.0f, -2.904f, -0.532f, -3.982f, -1.61f)
                curveToRelative(-2.275f, -2.274f, -2.122f, -6.13f, 0.342f, -8.593f)
                curveToRelative(0.703f, -0.703f, 1.522f, -1.229f, 2.436f, -1.563f)
                curveToRelative(1.34f, -0.491f, 2.348f, -1.5f, 2.838f, -2.838f)
                curveToRelative(0.334f, -0.913f, 0.86f, -1.733f, 1.563f, -2.436f)
                curveToRelative(1.181f, -1.18f, 2.715f, -1.873f, 4.32f, -1.949f)
                curveToRelative(1.632f, -0.072f, 3.158f, 0.493f, 4.272f, 1.608f)
                curveToRelative(2.274f, 2.274f, 2.121f, 6.129f, -0.342f, 8.592f)
                close()
                moveTo(13.004f, 19.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(16.004f, 15.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _peanuts!!
    }

private var _peanuts: ImageVector? = null
