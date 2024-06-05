package me.localx.icons.straight.bold

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

public val Icons.Bold.TransformationBlock: ImageVector
    get() {
        if (_transformationBlock != null) {
            return _transformationBlock!!
        }
        _transformationBlock = Builder(name = "TransformationBlock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 19.0f)
                curveToRelative(-0.253f, 0.0f, -0.493f, 0.049f, -0.724f, 0.119f)
                lineToRelative(-2.293f, -1.668f)
                lineToRelative(1.517f, -0.867f)
                lineTo(20.0f, 7.416f)
                lineToRelative(-1.517f, -0.867f)
                lineToRelative(2.293f, -1.668f)
                curveToRelative(0.231f, 0.07f, 0.47f, 0.119f, 0.724f, 0.119f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-1.367f, 0.0f, -2.474f, 1.099f, -2.496f, 2.461f)
                lineToRelative(-3.377f, 2.456f)
                lineToRelative(-3.627f, -2.073f)
                lineToRelative(-3.627f, 2.073f)
                lineToRelative(-3.377f, -2.456f)
                curveToRelative(-0.022f, -1.362f, -1.129f, -2.461f, -2.496f, -2.461f)
                curveTo(1.119f, 0.0f, 0.0f, 1.119f, 0.0f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.253f, 0.0f, 0.493f, -0.049f, 0.724f, -0.119f)
                lineToRelative(2.293f, 1.668f)
                lineToRelative(-1.517f, 0.867f)
                verticalLineToRelative(9.168f)
                lineToRelative(1.517f, 0.867f)
                lineToRelative(-2.293f, 1.668f)
                curveToRelative(-0.231f, -0.07f, -0.47f, -0.119f, -0.724f, -0.119f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.367f, 0.0f, 2.474f, -1.099f, 2.496f, -2.461f)
                lineToRelative(3.377f, -2.456f)
                lineToRelative(3.627f, 2.073f)
                lineToRelative(3.627f, -2.073f)
                lineToRelative(3.377f, 2.456f)
                curveToRelative(0.022f, 1.362f, 1.129f, 2.461f, 2.496f, 2.461f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7.0f, 10.12f)
                lineToRelative(4.0f, 2.286f)
                verticalLineToRelative(4.724f)
                lineToRelative(-4.0f, -2.286f)
                verticalLineToRelative(-4.724f)
                close()
                moveTo(13.0f, 12.406f)
                lineToRelative(4.0f, -2.286f)
                verticalLineToRelative(4.724f)
                lineToRelative(-4.0f, 2.286f)
                verticalLineToRelative(-4.724f)
                close()
                moveTo(15.828f, 8.487f)
                lineToRelative(-3.828f, 2.188f)
                lineToRelative(-3.828f, -2.188f)
                lineToRelative(3.828f, -2.188f)
                lineToRelative(3.828f, 2.188f)
                close()
            }
        }
        .build()
        return _transformationBlock!!
    }

private var _transformationBlock: ImageVector? = null
