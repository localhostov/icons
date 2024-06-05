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

public val Icons.Outline.HockeyPuck: ImageVector
    get() {
        if (_hockeyPuck != null) {
            return _hockeyPuck!!
        }
        _hockeyPuck = Builder(name = "HockeyPuck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 3.813f, 0.0f, 8.5f)
                verticalLineToRelative(7.0f)
                curveTo(0.0f, 20.187f, 5.383f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -3.813f, 12.0f, -8.5f)
                verticalLineToRelative(-7.0f)
                curveTo(24.0f, 3.813f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, 2.916f, 10.0f, 6.5f)
                reflectiveCurveTo(17.514f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(2.0f, 12.084f, 2.0f, 8.5f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(22.0f, 15.5f)
                curveToRelative(0.0f, 3.584f, -4.486f, 6.5f, -10.0f, 6.5f)
                reflectiveCurveTo(2.0f, 19.084f, 2.0f, 15.5f)
                lineTo(2.0f, 13.188f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 10.0f, -3.812f)
                close()
            }
        }
        .build()
        return _hockeyPuck!!
    }

private var _hockeyPuck: ImageVector? = null
