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

public val Icons.Outline.LandLayers: ImageVector
    get() {
        if (_landLayers != null) {
            return _landLayers!!
        }
        _landLayers = Builder(name = "LandLayers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.637f)
                verticalLineToRelative(2.332f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 11.969f)
                verticalLineToRelative(-2.332f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(12.0f, -7.2f)
                close()
                moveTo(0.0f, 13.968f)
                verticalLineToRelative(2.332f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(12.0f, -7.2f)
                verticalLineToRelative(-2.332f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 13.968f)
                close()
                moveTo(12.0f, 14.666f)
                lineTo(0.056f, 7.5f)
                lineTo(12.0f, 0.334f)
                lineToRelative(11.944f, 7.166f)
                lineToRelative(-11.944f, 7.166f)
                close()
                moveTo(12.0f, 12.334f)
                lineToRelative(3.078f, -1.847f)
                lineToRelative(-3.035f, -1.821f)
                lineToRelative(-3.078f, 1.846f)
                lineToRelative(3.035f, 1.821f)
                close()
                moveTo(20.056f, 7.5f)
                lineToRelative(-3.035f, -1.821f)
                lineToRelative(-3.035f, 1.821f)
                lineToRelative(3.035f, 1.821f)
                lineToRelative(3.035f, -1.821f)
                close()
                moveTo(12.0f, 2.666f)
                lineToRelative(-3.035f, 1.821f)
                lineToRelative(3.078f, 1.846f)
                lineToRelative(3.035f, -1.821f)
                lineToRelative(-3.078f, -1.847f)
                close()
                moveTo(3.944f, 7.5f)
                lineToRelative(3.077f, 1.846f)
                lineToRelative(3.078f, -1.846f)
                lineToRelative(-3.078f, -1.846f)
                lineToRelative(-3.077f, 1.846f)
                close()
            }
        }
        .build()
        return _landLayers!!
    }

private var _landLayers: ImageVector? = null
