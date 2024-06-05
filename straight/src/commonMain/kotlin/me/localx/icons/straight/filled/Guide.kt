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

public val Icons.Filled.Guide: ImageVector
    get() {
        if (_guide != null) {
            return _guide!!
        }
        _guide = Builder(name = "Guide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.462f)
                lineToRelative(-4.0f, 2.538f)
                verticalLineToRelative(6.5f)
                lineToRelative(-6.0f, 6.0f)
                verticalLineToRelative(6.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(8.138f)
                lineToRelative(5.362f, -4.469f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(4.0f, 2.462f)
                close()
                moveTo(15.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.806f)
                curveToRelative(-1.039f, -1.792f, -2.978f, -3.0f, -5.194f, -3.0f)
                curveTo(4.032f, 0.0f, 1.561f, 2.166f, 1.084f, 5.0f)
                horizontalLineToRelative(13.916f)
                close()
                moveTo(7.0f, 12.0f)
                curveToRelative(2.968f, 0.0f, 5.439f, -2.166f, 5.916f, -5.0f)
                lineTo(1.084f, 7.0f)
                curveToRelative(0.477f, 2.834f, 2.948f, 5.0f, 5.916f, 5.0f)
                close()
            }
        }
        .build()
        return _guide!!
    }

private var _guide: ImageVector? = null
