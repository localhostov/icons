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

public val Icons.Outline.SortDown: ImageVector
    get() {
        if (_sortDown != null) {
            return _sortDown!!
        }
        _sortDown = Builder(name = "SortDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.756f, 0.0f, -1.479f, -0.322f, -1.985f, -0.886f)
                lineTo(3.584f, 10.587f)
                curveToRelative(-0.602f, -0.658f, -0.746f, -1.536f, -0.401f, -2.318f)
                reflectiveCurveToRelative(1.09f, -1.269f, 1.944f, -1.269f)
                horizontalLineToRelative(13.746f)
                curveToRelative(0.854f, 0.0f, 1.6f, 0.486f, 1.944f, 1.269f)
                reflectiveCurveToRelative(0.2f, 1.66f, -0.376f, 2.291f)
                lineToRelative(-6.487f, 6.589f)
                curveToRelative(-0.475f, 0.529f, -1.198f, 0.852f, -1.954f, 0.852f)
                close()
                moveTo(5.127f, 9.0f)
                curveToRelative(-0.026f, 0.0f, -0.081f, 0.0f, -0.114f, 0.074f)
                curveToRelative(-0.033f, 0.075f, 0.004f, 0.116f, 0.022f, 0.136f)
                lineToRelative(6.437f, 6.534f)
                curveToRelative(0.204f, 0.227f, 0.417f, 0.256f, 0.528f, 0.256f)
                reflectiveCurveToRelative(0.324f, -0.029f, 0.497f, -0.222f)
                lineToRelative(6.493f, -6.596f)
                reflectiveCurveToRelative(0.058f, 0.03f, -0.003f, -0.108f)
                curveToRelative(-0.033f, -0.074f, -0.088f, -0.074f, -0.114f, -0.074f)
                horizontalLineTo(5.127f)
                close()
            }
        }
        .build()
        return _sortDown!!
    }

private var _sortDown: ImageVector? = null
