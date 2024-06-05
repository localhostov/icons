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

public val Icons.Outline.SimCard: ImageVector
    get() {
        if (_simCard != null) {
            return _simCard!!
        }
        _simCard = Builder(name = "SimCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(14.0f, 20.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(21.0f, 8.071f)
                verticalLineToRelative(10.929f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(3.0f, 5.0f)
                curveTo(3.0f, 2.243f, 5.243f, 0.0f, 8.0f, 0.0f)
                horizontalLineToRelative(4.929f)
                curveToRelative(1.603f, 0.0f, 3.109f, 0.624f, 4.243f, 1.757f)
                lineToRelative(2.071f, 2.071f)
                curveToRelative(1.133f, 1.133f, 1.757f, 2.64f, 1.757f, 4.243f)
                close()
                moveTo(19.0f, 8.071f)
                curveToRelative(0.0f, -1.068f, -0.416f, -2.073f, -1.171f, -2.829f)
                lineToRelative(-2.071f, -2.071f)
                curveToRelative(-0.755f, -0.755f, -1.76f, -1.171f, -2.829f, -1.171f)
                horizontalLineToRelative(-4.929f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-10.929f)
                close()
            }
        }
        .build()
        return _simCard!!
    }

private var _simCard: ImageVector? = null
