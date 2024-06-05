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

public val Icons.Bold.DeleteRight: ImageVector
    get() {
        if (_deleteRight != null) {
            return _deleteRight!!
        }
        _deleteRight = Builder(name = "DeleteRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.241f, 2.0f)
                lineTo(3.5f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.741f)
                lineToRelative(7.647f, -10.0f)
                lineToRelative(-7.647f, -10.0f)
                close()
                moveTo(14.759f, 19.0f)
                lineTo(3.5f, 19.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.259f)
                lineToRelative(5.353f, 7.0f)
                lineToRelative(-5.353f, 7.0f)
                close()
                moveTo(14.061f, 10.061f)
                lineToRelative(-1.939f, 1.939f)
                lineToRelative(1.939f, 1.939f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(-1.939f, 1.939f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.939f, -1.939f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.939f, 1.939f)
                lineToRelative(1.939f, -1.939f)
                lineToRelative(2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _deleteRight!!
    }

private var _deleteRight: ImageVector? = null
