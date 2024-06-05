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

public val Icons.Bold.HouseWindow: ImageVector
    get() {
        if (_houseWindow != null) {
            return _houseWindow!!
        }
        _houseWindow = Builder(name = "HouseWindow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 18.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(0.0f, 9.886f)
                curveToRelative(0.0f, -1.83f, 0.906f, -3.534f, 2.424f, -4.559f)
                lineTo(8.924f, 0.941f)
                curveToRelative(1.867f, -1.262f, 4.284f, -1.262f, 6.153f, 0.0f)
                lineToRelative(6.499f, 4.386f)
                curveToRelative(1.518f, 1.024f, 2.424f, 2.729f, 2.424f, 4.559f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(12.0f, 2.997f)
                curveToRelative(-0.486f, 0.0f, -0.974f, 0.144f, -1.397f, 0.431f)
                lineTo(4.102f, 7.813f)
                curveToRelative(-0.689f, 0.466f, -1.102f, 1.24f, -1.102f, 2.072f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(21.0f, 9.886f)
                curveToRelative(0.0f, -0.832f, -0.412f, -1.606f, -1.102f, -2.072f)
                lineTo(13.398f, 3.428f)
                curveToRelative(-0.425f, -0.287f, -0.912f, -0.431f, -1.398f, -0.431f)
                close()
            }
        }
        .build()
        return _houseWindow!!
    }

private var _houseWindow: ImageVector? = null
