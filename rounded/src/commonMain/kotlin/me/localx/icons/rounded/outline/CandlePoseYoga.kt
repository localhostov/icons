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

public val Icons.Outline.CandlePoseYoga: ImageVector
    get() {
        if (_candlePoseYoga != null) {
            return _candlePoseYoga!!
        }
        _candlePoseYoga = Builder(name = "CandlePoseYoga", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(8.882f)
                lineToRelative(-0.236f, 0.118f)
                curveToRelative(-1.705f, 0.852f, -2.764f, 2.566f, -2.764f, 4.472f)
                verticalLineToRelative(7.528f)
                horizontalLineToRelative(-2.941f)
                lineToRelative(1.83f, -3.541f)
                curveToRelative(0.254f, -0.491f, 0.062f, -1.094f, -0.429f, -1.347f)
                curveToRelative(-0.492f, -0.256f, -1.095f, -0.061f, -1.347f, 0.429f)
                lineToRelative(-1.91f, 3.699f)
                curveToRelative(-0.276f, 0.607f, -0.225f, 1.304f, 0.136f, 1.865f)
                curveToRelative(0.361f, 0.561f, 0.975f, 0.895f, 1.642f, 0.895f)
                horizontalLineToRelative(5.521f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -6.893f, -0.658f, -9.387f, -1.0f, -10.218f)
                lineTo(14.002f, 1.0f)
                close()
                moveTo(11.5f, 22.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-7.528f)
                curveToRelative(0.0f, -1.047f, 0.536f, -1.992f, 1.411f, -2.537f)
                curveToRelative(0.253f, 1.165f, 0.589f, 3.634f, 0.589f, 8.565f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.0f, 21.5f)
                curveToRelative(0.0f, 1.381f, -1.139f, 2.5f, -2.545f, 2.5f)
                reflectiveCurveToRelative(-2.455f, -1.119f, -2.455f, -2.5f)
                reflectiveCurveToRelative(1.05f, -2.5f, 2.455f, -2.5f)
                reflectiveCurveToRelative(2.545f, 1.119f, 2.545f, 2.5f)
                close()
            }
        }
        .build()
        return _candlePoseYoga!!
    }

private var _candlePoseYoga: ImageVector? = null
