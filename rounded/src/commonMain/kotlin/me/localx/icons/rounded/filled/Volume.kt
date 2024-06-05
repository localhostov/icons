package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(name = "Volume", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 4.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.39f, 5.707f)
                arcToRelative(8.911f, 8.911f, 0.0f, false, true, 0.0f, 12.586f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 20.8f, 19.707f)
                arcTo(10.911f, 10.911f, 0.0f, false, false, 20.8f, 4.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.093f, 7.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, 1.414f)
                arcToRelative(4.664f, 4.664f, 0.0f, false, true, 0.0f, 6.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                arcTo(6.665f, 6.665f, 0.0f, false, false, 18.093f, 7.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.819f, 0.207f)
                arcTo(12.055f, 12.055f, 0.0f, false, false, 6.268f, 5.0f)
                horizontalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(6.269f)
                arcToRelative(12.051f, 12.051f, 0.0f, false, false, 7.55f, 4.793f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 22.81f)
                verticalLineTo(1.19f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.819f, 0.207f)
                close()
            }
        }
        .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
