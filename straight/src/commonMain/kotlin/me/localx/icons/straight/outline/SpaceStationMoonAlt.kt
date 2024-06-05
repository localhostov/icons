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

public val Icons.Outline.SpaceStationMoonAlt: ImageVector
    get() {
        if (_spaceStationMoonAlt != null) {
            return _spaceStationMoonAlt!!
        }
        _spaceStationMoonAlt = Builder(name = "SpaceStationMoonAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.8f, 13.0f)
                curveToRelative(-0.366f, -1.593f, -1.152f, -3.017f, -2.228f, -4.158f)
                lineToRelative(1.526f, -1.526f)
                curveToRelative(1.355f, 1.054f, 3.057f, 1.683f, 4.903f, 1.683f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.846f, 0.629f, 3.548f, 1.683f, 4.903f)
                lineToRelative(-1.641f, 1.641f)
                curveToRelative(-1.185f, -0.799f, -2.564f, -1.324f, -4.042f, -1.488f)
                verticalLineToRelative(-2.056f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.056f)
                curveTo(3.506f, 6.557f, 0.0f, 10.39f, 0.0f, 15.029f)
                verticalLineToRelative(7.971f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-6.2f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-5.971f)
                curveToRelative(0.0f, -3.876f, 3.141f, -7.029f, 7.0f, -7.029f)
                curveToRelative(3.14f, 0.0f, 5.859f, 2.086f, 6.734f, 5.007f)
                curveToRelative(-2.634f, 0.139f, -4.734f, 2.325f, -4.734f, 4.993f)
                close()
                moveTo(22.0f, 21.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _spaceStationMoonAlt!!
    }

private var _spaceStationMoonAlt: ImageVector? = null
