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

public val Icons.Filled.CircleZ: ImageVector
    get() {
        if (_circleZ != null) {
            return _circleZ!!
        }
        _circleZ = Builder(name = "CircleZ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineToRelative(-8.361f)
                curveToRelative(-0.664f, 0.0f, -1.258f, -0.396f, -1.513f, -1.011f)
                curveToRelative(-0.254f, -0.614f, -0.115f, -1.315f, 0.355f, -1.785f)
                lineToRelative(7.021f, -7.204f)
                horizontalLineToRelative(-7.502f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.361f)
                curveToRelative(0.664f, 0.0f, 1.258f, 0.396f, 1.513f, 1.011f)
                curveToRelative(0.254f, 0.614f, 0.115f, 1.315f, -0.355f, 1.785f)
                lineToRelative(-7.021f, 7.204f)
                horizontalLineToRelative(7.502f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _circleZ!!
    }

private var _circleZ: ImageVector? = null
