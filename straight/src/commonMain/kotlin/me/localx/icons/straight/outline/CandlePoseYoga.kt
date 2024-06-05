package me.localx.icons.straight.outline

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
                moveToRelative(14.414f, 11.792f)
                curveToRelative(-0.149f, -0.759f, -0.299f, -1.231f, -0.414f, -1.51f)
                lineTo(14.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.882f)
                lineToRelative(-1.108f, 0.554f)
                curveToRelative(-1.167f, 0.583f, -1.892f, 1.756f, -1.892f, 3.061f)
                verticalLineToRelative(8.503f)
                horizontalLineToRelative(-2.884f)
                lineToRelative(1.799f, -4.098f)
                lineToRelative(-1.831f, -0.804f)
                lineToRelative(-2.563f, 5.837f)
                lineToRelative(1.065f, 1.065f)
                horizontalLineToRelative(10.414f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -3.041f, -0.099f, -5.254f, -0.272f, -6.818f)
                curveToRelative(-0.081f, -0.651f, -0.183f, -1.289f, -0.314f, -1.89f)
                close()
                moveTo(13.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.503f)
                curveToRelative(0.0f, -0.542f, 0.301f, -1.03f, 0.786f, -1.272f)
                lineToRelative(0.606f, -0.303f)
                curveToRelative(0.044f, 0.18f, 0.086f, 0.368f, 0.125f, 0.564f)
                curveToRelative(0.232f, 1.333f, 0.483f, 3.753f, 0.483f, 8.013f)
                verticalLineToRelative(1.5f)
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
