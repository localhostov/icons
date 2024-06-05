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

public val Icons.Outline.Scythe: ImageVector
    get() {
        if (_scythe != null) {
            return _scythe!!
        }
        _scythe = Builder(name = "Scythe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.683f, 0.0f)
                curveTo(5.528f, 0.0f, 1.709f, 7.195f, 1.308f, 8.015f)
                lineTo(0.066f, 10.546f)
                lineToRelative(2.559f, -1.184f)
                curveToRelative(1.954f, -0.904f, 4.161f, -1.363f, 6.558f, -1.363f)
                horizontalLineToRelative(10.156f)
                lineToRelative(-1.512f, 5.0f)
                horizontalLineToRelative(-6.827f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.223f)
                lineToRelative(-2.537f, 8.393f)
                lineToRelative(1.914f, 0.579f)
                lineTo(23.847f, 0.0f)
                horizontalLineToRelative(-8.164f)
                close()
                moveTo(9.183f, 6.0f)
                curveToRelative(-1.519f, 0.0f, -2.973f, 0.166f, -4.351f, 0.495f)
                curveToRelative(1.835f, -1.992f, 5.255f, -4.495f, 10.851f, -4.495f)
                horizontalLineToRelative(5.471f)
                lineToRelative(-1.21f, 4.0f)
                horizontalLineToRelative(-10.761f)
                close()
            }
        }
        .build()
        return _scythe!!
    }

private var _scythe: ImageVector? = null
