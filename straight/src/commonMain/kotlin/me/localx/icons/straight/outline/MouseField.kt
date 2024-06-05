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

public val Icons.Outline.MouseField: ImageVector
    get() {
        if (_mouseField != null) {
            return _mouseField!!
        }
        _mouseField = Builder(name = "MouseField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.013f, 2.001f)
                curveToRelative(-0.919f, -1.215f, -2.397f, -2.001f, -4.013f, -2.001f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 1.364f, 0.553f, 2.608f, 1.458f, 3.515f)
                curveToRelative(-6.367f, 2.027f, -6.458f, 9.399f, -6.458f, 9.485f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(13.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.998f)
                lineToRelative(0.01f, -5.0f)
                horizontalLineToRelative(3.434f)
                curveToRelative(0.856f, 0.0f, 1.554f, -0.701f, 1.554f, -1.562f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.0f, -3.529f, -2.249f, -7.178f, -5.987f, -7.187f)
                close()
                moveTo(17.002f, 18.0f)
                lineTo(6.0f, 18.0f)
                curveToRelative(0.0f, -0.308f, 0.09f, -7.171f, 6.776f, -7.924f)
                curveToRelative(0.868f, 1.501f, 2.43f, 2.551f, 4.237f, 2.838f)
                lineToRelative(-0.011f, 5.087f)
                close()
                moveTo(22.0f, 11.0f)
                horizontalLineToRelative(-3.985f)
                curveToRelative(-1.706f, 0.0f, -3.216f, -0.972f, -3.757f, -2.419f)
                lineToRelative(-0.206f, -0.586f)
                curveToRelative(-0.237f, 0.005f, -0.562f, -0.049f, -0.562f, -0.049f)
                curveToRelative(-1.443f, -0.248f, -2.49f, -1.487f, -2.49f, -2.946f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(1.511f, 0.0f, 2.813f, 1.125f, 3.0f, 2.621f)
                verticalLineToRelative(2.379f)
                curveToRelative(0.878f, -0.439f, 1.755f, -1.656f, 1.956f, -2.623f)
                curveToRelative(0.0f, 0.0f, 0.02f, -0.162f, 0.026f, -0.232f)
                curveToRelative(2.07f, 0.616f, 3.018f, 3.161f, 3.018f, 5.043f)
                verticalLineToRelative(1.812f)
                close()
            }
        }
        .build()
        return _mouseField!!
    }

private var _mouseField: ImageVector? = null
