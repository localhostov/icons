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

public val Icons.Bold.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.834f, 15.072f)
                arcTo(4.42f, 4.42f, 0.0f, false, false, 22.0f, 11.5f)
                curveToRelative(0.0f, -2.327f, -2.252f, -4.227f, -5.626f, -5.053f)
                arcTo(3.442f, 3.442f, 0.0f, false, false, 17.0f, 4.5f)
                curveTo(17.0f, 1.977f, 14.145f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveTo(4.0f, 1.977f, 4.0f, 4.5f)
                arcTo(3.867f, 3.867f, 0.0f, false, false, 5.721f, 7.573f)
                arcTo(4.7f, 4.7f, 0.0f, false, false, 3.0f, 11.5f)
                arcToRelative(4.281f, 4.281f, 0.0f, false, false, 1.879f, 3.355f)
                curveTo(2.023f, 15.646f, 0.0f, 17.0f, 0.0f, 19.0f)
                curveToRelative(0.0f, 3.454f, 6.027f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveToRelative(12.0f, -1.546f, 12.0f, -5.0f)
                curveTo(24.0f, 17.173f, 22.306f, 15.885f, 19.834f, 15.072f)
                close()
                moveTo(19.0f, 11.5f)
                curveToRelative(0.0f, 0.995f, -2.593f, 2.5f, -6.5f, 2.5f)
                reflectiveCurveTo(6.0f, 12.5f, 6.0f, 11.5f)
                reflectiveCurveTo(8.592f, 9.0f, 12.5f, 9.0f)
                reflectiveCurveTo(19.0f, 10.505f, 19.0f, 11.5f)
                close()
                moveTo(10.5f, 3.0f)
                curveToRelative(2.171f, 0.0f, 3.5f, 0.971f, 3.5f, 1.5f)
                reflectiveCurveTo(12.671f, 6.0f, 10.5f, 6.0f)
                reflectiveCurveTo(7.0f, 5.029f, 7.0f, 4.5f)
                reflectiveCurveTo(8.329f, 3.0f, 10.5f, 3.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-5.385f, 0.0f, -8.438f, -1.356f, -8.957f, -2.0f)
                curveToRelative(0.519f, -0.644f, 3.572f, -2.0f, 8.957f, -2.0f)
                reflectiveCurveToRelative(8.438f, 1.356f, 8.956f, 2.0f)
                curveTo(20.438f, 19.644f, 17.385f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
