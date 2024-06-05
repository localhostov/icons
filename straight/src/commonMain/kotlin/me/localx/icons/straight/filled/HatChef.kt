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

public val Icons.Filled.HatChef: ImageVector
    get() {
        if (_hatChef != null) {
            return _hatChef!!
        }
        _hatChef = Builder(name = "HatChef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 1.0f)
                arcToRelative(4.939f, 4.939f, 0.0f, false, true, 2.713f, 0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.574f, 0.0f)
                arcTo(4.939f, 4.939f, 0.0f, false, true, 19.0f, 1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 1.0f, 9.9f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.9f)
                arcTo(5.008f, 5.008f, 0.0f, false, true, 0.0f, 6.0f)
                close()
                moveTo(4.0f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _hatChef!!
    }

private var _hatChef: ImageVector? = null
