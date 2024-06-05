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

public val Icons.Filled.CandleLotusYoga: ImageVector
    get() {
        if (_candleLotusYoga != null) {
            return _candleLotusYoga!!
        }
        _candleLotusYoga = Builder(name = "CandleLotusYoga", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 4.0f)
                curveToRelative(0.0f, -1.105f, 2.0f, -4.0f, 2.0f, -4.0f)
                curveToRelative(0.0f, 0.0f, 2.0f, 2.895f, 2.0f, 4.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 16.858f)
                curveToRelative(0.909f, -1.21f, 2.093f, -2.179f, 3.489f, -2.844f)
                curveToRelative(-0.537f, -1.812f, -1.478f, -3.502f, -2.782f, -4.807f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(-0.707f, 0.708f)
                curveToRelative(-1.304f, 1.304f, -2.245f, 2.995f, -2.782f, 4.807f)
                curveToRelative(1.396f, 0.665f, 2.58f, 1.634f, 3.489f, 2.844f)
                close()
                moveTo(23.1f, 15.0f)
                curveToRelative(-4.769f, 0.0f, -8.1f, 3.331f, -8.1f, 8.1f)
                curveToRelative(0.0f, -4.769f, -3.331f, -8.1f, -8.1f, -8.1f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(0.9f)
                curveToRelative(0.0f, 4.996f, 3.104f, 8.1f, 8.1f, 8.1f)
                horizontalLineToRelative(1.8f)
                curveToRelative(4.997f, 0.0f, 8.1f, -3.104f, 8.1f, -8.1f)
                verticalLineToRelative(-0.9f)
                horizontalLineToRelative(-0.9f)
                close()
                moveTo(4.0f, 15.9f)
                verticalLineToRelative(-2.9f)
                horizontalLineToRelative(2.9f)
                curveToRelative(0.956f, 0.0f, 1.87f, 0.113f, 2.729f, 0.329f)
                curveToRelative(0.438f, -1.432f, 1.097f, -2.742f, 1.911f, -3.902f)
                curveToRelative(0.008f, 0.013f, 0.015f, 0.026f, 0.0f, 0.0f)
                curveToRelative(-0.013f, -0.022f, -0.008f, -0.013f, -0.002f, -0.002f)
                curveToRelative(-0.544f, -0.77f, -1.526f, -1.424f, -2.538f, -1.424f)
                lineTo(3.0f, 8.001f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(7.616f)
                curveToRelative(-2.293f, -1.75f, -3.616f, -4.562f, -3.616f, -8.1f)
                close()
            }
        }
        .build()
        return _candleLotusYoga!!
    }

private var _candleLotusYoga: ImageVector? = null
