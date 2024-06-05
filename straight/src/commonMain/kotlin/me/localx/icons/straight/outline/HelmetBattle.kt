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

public val Icons.Outline.HelmetBattle: ImageVector
    get() {
        if (_helmetBattle != null) {
            return _helmetBattle!!
        }
        _helmetBattle = Builder(name = "HelmetBattle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.481f, 0.244f)
                lineToRelative(-0.481f, -0.265f)
                lineToRelative(-0.481f, 0.265f)
                curveToRelative(-0.975f, 0.536f, -9.519f, 5.388f, -9.519f, 10.794f)
                verticalLineToRelative(8.809f)
                lineToRelative(10.0f, 4.117f)
                lineToRelative(10.0f, -4.117f)
                verticalLineToRelative(-8.809f)
                curveTo(22.0f, 5.632f, 13.456f, 0.779f, 12.481f, 0.244f)
                close()
                moveTo(12.0f, 15.063f)
                lineToRelative(-4.0f, -2.16f)
                verticalLineToRelative(-0.903f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.903f)
                lineToRelative(-4.0f, 2.16f)
                close()
                moveTo(20.0f, 18.507f)
                lineToRelative(-7.0f, 2.882f)
                verticalLineToRelative(-4.594f)
                lineToRelative(5.0f, -2.699f)
                verticalLineToRelative(-4.097f)
                lineTo(6.0f, 9.999f)
                verticalLineToRelative(4.097f)
                lineToRelative(5.0f, 2.699f)
                verticalLineToRelative(4.594f)
                lineToRelative(-7.0f, -2.882f)
                verticalLineToRelative(-7.469f)
                curveToRelative(0.0f, -3.363f, 5.384f, -7.228f, 8.0f, -8.767f)
                curveToRelative(2.616f, 1.539f, 8.0f, 5.404f, 8.0f, 8.767f)
                verticalLineToRelative(7.469f)
                close()
            }
        }
        .build()
        return _helmetBattle!!
    }

private var _helmetBattle: ImageVector? = null
