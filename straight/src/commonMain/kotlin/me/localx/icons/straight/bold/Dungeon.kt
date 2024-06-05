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

public val Icons.Bold.Dungeon: ImageVector
    get() {
        if (_dungeon != null) {
            return _dungeon!!
        }
        _dungeon = Builder(name = "Dungeon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 12.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(16.0f, 12.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(19.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.167f, -0.23f, -2.279f, -0.636f, -3.304f)
                lineToRelative(-1.742f, 1.053f)
                curveToRelative(0.241f, 0.707f, 0.378f, 1.463f, 0.378f, 2.25f)
                close()
                moveTo(5.378f, 9.749f)
                lineToRelative(-1.742f, -1.053f)
                curveToRelative(-0.406f, 1.024f, -0.636f, 2.137f, -0.636f, 3.304f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.788f, 0.137f, -1.543f, 0.378f, -2.251f)
                close()
                moveTo(5.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(10.5f, 5.166f)
                lineTo(10.5f, 3.135f)
                curveToRelative(-2.108f, 0.356f, -3.967f, 1.442f, -5.308f, 2.995f)
                lineToRelative(1.742f, 1.053f)
                curveToRelative(0.946f, -0.995f, 2.178f, -1.713f, 3.566f, -2.017f)
                close()
                moveTo(17.067f, 7.184f)
                lineToRelative(1.741f, -1.053f)
                curveToRelative(-1.341f, -1.553f, -3.2f, -2.639f, -5.308f, -2.995f)
                verticalLineToRelative(2.03f)
                curveToRelative(1.388f, 0.305f, 2.62f, 1.023f, 3.567f, 2.018f)
                close()
                moveTo(21.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _dungeon!!
    }

private var _dungeon: ImageVector? = null
