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

public val Icons.Filled.TowerControl: ImageVector
    get() {
        if (_towerControl != null) {
            return _towerControl!!
        }
        _towerControl = Builder(name = "TowerControl", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.349f, 12.0f)
                horizontalLineToRelative(-5.349f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(3.499f)
                curveToRelative(0.752f, 0.0f, 1.457f, 0.334f, 1.935f, 0.915f)
                curveToRelative(0.477f, 0.582f, 0.665f, 1.338f, 0.518f, 2.075f)
                lineToRelative(-0.602f, 3.01f)
                close()
                moveTo(0.651f, 12.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 6.0f)
                lineTo(2.501f, 6.0f)
                curveToRelative(-0.752f, 0.0f, -1.457f, 0.334f, -1.935f, 0.915f)
                curveTo(0.09f, 7.497f, -0.099f, 8.253f, 0.049f, 8.99f)
                lineToRelative(0.602f, 3.01f)
                close()
                moveTo(1.051f, 14.0f)
                lineToRelative(0.8f, 4.0f)
                horizontalLineToRelative(6.148f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(6.148f)
                lineToRelative(0.8f, -4.0f)
                lineTo(1.051f, 14.0f)
                close()
                moveTo(16.0f, 4.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(8.0f, 6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                close()
            }
        }
        .build()
        return _towerControl!!
    }

private var _towerControl: ImageVector? = null
