package me.localx.icons.rounded.outline

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

public val Icons.Outline.Dreidel: ImageVector
    get() {
        if (_dreidel != null) {
            return _dreidel!!
        }
        _dreidel = Builder(name = "Dreidel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(14.96f, 7.626f)
                lineTo(13.8f, 6.465f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -7.067f, -0.006f)
                lineTo(1.465f, 11.647f)
                arcTo(4.973f, 4.973f, 0.0f, false, false, 0.0f, 15.184f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(8.816f, 24.0f)
                arcToRelative(4.977f, 4.977f, 0.0f, false, false, 3.542f, -1.47f)
                lineToRelative(5.177f, -5.258f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 0.0f, -7.071f)
                lineTo(16.374f, 9.04f)
                lineToRelative(7.333f, -7.333f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.707f, 0.293f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(2.0f, 15.86f)
                arcTo(6.47f, 6.47f, 0.0f, false, false, 5.442f, 17.0f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, false, 1.732f, -0.182f)
                arcTo(7.905f, 7.905f, 0.0f, false, false, 7.0f, 18.5f)
                arcTo(6.6f, 6.6f, 0.0f, false, false, 8.15f, 22.0f)
                lineTo(5.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 19.0f)
                close()
                moveTo(16.115f, 15.863f)
                lineTo(10.938f, 21.121f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -0.585f, 0.457f)
                arcTo(5.044f, 5.044f, 0.0f, false, true, 9.0f, 18.5f)
                arcToRelative(4.386f, 4.386f, 0.0f, false, true, 1.128f, -3.214f)
                lineToRelative(2.579f, -2.579f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineTo(8.714f, 13.872f)
                arcTo(4.552f, 4.552f, 0.0f, false, true, 5.442f, 15.0f)
                arcToRelative(4.849f, 4.849f, 0.0f, false, true, -3.023f, -1.349f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.455f, -0.584f)
                lineTo(8.142f, 7.879f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.243f, 0.0f)
                lineToRelative(3.736f, 3.736f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.115f, 15.863f)
                close()
            }
        }
        .build()
        return _dreidel!!
    }

private var _dreidel: ImageVector? = null
