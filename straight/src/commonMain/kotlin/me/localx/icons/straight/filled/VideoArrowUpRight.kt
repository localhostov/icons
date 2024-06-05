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

public val Icons.Filled.VideoArrowUpRight: ImageVector
    get() {
        if (_videoArrowUpRight != null) {
            return _videoArrowUpRight!!
        }
        _videoArrowUpRight = Builder(name = "VideoArrowUpRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.007f)
                verticalLineToRelative(13.985f)
                lineToRelative(-3.0f, -2.236f)
                lineTo(21.0f, 7.244f)
                lineToRelative(3.0f, -2.236f)
                close()
                moveTo(19.0f, 7.0f)
                verticalLineToRelative(13.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(7.979f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.606f)
                lineToRelative(-6.793f, 6.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(6.793f, -6.793f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _videoArrowUpRight!!
    }

private var _videoArrowUpRight: ImageVector? = null
