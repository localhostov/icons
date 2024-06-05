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

public val Icons.Filled.Speakers: ImageVector
    get() {
        if (_speakers != null) {
            return _speakers!!
        }
        _speakers = Builder(name = "Speakers", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 16.0f)
                curveToRelative(0.0f, 1.103f, -0.896f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.896f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(24.0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(-14.0f)
                lineTo(10.0f, 2.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                close()
                moveTo(15.0f, 7.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(21.0f, 16.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(8.0f, 19.873f)
                curveToRelative(-0.32f, 0.083f, -0.655f, 0.127f, -1.0f, 0.127f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(0.345f, 0.0f, 0.68f, 0.044f, 1.0f, 0.127f)
                verticalLineToRelative(-3.395f)
                curveToRelative(-0.294f, 0.17f, -0.636f, 0.268f, -1.0f, 0.268f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.364f, 0.0f, 0.706f, 0.098f, 1.0f, 0.268f)
                verticalLineToRelative(-2.768f)
                curveToRelative(0.0f, -0.924f, 0.28f, -1.784f, 0.76f, -2.5f)
                lineTo(2.5f, 0.0f)
                curveTo(1.121f, 0.0f, 0.0f, 1.122f, 0.0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.127f)
                close()
                moveTo(8.0f, 14.269f)
                curveToRelative(-0.294f, -0.171f, -0.636f, -0.269f, -1.0f, -0.269f)
                curveToRelative(-1.104f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.896f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.364f, 0.0f, 0.706f, -0.098f, 1.0f, -0.269f)
                verticalLineToRelative(-3.462f)
                close()
            }
        }
        .build()
        return _speakers!!
    }

private var _speakers: ImageVector? = null
