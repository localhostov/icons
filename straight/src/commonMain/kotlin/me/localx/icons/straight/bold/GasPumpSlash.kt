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

public val Icons.Bold.GasPumpSlash: ImageVector
    get() {
        if (_gasPumpSlash != null) {
            return _gasPumpSlash!!
        }
        _gasPumpSlash = Builder(name = "GasPumpSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.033f, 20.912f)
                arcTo(3.485f, 3.485f, 0.0f, false, false, 24.0f, 18.5f)
                verticalLineTo(5.914f)
                arcToRelative(2.519f, 2.519f, 0.0f, false, false, -0.732f, -1.768f)
                lineTo(19.561f, 0.439f)
                lineTo(17.439f, 2.561f)
                lineTo(19.0f, 4.121f)
                verticalLineTo(6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, 2.45f)
                verticalLineTo(18.5f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, true, -0.092f, 0.287f)
                lineTo(16.0f, 13.879f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(3.507f, 3.507f, 0.0f, false, false, 2.325f, 0.2f)
                lineTo(2.061f, -0.061f)
                lineTo(-0.061f, 2.061f)
                lineToRelative(22.0f, 22.0f)
                lineToRelative(2.122f, -2.122f)
                close()
                moveTo(12.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.121f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(13.0f, 19.363f)
                lineToRelative(3.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(6.364f)
                lineTo(5.636f, 12.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _gasPumpSlash!!
    }

private var _gasPumpSlash: ImageVector? = null
