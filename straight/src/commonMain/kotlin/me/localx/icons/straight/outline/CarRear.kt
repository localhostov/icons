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

public val Icons.Outline.CarRear: ImageVector
    get() {
        if (_carRear != null) {
            return _carRear!!
        }
        _carRear = Builder(name = "CarRear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.032f)
                curveToRelative(0.0f, -2.793f, -0.483f, -5.54f, -1.438f, -8.163f)
                lineToRelative(-2.144f, -5.895f)
                curveToRelative(-0.429f, -1.181f, -1.562f, -1.975f, -2.818f, -1.975f)
                lineTo(6.4f, 0.999f)
                curveToRelative(-1.257f, 0.0f, -2.39f, 0.793f, -2.818f, 1.975f)
                lineToRelative(-2.144f, 5.895f)
                curveToRelative(-0.955f, 2.623f, -1.438f, 5.369f, -1.438f, 8.163f)
                verticalLineToRelative(1.968f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.968f)
                close()
                moveTo(5.461f, 3.658f)
                curveToRelative(0.144f, -0.394f, 0.521f, -0.658f, 0.939f, -0.658f)
                horizontalLineToRelative(11.199f)
                curveToRelative(0.419f, 0.0f, 0.796f, 0.265f, 0.939f, 0.658f)
                lineToRelative(1.579f, 4.342f)
                lineTo(3.882f, 8.0f)
                lineToRelative(1.579f, -4.342f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 17.0f)
                curveToRelative(0.002f, -1.009f, 0.092f, -2.009f, 0.23f, -3.0f)
                horizontalLineToRelative(2.77f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.396f)
                curveToRelative(0.159f, -0.674f, 0.348f, -1.341f, 0.572f, -2.0f)
                horizontalLineToRelative(17.647f)
                curveToRelative(0.224f, 0.659f, 0.412f, 1.326f, 0.572f, 2.0f)
                horizontalLineToRelative(-2.396f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.77f)
                curveToRelative(0.139f, 0.991f, 0.229f, 1.991f, 0.23f, 3.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _carRear!!
    }

private var _carRear: ImageVector? = null
