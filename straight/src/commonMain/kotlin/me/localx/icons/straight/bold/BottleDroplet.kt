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

public val Icons.Bold.BottleDroplet: ImageVector
    get() {
        if (_bottleDroplet != null) {
            return _bottleDroplet!!
        }
        _bottleDroplet = Builder(name = "BottleDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.815f, 7.84f)
                lineToRelative(-2.815f, -1.689f)
                verticalLineToRelative(-3.15f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.15f)
                lineToRelative(-2.815f, 1.689f)
                curveToRelative(-1.348f, 0.809f, -2.185f, 2.287f, -2.185f, 3.858f)
                verticalLineToRelative(12.302f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-12.302f)
                curveToRelative(0.0f, -1.571f, -0.837f, -3.05f, -2.185f, -3.858f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-9.302f)
                curveToRelative(0.0f, -0.523f, 0.279f, -1.017f, 0.728f, -1.286f)
                lineToRelative(4.272f, -2.562f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.85f)
                lineToRelative(4.272f, 2.562f)
                curveToRelative(0.448f, 0.27f, 0.728f, 0.763f, 0.728f, 1.286f)
                verticalLineToRelative(9.302f)
                close()
                moveTo(15.0f, 16.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -2.0f, 3.0f, -4.8f, 3.0f, -4.8f)
                curveToRelative(0.0f, 0.0f, 3.0f, 2.8f, 3.0f, 4.8f)
                close()
            }
        }
        .build()
        return _bottleDroplet!!
    }

private var _bottleDroplet: ImageVector? = null
