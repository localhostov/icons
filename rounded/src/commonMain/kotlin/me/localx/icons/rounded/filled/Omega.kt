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

public val Icons.Filled.Omega: ImageVector
    get() {
        if (_omega != null) {
            return _omega!!
        }
        _omega = Builder(name = "Omega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 24.0f)
                horizontalLineToRelative(-5.36f)
                curveToRelative(-1.455f, 0.0f, -2.64f, -1.185f, -2.64f, -2.64f)
                curveToRelative(0.0f, -1.028f, 0.598f, -1.964f, 1.522f, -2.385f)
                curveToRelative(3.379f, -1.538f, 5.478f, -4.595f, 5.478f, -7.976f)
                curveToRelative(0.0f, -4.962f, -4.486f, -9.0f, -10.0f, -9.0f)
                reflectiveCurveTo(2.0f, 6.038f, 2.0f, 11.0f)
                curveToRelative(0.0f, 3.381f, 2.099f, 6.438f, 5.478f, 7.976f)
                curveToRelative(0.925f, 0.421f, 1.522f, 1.357f, 1.522f, 2.385f)
                curveToRelative(0.0f, 1.455f, -1.184f, 2.64f, -2.639f, 2.64f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.361f)
                curveToRelative(0.353f, 0.0f, 0.639f, -0.287f, 0.639f, -0.64f)
                curveToRelative(0.0f, -0.246f, -0.138f, -0.468f, -0.351f, -0.564f)
                curveTo(2.547f, 18.929f, 0.0f, 15.175f, 0.0f, 11.0f)
                curveTo(0.0f, 4.935f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 4.935f, 12.0f, 11.0f)
                curveToRelative(0.0f, 4.175f, -2.548f, 7.929f, -6.649f, 9.796f)
                curveToRelative(-0.213f, 0.097f, -0.351f, 0.318f, -0.351f, 0.564f)
                curveToRelative(0.0f, 0.353f, 0.287f, 0.64f, 0.64f, 0.64f)
                horizontalLineToRelative(5.36f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _omega!!
    }

private var _omega: ImageVector? = null
