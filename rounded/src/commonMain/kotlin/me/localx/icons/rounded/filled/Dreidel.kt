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

public val Icons.Filled.Dreidel: ImageVector
    get() {
        if (_dreidel != null) {
            return _dreidel!!
        }
        _dreidel = Builder(name = "Dreidel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.848f, 23.894f)
                arcTo(5.047f, 5.047f, 0.0f, false, true, 8.816f, 24.0f)
                horizontalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineTo(15.184f)
                arcToRelative(4.988f, 4.988f, 0.0f, false, true, 0.107f, -1.033f)
                lineToRelative(0.507f, 0.507f)
                arcTo(6.882f, 6.882f, 0.0f, false, false, 5.442f, 17.0f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, false, 1.732f, -0.182f)
                arcTo(7.905f, 7.905f, 0.0f, false, false, 7.0f, 18.5f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, false, 2.293f, 4.838f)
                close()
                moveTo(23.707f, 0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(14.96f, 7.626f)
                lineTo(13.8f, 6.465f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -7.067f, -0.006f)
                lineTo(1.465f, 11.647f)
                arcToRelative(5.043f, 5.043f, 0.0f, false, false, -0.481f, 0.556f)
                lineToRelative(1.09f, 1.09f)
                arcTo(4.97f, 4.97f, 0.0f, false, false, 5.442f, 15.0f)
                arcToRelative(4.552f, 4.552f, 0.0f, false, false, 3.272f, -1.128f)
                lineToRelative(2.579f, -2.579f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineToRelative(-2.579f, 2.579f)
                arcTo(4.386f, 4.386f, 0.0f, false, false, 9.0f, 18.5f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, 1.662f, 3.382f)
                lineTo(11.8f, 23.016f)
                arcToRelative(5.14f, 5.14f, 0.0f, false, false, 0.561f, -0.486f)
                lineToRelative(5.177f, -5.258f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 0.0f, -7.071f)
                lineTo(16.374f, 9.04f)
                lineToRelative(7.333f, -7.333f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.707f, 0.293f)
                close()
            }
        }
        .build()
        return _dreidel!!
    }

private var _dreidel: ImageVector? = null
