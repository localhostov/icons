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

public val Icons.Filled.LandLayers: ImageVector
    get() {
        if (_landLayers != null) {
            return _landLayers!!
        }
        _landLayers = Builder(name = "LandLayers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.021f, 3.321f)
                lineTo(12.0f, 0.334f)
                lineToRelative(5.021f, 3.013f)
                lineToRelative(-4.979f, 2.987f)
                lineToRelative(-5.021f, -3.013f)
                close()
                moveTo(13.986f, 7.5f)
                lineToRelative(4.979f, 2.987f)
                lineToRelative(4.979f, -2.987f)
                lineToRelative(-4.979f, -2.987f)
                lineToRelative(-4.979f, 2.987f)
                close()
                moveTo(10.098f, 7.5f)
                lineToRelative(-5.021f, -3.013f)
                lineTo(0.056f, 7.5f)
                lineToRelative(5.021f, 3.013f)
                lineToRelative(5.021f, -3.013f)
                close()
                moveTo(12.042f, 8.666f)
                lineToRelative(-5.021f, 3.013f)
                lineToRelative(4.979f, 2.987f)
                lineToRelative(5.021f, -3.013f)
                lineToRelative(-4.979f, -2.987f)
                close()
                moveTo(23.999f, 9.637f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 9.637f)
                verticalLineToRelative(2.332f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(12.0f, -7.2f)
                verticalLineToRelative(-2.332f)
                close()
                moveTo(23.999f, 13.968f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 13.968f)
                verticalLineToRelative(2.332f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(12.0f, -7.2f)
                verticalLineToRelative(-2.332f)
                close()
            }
        }
        .build()
        return _landLayers!!
    }

private var _landLayers: ImageVector? = null
