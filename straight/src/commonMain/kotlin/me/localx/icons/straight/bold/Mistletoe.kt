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
                moveToRelative(17.275f, 10.427f)
                curveToRelative(1.61f, -0.831f, 2.725f, -2.493f, 2.725f, -4.427f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-2.01f, 0.0f, -3.735f, 1.199f, -4.529f, 2.913f)
                curveTo(8.589f, 1.71f, 5.468f, 0.0f, 0.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.558f, 0.0f, 2.864f, 0.16f, 3.971f, 0.44f)
                curveToRelative(-1.746f, 0.781f, -2.971f, 2.527f, -2.971f, 4.56f)
                curveToRelative(0.0f, 1.918f, 1.098f, 3.567f, 2.687f, 4.406f)
                curveToRelative(-2.048f, 1.684f, -3.687f, 3.997f, -3.687f, 7.094f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -3.968f, 1.869f, -6.414f, 3.0f, -7.533f)
                curveToRelative(1.131f, 1.12f, 3.0f, 3.565f, 3.0f, 7.533f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -4.556f, -3.544f, -7.42f, -6.725f, -9.073f)
                close()
                moveTo(15.0f, 4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(8.0f, 8.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
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
