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

public val Icons.Filled.Notes: ImageVector
    get() {
        if (_notes != null) {
            return _notes!!
        }
        _notes = Builder(name = "Notes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.654f, 22.0f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-15.223f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                verticalLineToRelative(16.038f)
                horizontalLineToRelative(13.654f)
                close()
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(23.687f, 14.0f)
                horizontalLineToRelative(-5.687f)
                verticalLineToRelative(5.687f)
                lineToRelative(5.687f, -5.687f)
                close()
            }
        }
        .build()
        return _notes!!
    }

private var _notes: ImageVector? = null
