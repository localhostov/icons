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

public val Icons.Outline.CircleC: ImageVector
    get() {
        if (_circleC != null) {
            return _circleC!!
        }
        _circleC = Builder(name = "CircleC", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.581f, 10.841f)
                verticalLineToRelative(2.409f)
                curveToRelative(0.0f, 1.682f, 1.339f, 3.0f, 3.049f, 3.0f)
                horizontalLineToRelative(0.454f)
                curveToRelative(1.209f, 0.0f, 2.236f, -0.592f, 2.748f, -1.583f)
                lineToRelative(1.777f, 0.918f)
                curveToRelative(-0.85f, 1.644f, -2.584f, 2.665f, -4.525f, 2.665f)
                horizontalLineToRelative(-0.454f)
                curveToRelative(-2.831f, 0.0f, -5.049f, -2.196f, -5.049f, -5.0f)
                verticalLineToRelative(-2.409f)
                curveToRelative(0.0f, -2.807f, 2.265f, -5.091f, 5.049f, -5.091f)
                horizontalLineToRelative(0.454f)
                curveToRelative(1.946f, 0.0f, 3.694f, 1.083f, 4.562f, 2.827f)
                lineToRelative(-1.791f, 0.891f)
                curveToRelative(-0.527f, -1.06f, -1.589f, -1.718f, -2.771f, -1.718f)
                horizontalLineToRelative(-0.454f)
                curveToRelative(-1.71f, 0.0f, -3.049f, 1.357f, -3.049f, 3.091f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _circleC!!
    }

private var _circleC: ImageVector? = null
