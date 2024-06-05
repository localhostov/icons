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

public val Icons.Bold.Skiing: ImageVector
    get() {
        if (_skiing != null) {
            return _skiing!!
        }
        _skiing = Builder(name = "Skiing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 19.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 2.5f)
                close()
                moveTo(23.853f, 21.446f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -6.0f, 2.111f)
                lineTo(0.856f, 15.481f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.288f, -2.71f)
                lineToRelative(7.978f, 3.792f)
                lineToRelative(0.5f, -0.935f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.148f, -0.642f)
                reflectiveCurveTo(9.058f, 13.957f, 9.01f, 13.912f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, true, -0.4f, -4.261f)
                lineTo(5.342f, 8.068f)
                lineToRelative(-0.329f, 0.693f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.356f, 0.858f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.3f, 7.475f)
                lineToRelative(0.339f, -0.715f)
                lineToRelative(-0.411f, -0.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.308f, -2.7f)
                lineToRelative(0.388f, 0.189f)
                lineToRelative(0.308f, -0.65f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.946f, 4.687f)
                lineToRelative(-0.318f, 0.67f)
                lineTo(10.643f, 7.3f)
                lineToRelative(1.024f, -1.16f)
                arcTo(3.469f, 3.469f, 0.0f, false, true, 14.367f, 5.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 2.123f, 0.837f)
                arcTo(3.959f, 3.959f, 0.0f, false, true, 18.0f, 8.938f)
                verticalLineToRelative(1.753f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.292f, 0.454f)
                lineTo(21.16f, 12.55f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.32f, 2.695f)
                lineToRelative(-2.835f, -1.39f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.0f, -3.164f)
                lineTo(15.005f, 9.627f)
                lineToRelative(-2.629f, 3.036f)
                arcToRelative(3.513f, 3.513f, 0.0f, false, true, 0.9f, 4.38f)
                lineToRelative(-0.433f, 0.809f)
                lineToRelative(6.307f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.0f, -0.7f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.706f, 1.3f)
                close()
            }
        }
        .build()
        return _skiing!!
    }

private var _skiing: ImageVector? = null
