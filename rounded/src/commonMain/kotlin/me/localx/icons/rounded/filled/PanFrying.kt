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
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-5.113f, -5.113f)
                curveToRelative(1.502f, -1.817f, 2.406f, -4.145f, 2.406f, -6.68f)
                curveTo(21.0f, 4.71f, 16.29f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveTo(0.0f, 4.71f, 0.0f, 10.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                curveToRelative(2.536f, 0.0f, 4.864f, -0.904f, 6.68f, -2.406f)
                lineToRelative(5.113f, 5.113f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(16.238f, 13.707f)
                curveToRelative(-0.086f, 0.067f, -0.143f, 0.159f, -0.16f, 0.26f)
                curveToRelative(-0.388f, 2.299f, -2.532f, 4.033f, -4.987f, 4.033f)
                curveToRelative(-4.461f, 0.0f, -8.091f, -3.629f, -8.091f, -8.091f)
                verticalLineToRelative(-0.48f)
                curveToRelative(0.0f, -3.12f, 2.192f, -5.782f, 5.211f, -6.328f)
                curveToRelative(2.558f, -0.46f, 4.926f, 0.72f, 6.327f, 3.088f)
                curveToRelative(1.989f, 0.475f, 3.462f, 2.136f, 3.462f, 4.015f)
                curveToRelative(0.0f, 1.321f, -0.675f, 2.663f, -1.762f, 3.502f)
                close()
                moveTo(14.157f, 8.151f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.567f, -0.136f, -1.059f, -0.495f, -1.349f, -0.985f)
                curveToRelative(-0.411f, -0.693f, -1.515f, -2.167f, -3.479f, -2.167f)
                curveToRelative(-0.24f, 0.0f, -0.493f, 0.022f, -0.759f, 0.07f)
                curveToRelative(-2.067f, 0.374f, -3.568f, 2.208f, -3.568f, 4.36f)
                verticalLineToRelative(0.48f)
                curveToRelative(0.0f, 3.358f, 2.732f, 6.091f, 6.091f, 6.091f)
                curveToRelative(1.467f, 0.0f, 2.791f, -1.04f, 3.015f, -2.366f)
                curveToRelative(0.101f, -0.599f, 0.424f, -1.136f, 0.91f, -1.511f)
                curveToRelative(0.598f, -0.461f, 0.984f, -1.214f, 0.984f, -1.918f)
                curveToRelative(0.0f, -1.109f, -0.956f, -1.842f, -1.843f, -2.054f)
                close()
                moveTo(9.0f, 12.001f)
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
