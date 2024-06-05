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

public val Icons.Outline.CircleA: ImageVector
    get() {
        if (_circleA != null) {
            return _circleA!!
        }
        _circleA = Builder(name = "CircleA", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.492f, 7.116f)
                curveToRelative(-0.405f, -0.97f, -1.368f, -1.597f, -2.453f, -1.597f)
                reflectiveCurveToRelative(-2.048f, 0.627f, -2.469f, 1.637f)
                lineToRelative(-3.22f, 8.768f)
                curveToRelative(-0.19f, 0.519f, 0.075f, 1.093f, 0.594f, 1.283f)
                curveToRelative(0.517f, 0.19f, 1.093f, -0.075f, 1.283f, -0.594f)
                lineToRelative(0.861f, -2.345f)
                horizontalLineToRelative(5.901f)
                lineToRelative(0.861f, 2.345f)
                curveToRelative(0.148f, 0.405f, 0.531f, 0.656f, 0.938f, 0.656f)
                curveToRelative(0.115f, 0.0f, 0.231f, -0.02f, 0.345f, -0.062f)
                curveToRelative(0.519f, -0.19f, 0.784f, -0.765f, 0.594f, -1.283f)
                lineToRelative(-3.235f, -8.809f)
                close()
                moveTo(9.822f, 12.269f)
                lineToRelative(1.609f, -4.383f)
                curveToRelative(0.142f, -0.341f, 0.501f, -0.367f, 0.607f, -0.367f)
                reflectiveCurveToRelative(0.465f, 0.026f, 0.592f, 0.327f)
                lineToRelative(1.624f, 4.423f)
                horizontalLineToRelative(-4.433f)
                close()
                moveTo(12.039f, 0.019f)
                curveTo(5.422f, 0.019f, 0.039f, 5.402f, 0.039f, 12.019f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.019f, 12.039f, 0.019f)
                close()
                moveTo(12.039f, 22.019f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.019f, 12.039f, 2.019f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _circleA!!
    }

private var _circleA: ImageVector? = null
