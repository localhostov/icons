package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Blood: ImageVector
    get() {
        if (_blood != null) {
            return _blood!!
        }
        _blood = Builder(name = "Blood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.04f, 11.856f)
                lineToRelative(-0.826f, -0.631f)
                curveToRelative(-0.717f, -0.547f, -1.711f, -0.547f, -2.428f, 0.0f)
                lineToRelative(-0.826f, 0.631f)
                lineToRelative(-2.202f, 1.901f)
                curveToRelative(-2.339f, 2.339f, -2.339f, 6.146f, 0.0f, 8.485f)
                curveToRelative(1.133f, 1.133f, 2.64f, 1.757f, 4.242f, 1.757f)
                reflectiveCurveToRelative(3.109f, -0.624f, 4.243f, -1.757f)
                curveToRelative(2.339f, -2.339f, 2.339f, -6.146f, -0.054f, -8.536f)
                lineToRelative(-2.148f, -1.851f)
                close()
                moveTo(22.361f, 8.584f)
                lineToRelative(-1.947f, -1.798f)
                lineToRelative(-0.526f, -0.506f)
                curveToRelative(-0.774f, -0.744f, -1.997f, -0.745f, -2.771f, -0.002f)
                lineToRelative(-0.509f, 0.488f)
                lineToRelative(-1.996f, 1.845f)
                curveToRelative(-1.039f, 1.039f, -1.611f, 2.42f, -1.611f, 3.889f)
                reflectiveCurveToRelative(0.572f, 2.851f, 1.611f, 3.889f)
                curveToRelative(1.039f, 1.039f, 2.42f, 1.611f, 3.889f, 1.611f)
                reflectiveCurveToRelative(2.85f, -0.572f, 3.889f, -1.611f)
                curveToRelative(2.145f, -2.145f, 2.145f, -5.634f, -0.028f, -7.806f)
                close()
                moveTo(12.862f, 2.207f)
                lineToRelative(-1.5f, -1.603f)
                curveToRelative(-0.737f, -0.787f, -1.986f, -0.788f, -2.723f, 0.0f)
                lineToRelative(-1.468f, 1.568f)
                curveToRelative(-0.756f, 0.755f, -1.172f, 1.76f, -1.172f, 2.828f)
                reflectiveCurveToRelative(0.416f, 2.073f, 1.171f, 2.828f)
                reflectiveCurveToRelative(1.76f, 1.172f, 2.829f, 1.172f)
                reflectiveCurveToRelative(2.073f, -0.416f, 2.829f, -1.172f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.097f, 0.034f, -5.621f)
                close()
            }
        }
        .build()
        return _blood!!
    }

private var _blood: ImageVector? = null
