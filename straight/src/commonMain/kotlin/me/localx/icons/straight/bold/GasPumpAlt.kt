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

public val Icons.Bold.GasPumpAlt: ImageVector
    get() {
        if (_gasPumpAlt != null) {
            return _gasPumpAlt!!
        }
        _gasPumpAlt = Builder(name = "GasPumpAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.268f, 4.146f)
                lineTo(19.561f, 0.439f)
                lineTo(17.439f, 2.561f)
                lineTo(19.0f, 4.121f)
                verticalLineTo(6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, 2.45f)
                verticalLineTo(18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.5f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 3.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                verticalLineTo(5.914f)
                arcTo(2.519f, 2.519f, 0.0f, false, false, 23.268f, 4.146f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 3.0f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _gasPumpAlt!!
    }

private var _gasPumpAlt: ImageVector? = null
