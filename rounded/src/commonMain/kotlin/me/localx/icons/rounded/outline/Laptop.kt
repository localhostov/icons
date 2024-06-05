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

public val Icons.Outline.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.184f)
                verticalLineTo(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineToRelative(7.184f)
                arcTo(2.993f, 2.993f, 0.0f, false, false, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, 1.0f, -5.816f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(15.849f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.528f, 0.708f)
                lineTo(14.074f, 16.0f)
                horizontalLineTo(9.925f)
                lineToRelative(-0.246f, -0.292f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.151f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 5.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(8.152f)
                lineToRelative(0.246f, 0.292f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.925f, 18.0f)
                horizontalLineToRelative(4.149f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.528f, -0.708f)
                lineTo(15.849f, 17.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
