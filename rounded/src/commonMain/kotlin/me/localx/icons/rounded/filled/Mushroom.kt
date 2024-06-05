package me.localx.icons.rounded.filled

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

public val Icons.Filled.Mushroom: ImageVector
    get() {
        if (_mushroom != null) {
            return _mushroom!!
        }
        _mushroom = Builder(name = "Mushroom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.229f, 15.37f)
                arcTo(18.968f, 18.968f, 0.0f, false, true, 17.0f, 19.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 19.0f)
                arcToRelative(19.025f, 19.025f, 0.0f, false, true, 0.77f, -3.63f)
                curveTo(10.844f, 13.622f, 13.156f, 13.622f, 16.229f, 15.37f)
                close()
                moveTo(21.054f, 14.983f)
                close()
                moveTo(24.0f, 11.33f)
                curveTo(24.0f, 5.083f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.083f, 0.0f, 11.33f)
                arcToRelative(3.887f, 3.887f, 0.0f, false, false, 0.953f, 2.9f)
                curveToRelative(1.659f, 1.485f, 3.6f, 0.5f, 5.615f, -0.5f)
                arcTo(12.75f, 12.75f, 0.0f, false, true, 12.0f, 12.0f)
                curveToRelative(3.167f, -0.1f, 6.189f, 2.757f, 9.054f, 2.983f)
                curveTo(23.121f, 14.946f, 24.0f, 13.485f, 24.0f, 11.33f)
                close()
            }
        }
        .build()
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
