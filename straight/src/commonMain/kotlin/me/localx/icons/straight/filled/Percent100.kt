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

public val Icons.Filled.Percent100: ImageVector
    get() {
        if (_percent100 != null) {
            return _percent100!!
        }
        _percent100 = Builder(name = "Percent100", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.4f, 10.518f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.496f, -0.404f, 0.9f, -0.9f, 0.9f)
                reflectiveCurveToRelative(-0.9f, -0.404f, -0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, 0.404f, -0.9f, 0.9f, -0.9f)
                reflectiveCurveToRelative(0.9f, 0.404f, 0.9f, 0.9f)
                close()
                moveTo(23.533f, 8.715f)
                curveToRelative(0.297f, 1.045f, 0.467f, 2.145f, 0.467f, 3.285f)
                curveToRelative(0.0f, 0.723f, -0.075f, 1.428f, -0.198f, 2.116f)
                curveToRelative(-0.219f, -0.362f, -0.599f, -0.616f, -1.052f, -0.616f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                curveToRelative(0.231f, 0.0f, 0.436f, -0.08f, 0.622f, -0.189f)
                curveToRelative(-1.594f, 4.757f, -6.078f, 8.189f, -11.372f, 8.189f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.223f, 0.0f, 9.654f, 3.342f, 11.303f, 8.0f)
                horizontalLineToRelative(-1.214f)
                lineToRelative(-5.222f, 8.0f)
                horizontalLineToRelative(1.911f)
                lineToRelative(4.756f, -7.285f)
                close()
                moveTo(17.0f, 9.25f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(-1.226f)
                lineTo(0.334f, 10.519f)
                lineToRelative(1.149f, 1.113f)
                lineToRelative(0.917f, -0.946f)
                verticalLineToRelative(5.332f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.018f)
                close()
                moveTo(10.0f, 10.518f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(16.0f, 10.518f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.5f, 9.618f)
                curveToRelative(-0.496f, 0.0f, -0.9f, 0.404f, -0.9f, 0.9f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.496f, 0.404f, 0.9f, 0.9f, 0.9f)
                reflectiveCurveToRelative(0.9f, -0.404f, 0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                close()
            }
        }
        .build()
        return _percent100!!
    }

private var _percent100: ImageVector? = null
