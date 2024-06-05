package me.localx.icons.rounded.outline

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

public val Icons.Outline.HouseFlag: ImageVector
    get() {
        if (_houseFlag != null) {
            return _houseFlag!!
        }
        _houseFlag = Builder(name = "HouseFlag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.891f, 15.053f)
                curveToRelative(0.634f, -0.32f, 1.047f, -0.935f, 1.103f, -1.643f)
                curveToRelative(0.057f, -0.708f, -0.253f, -1.379f, -0.828f, -1.796f)
                curveToRelative(-0.031f, -0.022f, -4.271f, -2.402f, -4.271f, -2.402f)
                curveToRelative(-0.626f, -0.312f, -1.353f, -0.279f, -1.946f, 0.087f)
                curveToRelative(-0.594f, 0.367f, -0.948f, 1.003f, -0.948f, 1.702f)
                verticalLineToRelative(11.999f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineToRelative(-0.021f, -5.889f)
                lineToRelative(4.911f, -2.058f)
                close()
                moveTo(16.958f, 10.979f)
                lineToRelative(4.096f, 2.259f)
                lineToRelative(-4.082f, 1.708f)
                lineToRelative(-0.014f, -3.968f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.283f, -1.542f, 4.274f, -3.751f, 4.842f)
                curveToRelative(-0.083f, 0.021f, -0.167f, 0.032f, -0.25f, 0.032f)
                curveToRelative(-0.445f, 0.0f, -0.852f, -0.3f, -0.968f, -0.751f)
                curveToRelative(-0.138f, -0.535f, 0.185f, -1.08f, 0.72f, -1.217f)
                curveToRelative(1.324f, -0.341f, 2.249f, -1.536f, 2.249f, -2.906f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(2.0f, 9.724f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.214f, 2.203f, -4.145f)
                lineTo(9.203f, 0.855f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.146f, 5.594f, 0.0f)
                lineToRelative(7.203f, 4.893f)
                curveToRelative(0.99f, 0.749f, 1.692f, 1.844f, 1.918f, 3.071f)
                curveToRelative(0.101f, 0.543f, -0.259f, 1.064f, -0.802f, 1.165f)
                curveToRelative(-0.544f, 0.098f, -1.065f, -0.258f, -1.165f, -0.802f)
                curveToRelative(-0.146f, -0.789f, -0.609f, -1.498f, -1.272f, -1.945f)
                lineToRelative(-7.001f, -4.724f)
                curveToRelative(-1.02f, -0.688f, -2.336f, -0.688f, -3.355f, 0.0f)
                lineTo(3.322f, 7.237f)
                curveToRelative(-0.828f, 0.558f, -1.322f, 1.488f, -1.322f, 2.487f)
                close()
            }
        }
        .build()
        return _houseFlag!!
    }

private var _houseFlag: ImageVector? = null
