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

public val Icons.Bold.ValueAbsolute: ImageVector
    get() {
        if (_valueAbsolute != null) {
            return _valueAbsolute!!
        }
        _valueAbsolute = Builder(name = "ValueAbsolute", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.061f, 8.061f)
                lineToRelative(-3.939f, 3.939f)
                lineToRelative(3.939f, 3.939f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-3.939f, -3.939f)
                lineToRelative(-3.939f, 3.939f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(3.939f, -3.939f)
                lineToRelative(-3.939f, -3.939f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(3.939f, 3.939f)
                lineToRelative(3.939f, -3.939f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(21.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _valueAbsolute!!
    }

private var _valueAbsolute: ImageVector? = null
