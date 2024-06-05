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

public val Icons.Bold.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.102f)
                curveToRelative(-1.721f, 0.225f, -3.367f, 0.83f, -4.827f, 1.793f)
                lineToRelative(1.652f, 2.504f)
                curveToRelative(0.966f, -0.637f, 2.046f, -1.051f, 3.174f, -1.252f)
                verticalLineToRelative(2.034f)
                curveToRelative(-2.862f, 0.68f, -5.0f, 3.251f, -5.0f, 6.318f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -3.067f, -2.138f, -5.638f, -5.0f, -6.318f)
                verticalLineToRelative(-2.182f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(7.999f, 0.0f)
                close()
                moveTo(10.0f, 13.5f)
                verticalLineToRelative(7.5f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(-8.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
