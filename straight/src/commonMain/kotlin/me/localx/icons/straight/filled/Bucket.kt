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

public val Icons.Filled.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.381f, 8.0f)
                curveToRelative(-0.503f, -3.159f, -2.572f, -5.8f, -5.381f, -7.111f)
                verticalLineToRelative(-0.889f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(0.889f)
                curveToRelative(-2.809f, 1.31f, -4.878f, 3.951f, -5.381f, 7.111f)
                horizontalLineToRelative(-1.619f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.692f)
                lineToRelative(0.429f, 2.0f)
                horizontalLineToRelative(14.714f)
                lineToRelative(-0.429f, 2.0f)
                lineTo(3.549f, 14.0f)
                lineToRelative(2.143f, 10.0f)
                horizontalLineToRelative(12.617f)
                lineToRelative(3.0f, -14.0f)
                horizontalLineToRelative(1.692f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.619f)
                close()
                moveTo(4.651f, 8.0f)
                curveToRelative(0.414f, -2.031f, 1.654f, -3.76f, 3.349f, -4.834f)
                verticalLineToRelative(0.834f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.834f)
                curveToRelative(1.695f, 1.074f, 2.935f, 2.804f, 3.349f, 4.834f)
                lineTo(4.651f, 8.0f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
