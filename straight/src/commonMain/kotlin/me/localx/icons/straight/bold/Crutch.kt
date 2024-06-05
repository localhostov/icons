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

public val Icons.Bold.Crutch: ImageVector
    get() {
        if (_crutch != null) {
            return _crutch!!
        }
        _crutch = Builder(name = "Crutch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.965f, 9.331f)
                lineTo(14.663f, 0.029f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(0.917f, 0.917f)
                lineToRelative(-5.446f, 5.445f)
                curveToRelative(-1.943f, 1.943f, -3.014f, 4.527f, -3.014f, 7.275f)
                verticalLineToRelative(1.09f)
                lineTo(0.157f, 21.722f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(4.843f, -4.843f)
                horizontalLineToRelative(1.091f)
                curveToRelative(2.709f, 0.0f, 5.36f, -1.099f, 7.274f, -3.014f)
                lineToRelative(5.446f, -5.446f)
                lineToRelative(0.911f, 0.911f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(-0.211f)
                curveToRelative(0.0f, -1.437f, 0.413f, -2.81f, 1.183f, -3.984f)
                lineToRelative(3.009f, 3.009f)
                curveToRelative(-1.177f, 0.764f, -2.567f, 1.187f, -3.98f, 1.187f)
                horizontalLineToRelative(-0.212f)
                close()
                moveTo(14.426f, 12.805f)
                lineToRelative(-3.231f, -3.231f)
                lineToRelative(4.385f, -4.385f)
                lineToRelative(3.231f, 3.231f)
                lineToRelative(-4.386f, 4.385f)
                close()
            }
        }
        .build()
        return _crutch!!
    }

private var _crutch: ImageVector? = null
