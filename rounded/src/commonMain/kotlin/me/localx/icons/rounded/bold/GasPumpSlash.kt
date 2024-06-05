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
                moveTo(14.625f, 22.138f)
                arcTo(5.505f, 5.505f, 0.0f, false, true, 10.5f, 24.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                verticalLineTo(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.875f, -0.847f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.25f, 1.985f)
                close()
                moveTo(24.0f, 18.5f)
                arcToRelative(3.485f, 3.485f, 0.0f, false, true, -0.967f, 2.412f)
                lineToRelative(0.528f, 0.527f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 2.122f)
                lineToRelative(-21.0f, -21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.561f, 0.439f)
                lineTo(2.819f, 0.7f)
                arcTo(5.491f, 5.491f, 0.0f, false, true, 5.5f, 0.0f)
                horizontalLineToRelative(5.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 16.0f, 5.5f)
                verticalLineToRelative(8.379f)
                lineToRelative(4.908f, 4.908f)
                arcTo(0.491f, 0.491f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineTo(8.95f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 6.5f)
                verticalLineTo(4.121f)
                lineToRelative(-1.561f, -1.56f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.561f, 0.439f)
                lineTo(22.1f, 2.975f)
                arcTo(6.451f, 6.451f, 0.0f, false, true, 24.0f, 7.436f)
                curveTo(24.0f, 7.457f, 24.0f, 18.5f, 24.0f, 18.5f)
                close()
                moveTo(5.146f, 3.025f)
                lineTo(13.0f, 10.879f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.5f, 3.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(2.61f, 2.61f, 0.0f, false, false, 5.146f, 3.025f)
                close()
            }
        }
        .build()
        return _gasPumpSlash!!
    }

private var _gasPumpSlash: ImageVector? = null
