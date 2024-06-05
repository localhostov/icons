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

public val Icons.Filled.SquareD: ImageVector
    get() {
        if (_squareD != null) {
            return _squareD!!
        }
        _squareD = Builder(name = "SquareD", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(18.0f, 12.857f)
                curveToRelative(0.0f, 3.387f, -2.756f, 6.143f, -6.143f, 6.143f)
                horizontalLineToRelative(-3.857f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(6.0f, 7.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.857f)
                curveToRelative(3.387f, 0.0f, 6.143f, 2.756f, 6.143f, 6.143f)
                verticalLineToRelative(1.714f)
                close()
                moveTo(16.0f, 11.143f)
                verticalLineToRelative(1.714f)
                curveToRelative(0.0f, 2.285f, -1.858f, 4.143f, -4.143f, 4.143f)
                horizontalLineToRelative(-3.857f)
                lineTo(8.0f, 7.0f)
                reflectiveCurveToRelative(3.857f, 0.0f, 3.857f, 0.0f)
                curveToRelative(2.284f, 0.0f, 4.143f, 1.858f, 4.143f, 4.143f)
                close()
            }
        }
        .build()
        return _squareD!!
    }

private var _squareD: ImageVector? = null
