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

public val Icons.Bold.SquareHeart: ImageVector
    get() {
        if (_squareHeart != null) {
            return _squareHeart!!
        }
        _squareHeart = Builder(name = "SquareHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.7f)
                curveToRelative(0.0f, 2.83f, -5.0f, 6.3f, -5.0f, 6.3f)
                curveToRelative(0.0f, 0.0f, -5.0f, -3.47f, -5.0f, -6.3f)
                curveToRelative(0.0f, -1.49f, 1.12f, -2.7f, 2.5f, -2.7f)
                reflectiveCurveToRelative(2.5f, 0.96f, 2.5f, 2.45f)
                curveToRelative(0.0f, -1.49f, 1.12f, -2.45f, 2.5f, -2.45f)
                reflectiveCurveToRelative(2.5f, 1.21f, 2.5f, 2.7f)
                close()
                moveTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.5f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                close()
            }
        }
        .build()
        return _squareHeart!!
    }

private var _squareHeart: ImageVector? = null
