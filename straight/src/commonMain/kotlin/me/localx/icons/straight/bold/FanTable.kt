package me.localx.icons.straight.bold

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

public val Icons.Bold.FanTable: ImageVector
    get() {
        if (_fanTable != null) {
            return _fanTable!!
        }
        _fanTable = Builder(name = "FanTable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 9.5f)
                curveTo(21.5f, 4.262f, 17.238f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.5f, 4.262f, 2.5f, 9.5f)
                curveToRelative(0.0f, 4.727f, 3.474f, 8.647f, 8.0f, 9.37f)
                verticalLineToRelative(2.13f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.13f)
                curveToRelative(4.526f, -0.723f, 8.0f, -4.643f, 8.0f, -9.37f)
                close()
                moveTo(9.764f, 3.404f)
                curveToRelative(0.525f, 2.047f, 1.701f, 5.146f, 2.236f, 6.096f)
                curveToRelative(0.535f, -0.95f, 1.711f, -4.048f, 2.236f, -6.095f)
                curveToRelative(2.484f, 0.914f, 4.264f, 3.298f, 4.264f, 6.095f)
                curveToRelative(0.0f, 0.493f, -0.06f, 0.972f, -0.165f, 1.434f)
                curveToRelative(-2.01f, -0.672f, -5.241f, -1.431f, -6.335f, -1.434f)
                curveToRelative(0.542f, 0.907f, 2.474f, 3.544f, 3.952f, 5.149f)
                curveToRelative(-1.097f, 0.844f, -2.464f, 1.351f, -3.952f, 1.351f)
                reflectiveCurveToRelative(-2.855f, -0.508f, -3.952f, -1.351f)
                curveToRelative(1.478f, -1.604f, 3.409f, -4.242f, 3.952f, -5.149f)
                curveToRelative(-1.094f, 0.004f, -4.325f, 0.762f, -6.335f, 1.434f)
                curveToRelative(-0.105f, -0.462f, -0.165f, -0.941f, -0.165f, -1.434f)
                curveToRelative(0.0f, -2.798f, 1.78f, -5.181f, 4.264f, -6.096f)
                close()
            }
        }
        .build()
        return _fanTable!!
    }

private var _fanTable: ImageVector? = null
