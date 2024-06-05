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

public val Icons.Filled.Manhole: ImageVector
    get() {
        if (_manhole != null) {
            return _manhole!!
        }
        _manhole = Builder(name = "Manhole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 0.168f)
                verticalLineToRelative(0.332f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                lineTo(10.0f, 0.168f)
                curveTo(4.332f, 1.123f, 0.0f, 6.064f, 0.0f, 12.0f)
                reflectiveCurveToRelative(4.332f, 10.877f, 10.0f, 11.832f)
                verticalLineToRelative(-0.332f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(0.332f)
                curveToRelative(5.668f, -0.955f, 10.0f, -5.897f, 10.0f, -11.832f)
                reflectiveCurveTo(19.668f, 1.123f, 14.0f, 0.168f)
                close()
                moveTo(8.13f, 5.0f)
                horizontalLineToRelative(7.74f)
                curveToRelative(0.915f, 0.507f, 1.719f, 1.189f, 2.37f, 2.0f)
                lineTo(5.76f, 7.0f)
                curveToRelative(0.651f, -0.811f, 1.454f, -1.493f, 2.37f, -2.0f)
                close()
                moveTo(15.87f, 19.0f)
                horizontalLineToRelative(-7.74f)
                curveToRelative(-0.915f, -0.507f, -1.719f, -1.189f, -2.37f, -2.0f)
                horizontalLineToRelative(12.479f)
                curveToRelative(-0.651f, 0.811f, -1.454f, 1.493f, -2.37f, 2.0f)
                close()
                moveTo(19.413f, 15.0f)
                lineTo(4.587f, 15.0f)
                curveToRelative(-0.256f, -0.631f, -0.431f, -1.301f, -0.518f, -2.0f)
                horizontalLineToRelative(15.862f)
                curveToRelative(-0.087f, 0.699f, -0.262f, 1.369f, -0.518f, 2.0f)
                close()
                moveTo(4.069f, 11.0f)
                curveToRelative(0.087f, -0.699f, 0.262f, -1.369f, 0.518f, -2.0f)
                horizontalLineToRelative(14.826f)
                curveToRelative(0.256f, 0.631f, 0.431f, 1.301f, 0.518f, 2.0f)
                lineTo(4.069f, 11.0f)
                close()
            }
        }
        .build()
        return _manhole!!
    }

private var _manhole: ImageVector? = null
