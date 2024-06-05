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
                moveToRelative(14.5f, 9.25f)
                curveToRelative(0.0f, -0.967f, 0.784f, -1.75f, 1.75f, -1.75f)
                reflectiveCurveToRelative(1.75f, 0.783f, 1.75f, 1.75f)
                reflectiveCurveToRelative(-0.784f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveToRelative(-1.75f, -0.784f, -1.75f, -1.75f)
                close()
                moveTo(24.0f, 2.992f)
                verticalLineToRelative(18.051f)
                curveToRelative(0.0f, 1.082f, -0.561f, 2.048f, -1.5f, 2.582f)
                curveToRelative(-0.456f, 0.259f, -0.965f, 0.389f, -1.475f, 0.389f)
                curveToRelative(-0.53f, 0.0f, -1.061f, -0.141f, -1.532f, -0.421f)
                curveToRelative(-2.771f, -1.648f, -5.433f, -2.557f, -7.493f, -2.557f)
                reflectiveCurveToRelative(-4.722f, 0.908f, -7.493f, 2.557f)
                curveToRelative(-0.922f, 0.549f, -2.075f, 0.561f, -3.007f, 0.032f)
                curveToRelative(-0.939f, -0.534f, -1.5f, -1.5f, -1.5f, -2.582f)
                lineTo(0.0f, 2.992f)
                curveTo(0.0f, 1.91f, 0.561f, 0.945f, 1.5f, 0.411f)
                curveToRelative(0.931f, -0.528f, 2.083f, -0.517f, 3.007f, 0.032f)
                curveToRelative(2.771f, 1.648f, 5.433f, 2.557f, 7.493f, 2.557f)
                reflectiveCurveToRelative(4.722f, -0.908f, 7.493f, -2.557f)
                curveToRelative(0.923f, -0.549f, 2.075f, -0.561f, 3.007f, -0.032f)
                curveToRelative(0.939f, 0.534f, 1.5f, 1.499f, 1.5f, 2.581f)
                close()
                moveTo(2.973f, 3.021f)
                lineToRelative(0.018f, 11.988f)
                lineToRelative(3.432f, -3.432f)
                curveToRelative(1.423f, -1.423f, 3.731f, -1.423f, 5.154f, 0.0f)
                lineToRelative(9.418f, 9.418f)
                reflectiveCurveToRelative(0.003f, 0.002f, 0.005f, 0.003f)
                lineTo(21.0f, 2.992f)
                curveToRelative(-2.257f, 1.388f, -5.677f, 3.008f, -9.0f, 3.008f)
                reflectiveCurveToRelative(-6.743f, -1.62f, -9.027f, -2.979f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
