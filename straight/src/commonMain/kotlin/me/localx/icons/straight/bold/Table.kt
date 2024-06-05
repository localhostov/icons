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

public val Icons.Bold.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table = Builder(name = "Table", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 2.0f)
                lineTo(3.5f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(10.5f, 7.0f)
                verticalLineToRelative(4.5f)
                lineTo(3.0f, 11.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(13.5f, 7.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(3.0f, 14.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.5f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(13.5f, 19.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _table!!
    }

private var _table: ImageVector? = null
