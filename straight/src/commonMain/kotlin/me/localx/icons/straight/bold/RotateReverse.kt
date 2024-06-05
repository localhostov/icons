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

public val Icons.Bold.RotateReverse: ImageVector
    get() {
        if (_rotateReverse != null) {
            return _rotateReverse!!
        }
        _rotateReverse = Builder(name = "RotateReverse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 17.091f)
                verticalLineToRelative(5.909f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(-2.232f, 2.228f, -5.267f, 3.53f, -8.47f, 3.53f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 4.962f, 4.037f, 9.0f, 9.0f, 9.0f)
                curveToRelative(2.402f, 0.0f, 4.678f, -0.977f, 6.352f, -2.648f)
                lineToRelative(-2.352f, -2.352f)
                horizontalLineToRelative(5.909f)
                curveToRelative(0.602f, 0.0f, 1.091f, 0.488f, 1.091f, 1.091f)
                close()
                moveTo(2.091f, 8.0f)
                horizontalLineToRelative(5.909f)
                lineToRelative(-2.352f, -2.352f)
                curveToRelative(1.675f, -1.671f, 3.95f, -2.648f, 6.352f, -2.648f)
                curveToRelative(4.963f, 0.0f, 9.0f, 4.038f, 9.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-3.203f, 0.0f, -6.237f, 1.302f, -8.47f, 3.53f)
                lineTo(1.0f, 1.0f)
                verticalLineToRelative(5.909f)
                curveToRelative(0.0f, 0.603f, 0.488f, 1.091f, 1.091f, 1.091f)
                close()
            }
        }
        .build()
        return _rotateReverse!!
    }

private var _rotateReverse: ImageVector? = null
