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

public val Icons.Bold.TriangleWarning: ImageVector
    get() {
        if (_triangleWarning != null) {
            return _triangleWarning!!
        }
        _triangleWarning = Builder(name = "TriangleWarning", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.6f, 20.48f)
                curveToRelative(-0.54f, 0.95f, -1.52f, 1.52f, -2.62f, 1.52f)
                horizontalLineToRelative(-4.98f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.98f)
                lineTo(12.02f, 4.02f)
                lineTo(3.0f, 19.01f)
                horizontalLineToRelative(5.0f)
                reflectiveCurveToRelative(0.0f, 2.99f, 0.0f, 2.99f)
                lineTo(3.02f, 22.0f)
                curveToRelative(-1.1f, 0.0f, -2.08f, -0.57f, -2.62f, -1.52f)
                curveToRelative(-0.54f, -0.95f, -0.53f, -2.07f, 0.02f, -3.01f)
                lineTo(9.4f, 2.48f)
                curveToRelative(0.54f, -0.92f, 1.51f, -1.48f, 2.6f, -1.48f)
                reflectiveCurveToRelative(2.06f, 0.56f, 2.6f, 1.49f)
                lineToRelative(8.98f, 14.98f)
                curveToRelative(0.56f, 0.95f, 0.56f, 2.07f, 0.02f, 3.02f)
                close()
                moveTo(10.5f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(10.5f, 22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _triangleWarning!!
    }

private var _triangleWarning: ImageVector? = null
