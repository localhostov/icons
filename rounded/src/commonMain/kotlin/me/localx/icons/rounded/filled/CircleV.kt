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

public val Icons.Filled.CircleV: ImageVector
    get() {
        if (_circleV != null) {
            return _circleV!!
        }
        _circleV = Builder(name = "CircleV", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.688f, 8.095f)
                lineToRelative(-3.22f, 8.769f)
                curveToRelative(-0.42f, 1.01f, -1.383f, 1.637f, -2.469f, 1.637f)
                reflectiveCurveToRelative(-2.048f, -0.627f, -2.453f, -1.596f)
                lineToRelative(-3.235f, -8.81f)
                curveToRelative(-0.19f, -0.519f, 0.075f, -1.093f, 0.594f, -1.283f)
                curveToRelative(0.519f, -0.191f, 1.093f, 0.076f, 1.283f, 0.594f)
                lineToRelative(3.22f, 8.769f)
                curveToRelative(0.126f, 0.3f, 0.485f, 0.326f, 0.592f, 0.326f)
                reflectiveCurveToRelative(0.465f, -0.026f, 0.607f, -0.367f)
                lineToRelative(3.204f, -8.728f)
                curveToRelative(0.19f, -0.519f, 0.765f, -0.786f, 1.283f, -0.594f)
                curveToRelative(0.519f, 0.19f, 0.784f, 0.765f, 0.594f, 1.283f)
                close()
            }
        }
        .build()
        return _circleV!!
    }

private var _circleV: ImageVector? = null
