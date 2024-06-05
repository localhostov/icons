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

public val Icons.Outline.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.608f, 10.963f)
                curveToRelative(1.407f, 0.269f, 2.623f, -0.948f, 2.354f, -2.354f)
                curveToRelative(-0.149f, -0.782f, -0.789f, -1.421f, -1.571f, -1.571f)
                curveToRelative(-1.407f, -0.269f, -2.623f, 0.948f, -2.354f, 2.354f)
                curveToRelative(0.149f, 0.782f, 0.789f, 1.421f, 1.571f, 1.571f)
                close()
                moveTo(24.0f, 0.073f)
                lineToRelative(-1.387f, 0.582f)
                curveToRelative(-0.056f, 0.023f, -5.645f, 2.345f, -10.613f, 2.345f)
                reflectiveCurveTo(1.443f, 0.679f, 1.387f, 0.655f)
                lineTo(0.0f, 0.073f)
                verticalLineToRelative(23.951f)
                reflectiveCurveToRelative(1.354f, -0.512f, 1.354f, -0.512f)
                curveToRelative(0.056f, -0.021f, 5.659f, -2.117f, 10.646f, -2.117f)
                reflectiveCurveToRelative(10.59f, 2.096f, 10.646f, 2.117f)
                lineToRelative(1.354f, 0.512f)
                lineTo(24.0f, 0.073f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(3.863f, 0.0f, 7.927f, -1.238f, 10.0f, -1.973f)
                verticalLineToRelative(17.85f)
                lineToRelative(-10.954f, -10.954f)
                curveToRelative(-1.209f, -1.209f, -3.169f, -1.209f, -4.377f, 0.0f)
                lineToRelative(-4.668f, 4.668f)
                lineTo(2.001f, 3.027f)
                curveToRelative(2.073f, 0.734f, 6.137f, 1.973f, 10.0f, 1.973f)
                close()
                moveTo(2.0f, 21.178f)
                verticalLineToRelative(-3.758f)
                lineToRelative(6.083f, -6.082f)
                curveToRelative(0.428f, -0.428f, 1.121f, -0.428f, 1.549f, 0.0f)
                lineToRelative(8.884f, 8.884f)
                curveToRelative(-1.951f, -0.447f, -4.268f, -0.826f, -6.516f, -0.826f)
                curveToRelative(-3.869f, 0.0f, -7.942f, 1.123f, -10.0f, 1.782f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
