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

public val Icons.Bold.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.463f)
                curveTo(22.0f, 4.261f, 17.514f, 0.029f, 12.0f, 0.029f)
                reflectiveCurveTo(2.0f, 4.261f, 2.0f, 9.463f)
                curveToRelative(0.0f, 5.097f, 3.172f, 10.714f, 7.709f, 12.174f)
                curveToRelative(-0.442f, 0.741f, -0.709f, 1.616f, -0.709f, 2.363f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, -0.747f, -0.267f, -1.622f, -0.709f, -2.363f)
                curveToRelative(4.537f, -1.461f, 7.709f, -7.077f, 7.709f, -12.174f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.878f, 0.0f, -7.0f, -5.218f, -7.0f, -9.537f)
                curveToRelative(0.0f, -3.548f, 3.141f, -6.434f, 7.0f, -6.434f)
                reflectiveCurveToRelative(7.0f, 2.886f, 7.0f, 6.434f)
                curveToRelative(0.0f, 4.319f, -3.122f, 9.537f, -7.0f, 9.537f)
                close()
                moveTo(13.965f, 10.0f)
                horizontalLineToRelative(3.003f)
                curveToRelative(-0.161f, 2.324f, -1.259f, 4.346f, -2.295f, 5.501f)
                lineToRelative(-2.234f, -2.002f)
                curveToRelative(0.682f, -0.761f, 1.372f, -2.093f, 1.526f, -3.499f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
