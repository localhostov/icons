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

public val Icons.Outline.HouseSignal: ImageVector
    get() {
        if (_houseSignal != null) {
            return _houseSignal!!
        }
        _houseSignal = Builder(name = "HouseSignal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.514f)
                verticalLineToRelative(6.438f)
                curveToRelative(0.0f, 2.232f, -1.815f, 4.048f, -4.048f, 4.048f)
                horizontalLineToRelative(-4.952f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.952f)
                curveToRelative(1.129f, 0.0f, 2.048f, -0.919f, 2.048f, -2.048f)
                verticalLineToRelative(-6.438f)
                curveToRelative(0.0f, -0.809f, -0.4f, -1.562f, -1.07f, -2.014f)
                lineToRelative(-4.571f, -3.084f)
                curveToRelative(-0.824f, -0.557f, -1.893f, -0.557f, -2.717f, 0.0f)
                lineToRelative(-4.571f, 3.084f)
                curveToRelative(-0.67f, 0.452f, -1.07f, 1.205f, -1.07f, 2.014f)
                verticalLineToRelative(1.486f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.486f)
                curveToRelative(0.0f, -1.474f, 0.729f, -2.847f, 1.951f, -3.672f)
                lineTo(12.522f, 0.758f)
                curveToRelative(1.506f, -1.016f, 3.449f, -1.016f, 4.955f, 0.0f)
                lineToRelative(4.571f, 3.084f)
                curveToRelative(1.222f, 0.825f, 1.951f, 2.198f, 1.951f, 3.672f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(1.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.0f, 16.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(1.0f, 11.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -6.617f, -5.383f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _houseSignal!!
    }

private var _houseSignal: ImageVector? = null
