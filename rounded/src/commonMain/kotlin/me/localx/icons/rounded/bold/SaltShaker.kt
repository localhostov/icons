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

public val Icons.Bold.SaltShaker: ImageVector
    get() {
        if (_saltShaker != null) {
            return _saltShaker!!
        }
        _saltShaker = Builder(name = "SaltShaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.975f, 17.987f)
                lineToRelative(-0.975f, -9.562f)
                verticalLineToRelative(-1.925f)
                curveTo(21.0f, 0.0f, 14.226f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.0f, 0.0f, 3.0f, 6.5f)
                verticalLineToRelative(1.925f)
                lineToRelative(-0.976f, 9.574f)
                curveToRelative(-0.145f, 1.538f, 0.368f, 3.076f, 1.408f, 4.219f)
                reflectiveCurveToRelative(2.522f, 1.798f, 4.067f, 1.798f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.545f, 0.0f, 3.027f, -0.655f, 4.067f, -1.798f)
                reflectiveCurveToRelative(1.553f, -2.681f, 1.407f, -4.23f)
                close()
                moveTo(8.0f, 3.503f)
                curveToRelative(0.002f, 0.827f, 0.672f, 1.497f, 1.5f, 1.497f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.48f)
                curveToRelative(0.314f, -0.013f, 0.647f, -0.02f, 1.0f, -0.02f)
                reflectiveCurveToRelative(0.686f, 0.007f, 1.0f, 0.02f)
                verticalLineToRelative(0.48f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.498f, -0.67f, 1.5f, -1.497f)
                curveToRelative(1.591f, 0.576f, 2.0f, 1.619f, 2.0f, 2.997f)
                verticalLineToRelative(0.5f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 0.409f, -2.422f, 2.0f, -2.997f)
                close()
                moveTo(18.349f, 20.198f)
                curveToRelative(-0.479f, 0.527f, -1.136f, 0.817f, -1.849f, 0.817f)
                lineTo(7.5f, 21.015f)
                curveToRelative(-0.712f, 0.0f, -1.369f, -0.29f, -1.849f, -0.817f)
                curveToRelative(-0.48f, -0.527f, -0.708f, -1.208f, -0.642f, -1.907f)
                lineToRelative(0.845f, -8.291f)
                horizontalLineToRelative(12.29f)
                lineToRelative(0.844f, 8.28f)
                curveToRelative(0.067f, 0.71f, -0.161f, 1.391f, -0.641f, 1.918f)
                close()
                moveTo(14.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 13.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _saltShaker!!
    }

private var _saltShaker: ImageVector? = null
