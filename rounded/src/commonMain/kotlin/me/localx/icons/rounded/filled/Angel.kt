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

public val Icons.Filled.Angel: ImageVector
    get() {
        if (_angel != null) {
            return _angel!!
        }
        _angel = Builder(name = "Angel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 5.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(17.0f, 3.25f)
                curveToRelative(0.0f, -1.853f, -2.149f, -3.25f, -5.0f, -3.25f)
                reflectiveCurveToRelative(-5.0f, 1.397f, -5.0f, 3.25f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.44f, 1.139f, -1.25f, 3.0f, -1.25f)
                reflectiveCurveToRelative(3.0f, 0.81f, 3.0f, 1.25f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(5.261f, 20.757f)
                lineToRelative(5.117f, -11.03f)
                curveToRelative(1.055f, 0.362f, 2.203f, 0.361f, 3.257f, -0.005f)
                curveToRelative(0.007f, -0.008f, 0.014f, -0.016f, 0.021f, -0.024f)
                lineToRelative(5.138f, 11.064f)
                curveToRelative(0.673f, 1.525f, -0.444f, 3.237f, -2.11f, 3.237f)
                lineTo(7.369f, 23.999f)
                curveToRelative(-1.669f, 0.0f, -2.785f, -1.718f, -2.108f, -3.243f)
                close()
                moveTo(8.853f, 8.233f)
                lineToRelative(-5.001f, 10.767f)
                horizontalLineToRelative(-0.353f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.5f, 0.0f, -1.5f, -1.513f, -1.5f, -1.513f)
                curveToRelative(0.0f, -3.007f, 0.341f, -9.487f, 3.5f, -9.487f)
                curveToRelative(2.188f, 0.0f, 4.081f, 1.167f, 5.353f, 2.233f)
                close()
                moveTo(20.5f, 6.0f)
                curveToRelative(3.159f, 0.0f, 3.5f, 6.48f, 3.5f, 9.487f)
                curveToRelative(0.0f, 0.0f, 0.0f, 1.513f, -1.5f, 1.513f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.353f)
                reflectiveCurveToRelative(-5.001f, -10.767f, -5.001f, -10.767f)
                curveToRelative(1.273f, -1.066f, 3.165f, -2.233f, 5.353f, -2.233f)
                close()
            }
        }
        .build()
        return _angel!!
    }

private var _angel: ImageVector? = null
