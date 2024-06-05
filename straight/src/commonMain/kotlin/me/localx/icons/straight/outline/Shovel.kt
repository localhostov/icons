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

public val Icons.Outline.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.577f, 7.324f)
                lineToRelative(1.414f, -1.414f)
                lineTo(18.09f, 0.01f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.243f, 2.243f)
                lineToRelative(-8.948f, 8.948f)
                lineToRelative(-3.46f, -3.46f)
                lineToRelative(-4.307f, 4.308f)
                curveToRelative(-1.421f, 1.421f, -2.204f, 3.311f, -2.204f, 5.321f)
                verticalLineToRelative(5.218f)
                horizontalLineToRelative(5.218f)
                curveToRelative(2.01f, 0.0f, 3.899f, -0.783f, 5.321f, -2.204f)
                lineToRelative(4.307f, -4.307f)
                lineToRelative(-3.46f, -3.46f)
                lineToRelative(8.948f, -8.948f)
                lineToRelative(2.243f, 2.243f)
                close()
                moveTo(12.018f, 17.489f)
                lineToRelative(-2.893f, 2.893f)
                curveToRelative(-1.043f, 1.043f, -2.431f, 1.618f, -3.907f, 1.618f)
                horizontalLineToRelative(-3.218f)
                verticalLineToRelative(-3.218f)
                curveToRelative(0.0f, -1.476f, 0.575f, -2.863f, 1.618f, -3.907f)
                lineToRelative(2.893f, -2.894f)
                lineToRelative(2.046f, 2.046f)
                lineToRelative(-2.765f, 2.765f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.765f, -2.765f)
                lineToRelative(2.046f, 2.046f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
