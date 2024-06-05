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

public val Icons.Filled.PanFrying: ImageVector
    get() {
        if (_panFrying != null) {
            return _panFrying!!
        }
        _panFrying = Builder(name = "PanFrying", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.595f, 17.181f)
                curveToRelative(1.502f, -1.817f, 2.405f, -4.145f, 2.405f, -6.681f)
                curveTo(21.0f, 4.71f, 16.29f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveTo(0.0f, 4.71f, 0.0f, 10.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                curveToRelative(2.536f, 0.0f, 4.864f, -0.904f, 6.681f, -2.405f)
                lineToRelative(5.375f, 5.375f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.375f, -5.375f)
                close()
                moveTo(16.101f, 13.81f)
                curveToRelative(-0.309f, 2.389f, -2.438f, 4.19f, -5.01f, 4.19f)
                curveToRelative(-4.461f, 0.0f, -8.091f, -3.629f, -8.091f, -8.091f)
                verticalLineToRelative(-0.591f)
                curveToRelative(0.0f, -3.484f, 2.834f, -6.318f, 6.318f, -6.318f)
                curveToRelative(2.144f, 0.0f, 4.067f, 1.182f, 5.234f, 3.188f)
                curveToRelative(2.0f, 0.437f, 3.448f, 2.083f, 3.448f, 4.017f)
                curveToRelative(0.0f, 1.408f, -0.745f, 2.792f, -1.899f, 3.605f)
                close()
                moveTo(13.803f, 8.09f)
                lineToRelative(-0.55f, -0.056f)
                lineToRelative(-0.245f, -0.496f)
                curveToRelative(-0.784f, -1.589f, -2.163f, -2.538f, -3.689f, -2.538f)
                curveToRelative(-2.381f, 0.0f, -4.318f, 1.937f, -4.318f, 4.318f)
                verticalLineToRelative(0.591f)
                curveToRelative(0.0f, 3.358f, 2.732f, 6.091f, 6.091f, 6.091f)
                curveToRelative(1.654f, 0.0f, 3.052f, -1.243f, 3.052f, -2.714f)
                verticalLineToRelative(-0.612f)
                lineToRelative(0.542f, -0.339f)
                curveToRelative(0.762f, -0.389f, 1.315f, -1.285f, 1.315f, -2.13f)
                curveToRelative(0.0f, -1.183f, -1.117f, -2.004f, -2.197f, -2.115f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _panFrying!!
    }

private var _panFrying: ImageVector? = null
