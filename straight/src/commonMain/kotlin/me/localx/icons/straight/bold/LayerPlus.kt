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

public val Icons.Bold.LayerPlus: ImageVector
    get() {
        if (_layerPlus != null) {
            return _layerPlus!!
        }
        _layerPlus = Builder(name = "LayerPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.303f)
                lineToRelative(12.0f, 7.2f)
                verticalLineToRelative(3.499f)
                lineTo(0.0f, 14.802f)
                verticalLineToRelative(-3.499f)
                close()
                moveTo(24.0f, 8.2f)
                verticalLineToRelative(1.099f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 9.299f)
                verticalLineToRelative(-1.099f)
                lineTo(12.0f, 1.0f)
                lineToRelative(12.0f, 7.2f)
                close()
                moveTo(19.084f, 8.749f)
                lineToRelative(-7.084f, -4.25f)
                lineToRelative(-7.084f, 4.25f)
                lineToRelative(7.084f, 4.25f)
                lineToRelative(7.084f, -4.25f)
                close()
                moveTo(21.0f, 14.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _layerPlus!!
    }

private var _layerPlus: ImageVector? = null
