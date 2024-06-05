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

public val Icons.Filled.TowerControl: ImageVector
    get() {
        if (_towerControl != null) {
            return _towerControl!!
        }
        _towerControl = Builder(name = "TowerControl", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(8.0f, 6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineToRelative(5.678f)
                lineToRelative(0.243f, -1.216f)
                curveToRelative(0.236f, -1.18f, -0.066f, -2.39f, -0.829f, -3.32f)
                reflectiveCurveToRelative(-1.89f, -1.464f, -3.093f, -1.464f)
                horizontalLineToRelative(-1.999f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(0.322f, 12.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(-1.999f)
                curveToRelative(-1.203f, 0.0f, -2.33f, 0.533f, -3.093f, 1.464f)
                reflectiveCurveTo(-0.157f, 9.604f, 0.079f, 10.784f)
                lineToRelative(0.243f, 1.216f)
                close()
                moveTo(23.277f, 14.0f)
                lineToRelative(-0.077f, 0.383f)
                curveToRelative(-0.419f, 2.096f, -2.274f, 3.617f, -4.412f, 3.617f)
                horizontalLineToRelative(-2.789f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.789f)
                curveToRelative(-2.138f, 0.0f, -3.993f, -1.521f, -4.412f, -3.617f)
                lineToRelative(-0.077f, -0.383f)
                lineTo(23.278f, 14.0f)
                close()
            }
        }
        .build()
        return _towerControl!!
    }

private var _towerControl: ImageVector? = null
