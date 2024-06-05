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

public val Icons.Filled.CircleExclamationCheck: ImageVector
    get() {
        if (_circleExclamationCheck != null) {
            return _circleExclamationCheck!!
        }
        _circleExclamationCheck = Builder(name = "CircleExclamationCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.944f, 15.0f)
                curveToRelative(-0.513f, 0.0f, -1.025f, -0.195f, -1.416f, -0.586f)
                lineToRelative(-2.371f, -2.285f)
                lineToRelative(1.393f, -1.436f)
                lineToRelative(2.381f, 2.295f)
                lineToRelative(4.666f, -4.559f)
                lineToRelative(1.402f, 1.426f)
                lineToRelative(-4.65f, 4.564f)
                curveToRelative(-0.386f, 0.386f, -0.896f, 0.58f, -1.406f, 0.58f)
                close()
                moveTo(16.627f, 16.779f)
                curveToRelative(-1.592f, 2.535f, -4.412f, 4.221f, -7.627f, 4.221f)
                curveTo(4.029f, 21.0f, 0.0f, 16.971f, 0.0f, 12.0f)
                reflectiveCurveTo(4.029f, 3.0f, 9.0f, 3.0f)
                curveToRelative(4.311f, 0.0f, 7.914f, 3.032f, 8.794f, 7.08f)
                lineToRelative(-2.292f, -2.209f)
                lineToRelative(-4.178f, 4.307f)
                lineToRelative(3.79f, 3.65f)
                curveToRelative(0.434f, 0.434f, 0.95f, 0.755f, 1.513f, 0.951f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _circleExclamationCheck!!
    }

private var _circleExclamationCheck: ImageVector? = null
