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

public val Icons.Bold.CandlePoseYoga: ImageVector
    get() {
        if (_candlePoseYoga != null) {
            return _candlePoseYoga!!
        }
        _candlePoseYoga = Builder(name = "CandlePoseYoga", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-2.894f, -1.343f, -2.894f, -3.0f)
                reflectiveCurveToRelative(1.237f, -3.0f, 2.894f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(11.0f, 9.827f)
                lineToRelative(-0.2f, 0.15f)
                curveToRelative(-1.127f, 0.846f, -1.8f, 2.191f, -1.8f, 3.6f)
                verticalLineToRelative(7.423f)
                horizontalLineToRelative(-2.118f)
                lineToRelative(1.492f, -3.397f)
                lineToRelative(-2.747f, -1.206f)
                lineToRelative(-2.701f, 6.15f)
                lineToRelative(1.453f, 1.453f)
                horizontalLineToRelative(9.621f)
                lineTo(14.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.827f)
                close()
            }
        }
        .build()
        return _candlePoseYoga!!
    }

private var _candlePoseYoga: ImageVector? = null
