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

public val Icons.Bold.FireFlameSimple: ImageVector
    get() {
        if (_fireFlameSimple != null) {
            return _fireFlameSimple!!
        }
        _fireFlameSimple = Builder(name = "FireFlameSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.06f, 6.911f)
                lineTo(12.0f, 0.006f)
                lineToRelative(-7.071f, 6.917f)
                curveToRelative(-3.899f, 3.898f, -3.899f, 10.243f, 0.0f, 14.142f)
                curveToRelative(1.889f, 1.889f, 4.399f, 2.929f, 7.071f, 2.929f)
                reflectiveCurveToRelative(5.183f, -1.04f, 7.071f, -2.929f)
                curveToRelative(3.899f, -3.898f, 3.899f, -10.243f, -0.012f, -14.153f)
                close()
                moveTo(16.951f, 18.943f)
                curveToRelative(-1.322f, 1.322f, -3.08f, 2.05f, -4.95f, 2.05f)
                reflectiveCurveToRelative(-3.628f, -0.728f, -4.95f, -2.05f)
                curveToRelative(-2.729f, -2.729f, -2.729f, -7.17f, -0.012f, -9.888f)
                lineToRelative(4.962f, -4.853f)
                lineToRelative(4.95f, 4.841f)
                curveToRelative(2.729f, 2.729f, 2.729f, 7.17f, 0.0f, 9.899f)
                close()
                moveTo(14.829f, 12.171f)
                curveToRelative(1.562f, 1.562f, 1.562f, 4.095f, 0.0f, 5.657f)
                curveToRelative(-0.781f, 0.781f, -1.805f, 1.172f, -2.828f, 1.172f)
                curveToRelative(-1.024f, 0.0f, -2.047f, -0.391f, -2.829f, -1.172f)
                curveToRelative(-1.562f, -1.562f, -1.562f, -4.095f, 0.0f, -5.657f)
                lineToRelative(2.828f, -2.766f)
                lineToRelative(2.828f, 2.766f)
                close()
            }
        }
        .build()
        return _fireFlameSimple!!
    }

private var _fireFlameSimple: ImageVector? = null
