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

public val Icons.Filled.SquareHeart: ImageVector
    get() {
        if (_squareHeart != null) {
            return _squareHeart!!
        }
        _squareHeart = Builder(name = "SquareHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.75f)
                curveToRelative(0.0f, 1.2f, -1.48f, 3.14f, -3.85f, 5.04f)
                curveToRelative(-0.09f, 0.07f, -0.21f, 0.07f, -0.3f, 0.0f)
                curveToRelative(-2.38f, -1.91f, -3.85f, -3.84f, -3.85f, -5.04f)
                curveToRelative(0.0f, -0.96f, 0.67f, -1.75f, 1.5f, -1.75f)
                reflectiveCurveToRelative(1.5f, 0.79f, 1.5f, 1.75f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.96f, 0.67f, -1.75f, 1.5f, -1.75f)
                reflectiveCurveToRelative(1.5f, 0.79f, 1.5f, 1.75f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.24f, 2.24f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
                moveTo(18.0f, 10.75f)
                curveToRelative(0.0f, -2.07f, -1.57f, -3.75f, -3.5f, -3.75f)
                curveToRelative(-0.98f, 0.0f, -1.86f, 0.43f, -2.5f, 1.13f)
                curveToRelative(-0.64f, -0.7f, -1.52f, -1.13f, -2.5f, -1.13f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.68f, -3.5f, 3.75f)
                curveToRelative(0.0f, 2.41f, 2.5f, 4.92f, 4.6f, 6.6f)
                curveToRelative(0.41f, 0.33f, 0.9f, 0.49f, 1.4f, 0.49f)
                reflectiveCurveToRelative(1.0f, -0.16f, 1.4f, -0.49f)
                curveToRelative(2.1f, -1.68f, 4.6f, -4.2f, 4.6f, -6.6f)
                close()
            }
        }
        .build()
        return _squareHeart!!
    }

private var _squareHeart: ImageVector? = null
