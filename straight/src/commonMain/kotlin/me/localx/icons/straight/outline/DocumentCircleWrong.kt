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

public val Icons.Outline.DocumentCircleWrong: ImageVector
    get() {
        if (_documentCircleWrong != null) {
            return _documentCircleWrong!!
        }
        _documentCircleWrong = Builder(name = "DocumentCircleWrong", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.518f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.414f)
                lineTo(12.414f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(11.349f)
                curveToRelative(-0.706f, -0.571f, -1.325f, -1.244f, -1.831f, -2.0f)
                close()
                moveTo(13.0f, 3.414f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(-3.586f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(19.957f, 15.457f)
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
            }
        }
        .build()
        return _documentCircleWrong!!
    }

private var _documentCircleWrong: ImageVector? = null
