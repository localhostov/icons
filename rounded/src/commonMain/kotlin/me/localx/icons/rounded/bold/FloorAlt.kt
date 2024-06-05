package me.localx.icons.rounded.bold

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

public val Icons.Bold.FloorAlt: ImageVector
    get() {
        if (_floorAlt != null) {
            return _floorAlt!!
        }
        _floorAlt = Builder(name = "FloorAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.976f, 5.024f)
                curveToRelative(-0.243f, -2.81f, -2.604f, -5.024f, -5.476f, -5.024f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.872f, 2.214f, 5.233f, 5.024f, 5.476f)
                curveToRelative(0.243f, 2.81f, 2.604f, 5.024f, 5.476f, 5.024f)
                horizontalLineToRelative(8.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.872f, -2.214f, -5.233f, -5.024f, -5.476f)
                close()
                moveTo(16.0f, 5.5f)
                verticalLineToRelative(3.086f)
                lineToRelative(-4.75f, 4.75f)
                lineToRelative(-2.086f, -2.086f)
                lineToRelative(6.659f, -6.659f)
                curveToRelative(0.111f, 0.282f, 0.177f, 0.588f, 0.177f, 0.909f)
                close()
                moveTo(16.0f, 11.414f)
                verticalLineToRelative(2.086f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.086f)
                lineToRelative(4.586f, -4.586f)
                close()
                moveTo(10.414f, 3.0f)
                horizontalLineToRelative(3.086f)
                curveToRelative(0.321f, 0.0f, 0.626f, 0.066f, 0.909f, 0.177f)
                lineToRelative(-3.409f, 3.409f)
                lineToRelative(-2.086f, -2.086f)
                lineToRelative(1.5f, -1.5f)
                close()
                moveTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.086f)
                lineTo(3.0f, 7.586f)
                verticalLineToRelative(-2.086f)
                close()
                moveTo(3.0f, 13.5f)
                verticalLineToRelative(-3.086f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(2.086f, 2.086f)
                lineToRelative(-6.409f, 6.409f)
                curveToRelative(-0.111f, -0.282f, -0.177f, -0.588f, -0.177f, -0.909f)
                close()
                moveTo(5.5f, 16.0f)
                curveToRelative(-0.321f, 0.0f, -0.626f, -0.066f, -0.909f, -0.177f)
                lineToRelative(3.159f, -3.159f)
                lineToRelative(2.086f, 2.086f)
                lineToRelative(-1.25f, 1.25f)
                horizontalLineToRelative(-3.086f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.208f, 0.0f, -2.217f, -0.86f, -2.449f, -2.0f)
                horizontalLineToRelative(5.449f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-5.449f)
                curveToRelative(1.14f, 0.232f, 2.0f, 1.242f, 2.0f, 2.449f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _floorAlt!!
    }

private var _floorAlt: ImageVector? = null
