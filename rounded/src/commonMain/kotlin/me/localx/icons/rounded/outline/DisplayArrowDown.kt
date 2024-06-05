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

public val Icons.Outline.DisplayArrowDown: ImageVector
    get() {
        if (_displayArrowDown != null) {
            return _displayArrowDown!!
        }
        _displayArrowDown = Builder(name = "DisplayArrowDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.017f)
                curveToRelative(0.0f, -1.34f, 0.523f, -2.599f, 1.474f, -3.544f)
                curveToRelative(0.944f, -0.939f, 2.196f, -1.456f, 3.527f, -1.456f)
                horizontalLineToRelative(0.026f)
                lineToRelative(2.979f, 0.017f)
                curveToRelative(0.552f, 0.003f, 0.997f, 0.453f, 0.994f, 1.005f)
                curveToRelative(-0.003f, 0.551f, -0.45f, 0.995f, -1.0f, 0.995f)
                horizontalLineToRelative(-0.006f)
                lineToRelative(-2.978f, -0.017f)
                curveToRelative(-0.799f, -0.03f, -1.562f, 0.306f, -2.133f, 0.874f)
                curveToRelative(-0.569f, 0.567f, -0.884f, 1.322f, -0.884f, 2.126f)
                verticalLineToRelative(6.017f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(8.681f, 7.267f)
                curveToRelative(-0.404f, -0.375f, -1.039f, -0.354f, -1.413f, 0.053f)
                curveToRelative(-0.376f, 0.405f, -0.353f, 1.037f, 0.052f, 1.413f)
                lineToRelative(2.587f, 2.4f)
                curveToRelative(0.58f, 0.581f, 1.344f, 0.869f, 2.104f, 0.869f)
                curveToRelative(0.75f, 0.0f, 1.497f, -0.282f, 2.058f, -0.843f)
                lineToRelative(2.613f, -2.426f)
                curveToRelative(0.404f, -0.376f, 0.428f, -1.008f, 0.052f, -1.413f)
                curveToRelative(-0.375f, -0.406f, -1.01f, -0.428f, -1.413f, -0.053f)
                lineToRelative(-2.319f, 2.154f)
                lineTo(13.002f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(8.42f)
                lineToRelative(-2.319f, -2.153f)
                close()
            }
        }
        .build()
        return _displayArrowDown!!
    }

private var _displayArrowDown: ImageVector? = null
