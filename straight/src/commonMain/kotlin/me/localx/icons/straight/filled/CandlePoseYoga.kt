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

public val Icons.Filled.CandlePoseYoga: ImageVector
    get() {
        if (_candlePoseYoga != null) {
            return _candlePoseYoga!!
        }
        _candlePoseYoga = Builder(name = "CandlePoseYoga", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(24.0f)
                lineTo(4.586f, 24.0f)
                lineToRelative(-1.065f, -1.065f)
                lineToRelative(2.563f, -5.837f)
                lineToRelative(1.831f, 0.804f)
                lineToRelative(-1.799f, 4.098f)
                horizontalLineToRelative(2.884f)
                verticalLineToRelative(-8.503f)
                curveToRelative(0.0f, -1.305f, 0.725f, -2.478f, 1.892f, -3.061f)
                lineToRelative(1.108f, -0.554f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(17.455f, 19.0f)
                curveToRelative(-1.406f, 0.0f, -2.455f, 1.119f, -2.455f, 2.5f)
                reflectiveCurveToRelative(1.05f, 2.5f, 2.455f, 2.5f)
                reflectiveCurveToRelative(2.545f, -1.119f, 2.545f, -2.5f)
                reflectiveCurveToRelative(-1.139f, -2.5f, -2.545f, -2.5f)
                close()
            }
        }
        .build()
        return _candlePoseYoga!!
    }

private var _candlePoseYoga: ImageVector? = null
