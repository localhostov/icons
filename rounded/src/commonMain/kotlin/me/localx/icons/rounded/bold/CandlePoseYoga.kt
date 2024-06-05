package me.localx.icons.rounded.bold

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
                moveToRelative(14.0f, 1.5f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 1.826f, -1.0f, 3.5f, -3.0f, 3.5f)
                horizontalLineToRelative(-5.359f)
                curveToRelative(-0.902f, 0.0f, -1.732f, -0.453f, -2.22f, -1.211f)
                curveToRelative(-0.488f, -0.758f, -0.557f, -1.701f, -0.183f, -2.521f)
                lineToRelative(1.767f, -3.888f)
                curveToRelative(0.343f, -0.754f, 1.234f, -1.086f, 1.986f, -0.745f)
                curveToRelative(0.754f, 0.343f, 1.088f, 1.232f, 0.745f, 1.986f)
                lineToRelative(-1.536f, 3.379f)
                horizontalLineToRelative(2.799f)
                verticalLineToRelative(-7.423f)
                curveToRelative(0.0f, -1.409f, 0.873f, -2.731f, 2.0f, -3.577f)
                lineTo(10.999f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(17.894f, 18.0f)
                curveToRelative(-1.657f, 0.0f, -2.894f, 1.343f, -2.894f, 3.0f)
                reflectiveCurveToRelative(1.237f, 3.0f, 2.894f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _candlePoseYoga!!
    }

private var _candlePoseYoga: ImageVector? = null
