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

public val Icons.Bold.Total: ImageVector
    get() {
        if (_total != null) {
            return _total!!
        }
        _total = Builder(name = "Total", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 19.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineTo(4.814f)
                curveToRelative(-1.162f, 0.0f, -2.192f, -0.697f, -2.625f, -1.776f)
                curveToRelative(-0.432f, -1.079f, -0.168f, -2.295f, 0.672f, -3.098f)
                lineToRelative(7.466f, -7.126f)
                lineTo(2.861f, 4.874f)
                curveToRelative(-0.841f, -0.803f, -1.104f, -2.02f, -0.671f, -3.098f)
                curveToRelative(0.432f, -1.079f, 1.462f, -1.776f, 2.624f, -1.776f)
                horizontalLineToRelative(12.686f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(5.243f)
                lineToRelative(8.293f, 7.915f)
                curveToRelative(0.296f, 0.283f, 0.464f, 0.675f, 0.464f, 1.085f)
                reflectiveCurveToRelative(-0.168f, 0.802f, -0.464f, 1.085f)
                lineToRelative(-8.293f, 7.915f)
                horizontalLineToRelative(12.257f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _total!!
    }

private var _total: ImageVector? = null
