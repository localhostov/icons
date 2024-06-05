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

public val Icons.Filled.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 16.592f)
                lineTo(0.0f, 0.073f)
                reflectiveCurveToRelative(1.387f, 0.582f, 1.387f, 0.582f)
                curveToRelative(0.056f, 0.023f, 5.645f, 2.345f, 10.613f, 2.345f)
                reflectiveCurveTo(22.557f, 0.679f, 22.613f, 0.655f)
                lineToRelative(1.387f, -0.582f)
                verticalLineToRelative(22.804f)
                reflectiveCurveToRelative(-12.954f, -12.954f, -12.954f, -12.954f)
                curveToRelative(-1.206f, -1.206f, -3.169f, -1.206f, -4.377f, 0.0f)
                lineTo(0.0f, 16.592f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                close()
                moveTo(9.632f, 11.338f)
                curveToRelative(-0.427f, -0.427f, -1.122f, -0.429f, -1.549f, 0.0f)
                lineTo(0.0f, 19.42f)
                verticalLineToRelative(4.605f)
                reflectiveCurveToRelative(1.354f, -0.512f, 1.354f, -0.512f)
                curveToRelative(0.056f, -0.021f, 5.659f, -2.117f, 10.646f, -2.117f)
                curveToRelative(3.558f, 0.0f, 7.428f, 1.066f, 9.375f, 1.685f)
                lineToRelative(-11.743f, -11.743f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
