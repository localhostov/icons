package me.localx.icons.straight.outline

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

public val Icons.Outline.Damage: ImageVector
    get() {
        if (_damage != null) {
            return _damage!!
        }
        _damage = Builder(name = "Damage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 19.767f)
                lineToRelative(-5.354f, -4.53f)
                lineToRelative(-1.292f, 1.526f)
                lineToRelative(6.189f, 5.237f)
                lineTo(2.0f, 22.0f)
                lineToRelative(10.104f, -5.179f)
                lineToRelative(-0.894f, -1.789f)
                lineToRelative(-3.219f, 1.608f)
                lineToRelative(0.009f, -3.638f)
                lineToRelative(-2.0f, -0.005f)
                lineToRelative(-0.012f, 4.643f)
                lineToRelative(-3.988f, 2.124f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.023f)
                lineToRelative(3.099f, 6.0f)
                horizontalLineToRelative(3.29f)
                lineToRelative(2.214f, 3.986f)
                lineToRelative(1.748f, -0.972f)
                lineToRelative(-1.675f, -3.014f)
                horizontalLineToRelative(3.301f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.66f)
                lineToRelative(-2.066f, -4.0f)
                horizontalLineToRelative(11.726f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(16.767f)
                close()
            }
        }
        .build()
        return _damage!!
    }

private var _damage: ImageVector? = null
