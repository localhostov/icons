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

public val Icons.Filled.BagMapPin: ImageVector
    get() {
        if (_bagMapPin != null) {
            return _bagMapPin!!
        }
        _bagMapPin = Builder(name = "BagMapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(6.0f, 2.691f, 6.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.122f)
                lineToRelative(-1.047f, -1.024f)
                curveToRelative(-2.749f, -2.749f, -2.753f, -7.193f, -0.023f, -9.923f)
                curveToRelative(1.318f, -1.321f, 3.075f, -2.05f, 4.945f, -2.05f)
                reflectiveCurveToRelative(3.632f, 0.728f, 4.953f, 2.05f)
                curveToRelative(2.729f, 2.729f, 2.729f, 7.17f, 0.0f, 9.899f)
                lineToRelative(-1.071f, 1.048f)
                horizontalLineToRelative(3.122f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.001f, 9.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(15.535f, 14.467f)
                curveToRelative(-0.944f, -0.944f, -2.199f, -1.464f, -3.534f, -1.464f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-1.335f, 0.0f, -2.589f, 0.52f, -3.531f, 1.464f)
                curveToRelative(-1.949f, 1.949f, -1.949f, 5.122f, 0.008f, 7.079f)
                lineToRelative(1.781f, 1.742f)
                curveToRelative(0.481f, 0.471f, 1.113f, 0.706f, 1.746f, 0.706f)
                reflectiveCurveToRelative(1.265f, -0.235f, 1.746f, -0.706f)
                lineToRelative(1.789f, -1.75f)
                curveToRelative(1.949f, -1.949f, 1.949f, -5.122f, 0.0f, -7.071f)
                close()
                moveTo(12.0f, 19.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bagMapPin!!
    }

private var _bagMapPin: ImageVector? = null
