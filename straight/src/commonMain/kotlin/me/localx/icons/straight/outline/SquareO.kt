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

public val Icons.Outline.SquareO: ImageVector
    get() {
        if (_squareO != null) {
            return _squareO!!
        }
        _squareO = Builder(name = "SquareO", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-3.315f, 0.0f, -6.012f, 2.716f, -6.012f, 6.054f)
                verticalLineToRelative(1.893f)
                curveToRelative(0.0f, 3.338f, 2.697f, 6.054f, 6.012f, 6.054f)
                reflectiveCurveToRelative(5.988f, -2.716f, 5.988f, -6.054f)
                verticalLineToRelative(-1.893f)
                curveToRelative(0.0f, -3.338f, -2.687f, -6.054f, -5.988f, -6.054f)
                close()
                moveTo(15.988f, 12.946f)
                curveToRelative(0.0f, 2.273f, -1.752f, 4.054f, -3.988f, 4.054f)
                curveToRelative(-2.212f, 0.0f, -4.012f, -1.818f, -4.012f, -4.054f)
                verticalLineToRelative(-1.893f)
                curveToRelative(0.0f, -2.235f, 1.8f, -4.054f, 4.012f, -4.054f)
                curveToRelative(2.236f, 0.0f, 3.988f, 1.781f, 3.988f, 4.054f)
                verticalLineToRelative(1.893f)
                close()
            }
        }
        .build()
        return _squareO!!
    }

private var _squareO: ImageVector? = null
