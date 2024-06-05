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

public val Icons.Filled.Damage: ImageVector
    get() {
        if (_damage != null) {
            return _damage!!
        }
        _damage = Builder(name = "Damage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.077f, 17.282f)
                lineToRelative(1.292f, -1.526f)
                lineToRelative(6.631f, 5.704f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-12.759f)
                lineToRelative(3.099f, 6.0f)
                horizontalLineToRelative(7.66f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.301f)
                lineToRelative(1.675f, 3.014f)
                lineToRelative(-1.748f, 0.972f)
                lineToRelative(-2.214f, -3.986f)
                horizontalLineToRelative(-3.29f)
                lineTo(5.99f, 0.0f)
                horizontalLineToRelative(-2.99f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(18.765f)
                lineToRelative(6.0f, -2.991f)
                verticalLineToRelative(-4.778f)
                lineToRelative(2.0f, 0.005f)
                verticalLineToRelative(3.773f)
                lineToRelative(3.21f, -1.608f)
                lineToRelative(0.894f, 1.789f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(23.907f)
                lineToRelative(-7.83f, -6.718f)
                close()
            }
        }
        .build()
        return _damage!!
    }

private var _damage: ImageVector? = null
