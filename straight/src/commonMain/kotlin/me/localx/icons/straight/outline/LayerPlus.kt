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

public val Icons.Outline.LayerPlus: ImageVector
    get() {
        if (_layerPlus != null) {
            return _layerPlus!!
        }
        _layerPlus = Builder(name = "LayerPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.367f)
                verticalLineToRelative(2.332f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 11.7f)
                verticalLineToRelative(-2.332f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(12.0f, -7.2f)
                close()
                moveTo(12.0f, 14.396f)
                lineTo(0.056f, 7.23f)
                lineTo(12.0f, 0.064f)
                lineToRelative(11.944f, 7.166f)
                lineToRelative(-11.944f, 7.166f)
                close()
                moveTo(3.944f, 7.23f)
                lineToRelative(8.056f, 4.834f)
                lineToRelative(8.056f, -4.834f)
                lineTo(12.0f, 2.396f)
                lineTo(3.944f, 7.23f)
                close()
                moveTo(0.0f, 13.699f)
                verticalLineToRelative(2.332f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(2.0f, -1.2f)
                verticalLineToRelative(-2.332f)
                lineToRelative(-2.0f, 1.2f)
                lineTo(0.0f, 13.699f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _layerPlus!!
    }

private var _layerPlus: ImageVector? = null
