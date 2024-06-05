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
                moveToRelative(5.5f, 10.489f)
                lineToRelative(-3.889f, 4.122f)
                curveToRelative(-1.039f, 1.039f, -1.611f, 2.42f, -1.611f, 3.889f)
                reflectiveCurveToRelative(0.572f, 2.851f, 1.611f, 3.889f)
                curveToRelative(1.039f, 1.039f, 2.42f, 1.611f, 3.889f, 1.611f)
                reflectiveCurveToRelative(2.85f, -0.572f, 3.889f, -1.611f)
                curveToRelative(2.145f, -2.145f, 2.145f, -5.634f, 0.02f, -7.758f)
                lineToRelative(-3.909f, -4.142f)
                close()
                moveTo(22.528f, 9.456f)
                lineToRelative(-3.528f, -3.45f)
                lineToRelative(-3.535f, 3.458f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.122f, 0.0f, 7.071f)
                curveToRelative(0.944f, 0.944f, 2.2f, 1.464f, 3.535f, 1.464f)
                reflectiveCurveToRelative(2.591f, -0.52f, 3.536f, -1.464f)
                curveToRelative(1.949f, -1.95f, 1.949f, -5.122f, -0.008f, -7.079f)
                close()
                moveTo(10.0f, 0.405f)
                lineToRelative(-2.828f, 2.767f)
                curveToRelative(-0.756f, 0.755f, -1.172f, 1.76f, -1.172f, 2.828f)
                reflectiveCurveToRelative(0.416f, 2.073f, 1.171f, 2.828f)
                curveToRelative(0.755f, 0.756f, 1.76f, 1.172f, 2.829f, 1.172f)
                reflectiveCurveToRelative(2.073f, -0.416f, 2.829f, -1.172f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.097f, -0.008f, -5.664f)
                lineTo(10.0f, 0.405f)
                close()
            }
        }
        .build()
        return _blood!!
    }

private var _blood: ImageVector? = null
