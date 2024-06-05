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

public val Icons.Filled.Mistletoe: ImageVector
    get() {
        if (_mistletoe != null) {
            return _mistletoe!!
        }
        _mistletoe = Builder(name = "Mistletoe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 6.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(12.975f, 9.233f)
                curveTo(12.735f, 5.469f, 10.569f, 0.0f, 0.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(6.936f, 0.0f, 10.616f, 2.435f, 10.966f, 7.232f)
                curveToRelative(-2.857f, 0.891f, -10.966f, 4.042f, -10.966f, 10.768f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -4.922f, 2.788f, -7.752f, 3.997f, -8.748f)
                curveToRelative(1.197f, 0.996f, 4.003f, 3.85f, 4.003f, 8.748f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -6.945f, -8.437f, -9.994f, -11.025f, -10.767f)
                close()
                moveTo(8.0f, 7.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _mistletoe!!
    }

private var _mistletoe: ImageVector? = null
