package me.localx.icons.rounded.bold

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
                moveTo(18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.47f, 2.47f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(5.5f, 3.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                close()
                moveTo(14.5f, 8.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.23f, -2.5f, 2.75f)
                curveToRelative(0.0f, -1.52f, -1.12f, -2.75f, -2.5f, -2.75f)
                reflectiveCurveToRelative(-2.5f, 1.23f, -2.5f, 2.75f)
                curveToRelative(0.0f, 2.16f, 2.82f, 4.7f, 4.22f, 5.82f)
                curveToRelative(0.45f, 0.36f, 1.1f, 0.36f, 1.55f, 0.0f)
                curveToRelative(1.4f, -1.13f, 4.22f, -3.66f, 4.22f, -5.82f)
                curveToRelative(0.0f, -1.52f, -1.12f, -2.75f, -2.5f, -2.75f)
                close()
            }
        }
        .build()
        return _squareHeart!!
    }

private var _squareHeart: ImageVector? = null
