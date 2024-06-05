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

public val Icons.Bold.Citrus: ImageVector
    get() {
        if (_citrus != null) {
            return _citrus!!
        }
        _citrus = Builder(name = "Citrus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 7.0f)
                curveToRelative(0.0f, -1.838f, -0.478f, -3.683f, -1.419f, -5.483f)
                lineTo(11.739f, 0.126f)
                curveToRelative(0.982f, 1.877f, 1.558f, 3.811f, 1.716f, 5.763f)
                curveToRelative(0.136f, -1.169f, 0.532f, -3.004f, 1.685f, -4.217f)
                curveTo(16.946f, -0.229f, 19.991f, 0.01f, 19.991f, 0.01f)
                curveToRelative(0.0f, 0.0f, 0.226f, 3.203f, -1.58f, 5.103f)
                curveToRelative(-1.604f, 1.687f, -4.321f, 1.866f, -4.911f, 1.885f)
                verticalLineToRelative(0.002f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(21.251f, 4.366f)
                curveToRelative(-0.318f, 0.754f, -0.765f, 1.506f, -1.402f, 2.165f)
                curveToRelative(-0.136f, 0.141f, -0.277f, 0.272f, -0.421f, 0.397f)
                curveToRelative(0.99f, 1.445f, 1.572f, 3.192f, 1.572f, 5.072f)
                curveToRelative(0.0f, 4.962f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.962f, 3.0f, 12.0f)
                curveToRelative(0.0f, -3.507f, 2.021f, -6.544f, 4.956f, -8.029f)
                curveToRelative(-0.177f, -0.51f, -0.382f, -1.02f, -0.647f, -1.527f)
                lineToRelative(-0.622f, -1.188f)
                curveTo(2.732f, 3.221f, 0.0f, 7.293f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -2.898f, -1.033f, -5.558f, -2.749f, -7.634f)
                close()
                moveTo(15.5f, 18.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 12.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _citrus!!
    }

private var _citrus: ImageVector? = null
