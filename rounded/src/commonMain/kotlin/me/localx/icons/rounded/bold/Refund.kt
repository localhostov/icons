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

public val Icons.Bold.Refund: ImageVector
    get() {
        if (_refund != null) {
            return _refund!!
        }
        _refund = Builder(name = "Refund", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                lineTo(14.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(10.5f, 4.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(5.5f, 4.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(22.733f, 9.014f)
                curveToRelative(-0.766f, -0.698f, -1.752f, -1.058f, -2.795f, -1.01f)
                curveToRelative(-1.037f, 0.049f, -1.993f, 0.498f, -2.692f, 1.266f)
                lineToRelative(-2.438f, 2.68f)
                curveToRelative(-0.647f, -0.59f, -1.507f, -0.949f, -2.449f, -0.949f)
                horizontalLineToRelative(-7.858f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(5.414f)
                curveToRelative(3.03f, 0.0f, 5.912f, -1.309f, 7.905f, -3.589f)
                lineToRelative(5.195f, -5.942f)
                curveToRelative(1.411f, -1.581f, 1.284f, -4.028f, -0.281f, -5.455f)
                close()
                moveTo(20.766f, 12.483f)
                lineToRelative(-5.206f, 5.954f)
                curveToRelative(-1.424f, 1.629f, -3.482f, 2.563f, -5.646f, 2.563f)
                horizontalLineToRelative(-5.414f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.858f)
                curveToRelative(0.354f, 0.0f, 0.642f, 0.288f, 0.642f, 0.643f)
                curveToRelative(0.0f, 0.317f, -0.237f, 0.591f, -0.551f, 0.635f)
                lineToRelative(-5.161f, 0.737f)
                curveToRelative(-0.82f, 0.117f, -1.39f, 0.877f, -1.273f, 1.697f)
                curveToRelative(0.117f, 0.82f, 0.879f, 1.383f, 1.697f, 1.273f)
                lineToRelative(5.16f, -0.737f)
                curveToRelative(1.619f, -0.231f, 2.876f, -1.53f, 3.094f, -3.115f)
                lineToRelative(3.498f, -3.844f)
                curveToRelative(0.159f, -0.175f, 0.376f, -0.277f, 0.612f, -0.288f)
                curveToRelative(0.233f, -0.018f, 0.46f, 0.07f, 0.635f, 0.229f)
                curveToRelative(0.356f, 0.325f, 0.385f, 0.881f, 0.054f, 1.252f)
                close()
            }
        }
        .build()
        return _refund!!
    }

private var _refund: ImageVector? = null
