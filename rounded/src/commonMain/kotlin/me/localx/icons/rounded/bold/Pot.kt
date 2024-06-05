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

public val Icons.Bold.Pot: ImageVector
    get() {
        if (_pot != null) {
            return _pot!!
        }
        _pot = Builder(name = "Pot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 5.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 7.5f, 24.0f)
                horizontalLineToRelative(9.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 22.0f, 18.5f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(19.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 21.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.0f, 18.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _pot!!
    }

private var _pot: ImageVector? = null