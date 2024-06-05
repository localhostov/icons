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

public val Icons.Filled.CircleQ: ImageVector
    get() {
        if (_circleQ != null) {
            return _circleQ!!
        }
        _circleQ = Builder(name = "CircleQ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(16.043f, 18.457f)
                lineToRelative(-1.139f, -1.139f)
                curveToRelative(-0.819f, 0.586f, -1.822f, 0.932f, -2.904f, 0.932f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.953f, -0.268f, 1.844f, -0.733f, 2.603f)
                lineToRelative(1.19f, 1.19f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(12.0f, 16.25f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.395f, -0.078f, 0.773f, -0.217f, 1.119f)
                lineToRelative(-1.576f, -1.576f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.664f, 1.664f)
                curveToRelative(-0.432f, 0.241f, -0.929f, 0.379f, -1.457f, 0.379f)
                close()
            }
        }
        .build()
        return _circleQ!!
    }

private var _circleQ: ImageVector? = null
