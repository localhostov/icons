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

public val Icons.Filled.CarRear: ImageVector
    get() {
        if (_carRear != null) {
            return _carRear!!
        }
        _carRear = Builder(name = "CarRear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.609f, 9.0f)
                lineTo(1.391f, 9.0f)
                lineToRelative(1.713f, -4.709f)
                curveToRelative(0.715f, -1.968f, 2.603f, -3.291f, 4.698f, -3.291f)
                horizontalLineToRelative(8.396f)
                curveToRelative(2.096f, 0.0f, 3.983f, 1.323f, 4.698f, 3.292f)
                lineToRelative(1.713f, 4.708f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.045f, -1.237f, 3.802f, -3.0f, 4.576f)
                verticalLineToRelative(1.424f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.424f)
                curveToRelative(-1.763f, -0.774f, -3.0f, -2.531f, -3.0f, -4.576f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(0.087f, 13.0f)
                curveToRelative(0.066f, -0.436f, 0.163f, -0.865f, 0.315f, -1.282f)
                lineToRelative(0.261f, -0.718f)
                horizontalLineToRelative(22.673f)
                lineToRelative(0.261f, 0.718f)
                curveToRelative(0.152f, 0.417f, 0.249f, 0.846f, 0.315f, 1.282f)
                horizontalLineToRelative(-2.913f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _carRear!!
    }

private var _carRear: ImageVector? = null
