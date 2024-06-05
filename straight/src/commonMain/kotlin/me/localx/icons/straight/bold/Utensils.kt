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

public val Icons.Bold.Utensils: ImageVector
    get() {
        if (_utensils != null) {
            return _utensils!!
        }
        _utensils = Builder(name = "Utensils", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 9.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.5f, 13.0f)
                lineTo(8.0f, 13.0f)
                lineTo(8.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 13.0f)
                lineTo(3.5f, 13.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.0f, 9.5f)
                lineTo(0.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                lineTo(5.0f, 10.0f)
                lineTo(5.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 10.0f)
                lineTo(9.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(24.0f, 9.767f)
                curveToRelative(0.0f, 4.861f, -3.672f, 9.2f, -5.0f, 10.612f)
                lineTo(19.0f, 24.0f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.511f, -1.486f)
                curveTo(22.1f, 3.149f, 24.0f, 6.4f, 24.0f, 9.767f)
                close()
                moveTo(19.0f, 15.521f)
                arcTo(9.365f, 9.365f, 0.0f, false, false, 19.0f, 4.1f)
                close()
            }
        }
        .build()
        return _utensils!!
    }

private var _utensils: ImageVector? = null
