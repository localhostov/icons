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

public val Icons.Outline.ShirtLongSleeve: ImageVector
    get() {
        if (_shirtLongSleeve != null) {
            return _shirtLongSleeve!!
        }
        _shirtLongSleeve = Builder(name = "ShirtLongSleeve", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.636f)
                curveToRelative(0.0f, -2.301f, -1.221f, -4.386f, -3.186f, -5.44f)
                curveToRelative(-1.477f, -0.793f, -3.032f, -1.195f, -4.624f, -1.195f)
                lineTo(7.81f, 0.001f)
                curveToRelative(-1.592f, 0.0f, -3.148f, 0.402f, -4.625f, 1.195f)
                curveTo(1.221f, 2.25f, 0.0f, 4.335f, 0.0f, 6.636f)
                verticalLineToRelative(14.364f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.024f)
                horizontalLineToRelative(4.0f)
                lineTo(24.0f, 6.636f)
                close()
                moveTo(14.901f, 2.0f)
                curveToRelative(-0.455f, 1.196f, -1.594f, 2.0f, -2.901f, 2.0f)
                reflectiveCurveToRelative(-2.446f, -0.804f, -2.901f, -2.0f)
                horizontalLineToRelative(5.802f)
                close()
                moveTo(22.0f, 18.976f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(15.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(2.0f, 6.636f)
                curveToRelative(0.0f, -1.563f, 0.817f, -2.973f, 2.131f, -3.679f)
                curveToRelative(0.939f, -0.504f, 1.913f, -0.81f, 2.905f, -0.915f)
                lineToRelative(-0.01f, 0.002f)
                curveToRelative(0.542f, 2.329f, 2.587f, 3.956f, 4.974f, 3.956f)
                reflectiveCurveToRelative(4.432f, -1.627f, 4.974f, -3.956f)
                lineToRelative(-0.01f, -0.002f)
                curveToRelative(0.991f, 0.105f, 1.966f, 0.411f, 2.906f, 0.915f)
                curveToRelative(1.314f, 0.706f, 2.131f, 2.116f, 2.131f, 3.679f)
                verticalLineToRelative(12.34f)
                close()
            }
        }
        .build()
        return _shirtLongSleeve!!
    }

private var _shirtLongSleeve: ImageVector? = null
