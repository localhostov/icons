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

public val Icons.Bold.Female: ImageVector
    get() {
        if (_female != null) {
            return _female!!
        }
        _female = Builder(name = "Female", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -9.5f, 7.854f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.854f)
                arcTo(8.01f, 8.01f, 0.0f, false, false, 20.0f, 8.0f)
                close()
                moveTo(7.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 7.0f, 8.0f)
                close()
            }
        }
        .build()
        return _female!!
    }

private var _female: ImageVector? = null
