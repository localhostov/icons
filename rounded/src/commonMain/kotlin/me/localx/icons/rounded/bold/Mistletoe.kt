package me.localx.icons.rounded.bold

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

public val Icons.Bold.Mistletoe: ImageVector
    get() {
        if (_mistletoe != null) {
            return _mistletoe!!
        }
        _mistletoe = Builder(name = "Mistletoe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.129f, 10.897f)
                curveToRelative(1.14f, -0.917f, 1.871f, -2.323f, 1.871f, -3.897f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-1.643f, 0.0f, -3.104f, 0.797f, -4.016f, 2.025f)
                curveTo(9.362f, 1.857f, 6.589f, 0.0f, 1.5f, 0.0f)
                curveTo(0.671f, 0.0f, 0.0f, 0.671f, 0.0f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                curveToRelative(1.377f, 0.0f, 2.52f, 0.156f, 3.477f, 0.428f)
                curveToRelative(-1.752f, 0.778f, -2.977f, 2.535f, -2.977f, 4.572f)
                curveToRelative(0.0f, 1.678f, 0.831f, 3.165f, 2.103f, 4.073f)
                curveToRelative(-2.238f, 1.708f, -4.103f, 4.122f, -4.103f, 7.427f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -3.963f, 1.868f, -6.415f, 3.0f, -7.537f)
                curveToRelative(1.132f, 1.122f, 3.0f, 3.573f, 3.0f, 7.537f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -4.151f, -2.942f, -6.898f, -5.871f, -8.603f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(15.0f, 5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(6.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -2.72f, 2.088f, -4.665f, 4.291f, -5.96f)
                curveToRelative(-0.741f, 1.576f, -1.291f, 3.555f, -1.291f, 5.96f)
                close()
                moveTo(19.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -2.405f, -0.55f, -4.384f, -1.291f, -5.96f)
                curveToRelative(2.203f, 1.295f, 4.291f, 3.24f, 4.291f, 5.96f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _mistletoe!!
    }

private var _mistletoe: ImageVector? = null
