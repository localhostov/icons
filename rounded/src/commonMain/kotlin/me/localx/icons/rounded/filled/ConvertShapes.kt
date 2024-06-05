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

public val Icons.Filled.ConvertShapes: ImageVector
    get() {
        if (_convertShapes != null) {
            return _convertShapes!!
        }
        _convertShapes = Builder(name = "ConvertShapes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.366f, 2.0f)
                horizontalLineToRelative(-2.366f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.655f)
                curveToRelative(-2.798f, 1.618f, -4.713f, 4.518f, -5.004f, 7.745f)
                curveToRelative(-0.047f, 0.52f, -0.483f, 0.91f, -0.995f, 0.91f)
                curveToRelative(-0.55f, -0.05f, -1.046f, -0.54f, -0.997f, -1.09f)
                curveTo(0.331f, 7.284f, 2.359f, 3.997f, 5.366f, 2.0f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(3.0f, 14.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(23.996f, 13.09f)
                curveToRelative(0.05f, -0.55f, -0.356f, -1.036f, -0.906f, -1.086f)
                curveToRelative(-0.543f, -0.05f, -1.036f, 0.356f, -1.086f, 0.906f)
                curveToRelative(-0.291f, 3.226f, -2.205f, 6.126f, -5.004f, 7.744f)
                verticalLineToRelative(-2.655f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.366f)
                curveToRelative(3.007f, -1.997f, 5.036f, -5.284f, 5.362f, -8.91f)
                close()
                moveTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.468f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.468f, 5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _convertShapes!!
    }

private var _convertShapes: ImageVector? = null
