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

public val Icons.Outline.CircleV: ImageVector
    get() {
        if (_circleV != null) {
            return _circleV!!
        }
        _circleV = Builder(name = "CircleV", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.727f, 8.114f)
                lineToRelative(-3.22f, 8.769f)
                curveToRelative(-0.42f, 1.01f, -1.383f, 1.637f, -2.469f, 1.637f)
                reflectiveCurveToRelative(-2.048f, -0.627f, -2.453f, -1.596f)
                lineToRelative(-3.235f, -8.81f)
                curveToRelative(-0.19f, -0.519f, 0.075f, -1.093f, 0.594f, -1.283f)
                reflectiveCurveToRelative(1.093f, 0.076f, 1.283f, 0.594f)
                lineToRelative(3.22f, 8.769f)
                curveToRelative(0.126f, 0.3f, 0.485f, 0.326f, 0.592f, 0.326f)
                reflectiveCurveToRelative(0.465f, -0.026f, 0.607f, -0.367f)
                lineToRelative(3.204f, -8.728f)
                curveToRelative(0.19f, -0.519f, 0.766f, -0.786f, 1.283f, -0.594f)
                curveToRelative(0.519f, 0.19f, 0.784f, 0.765f, 0.594f, 1.283f)
                close()
                moveTo(24.039f, 12.019f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.039f, 18.637f, 0.039f, 12.02f)
                reflectiveCurveTo(5.422f, 0.02f, 12.039f, 0.02f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(22.039f, 12.019f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.039f, 6.506f, 2.039f, 12.02f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _circleV!!
    }

private var _circleV: ImageVector? = null
