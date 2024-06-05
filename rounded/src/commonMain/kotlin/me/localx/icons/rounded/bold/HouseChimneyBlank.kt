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

public val Icons.Bold.HouseChimneyBlank: ImageVector
    get() {
        if (_houseChimneyBlank != null) {
            return _houseChimneyBlank!!
        }
        _houseChimneyBlank = Builder(name = "HouseChimneyBlank", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.644f)
                lineTo(22.0f, 2.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.089f)
                lineTo(15.077f, 0.941f)
                curveToRelative(-1.869f, -1.262f, -4.286f, -1.262f, -6.153f, 0.0f)
                lineTo(2.424f, 5.327f)
                curveTo(0.906f, 6.352f, 0.0f, 8.056f, 0.0f, 9.886f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 9.886f)
                curveToRelative(0.0f, -1.653f, -0.739f, -3.202f, -2.0f, -4.242f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 9.886f)
                curveToRelative(0.0f, -0.832f, 0.412f, -1.606f, 1.102f, -2.072f)
                lineTo(10.603f, 3.428f)
                curveToRelative(0.424f, -0.287f, 0.911f, -0.431f, 1.397f, -0.431f)
                reflectiveCurveToRelative(0.974f, 0.144f, 1.398f, 0.431f)
                lineToRelative(6.5f, 4.386f)
                curveToRelative(0.689f, 0.466f, 1.102f, 1.24f, 1.102f, 2.072f)
                verticalLineToRelative(8.614f)
                close()
            }
        }
        .build()
        return _houseChimneyBlank!!
    }

private var _houseChimneyBlank: ImageVector? = null
