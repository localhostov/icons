package me.localx.icons.straight.outline

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

public val Icons.Outline.DeleteRight: ImageVector
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
                moveTo(15.329f, 20.0f)
                lineTo(3.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.329f)
                lineToRelative(6.118f, 8.0f)
                lineToRelative(-6.118f, 8.0f)
                close()
                moveTo(14.034f, 9.38f)
                lineToRelative(-2.62f, 2.62f)
                lineToRelative(2.62f, 2.62f)
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
                close()
            }
        }
        .build()
        return _deleteRight!!
    }

private var _deleteRight: ImageVector? = null
