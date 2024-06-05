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

public val Icons.Outline.CircleM: ImageVector
    get() {
        if (_circleM != null) {
            return _circleM!!
        }
        _circleM = Builder(name = "CircleM", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.039f, 0.02f)
                curveTo(5.422f, 0.02f, 0.039f, 5.402f, 0.039f, 12.02f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.02f, 12.039f, 0.02f)
                close()
                moveTo(12.039f, 22.02f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.02f, 12.039f, 2.02f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(18.039f, 8.142f)
                verticalLineToRelative(8.89f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-8.901f)
                reflectiveCurveToRelative(-0.003f, 0.006f, -0.005f, 0.009f)
                lineToRelative(-3.097f, 6.321f)
                curveToRelative(-0.168f, 0.343f, -0.517f, 0.56f, -0.898f, 0.56f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-0.384f, -0.003f, -0.733f, -0.226f, -0.897f, -0.573f)
                lineToRelative(-2.996f, -6.353f)
                reflectiveCurveToRelative(-0.033f, -0.081f, -0.066f, -0.062f)
                curveToRelative(-0.031f, 0.007f, -0.033f, 0.086f, -0.033f, 0.109f)
                verticalLineToRelative(8.89f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-8.89f)
                curveToRelative(0.0f, -1.008f, 0.633f, -1.835f, 1.575f, -2.057f)
                curveToRelative(0.945f, -0.221f, 1.875f, 0.236f, 2.324f, 1.136f)
                lineToRelative(2.118f, 4.491f)
                lineToRelative(2.186f, -4.46f)
                curveToRelative(0.453f, -0.907f, 1.368f, -1.372f, 2.276f, -1.154f)
                curveToRelative(0.91f, 0.215f, 1.521f, 1.036f, 1.521f, 2.044f)
                close()
            }
        }
        .build()
        return _circleM!!
    }

private var _circleM: ImageVector? = null
