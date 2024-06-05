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

public val Icons.Outline.Blood: ImageVector
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
                moveTo(7.975f, 20.974f)
                curveToRelative(-1.322f, 1.322f, -3.627f, 1.322f, -4.95f, 0.0f)
                curveToRelative(-0.661f, -0.661f, -1.025f, -1.54f, -1.025f, -2.475f)
                reflectiveCurveToRelative(0.364f, -1.814f, 1.046f, -2.496f)
                lineToRelative(2.454f, -2.601f)
                lineToRelative(2.475f, 2.622f)
                curveToRelative(1.365f, 1.365f, 1.365f, 3.585f, 0.0f, 4.95f)
                close()
                moveTo(22.528f, 9.456f)
                lineToRelative(-3.528f, -3.45f)
                lineToRelative(-3.535f, 3.458f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.122f, 0.0f, 7.071f)
                curveToRelative(0.944f, 0.944f, 2.2f, 1.464f, 3.535f, 1.464f)
                reflectiveCurveToRelative(2.591f, -0.52f, 3.536f, -1.464f)
                curveToRelative(1.949f, -1.95f, 1.949f, -5.122f, -0.008f, -7.079f)
                close()
                moveTo(21.122f, 15.121f)
                curveToRelative(-1.134f, 1.134f, -3.11f, 1.133f, -4.243f, 0.0f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.073f, -0.008f, -4.235f)
                lineToRelative(2.129f, -2.082f)
                lineToRelative(2.122f, 2.074f)
                curveToRelative(1.169f, 1.17f, 1.169f, 3.073f, 0.0f, 4.243f)
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
                moveTo(11.415f, 7.414f)
                curveToRelative(-0.756f, 0.756f, -2.073f, 0.756f, -2.828f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.378f, -0.378f, -0.586f, -0.88f, -0.586f, -1.414f)
                reflectiveCurveToRelative(0.208f, -1.036f, 0.578f, -1.406f)
                lineToRelative(1.422f, -1.391f)
                lineToRelative(1.415f, 1.383f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.048f, 0.0f, 2.828f)
                close()
            }
        }
        .build()
        return _blood!!
    }

private var _blood: ImageVector? = null
