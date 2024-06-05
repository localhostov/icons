package me.localx.icons.straight.outline

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

public val Icons.Outline.UserAdd: ImageVector
    get() {
        if (_userAdd != null) {
            return _userAdd!!
        }
        _userAdd = Builder(name = "UserAdd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 3.0f, 6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 9.0f, 12.0f)
                close()
                moveTo(9.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 5.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-3.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.043f, 14.0f)
                horizontalLineTo(4.957f)
                arcTo(4.963f, 4.963f, 0.0f, false, false, 0.0f, 18.957f)
                verticalLineTo(24.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.957f)
                arcTo(2.96f, 2.96f, 0.0f, false, true, 4.957f, 16.0f)
                horizontalLineToRelative(8.086f)
                arcTo(2.96f, 2.96f, 0.0f, false, true, 16.0f, 18.957f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(18.957f)
                arcTo(4.963f, 4.963f, 0.0f, false, false, 13.043f, 14.0f)
                close()
            }
        }
        .build()
        return _userAdd!!
    }

private var _userAdd: ImageVector? = null
