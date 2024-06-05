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

public val Icons.Bold.LiveAlt: ImageVector
    get() {
        if (_liveAlt != null) {
            return _liveAlt!!
        }
        _liveAlt = Builder(name = "LiveAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.0f)
                curveToRelative(1.47f, 0.0f, 2.851f, 0.572f, 3.889f, 1.611f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(-0.945f, -0.944f, -2.59f, -0.944f, -3.535f, 0.0f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(1.038f, -1.039f, 2.419f, -1.611f, 3.889f, -1.611f)
                close()
                moveTo(16.597f, 4.904f)
                lineToRelative(2.121f, -2.121f)
                curveTo(15.013f, -0.921f, 8.987f, -0.921f, 5.282f, 2.783f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(2.535f, -2.534f, 6.658f, -2.534f, 9.193f, 0.0f)
                close()
                moveTo(24.0f, 13.5f)
                verticalLineToRelative(10.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.36f)
                lineToRelative(-1.0f, 3.5f)
                lineToRelative(-1.0f, -3.5f)
                verticalLineToRelative(-0.36f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                lineToRelative(2.115f, 7.5f)
                horizontalLineToRelative(1.783f)
                lineToRelative(2.065f, -7.225f)
                lineToRelative(0.038f, -0.775f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _liveAlt!!
    }

private var _liveAlt: ImageVector? = null
