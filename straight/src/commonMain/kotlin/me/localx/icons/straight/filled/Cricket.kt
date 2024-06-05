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

public val Icons.Filled.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.963f, 15.6f)
                lineTo(6.905f, 23.66f)
                lineToRelative(-0.223f, 0.074f)
                arcTo(6.241f, 6.241f, 0.0f, false, true, 4.858f, 24.0f)
                arcToRelative(4.811f, 4.811f, 0.0f, false, true, -3.492f, -1.366f)
                curveTo(-0.764f, 20.5f, 0.223f, 17.448f, 0.267f, 17.318f)
                lineTo(0.341f, 17.1f)
                lineTo(8.4f, 9.037f)
                lineToRelative(0.993f, 0.994f)
                arcTo(2.288f, 2.288f, 0.0f, false, true, 10.0f, 11.673f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.413f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 1.556f, 0.608f)
                close()
                moveTo(20.457f, 0.043f)
                lineTo(19.043f, 1.457f)
                lineTo(20.086f, 2.5f)
                lineTo(16.4f, 6.189f)
                arcToRelative(2.652f, 2.652f, 0.0f, false, true, -3.742f, 0.0f)
                lineToRelative(-0.707f, -0.7f)
                lineTo(9.812f, 7.623f)
                lineToRelative(0.994f, 0.994f)
                arcTo(4.218f, 4.218f, 0.0f, false, true, 12.0f, 11.673f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(0.424f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.958f, 1.193f)
                lineToRelative(0.995f, 1.0f)
                lineToRelative(2.135f, -2.135f)
                lineToRelative(-0.705f, -0.707f)
                arcToRelative(2.65f, 2.65f, 0.0f, false, true, 0.0f, -3.739f)
                lineToRelative(0.0f, 0.0f)
                lineTo(21.5f, 3.914f)
                lineToRelative(1.043f, 1.043f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(24.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.5f)
                close()
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null
