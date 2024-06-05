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

public val Icons.Bold.Lambda: ImageVector
    get() {
        if (_lambda != null) {
            return _lambda!!
        }
        _lambda = Builder(name = "Lambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.285f)
                curveToRelative(-1.312f, 0.0f, -2.501f, -0.723f, -3.105f, -1.887f)
                lineToRelative(-6.125f, -11.791f)
                lineToRelative(-7.104f, 13.678f)
                horizontalLineTo(1.0f)
                lineTo(9.794f, 7.068f)
                lineToRelative(-1.973f, -3.799f)
                curveToRelative(-0.087f, -0.166f, -0.257f, -0.27f, -0.444f, -0.27f)
                horizontalLineToRelative(-3.377f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.377f)
                curveToRelative(1.312f, 0.0f, 2.502f, 0.723f, 3.106f, 1.887f)
                lineToRelative(9.788f, 18.844f)
                curveToRelative(0.087f, 0.166f, 0.256f, 0.27f, 0.443f, 0.27f)
                horizontalLineToRelative(3.285f)
                close()
            }
        }
        .build()
        return _lambda!!
    }

private var _lambda: ImageVector? = null
