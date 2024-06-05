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

public val Icons.Bold.VideoArrowUpRight: ImageVector
    get() {
        if (_videoArrowUpRight != null) {
            return _videoArrowUpRight!!
        }
        _videoArrowUpRight = Builder(name = "VideoArrowUpRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-1.94f, -1.94f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 18.875f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(5.125f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.625f)
                lineToRelative(3.0f, -3.0f)
                verticalLineToRelative(13.75f)
                close()
                moveTo(18.0f, 6.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 6.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(15.0f)
                lineTo(18.0f, 6.5f)
                close()
            }
        }
        .build()
        return _videoArrowUpRight!!
    }

private var _videoArrowUpRight: ImageVector? = null
