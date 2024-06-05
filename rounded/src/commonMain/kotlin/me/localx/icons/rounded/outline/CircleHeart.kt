package me.localx.icons.rounded.outline

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

public val Icons.Outline.CircleHeart: ImageVector
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
                moveTo(12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.49f, 10.0f, -10.0f)
                reflectiveCurveTo(17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 17.84f)
                curveToRelative(-0.5f, 0.0f, -0.99f, -0.16f, -1.4f, -0.49f)
                curveToRelative(-2.1f, -1.69f, -4.6f, -4.2f, -4.6f, -6.6f)
                curveToRelative(0.0f, -2.07f, 1.57f, -3.75f, 3.5f, -3.75f)
                curveToRelative(0.98f, 0.0f, 1.86f, 0.43f, 2.5f, 1.13f)
                curveToRelative(0.64f, -0.7f, 1.52f, -1.13f, 2.5f, -1.13f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.68f, 3.5f, 3.75f)
                curveToRelative(0.0f, 2.41f, -2.5f, 4.92f, -4.6f, 6.6f)
                curveToRelative(-0.41f, 0.33f, -0.9f, 0.49f, -1.4f, 0.49f)
                close()
                moveTo(9.5f, 9.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.79f, -1.5f, 1.75f)
                curveToRelative(0.0f, 1.2f, 1.48f, 3.14f, 3.85f, 5.04f)
                curveToRelative(0.09f, 0.07f, 0.21f, 0.07f, 0.3f, 0.0f)
                curveToRelative(2.37f, -1.91f, 3.85f, -3.84f, 3.85f, -5.04f)
                curveToRelative(0.0f, -0.96f, -0.67f, -1.75f, -1.5f, -1.75f)
                reflectiveCurveToRelative(-1.5f, 0.79f, -1.5f, 1.75f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.96f, -0.67f, -1.75f, -1.5f, -1.75f)
                close()
            }
        }
        .build()
        return _circleHeart!!
    }

private var _circleHeart: ImageVector? = null
