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

public val Icons.Filled.Calendars: ImageVector
    get() {
        if (_calendars != null) {
            return _calendars!!
        }
        _calendars = Builder(name = "Calendars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(4.0f, 9.0f)
                verticalLineToRelative(11.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _calendars!!
    }

private var _calendars: ImageVector? = null
