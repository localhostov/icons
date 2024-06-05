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

public val Icons.Bold.ClockUpArrow: ImageVector
    get() {
        if (_clockUpArrow != null) {
            return _clockUpArrow!!
        }
        _clockUpArrow = Builder(name = "ClockUpArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.717f)
                lineToRelative(-5.126f, 3.135f)
                lineToRelative(-1.564f, -2.559f)
                lineToRelative(3.69f, -2.258f)
                verticalLineToRelative(-5.035f)
                close()
                moveTo(4.331f, 16.713f)
                curveToRelative(-0.871f, -1.413f, -1.331f, -3.043f, -1.331f, -4.713f)
                curveTo(3.0f, 7.037f, 7.037f, 3.0f, 12.0f, 3.0f)
                curveToRelative(2.772f, 0.0f, 5.35f, 1.25f, 7.069f, 3.43f)
                curveToRelative(1.054f, 1.336f, 1.687f, 2.901f, 1.87f, 4.57f)
                horizontalLineToRelative(3.02f)
                curveToRelative(-0.191f, -2.352f, -1.057f, -4.557f, -2.534f, -6.43f)
                curveTo(19.132f, 1.666f, 15.697f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.226f, 0.614f, 4.4f, 1.776f, 6.287f)
                curveToRelative(0.697f, 1.131f, 1.57f, 2.098f, 2.551f, 2.919f)
                lineToRelative(2.126f, -2.126f)
                curveToRelative(-0.825f, -0.648f, -1.55f, -1.438f, -2.122f, -2.367f)
                close()
                moveTo(22.909f, 13.0f)
                horizontalLineToRelative(-4.909f)
                lineToRelative(1.931f, 1.931f)
                lineToRelative(-4.056f, 4.055f)
                lineToRelative(-3.25f, -3.25f)
                lineToRelative(-6.194f, 6.195f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(4.073f, -4.074f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(6.177f, -6.176f)
                lineToRelative(1.948f, 1.948f)
                verticalLineToRelative(-4.909f)
                curveToRelative(0.0f, -0.602f, -0.488f, -1.091f, -1.091f, -1.091f)
                close()
            }
        }
        .build()
        return _clockUpArrow!!
    }

private var _clockUpArrow: ImageVector? = null
