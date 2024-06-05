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

public val Icons.Bold.Insert: ImageVector
    get() {
        if (_insert != null) {
            return _insert!!
        }
        _insert = Builder(name = "Insert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.452f, 13.573f)
                curveToRelative(-0.593f, -0.579f, -0.604f, -1.529f, -0.024f, -2.121f)
                curveToRelative(0.581f, -0.593f, 1.53f, -0.603f, 2.121f, -0.024f)
                lineToRelative(1.952f, 1.907f)
                lineTo(10.501f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(11.835f)
                lineToRelative(1.952f, -1.907f)
                curveToRelative(0.592f, -0.579f, 1.542f, -0.568f, 2.121f, 0.024f)
                curveToRelative(0.579f, 0.592f, 0.568f, 1.542f, -0.024f, 2.121f)
                lineToRelative(-3.793f, 3.707f)
                curveToRelative(-0.479f, 0.48f, -1.117f, 0.72f, -1.753f, 0.72f)
                curveToRelative(-0.502f, 0.0f, -1.303f, -0.265f, -1.77f, -0.732f)
                lineToRelative(-3.781f, -3.695f)
                close()
                moveTo(22.5f, 15.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(7.0f, 21.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _insert!!
    }

private var _insert: ImageVector? = null
