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

public val Icons.Outline.EarthAmericas: ImageVector
    get() {
        if (_earthAmericas != null) {
            return _earthAmericas!!
        }
        _earthAmericas = Builder(name = "EarthAmericas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                curveToRelative(0.0f, -1.494f, 0.33f, -2.912f, 0.92f, -4.187f)
                lineToRelative(2.08f, 2.187f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(3.0f, -6.5f)
                lineToRelative(-4.0f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(-1.5f, -2.5f)
                reflectiveCurveToRelative(0.738f, -1.148f, 1.616f, -2.48f)
                curveToRelative(3.272f, 0.2f, 6.125f, 1.98f, 7.801f, 4.586f)
                lineToRelative(-2.417f, 1.394f)
                lineToRelative(1.0f, 4.0f)
                lineToRelative(2.896f, 1.438f)
                curveToRelative(-0.699f, 4.835f, -4.871f, 8.562f, -9.896f, 8.562f)
                close()
            }
        }
        .build()
        return _earthAmericas!!
    }

private var _earthAmericas: ImageVector? = null
