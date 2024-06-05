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

public val Icons.Bold.InsertSquare: ImageVector
    get() {
        if (_insertSquare != null) {
            return _insertSquare!!
        }
        _insertSquare = Builder(name = "InsertSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.549f, 10.427f)
                curveToRelative(0.592f, 0.579f, 0.603f, 1.529f, 0.023f, 2.121f)
                curveToRelative(-0.293f, 0.301f, -0.683f, 0.452f, -1.072f, 0.452f)
                curveToRelative(-0.378f, 0.0f, -0.757f, -0.142f, -1.049f, -0.427f)
                lineToRelative(-1.951f, -1.907f)
                verticalLineToRelative(11.835f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-11.835f)
                lineToRelative(-1.952f, 1.907f)
                curveToRelative(-0.592f, 0.579f, -1.542f, 0.568f, -2.121f, -0.024f)
                curveToRelative(-0.579f, -0.592f, -0.568f, -1.542f, 0.024f, -2.121f)
                lineToRelative(3.793f, -3.707f)
                curveToRelative(0.962f, -0.963f, 2.548f, -0.962f, 3.523f, 0.012f)
                lineToRelative(3.781f, 3.695f)
                close()
                moveTo(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _insertSquare!!
    }

private var _insertSquare: ImageVector? = null
