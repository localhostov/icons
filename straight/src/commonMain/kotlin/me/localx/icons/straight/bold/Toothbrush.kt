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

public val Icons.Bold.Toothbrush: ImageVector
    get() {
        if (_toothbrush != null) {
            return _toothbrush!!
        }
        _toothbrush = Builder(name = "Toothbrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.5f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(7.5f, 2.0f)
                curveTo(3.364f, 2.0f, 0.0f, 5.364f, 0.0f, 9.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.05f)
                curveToRelative(-1.141f, 0.232f, -2.0f, 1.24f, -2.0f, 2.45f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-8.868f)
                curveToRelative(2.377f, -1.259f, 4.0f, -3.759f, 4.0f, -6.632f)
                close()
                moveTo(7.5f, 5.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.654f, 0.0f, 1.279f, -0.126f, 1.853f, -0.355f)
                curveToRelative(-0.508f, 1.929f, -2.267f, 3.355f, -4.353f, 3.355f)
                lineTo(3.257f, 8.0f)
                curveToRelative(0.619f, -1.746f, 2.287f, -3.0f, 4.243f, -3.0f)
                close()
                moveTo(12.0f, 11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.168f, 0.0f, 0.335f, -0.006f, 0.5f, -0.017f)
                verticalLineToRelative(8.017f)
                close()
            }
        }
        .build()
        return _toothbrush!!
    }

private var _toothbrush: ImageVector? = null
