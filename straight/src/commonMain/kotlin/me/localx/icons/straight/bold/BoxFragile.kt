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

public val Icons.Bold.BoxFragile: ImageVector
    get() {
        if (_boxFragile != null) {
            return _boxFragile!!
        }
        _boxFragile = Builder(name = "BoxFragile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                lineTo(21.0f, 21.0f)
                close()
                moveTo(13.5f, 14.538f)
                verticalLineToRelative(1.462f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1.429f)
                curveToRelative(-2.053f, -0.623f, -3.5f, -2.532f, -3.5f, -4.786f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(4.196f)
                lineToRelative(-2.223f, 5.0f)
                horizontalLineToRelative(2.818f)
                lineToRelative(-1.216f, 2.336f)
                lineToRelative(1.789f, 0.895f)
                lineToRelative(2.663f, -5.231f)
                horizontalLineToRelative(-2.977f)
                lineToRelative(1.333f, -3.0f)
                horizontalLineToRelative(3.615f)
                verticalLineToRelative(4.785f)
                curveToRelative(0.0f, 2.216f, -1.5f, 4.099f, -3.5f, 4.753f)
                close()
            }
        }
        .build()
        return _boxFragile!!
    }

private var _boxFragile: ImageVector? = null
