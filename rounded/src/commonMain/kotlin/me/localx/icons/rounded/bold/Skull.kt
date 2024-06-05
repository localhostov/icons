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

public val Icons.Bold.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = Builder(name = "Skull", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.748f, 0.024f)
                curveToRelative(-3.079f, -0.202f, -6.01f, 0.84f, -8.257f, 2.943f)
                curveTo(2.272f, 5.043f, 1.0f, 7.971f, 1.0f, 11.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 2.517f, 1.699f, 4.644f, 4.01f, 5.295f)
                curveToRelative(0.152f, 2.345f, 2.108f, 4.205f, 4.49f, 4.205f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.382f, 0.0f, 4.338f, -1.86f, 4.49f, -4.205f)
                curveToRelative(2.311f, -0.651f, 4.01f, -2.778f, 4.01f, -5.295f)
                verticalLineToRelative(-3.165f)
                curveTo(23.0f, 5.377f, 18.497f, 0.409f, 12.748f, 0.024f)
                close()
                moveTo(20.0f, 14.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -2.234f, 0.902f, -4.31f, 2.54f, -5.842f)
                curveToRelative(1.5f, -1.403f, 3.419f, -2.158f, 5.455f, -2.158f)
                curveToRelative(0.183f, 0.0f, 0.368f, 0.006f, 0.553f, 0.019f)
                curveToRelative(4.179f, 0.278f, 7.452f, 3.932f, 7.452f, 8.316f)
                verticalLineToRelative(3.165f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(14.0f, 17.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 1.0f, -2.0f, 1.0f)
                reflectiveCurveToRelative(-2.0f, 0.105f, -2.0f, -1.0f)
                reflectiveCurveToRelative(0.895f, -3.0f, 2.0f, -3.0f)
                reflectiveCurveToRelative(2.0f, 1.895f, 2.0f, 3.0f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
