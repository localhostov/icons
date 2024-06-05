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

public val Icons.Bold.SquareW: ImageVector
    get() {
        if (_squareW != null) {
            return _squareW!!
        }
        _squareW = Builder(name = "SquareW", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.464f, 5.0f)
                horizontalLineToRelative(3.045f)
                lineToRelative(-2.164f, 12.459f)
                curveToRelative(-0.156f, 0.815f, -0.786f, 1.425f, -1.606f, 1.554f)
                curveToRelative(-0.102f, 0.016f, -0.204f, 0.024f, -0.305f, 0.024f)
                curveToRelative(-0.702f, 0.0f, -1.358f, -0.385f, -1.7f, -1.01f)
                lineToRelative(-1.733f, -3.95f)
                lineToRelative(-1.697f, 3.873f)
                curveToRelative(-0.377f, 0.696f, -1.029f, 1.087f, -1.74f, 1.087f)
                curveToRelative(-0.1f, 0.0f, -0.202f, -0.009f, -0.304f, -0.025f)
                curveToRelative(-0.82f, -0.129f, -1.45f, -0.739f, -1.606f, -1.555f)
                lineToRelative(-2.163f, -12.459f)
                horizontalLineToRelative(3.045f)
                lineToRelative(1.466f, 8.445f)
                lineToRelative(0.25f, -0.571f)
                lineToRelative(2.746f, -6.267f)
                lineToRelative(2.749f, 6.266f)
                lineToRelative(0.25f, 0.57f)
                lineToRelative(1.466f, -8.443f)
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
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.5f)
                close()
            }
        }
        .build()
        return _squareW!!
    }

private var _squareW: ImageVector? = null
