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

public val Icons.Outline.Sausage: ImageVector
    get() {
        if (_sausage != null) {
            return _sausage!!
        }
        _sausage = Builder(name = "Sausage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.356f, 3.188f)
                arcTo(4.59f, 4.59f, 0.0f, false, false, 22.0f, 0.0f)
                lineTo(20.0f, 0.0f)
                arcToRelative(2.744f, 2.744f, 0.0f, false, true, -1.0f, 1.712f)
                arcTo(2.747f, 2.747f, 0.0f, false, true, 18.0f, 0.0f)
                lineTo(16.0f, 0.0f)
                arcToRelative(4.588f, 4.588f, 0.0f, false, false, 1.642f, 3.186f)
                arcTo(4.946f, 4.946f, 0.0f, false, false, 14.0f, 7.905f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -2.2f, 3.916f)
                arcToRelative(7.091f, 7.091f, 0.0f, false, true, -3.881f, 2.2f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.733f, 3.628f)
                arcTo(4.588f, 4.588f, 0.0f, false, false, 0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, true, 1.713f, 1.0f)
                arcTo(2.745f, 2.745f, 0.0f, false, true, 0.0f, 20.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.592f, 4.592f, 0.0f, false, false, 3.186f, -1.642f)
                arcTo(5.015f, 5.015f, 0.0f, false, false, 8.0f, 24.0f)
                curveToRelative(0.962f, 0.0f, 6.011f, -0.271f, 10.865f, -5.115f)
                curveTo(23.753f, 14.014f, 24.0f, 8.987f, 24.0f, 8.029f)
                arcTo(5.033f, 5.033f, 0.0f, false, false, 20.356f, 3.188f)
                close()
                moveTo(17.456f, 17.469f)
                curveTo(13.155f, 21.761f, 8.82f, 22.0f, 8.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -2.979f)
                arcTo(2.971f, 2.971f, 0.0f, false, true, 5.868f, 16.9f)
                arcToRelative(3.059f, 3.059f, 0.0f, false, true, 2.205f, -0.891f)
                arcToRelative(8.78f, 8.78f, 0.0f, false, false, 5.142f, -2.774f)
                arcTo(8.455f, 8.455f, 0.0f, false, false, 16.0f, 7.956f)
                arcTo(2.982f, 2.982f, 0.0f, false, true, 19.0f, 5.0f)
                arcToRelative(3.018f, 3.018f, 0.0f, false, true, 3.0f, 3.029f)
                curveTo(22.0f, 8.849f, 21.781f, 13.156f, 17.457f, 17.469f)
                close()
            }
        }
        .build()
        return _sausage!!
    }

private var _sausage: ImageVector? = null
