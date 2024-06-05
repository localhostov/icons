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

public val Icons.Filled.SquareQ: ImageVector
    get() {
        if (_squareQ != null) {
            return _squareQ!!
        }
        _squareQ = Builder(name = "SquareQ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(17.707f, 18.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-0.827f, -0.827f)
                curveToRelative(-0.979f, 0.705f, -2.176f, 1.12f, -3.466f, 1.12f)
                curveToRelative(-3.314f, 0.0f, -6.012f, -2.716f, -6.012f, -6.054f)
                verticalLineToRelative(-1.893f)
                curveToRelative(0.0f, -3.338f, 2.697f, -6.054f, 6.012f, -6.054f)
                reflectiveCurveToRelative(5.988f, 2.716f, 5.988f, 6.054f)
                verticalLineToRelative(1.893f)
                curveToRelative(0.0f, 1.309f, -0.413f, 2.522f, -1.115f, 3.513f)
                lineToRelative(0.833f, 0.833f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(15.988f, 11.054f)
                verticalLineToRelative(1.893f)
                curveToRelative(0.0f, 0.766f, -0.199f, 1.475f, -0.548f, 2.08f)
                lineToRelative(-1.733f, -1.733f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(1.742f, 1.742f)
                curveToRelative(-0.593f, 0.351f, -1.287f, 0.551f, -2.035f, 0.551f)
                curveToRelative(-2.212f, 0.0f, -4.012f, -1.818f, -4.012f, -4.054f)
                verticalLineToRelative(-1.893f)
                curveToRelative(0.0f, -2.235f, 1.8f, -4.054f, 4.012f, -4.054f)
                curveToRelative(2.236f, 0.0f, 3.988f, 1.781f, 3.988f, 4.054f)
                close()
            }
        }
        .build()
        return _squareQ!!
    }

private var _squareQ: ImageVector? = null
