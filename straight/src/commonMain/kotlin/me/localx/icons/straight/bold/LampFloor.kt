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

public val Icons.Bold.LampFloor: ImageVector
    get() {
        if (_lampFloor != null) {
            return _lampFloor!!
        }
        _lampFloor = Builder(name = "LampFloor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 11.0f)
                horizontalLineToRelative(7.082f)
                lineToRelative(-1.346f, -8.074f)
                curveToRelative(-0.281f, -1.695f, -1.733f, -2.926f, -3.452f, -2.926f)
                horizontalLineToRelative(-7.568f)
                curveToRelative(-1.718f, 0.0f, -3.17f, 1.23f, -3.453f, 2.925f)
                lineToRelative(-1.346f, 8.075f)
                horizontalLineToRelative(7.083f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(7.722f, 3.418f)
                curveToRelative(0.041f, -0.242f, 0.248f, -0.418f, 0.494f, -0.418f)
                horizontalLineToRelative(7.568f)
                curveToRelative(0.245f, 0.0f, 0.453f, 0.175f, 0.493f, 0.418f)
                lineToRelative(0.764f, 4.582f)
                horizontalLineTo(6.958f)
                lineToRelative(0.764f, -4.582f)
                close()
            }
        }
        .build()
        return _lampFloor!!
    }

private var _lampFloor: ImageVector? = null
