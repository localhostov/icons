package me.localx.icons.rounded.filled

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

public val Icons.Filled.GasPumpSlash: ImageVector
    get() {
        if (_gasPumpSlash != null) {
            return _gasPumpSlash!!
        }
        _gasPumpSlash = Builder(name = "GasPumpSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.758f, 9.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.242f)
                close()
                moveTo(0.0f, 11.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.866f, -3.891f)
                lineTo(6.758f, 11.0f)
                close()
                moveTo(24.0f, 6.977f)
                arcToRelative(5.955f, 5.955f, 0.0f, false, false, -1.753f, -4.149f)
                lineTo(19.707f, 0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineTo(20.0f, 3.414f)
                verticalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-0.586f)
                lineTo(16.0f, 14.586f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.414f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(5.0f)
                arcTo(4.972f, 4.972f, 0.0f, false, false, 2.248f, 0.834f)
                lineTo(1.707f, 0.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineTo(22.174f, 20.76f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 24.0f, 18.0f)
                reflectiveCurveTo(24.0f, 6.985f, 24.0f, 6.977f)
                close()
            }
        }
        .build()
        return _gasPumpSlash!!
    }

private var _gasPumpSlash: ImageVector? = null
