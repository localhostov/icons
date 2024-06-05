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

public val Icons.Filled.CircleM: ImageVector
    get() {
        if (_circleM != null) {
            return _circleM!!
        }
        _circleM = Builder(name = "CircleM", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(18.0f, 17.012f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-8.901f)
                reflectiveCurveToRelative(-0.003f, 0.006f, -0.005f, 0.009f)
                lineToRelative(-3.097f, 6.321f)
                curveToRelative(-0.168f, 0.343f, -0.517f, 0.56f, -0.898f, 0.56f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-0.384f, -0.003f, -0.733f, -0.226f, -0.897f, -0.573f)
                lineToRelative(-2.996f, -6.352f)
                reflectiveCurveToRelative(-0.035f, -0.082f, -0.067f, -0.062f)
                curveToRelative(-0.031f, 0.007f, -0.033f, 0.085f, -0.033f, 0.108f)
                verticalLineToRelative(8.89f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-8.89f)
                curveToRelative(0.0f, -1.008f, 0.633f, -1.834f, 1.574f, -2.056f)
                curveToRelative(0.943f, -0.22f, 1.876f, 0.235f, 2.325f, 1.136f)
                lineToRelative(2.118f, 4.49f)
                lineToRelative(2.186f, -4.46f)
                curveToRelative(0.453f, -0.906f, 1.364f, -1.369f, 2.275f, -1.153f)
                curveToRelative(0.91f, 0.214f, 1.522f, 1.035f, 1.522f, 2.043f)
                verticalLineToRelative(8.89f)
                close()
            }
        }
        .build()
        return _circleM!!
    }

private var _circleM: ImageVector? = null
