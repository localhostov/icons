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

public val Icons.Filled.Left: ImageVector
    get() {
        if (_left != null) {
            return _left!!
        }
        _left = Builder(name = "Left", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 22.03f)
                curveToRelative(-0.77f, 0.0f, -1.51f, -0.3f, -2.09f, -0.88f)
                lineTo(1.18f, 14.82f)
                curveToRelative(-1.57f, -1.57f, -1.57f, -4.09f, -0.02f, -5.64f)
                curveToRelative(0.0f, 0.0f, 0.01f, -0.01f, 0.02f, -0.02f)
                lineTo(7.93f, 2.81f)
                curveToRelative(0.84f, -0.85f, 2.09f, -1.1f, 3.22f, -0.63f)
                reflectiveCurveToRelative(1.84f, 1.52f, 1.85f, 2.74f)
                verticalLineToRelative(2.06f)
                horizontalLineToRelative(7.03f)
                curveToRelative(2.19f, 0.0f, 3.97f, 1.8f, 3.97f, 4.01f)
                verticalLineToRelative(1.98f)
                curveToRelative(0.0f, 2.21f, -1.78f, 4.01f, -3.97f, 4.01f)
                horizontalLineToRelative(-7.03f)
                verticalLineToRelative(2.06f)
                curveToRelative(0.0f, 1.23f, -0.71f, 2.28f, -1.85f, 2.75f)
                curveToRelative(-0.38f, 0.16f, -0.77f, 0.23f, -1.15f, 0.23f)
                close()
            }
        }
        .build()
        return _left!!
    }

private var _left: ImageVector? = null
