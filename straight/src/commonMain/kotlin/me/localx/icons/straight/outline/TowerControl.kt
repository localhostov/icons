package me.localx.icons.straight.outline

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

public val Icons.Outline.TowerControl: ImageVector
    get() {
        if (_towerControl != null) {
            return _towerControl!!
        }
        _towerControl = Builder(name = "TowerControl", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.434f, 6.915f)
                curveToRelative(-0.478f, -0.581f, -1.183f, -0.915f, -1.935f, -0.915f)
                horizontalLineToRelative(-5.499f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(8.0f, 6.0f)
                lineTo(2.501f, 6.0f)
                curveToRelative(-0.752f, 0.0f, -1.457f, 0.334f, -1.935f, 0.915f)
                curveTo(0.09f, 7.497f, -0.099f, 8.253f, 0.049f, 8.99f)
                lineToRelative(1.803f, 9.01f)
                horizontalLineToRelative(6.148f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(6.148f)
                lineToRelative(1.803f, -9.01f)
                curveToRelative(0.147f, -0.737f, -0.041f, -1.493f, -0.518f, -2.075f)
                close()
                moveTo(10.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.113f, 8.184f)
                curveToRelative(0.057f, -0.068f, 0.182f, -0.184f, 0.388f, -0.184f)
                horizontalLineToRelative(5.499f)
                verticalLineToRelative(4.0f)
                lineTo(2.69f, 12.0f)
                lineToRelative(-0.68f, -3.402f)
                curveToRelative(-0.04f, -0.201f, 0.048f, -0.346f, 0.104f, -0.414f)
                close()
                moveTo(14.0f, 22.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(3.49f, 16.0f)
                lineToRelative(-0.4f, -2.0f)
                lineTo(20.91f, 14.0f)
                lineToRelative(-0.4f, 2.0f)
                lineTo(3.49f, 16.0f)
                close()
                moveTo(21.99f, 8.598f)
                lineToRelative(-0.68f, 3.402f)
                horizontalLineToRelative(-5.31f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.499f)
                curveToRelative(0.206f, 0.0f, 0.331f, 0.115f, 0.388f, 0.184f)
                curveToRelative(0.056f, 0.068f, 0.144f, 0.213f, 0.104f, 0.414f)
                close()
            }
        }
        .build()
        return _towerControl!!
    }

private var _towerControl: ImageVector? = null
