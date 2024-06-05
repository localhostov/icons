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

public val Icons.Outline.Manhole: ImageVector
    get() {
        if (_manhole != null) {
            return _manhole!!
        }
        _manhole = Builder(name = "Manhole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.76f, 17.0f)
                horizontalLineToRelative(12.479f)
                curveToRelative(-0.651f, 0.811f, -1.454f, 1.493f, -2.37f, 2.0f)
                horizontalLineToRelative(-7.74f)
                curveToRelative(-0.915f, -0.507f, -1.719f, -1.189f, -2.37f, -2.0f)
                close()
                moveTo(19.413f, 9.0f)
                lineTo(4.587f, 9.0f)
                curveToRelative(-0.256f, 0.631f, -0.431f, 1.301f, -0.518f, 2.0f)
                horizontalLineToRelative(15.862f)
                curveToRelative(-0.087f, -0.699f, -0.262f, -1.369f, -0.518f, -2.0f)
                close()
                moveTo(15.87f, 5.0f)
                horizontalLineToRelative(-7.74f)
                curveToRelative(-0.915f, 0.507f, -1.719f, 1.189f, -2.37f, 2.0f)
                horizontalLineToRelative(12.479f)
                curveToRelative(-0.651f, -0.811f, -1.454f, -1.493f, -2.37f, -2.0f)
                close()
                moveTo(4.587f, 15.0f)
                horizontalLineToRelative(14.826f)
                curveToRelative(0.256f, -0.631f, 0.431f, -1.301f, 0.518f, -2.0f)
                lineTo(4.069f, 13.0f)
                curveToRelative(0.087f, 0.699f, 0.262f, 1.369f, 0.518f, 2.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -4.832f, -3.446f, -8.876f, -8.01f, -9.801f)
                curveToRelative(-0.1f, 1.009f, -0.954f, 1.801f, -1.99f, 1.801f)
                reflectiveCurveToRelative(-1.89f, -0.791f, -1.99f, -1.801f)
                curveTo(5.446f, 3.124f, 2.0f, 7.168f, 2.0f, 12.0f)
                reflectiveCurveToRelative(3.446f, 8.876f, 8.01f, 9.801f)
                curveToRelative(0.1f, -1.009f, 0.954f, -1.801f, 1.99f, -1.801f)
                reflectiveCurveToRelative(1.89f, 0.791f, 1.99f, 1.801f)
                curveToRelative(4.564f, -0.925f, 8.01f, -4.968f, 8.01f, -9.801f)
                close()
            }
        }
        .build()
        return _manhole!!
    }

private var _manhole: ImageVector? = null
