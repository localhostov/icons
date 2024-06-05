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

public val Icons.Outline.GlobeSnow: ImageVector
    get() {
        if (_globeSnow != null) {
            return _globeSnow!!
        }
        _globeSnow = Builder(name = "GlobeSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.474f, -0.801f, -2.764f, -1.991f, -3.458f)
                curveToRelative(1.919f, -2.024f, 2.991f, -4.688f, 2.991f, -7.542f)
                curveTo(23.0f, 4.935f, 18.065f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 2.853f, 1.072f, 5.517f, 2.992f, 7.542f)
                curveToRelative(-1.19f, 0.694f, -1.992f, 1.984f, -1.992f, 3.458f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, 4.038f, 9.0f, 9.0f)
                curveToRelative(0.0f, 2.749f, -1.217f, 5.282f, -3.349f, 7.0f)
                horizontalLineToRelative(-4.651f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.641f)
                curveToRelative(0.843f, 0.0f, 1.325f, -0.963f, 0.819f, -1.637f)
                lineToRelative(-1.022f, -1.363f)
                horizontalLineToRelative(0.295f)
                curveToRelative(0.732f, 0.0f, 1.149f, -0.835f, 0.71f, -1.421f)
                lineToRelative(-2.414f, -3.219f)
                curveToRelative(-0.495f, -0.66f, -1.485f, -0.66f, -1.98f, 0.0f)
                lineToRelative(-2.414f, 3.219f)
                curveToRelative(-0.439f, 0.585f, -0.021f, 1.421f, 0.71f, 1.421f)
                horizontalLineToRelative(0.218f)
                lineToRelative(-1.022f, 1.363f)
                curveToRelative(-0.506f, 0.675f, -0.025f, 1.637f, 0.819f, 1.637f)
                horizontalLineToRelative(1.641f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.652f)
                curveToRelative(-2.132f, -1.719f, -3.348f, -4.252f, -3.348f, -7.0f)
                curveTo(3.0f, 6.038f, 7.037f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                lineTo(4.0f, 22.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(13.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(17.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 10.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _globeSnow!!
    }

private var _globeSnow: ImageVector? = null
