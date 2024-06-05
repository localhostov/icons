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

public val Icons.Filled.DeleteRight: ImageVector
    get() {
        if (_deleteRight != null) {
            return _deleteRight!!
        }
        _deleteRight = Builder(name = "DeleteRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.317f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(13.317f)
                lineToRelative(7.647f, -10.0f)
                lineToRelative(-7.647f, -10.0f)
                close()
                moveTo(14.034f, 14.62f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.62f, -2.62f)
                lineToRelative(-2.62f, 2.62f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.62f, -2.62f)
                lineToRelative(-2.62f, -2.62f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.62f, 2.62f)
                lineToRelative(2.62f, -2.62f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.62f, 2.62f)
                lineToRelative(2.62f, 2.62f)
                close()
            }
        }
        .build()
        return _deleteRight!!
    }

private var _deleteRight: ImageVector? = null
