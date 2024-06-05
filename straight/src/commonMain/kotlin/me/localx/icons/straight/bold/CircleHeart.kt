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

public val Icons.Bold.CircleHeart: ImageVector
    get() {
        if (_circleHeart != null) {
            return _circleHeart!!
        }
        _circleHeart = Builder(name = "CircleHeart", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 5.38f, 18.62f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 4.96f, -4.04f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.96f, 3.0f, 12.0f)
                reflectiveCurveTo(7.04f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.04f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _circleHeart!!
    }

private var _circleHeart: ImageVector? = null
