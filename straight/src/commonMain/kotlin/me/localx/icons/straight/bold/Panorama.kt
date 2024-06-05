package me.localx.icons.straight.bold

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

public val Icons.Bold.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 9.962f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 23.938f)
                lineToRelative(-2.06f, -0.828f)
                curveToRelative(-0.053f, -0.021f, -5.301f, -2.109f, -9.94f, -2.109f)
                reflectiveCurveToRelative(-9.887f, 2.088f, -9.94f, 2.109f)
                lineTo(0.0f, 23.938f)
                lineTo(0.0f, 0.009f)
                reflectiveCurveToRelative(2.068f, 0.847f, 2.068f, 0.847f)
                curveToRelative(0.052f, 0.021f, 5.297f, 2.145f, 9.931f, 2.145f)
                reflectiveCurveTo(21.879f, 0.877f, 21.931f, 0.855f)
                lineTo(23.999f, 0.009f)
                verticalLineToRelative(23.929f)
                close()
                moveTo(3.0f, 4.373f)
                verticalLineToRelative(10.627f)
                lineToRelative(4.586f, -4.586f)
                curveToRelative(0.781f, -0.781f, 2.047f, -0.781f, 2.828f, 0.0f)
                lineToRelative(8.613f, 8.613f)
                curveToRelative(0.735f, 0.193f, 1.402f, 0.392f, 1.973f, 0.574f)
                lineTo(21.0f, 4.373f)
                curveToRelative(-2.146f, 0.695f, -5.647f, 1.627f, -9.0f, 1.627f)
                reflectiveCurveToRelative(-6.854f, -0.932f, -9.0f, -1.627f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
