package me.localx.icons.straight.outline

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
                moveToRelative(22.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.207f, -0.717f, -2.249f, -1.746f, -2.725f)
                curveToRelative(1.765f, -1.989f, 2.746f, -4.545f, 2.746f, -7.275f)
                curveTo(23.0f, 4.935f, 18.065f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 2.73f, 0.981f, 5.286f, 2.746f, 7.275f)
                curveToRelative(-1.03f, 0.476f, -1.746f, 1.518f, -1.746f, 2.725f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, 4.038f, 9.0f, 9.0f)
                curveToRelative(0.0f, 2.749f, -1.216f, 5.282f, -3.348f, 7.0f)
                horizontalLineToRelative(-4.652f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.75f)
                lineToRelative(-2.25f, -3.0f)
                horizontalLineToRelative(1.875f)
                lineToRelative(-3.375f, -4.5f)
                lineToRelative(-3.375f, 4.5f)
                horizontalLineToRelative(1.875f)
                lineToRelative(-2.25f, 3.0f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.652f)
                curveToRelative(-2.132f, -1.718f, -3.348f, -4.251f, -3.348f, -7.0f)
                curveTo(3.0f, 6.038f, 7.037f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 21.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(16.0f, 10.5f)
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
