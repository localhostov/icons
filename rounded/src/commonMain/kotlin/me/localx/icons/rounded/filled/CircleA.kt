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

public val Icons.Filled.CircleA: ImageVector
    get() {
        if (_circleA != null) {
            return _circleA!!
        }
        _circleA = Builder(name = "CircleA", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(17.095f, 17.188f)
                curveToRelative(-0.114f, 0.042f, -0.23f, 0.062f, -0.345f, 0.062f)
                curveToRelative(-0.407f, 0.0f, -0.79f, -0.251f, -0.938f, -0.656f)
                lineToRelative(-0.861f, -2.345f)
                horizontalLineToRelative(-5.901f)
                lineToRelative(-0.861f, 2.345f)
                curveToRelative(-0.19f, 0.519f, -0.766f, 0.783f, -1.283f, 0.594f)
                curveToRelative(-0.519f, -0.19f, -0.784f, -0.765f, -0.594f, -1.283f)
                lineToRelative(3.22f, -8.769f)
                curveToRelative(0.42f, -1.01f, 1.383f, -1.637f, 2.469f, -1.637f)
                reflectiveCurveToRelative(2.048f, 0.626f, 2.453f, 1.596f)
                lineToRelative(3.235f, 8.809f)
                curveToRelative(0.19f, 0.519f, -0.075f, 1.093f, -0.594f, 1.283f)
                close()
                moveTo(12.592f, 7.826f)
                lineToRelative(1.624f, 4.424f)
                horizontalLineToRelative(-4.433f)
                lineToRelative(1.609f, -4.383f)
                curveToRelative(0.142f, -0.34f, 0.501f, -0.367f, 0.607f, -0.367f)
                reflectiveCurveToRelative(0.465f, 0.026f, 0.592f, 0.326f)
                close()
            }
        }
        .build()
        return _circleA!!
    }

private var _circleA: ImageVector? = null
