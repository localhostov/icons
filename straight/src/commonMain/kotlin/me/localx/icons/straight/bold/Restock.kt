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

public val Icons.Bold.Restock: ImageVector
    get() {
        if (_restock != null) {
            return _restock!!
        }
        _restock = Builder(name = "Restock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-2.703f, 0.0f, -5.298f, -0.939f, -7.389f, -2.573f)
                lineToRelative(-2.573f, 2.573f)
                verticalLineToRelative(-6.021f)
                curveToRelative(0.0f, -0.527f, 0.428f, -0.954f, 0.955f, -0.955f)
                horizontalLineToRelative(6.021f)
                lineToRelative(-2.265f, 2.265f)
                curveToRelative(1.516f, 1.09f, 3.348f, 1.711f, 5.251f, 1.711f)
                curveToRelative(4.963f, 0.0f, 9.0f, -4.037f, 9.0f, -9.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.912f, 0.0f, 3.741f, 0.618f, 5.255f, 1.707f)
                lineToRelative(-2.269f, 2.269f)
                horizontalLineToRelative(5.83f)
                curveToRelative(0.633f, 0.0f, 1.146f, -0.513f, 1.146f, -1.146f)
                lineTo(21.962f, 0.0f)
                lineToRelative(-2.573f, 2.573f)
                curveToRelative(-2.088f, -1.635f, -4.675f, -2.573f, -7.389f, -2.573f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                curveTo(3.0f, 7.037f, 7.038f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(15.0f, 8.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.5f, 10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _restock!!
    }

private var _restock: ImageVector? = null
