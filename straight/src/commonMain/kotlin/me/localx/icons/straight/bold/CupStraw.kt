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

public val Icons.Bold.CupStraw: ImageVector
    get() {
        if (_cupStraw != null) {
            return _cupStraw!!
        }
        _cupStraw = Builder(name = "CupStraw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 5.0f)
                horizontalLineToRelative(-7.947f)
                lineToRelative(0.267f, -2.0f)
                horizontalLineToRelative(4.68f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-7.32f)
                lineToRelative(-0.656f, 5.0f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.167f)
                lineToRelative(1.524f, 12.911f)
                curveToRelative(0.208f, 1.761f, 1.702f, 3.089f, 3.476f, 3.089f)
                horizontalLineToRelative(9.666f)
                curveToRelative(1.773f, 0.0f, 3.268f, -1.328f, 3.476f, -3.09f)
                lineToRelative(1.524f, -12.91f)
                horizontalLineToRelative(1.167f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.33f, 20.558f)
                curveToRelative(-0.03f, 0.252f, -0.244f, 0.442f, -0.497f, 0.442f)
                lineTo(7.167f, 21.0f)
                curveToRelative(-0.253f, 0.0f, -0.467f, -0.19f, -0.497f, -0.441f)
                lineToRelative(-1.483f, -12.559f)
                horizontalLineToRelative(13.626f)
                lineToRelative(-1.483f, 12.558f)
                close()
            }
        }
        .build()
        return _cupStraw!!
    }

private var _cupStraw: ImageVector? = null
