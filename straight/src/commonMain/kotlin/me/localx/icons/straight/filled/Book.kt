package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(426.667f, 0.0f)
                horizontalLineToRelative(-256.0f)
                verticalLineToRelative(384.0f)
                horizontalLineToRelative(298.667f)
                verticalLineTo(42.667f)
                curveTo(469.333f, 19.103f, 450.231f, 0.0f, 426.667f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.667f, 0.0f)
                curveToRelative(-35.346f, 0.0f, -64.0f, 28.654f, -64.0f, 64.0f)
                verticalLineToRelative(336.32f)
                curveToRelative(11.715f, -10.528f, 26.916f, -16.342f, 42.667f, -16.32f)
                horizontalLineTo(128.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(106.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.333f, 512.0f)
                horizontalLineToRelative(-384.0f)
                curveToRelative(-23.564f, 0.0f, -42.667f, -19.102f, -42.667f, -42.667f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, -23.564f, 19.103f, -42.667f, 42.667f, -42.667f)
                horizontalLineToRelative(384.0f)
                verticalLineTo(512.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
