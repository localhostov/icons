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

public val Icons.Outline.DirectionSignalArrow: ImageVector
    get() {
        if (_directionSignalArrow != null) {
            return _directionSignalArrow!!
        }
        _directionSignalArrow = Builder(name = "DirectionSignalArrow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.668f, -0.26f, 1.296f, -0.732f, 1.768f)
                lineToRelative(-2.939f, 2.939f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                horizontalLineToRelative(-5.207f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(2.793f)
                lineToRelative(2.293f, 2.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.939f, -2.939f)
                curveToRelative(-0.472f, -0.472f, -0.732f, -1.1f, -0.732f, -1.768f)
                reflectiveCurveToRelative(0.26f, -1.296f, 0.732f, -1.768f)
                lineToRelative(2.939f, -2.939f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-2.293f, 2.293f)
                horizontalLineToRelative(5.207f)
                curveToRelative(1.125f, 0.0f, 2.164f, 0.373f, 3.0f, 1.003f)
                verticalLineTo(2.793f)
                lineToRelative(-2.293f, 2.293f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.939f, -2.939f)
                curveToRelative(0.404f, -0.405f, 1.268f, -0.732f, 1.768f, -0.732f)
                reflectiveCurveToRelative(1.363f, 0.328f, 1.768f, 0.732f)
                lineToRelative(2.939f, 2.939f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(9.21f)
                curveToRelative(0.836f, -0.629f, 1.875f, -1.003f, 3.0f, -1.003f)
                horizontalLineToRelative(5.207f)
                lineToRelative(-2.293f, -2.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.939f, 2.939f)
                curveToRelative(0.473f, 0.472f, 0.732f, 1.1f, 0.732f, 1.768f)
                close()
            }
        }
        .build()
        return _directionSignalArrow!!
    }

private var _directionSignalArrow: ImageVector? = null
