package me.localx.icons.straight.outline

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
                moveTo(14.5f, 7.0f)
                curveToRelative(-1.0f, 0.0f, -1.87f, 0.37f, -2.5f, 0.99f)
                curveToRelative(-0.63f, -0.62f, -1.5f, -0.99f, -2.5f, -0.99f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.66f, -3.5f, 3.7f)
                curveToRelative(0.0f, 3.26f, 4.87f, 6.74f, 5.43f, 7.12f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.56f, -0.39f, 5.43f, -3.87f, 5.43f, -7.12f)
                curveToRelative(0.0f, -2.04f, -1.57f, -3.7f, -3.5f, -3.7f)
                close()
                moveTo(12.0f, 15.76f)
                curveToRelative(-1.74f, -1.33f, -4.0f, -3.56f, -4.0f, -5.06f)
                curveToRelative(0.0f, -0.94f, 0.67f, -1.7f, 1.5f, -1.7f)
                curveToRelative(0.75f, 0.0f, 1.5f, 0.45f, 1.5f, 1.45f)
                verticalLineToRelative(0.55f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0.0f, -1.0f, 0.75f, -1.45f, 1.5f, -1.45f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.76f, 1.5f, 1.7f)
                curveToRelative(0.0f, 1.5f, -2.26f, 3.73f, -4.0f, 5.06f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.51f, 0.0f, -10.0f, -4.49f, -10.0f, -10.0f)
                reflectiveCurveTo(6.49f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.49f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.49f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _circleHeart!!
    }

private var _circleHeart: ImageVector? = null
