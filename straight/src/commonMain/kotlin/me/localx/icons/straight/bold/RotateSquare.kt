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

public val Icons.Bold.RotateSquare: ImageVector
    get() {
        if (_rotateSquare != null) {
            return _rotateSquare!!
        }
        _rotateSquare = Builder(name = "RotateSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.941f, 7.059f)
                lineToRelative(2.059f, -2.059f)
                verticalLineToRelative(4.8f)
                curveToRelative(0.0f, 0.663f, -0.537f, 1.2f, -1.2f, 1.2f)
                horizontalLineToRelative(-4.8f)
                lineToRelative(1.823f, -1.823f)
                curveToRelative(-0.745f, -0.743f, -1.756f, -1.177f, -2.823f, -1.177f)
                curveToRelative(-1.859f, 0.0f, -3.411f, 1.28f, -3.858f, 3.0f)
                horizontalLineToRelative(-3.062f)
                curveToRelative(0.488f, -3.387f, 3.401f, -6.0f, 6.92f, -6.0f)
                curveToRelative(1.869f, 0.0f, 3.639f, 0.759f, 4.941f, 2.059f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.5f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.067f, 0.0f, -2.079f, -0.434f, -2.823f, -1.177f)
                lineToRelative(1.823f, -1.823f)
                horizontalLineToRelative(-4.8f)
                curveToRelative(-0.663f, 0.0f, -1.2f, 0.537f, -1.2f, 1.2f)
                verticalLineToRelative(4.8f)
                lineToRelative(2.059f, -2.059f)
                curveToRelative(1.302f, 1.3f, 3.072f, 2.059f, 4.941f, 2.059f)
                curveToRelative(3.519f, 0.0f, 6.432f, -2.613f, 6.92f, -6.0f)
                horizontalLineToRelative(-3.062f)
                curveToRelative(-0.447f, 1.72f, -1.999f, 3.0f, -3.858f, 3.0f)
                close()
            }
        }
        .build()
        return _rotateSquare!!
    }

private var _rotateSquare: ImageVector? = null
