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

public val Icons.Outline.InsertSquare: ImageVector
    get() {
        if (_insertSquare != null) {
            return _insertSquare!!
        }
        _insertSquare = Builder(name = "InsertSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.7f, 9.786f)
                curveToRelative(0.395f, 0.387f, 0.4f, 1.02f, 0.014f, 1.414f)
                curveToRelative(-0.195f, 0.2f, -0.455f, 0.3f, -0.714f, 0.3f)
                curveToRelative(-0.253f, 0.0f, -0.505f, -0.095f, -0.7f, -0.286f)
                lineToRelative(-3.3f, -3.234f)
                verticalLineToRelative(15.02f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(11.0f, 7.991f)
                lineToRelative(-3.3f, 3.223f)
                curveToRelative(-0.395f, 0.386f, -1.028f, 0.38f, -1.414f, -0.015f)
                curveToRelative(-0.386f, -0.394f, -0.38f, -1.027f, 0.015f, -1.414f)
                lineToRelative(4.293f, -4.207f)
                curveToRelative(0.385f, -0.385f, 0.893f, -0.577f, 1.403f, -0.578f)
                curveToRelative(0.001f, 0.0f, 0.003f, 0.0f, 0.004f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.002f, 0.0f, 0.003f, 0.0f)
                curveToRelative(0.511f, 0.001f, 1.022f, 0.196f, 1.411f, 0.585f)
                lineToRelative(4.286f, 4.2f)
                close()
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _insertSquare!!
    }

private var _insertSquare: ImageVector? = null
