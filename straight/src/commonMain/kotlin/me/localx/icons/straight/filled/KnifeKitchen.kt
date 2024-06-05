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

public val Icons.Filled.KnifeKitchen: ImageVector
    get() {
        if (_knifeKitchen != null) {
            return _knifeKitchen!!
        }
        _knifeKitchen = Builder(name = "KnifeKitchen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.007f, 11.323f)
                lineToRelative(5.233f, 5.247f)
                lineToRelative(-2.507f, 2.523f)
                curveToRelative(-2.182f, 2.191f, -5.519f, 3.757f, -9.02f, 3.896f)
                curveToRelative(-0.209f, 0.008f, -2.713f, 0.011f, -2.713f, 0.011f)
                curveToRelative(0.0f, -1.695f, 0.672f, -3.32f, 1.869f, -4.52f)
                lineToRelative(7.138f, -7.157f)
                close()
                moveTo(19.265f, 10.944f)
                curveToRelative(-0.683f, 0.695f, -1.046f, 1.616f, -1.024f, 2.593f)
                curveToRelative(0.02f, 0.843f, 0.327f, 1.629f, 0.872f, 2.248f)
                lineToRelative(0.324f, 0.326f)
                lineToRelative(-1.393f, 1.435f)
                curveToRelative(-0.114f, -0.106f, -7.83f, -7.85f, -7.83f, -7.85f)
                lineToRelative(7.605f, -7.631f)
                curveToRelative(1.366f, -1.372f, 3.753f, -1.373f, 5.121f, 0.0f)
                curveToRelative(1.409f, 1.414f, 1.409f, 3.716f, 0.0f, 5.13f)
                lineToRelative(-3.676f, 3.748f)
                close()
                moveTo(20.0f, 6.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _knifeKitchen!!
    }

private var _knifeKitchen: ImageVector? = null
