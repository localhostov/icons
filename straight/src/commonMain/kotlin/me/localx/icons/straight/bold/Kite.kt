package me.localx.icons.straight.bold

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

public val Icons.Bold.Kite: ImageVector
    get() {
        if (_kite != null) {
            return _kite!!
        }
        _kite = Builder(name = "Kite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9f, 17.0f)
                arcToRelative(6.093f, 6.093f, 0.0f, false, false, -3.387f, 1.025f)
                lineTo(11.18f, 20.244f)
                arcToRelative(4.491f, 4.491f, 0.0f, false, true, -2.5f, 0.756f)
                horizontalLineTo(3.626f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, true, -0.439f, -1.062f)
                lineTo(4.28f, 18.844f)
                lineTo(18.3f, 15.1f)
                arcTo(3.635f, 3.635f, 0.0f, false, false, 21.0f, 11.6f)
                verticalLineTo(3.634f)
                arcTo(3.638f, 3.638f, 0.0f, false, false, 17.366f, 0.0f)
                horizontalLineTo(9.4f)
                arcTo(3.635f, 3.635f, 0.0f, false, false, 5.9f, 2.7f)
                lineTo(2.153f, 16.728f)
                lineTo(1.065f, 17.817f)
                arcTo(3.621f, 3.621f, 0.0f, false, false, 3.626f, 24.0f)
                horizontalLineTo(8.684f)
                arcToRelative(7.475f, 7.475f, 0.0f, false, false, 4.16f, -1.26f)
                lineToRelative(3.327f, -2.218f)
                arcTo(3.106f, 3.106f, 0.0f, false, true, 21.0f, 23.105f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.895f)
                arcTo(6.112f, 6.112f, 0.0f, false, false, 17.9f, 17.0f)
                close()
                moveTo(8.794f, 3.47f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, true, 0.125f, -0.232f)
                lineToRelative(4.626f, 4.355f)
                lineTo(17.87f, 3.268f)
                arcToRelative(0.619f, 0.619f, 0.0f, false, true, 0.13f, 0.366f)
                verticalLineTo(11.6f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, true, -0.029f, 0.174f)
                lineTo(13.545f, 7.593f)
                lineToRelative(-7.9f, 7.783f)
                lineToRelative(-0.027f, 0.007f)
                close()
            }
        }
        .build()
        return _kite!!
    }

private var _kite: ImageVector? = null
