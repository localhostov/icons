package me.localx.icons.straight.filled

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
                moveTo(15.789f, 17.25f)
                lineToRelative(-0.945f, -3.0f)
                horizontalLineToRelative(-5.691f)
                lineToRelative(-0.943f, 3.0f)
                horizontalLineToRelative(-2.126f)
                lineToRelative(3.374f, -10.049f)
                curveToRelative(0.621f, -1.411f, 1.465f, -1.701f, 2.542f, -1.701f)
                curveToRelative(1.077f, 0.0f, 1.922f, 0.29f, 2.526f, 1.658f)
                lineToRelative(3.39f, 10.092f)
                horizontalLineToRelative(-2.127f)
                close()
                moveTo(9.782f, 12.25f)
                lineToRelative(1.295f, -4.119f)
                curveToRelative(0.194f, -0.408f, 0.542f, -0.625f, 0.917f, -0.631f)
                curveToRelative(0.388f, 0.005f, 0.736f, 0.223f, 0.9f, 0.555f)
                lineToRelative(1.321f, 4.195f)
                horizontalLineToRelative(-4.433f)
                close()
            }
        }
        .build()
        return _circleA!!
    }

private var _circleA: ImageVector? = null
