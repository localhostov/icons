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

public val Icons.Bold.TowerControl: ImageVector
    get() {
        if (_towerControl != null) {
            return _towerControl!!
        }
        _towerControl = Builder(name = "TowerControl", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.319f, 6.098f)
                curveToRelative(-0.571f, -0.697f, -1.417f, -1.098f, -2.319f, -1.098f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.0f)
                horizontalLineToRelative(-3.501f)
                verticalLineToRelative(3.0f)
                lineTo(3.001f, 5.0f)
                curveToRelative(-0.902f, 0.0f, -1.748f, 0.4f, -2.319f, 1.098f)
                curveTo(0.109f, 6.796f, -0.117f, 7.703f, 0.06f, 8.588f)
                lineToRelative(1.882f, 9.412f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.06f)
                lineToRelative(1.882f, -9.412f)
                curveToRelative(0.177f, -0.885f, -0.05f, -1.792f, -0.622f, -2.49f)
                close()
                moveTo(20.2f, 12.0f)
                horizontalLineToRelative(-3.2f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-0.8f, 4.0f)
                close()
                moveTo(14.0f, 8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(7.0f, 8.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.801f, 12.0f)
                lineToRelative(-0.8f, -4.0f)
                horizontalLineToRelative(3.999f)
                close()
                moveTo(14.0f, 21.0f)
                horizontalLineToRelative(-4.001f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.002f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _towerControl!!
    }

private var _towerControl: ImageVector? = null
