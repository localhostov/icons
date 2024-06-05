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

public val Icons.Filled.VestPatches: ImageVector
    get() {
        if (_vestPatches != null) {
            return _vestPatches!!
        }
        _vestPatches = Builder(name = "VestPatches", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.352f, 0.008f)
                lineToRelative(-3.352f, 9.099f)
                lineTo(8.648f, 0.008f)
                curveToRelative(0.205f, -0.008f, 0.333f, -0.008f, 0.352f, -0.008f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.019f, 0.0f, 0.148f, 0.0f, 0.352f, 0.008f)
                close()
                moveTo(23.0f, 11.631f)
                verticalLineToRelative(12.369f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 12.178f)
                lineTo(17.41f, 0.209f)
                curveToRelative(0.444f, 0.07f, 0.917f, 0.164f, 1.388f, 0.289f)
                curveToRelative(1.297f, 0.347f, 2.202f, 1.537f, 2.202f, 2.896f)
                verticalLineToRelative(4.606f)
                curveToRelative(0.0f, 0.973f, 1.426f, 2.958f, 2.0f, 3.631f)
                close()
                moveTo(20.0f, 15.0f)
                lineToRelative(-2.0f, -3.0f)
                lineToRelative(-2.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(6.59f, 0.209f)
                lineToRelative(4.41f, 11.969f)
                verticalLineToRelative(11.822f)
                lineTo(1.0f, 24.0f)
                lineTo(1.0f, 11.632f)
                curveToRelative(0.681f, -0.801f, 2.0f, -2.699f, 2.0f, -3.632f)
                lineTo(3.0f, 3.394f)
                curveToRelative(0.0f, -1.358f, 0.905f, -2.549f, 2.202f, -2.896f)
                curveToRelative(0.471f, -0.126f, 0.943f, -0.219f, 1.388f, -0.289f)
                close()
                moveTo(8.0f, 19.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _vestPatches!!
    }

private var _vestPatches: ImageVector? = null
