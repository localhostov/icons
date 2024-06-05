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

public val Icons.Filled.CircleW: ImageVector
    get() {
        if (_circleW != null) {
            return _circleW!!
        }
        _circleW = Builder(name = "CircleW", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(16.75f, 16.827f)
                curveToRelative(-0.115f, 0.605f, -0.583f, 1.059f, -1.194f, 1.155f)
                curveToRelative(-0.607f, 0.095f, -1.199f, -0.207f, -1.478f, -0.716f)
                lineToRelative(-2.078f, -4.421f)
                lineToRelative(-2.034f, 4.329f)
                curveToRelative(-0.323f, 0.598f, -0.91f, 0.906f, -1.526f, 0.808f)
                curveToRelative(-0.608f, -0.096f, -1.076f, -0.549f, -1.19f, -1.146f)
                lineToRelative(-1.5f, -10.585f)
                horizontalLineToRelative(2.03f)
                lineToRelative(0.973f, 8.108f)
                lineToRelative(3.247f, -5.858f)
                lineToRelative(3.144f, 5.886f)
                lineToRelative(1.077f, -8.136f)
                horizontalLineToRelative(2.029f)
                lineToRelative(-1.5f, 10.577f)
                close()
            }
        }
        .build()
        return _circleW!!
    }

private var _circleW: ImageVector? = null
