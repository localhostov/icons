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

public val Icons.Filled.CowbellCirclePlus: ImageVector
    get() {
        if (_cowbellCirclePlus != null) {
            return _cowbellCirclePlus!!
        }
        _cowbellCirclePlus = Builder(name = "CowbellCirclePlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 17.0f)
                curveToRelative(0.0f, -4.971f, 4.029f, -9.0f, 9.0f, -9.0f)
                curveToRelative(1.109f, 0.0f, 2.171f, 0.201f, 3.153f, 0.568f)
                lineToRelative(-0.227f, -1.27f)
                curveToRelative(-0.341f, -1.91f, -1.997f, -3.297f, -3.938f, -3.297f)
                horizontalLineToRelative(-0.16f)
                curveToRelative(0.111f, -0.313f, 0.172f, -0.649f, 0.172f, -1.0f)
                curveTo(16.0f, 1.347f, 14.654f, 0.0f, 13.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(7.346f, 0.0f, 6.0f, 1.347f, 6.0f, 3.001f)
                curveToRelative(0.0f, 0.351f, 0.061f, 0.687f, 0.172f, 1.0f)
                horizontalLineToRelative(-0.16f)
                curveToRelative(-1.94f, 0.0f, -3.597f, 1.387f, -3.941f, 3.319f)
                lineTo(0.102f, 20.001f)
                horizontalLineToRelative(6.898f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.11f, 0.0f, 0.22f, -0.005f, 0.328f, -0.013f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.03f, -1.65f, -3.328f, -4.167f, -3.328f, -6.987f)
                close()
                moveTo(8.0f, 3.001f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _cowbellCirclePlus!!
    }

private var _cowbellCirclePlus: ImageVector? = null
