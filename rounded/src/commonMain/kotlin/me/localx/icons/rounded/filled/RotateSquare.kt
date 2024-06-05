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

public val Icons.Filled.RotateSquare: ImageVector
    get() {
        if (_rotateSquare != null) {
            return _rotateSquare!!
        }
        _rotateSquare = Builder(name = "RotateSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.239f, 0.0f, 0.0f, 2.239f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.022f, 0.0f, -5.64f, -1.697f, -7.0f, -4.177f)
                verticalLineToRelative(2.177f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.169f)
                curveToRelative(1.039f, 1.787f, 2.957f, 3.0f, 5.169f, 3.0f)
                curveToRelative(2.722f, 0.0f, 5.02f, -1.823f, 5.751f, -4.312f)
                curveToRelative(0.122f, -0.414f, 0.515f, -0.688f, 0.947f, -0.688f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.653f, 0.0f, 1.156f, 0.622f, 0.972f, 1.249f)
                curveToRelative(-0.973f, 3.319f, -4.041f, 5.751f, -7.671f, 5.751f)
                close()
                moveTo(21.0f, 9.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.185f)
                curveToRelative(-1.037f, -1.791f, -2.97f, -3.0f, -5.185f, -3.0f)
                curveToRelative(-2.722f, 0.0f, -5.02f, 1.823f, -5.751f, 4.312f)
                curveToRelative(-0.122f, 0.414f, -0.515f, 0.688f, -0.947f, 0.688f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.653f, 0.0f, -1.156f, -0.622f, -0.972f, -1.249f)
                curveToRelative(0.973f, -3.319f, 4.041f, -5.751f, 7.671f, -5.751f)
                curveToRelative(3.015f, 0.0f, 5.639f, 1.679f, 7.0f, 4.15f)
                verticalLineToRelative(-2.15f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _rotateSquare!!
    }

private var _rotateSquare: ImageVector? = null
