package me.localx.icons.rounded.outline

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

public val Icons.Outline.HouseWindow: ImageVector
    get() {
        if (_houseWindow != null) {
            return _houseWindow!!
        }
        _houseWindow = Builder(name = "HouseWindow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(10.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.002f)
                lineToRelative(-0.002f, -4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(19.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 9.724f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.215f, 2.204f, -4.145f)
                lineTo(9.203f, 0.855f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.146f, 5.594f, 0.0f)
                lineToRelative(7.0f, 4.724f)
                curveToRelative(1.379f, 0.93f, 2.203f, 2.479f, 2.203f, 4.145f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(12.0f, 1.997f)
                curveToRelative(-0.584f, 0.0f, -1.168f, 0.172f, -1.678f, 0.517f)
                lineTo(3.322f, 7.237f)
                curveToRelative(-0.828f, 0.558f, -1.322f, 1.487f, -1.322f, 2.486f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(22.0f, 9.724f)
                curveToRelative(0.0f, -0.999f, -0.494f, -1.929f, -1.321f, -2.486f)
                lineTo(13.678f, 2.514f)
                curveToRelative(-0.51f, -0.345f, -1.094f, -0.517f, -1.678f, -0.517f)
                close()
            }
        }
        .build()
        return _houseWindow!!
    }

private var _houseWindow: ImageVector? = null
