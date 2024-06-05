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
                moveTo(12.0f, 24.0f)
                curveTo(5.38f, 24.0f, 0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.38f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.38f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.04f, 3.0f, 3.0f, 7.04f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f)
                reflectiveCurveTo(16.96f, 3.0f, 12.0f, 3.0f)
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
        return _circleHeart!!
    }

private var _circleHeart: ImageVector? = null
