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

public val Icons.Filled.WaterRise: ImageVector
    get() {
        if (_waterRise != null) {
            return _waterRise!!
        }
        _waterRise = Builder(name = "WaterRise", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.315f)
                lineToRelative(1.506f, 1.317f)
                arcTo(4.006f, 4.006f, 0.0f, false, true, 18.0f, 22.618f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, -6.009f, 0.014f)
                lineTo(1.5f, 21.315f)
                arcTo(2.01f, 2.01f, 0.0f, false, false, 5.0f, 20.0f)
                horizontalLineTo(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcTo(2.01f, 2.01f, 0.0f, false, false, 22.5f, 21.315f)
                close()
                moveTo(6.0f, 17.618f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, false, 6.009f, 0.014f)
                lineTo(22.5f, 16.315f)
                arcTo(2.01f, 2.01f, 0.0f, false, true, 19.0f, 15.0f)
                horizontalLineTo(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                horizontalLineTo(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                horizontalLineTo(5.0f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -3.5f, 1.315f)
                lineTo(-0.009f, 17.632f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 6.0f, 17.618f)
                close()
                moveTo(15.293f, 5.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 0.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.828f, 0.0f)
                lineTo(7.293f, 3.879f)
                lineTo(8.707f, 5.293f)
                lineTo(11.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _waterRise!!
    }

private var _waterRise: ImageVector? = null
