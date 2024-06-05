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

public val Icons.Filled.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.848f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.527f, 0.708f)
                lineTo(14.074f, 17.0f)
                horizontalLineTo(9.925f)
                lineToRelative(-0.246f, -0.292f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.151f, 16.0f)
                horizontalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 18.5f)
                horizontalLineTo(0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 21.0f)
                horizontalLineToRelative(19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 18.5f)
                horizontalLineToRelative(0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.5f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                horizontalLineTo(8.151f)
                arcTo(3.993f, 3.993f, 0.0f, false, true, 10.8f, 15.0f)
                horizontalLineToRelative(2.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.647f, -1.0f)
                horizontalLineTo(21.0f)
                arcToRelative(4.909f, 4.909f, 0.0f, false, true, 1.0f, 0.11f)
                verticalLineTo(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineToRelative(6.11f)
                arcTo(4.909f, 4.909f, 0.0f, false, true, 3.0f, 14.0f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
