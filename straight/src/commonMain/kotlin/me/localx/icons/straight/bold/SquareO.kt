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

public val Icons.Bold.SquareO: ImageVector
    get() {
        if (_squareO != null) {
            return _squareO!!
        }
        _squareO = Builder(name = "SquareO", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-3.314f, 0.0f, -6.011f, 2.713f, -6.011f, 6.048f)
                verticalLineToRelative(1.903f)
                curveToRelative(0.0f, 3.335f, 2.696f, 6.048f, 6.011f, 6.048f)
                reflectiveCurveToRelative(5.989f, -2.713f, 5.989f, -6.048f)
                verticalLineToRelative(-1.903f)
                curveToRelative(0.0f, -3.335f, -2.687f, -6.048f, -5.989f, -6.048f)
                close()
                moveTo(14.989f, 12.952f)
                curveToRelative(0.0f, 1.709f, -1.313f, 3.048f, -2.989f, 3.048f)
                curveToRelative(-1.66f, 0.0f, -3.011f, -1.367f, -3.011f, -3.048f)
                verticalLineToRelative(-1.903f)
                curveToRelative(0.0f, -1.681f, 1.351f, -3.048f, 3.011f, -3.048f)
                curveToRelative(1.676f, 0.0f, 2.989f, 1.339f, 2.989f, 3.048f)
                verticalLineToRelative(1.903f)
                close()
            }
        }
        .build()
        return _squareO!!
    }

private var _squareO: ImageVector? = null
