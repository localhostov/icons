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

public val Icons.Filled.CommentArrowUpRight: ImageVector
    get() {
        if (_commentArrowUpRight != null) {
            return _commentArrowUpRight!!
        }
        _commentArrowUpRight = Builder(name = "CommentArrowUpRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.557f)
                lineToRelative(-6.591f, 6.591f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(6.62f, -6.62f)
                horizontalLineToRelative(-4.615f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.529f)
                curveToRelative(1.362f, 0.0f, 2.471f, 1.122f, 2.471f, 2.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }
        .build()
        return _commentArrowUpRight!!
    }

private var _commentArrowUpRight: ImageVector? = null
