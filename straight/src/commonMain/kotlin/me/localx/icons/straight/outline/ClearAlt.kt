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

public val Icons.Outline.ClearAlt: ImageVector
    get() {
        if (_clearAlt != null) {
            return _clearAlt!!
        }
        _clearAlt = Builder(name = "ClearAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 0.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveTo(20.86f, 0.0f, 17.0f, 0.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(19.957f, 5.457f)
                lineToRelative(-1.543f, 1.543f)
                lineToRelative(1.543f, 1.543f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.543f, -1.543f)
                lineToRelative(-1.543f, 1.543f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.543f, -1.543f)
                lineToRelative(-1.543f, -1.543f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.543f, 1.543f)
                lineToRelative(1.543f, -1.543f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(12.0f, 14.482f)
                curveToRelative(0.616f, 0.412f, 1.289f, 0.743f, 2.0f, 0.995f)
                verticalLineToRelative(8.523f)
                lineToRelative(-6.0f, -4.5f)
                verticalLineToRelative(-5.12f)
                lineTo(0.0f, 5.38f)
                verticalLineToRelative(-2.38f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(8.349f)
                curveToRelative(-0.706f, 0.571f, -1.325f, 1.244f, -1.831f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(1.62f)
                lineToRelative(8.0f, 9.0f)
                verticalLineToRelative(4.88f)
                lineToRelative(2.0f, 1.5f)
                verticalLineToRelative(-5.518f)
                close()
            }
        }
        .build()
        return _clearAlt!!
    }

private var _clearAlt: ImageVector? = null
