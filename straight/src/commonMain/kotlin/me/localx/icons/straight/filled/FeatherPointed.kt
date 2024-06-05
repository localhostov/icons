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

public val Icons.Filled.FeatherPointed: ImageVector
    get() {
        if (_featherPointed != null) {
            return _featherPointed!!
        }
        _featherPointed = Builder(name = "FeatherPointed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.622f, 20.995f)
                curveToRelative(-1.652f, 0.0f, -3.284f, -0.516f, -4.633f, -1.57f)
                lineToRelative(4.425f, -4.425f)
                horizontalLineToRelative(8.867f)
                curveToRelative(-0.814f, 1.24f, -1.726f, 2.389f, -2.732f, 3.439f)
                curveToRelative(-1.617f, 1.688f, -3.787f, 2.556f, -5.927f, 2.556f)
                close()
                moveTo(12.414f, 13.0f)
                horizontalLineToRelative(8.055f)
                curveToRelative(0.512f, -0.957f, 0.973f, -1.958f, 1.38f, -3.0f)
                horizontalLineToRelative(-6.435f)
                lineToRelative(-3.0f, 3.0f)
                close()
                moveTo(22.811f, 0.083f)
                curveToRelative(-2.731f, 0.299f, -11.044f, 1.209f, -17.545f, 7.729f)
                curveToRelative(-1.539f, 1.543f, -2.362f, 3.68f, -2.257f, 5.861f)
                curveToRelative(0.077f, 1.602f, 0.625f, 3.093f, 1.573f, 4.331f)
                lineToRelative(10.004f, -10.004f)
                horizontalLineToRelative(7.964f)
                curveToRelative(0.666f, -2.136f, 1.125f, -4.419f, 1.365f, -6.823f)
                lineToRelative(0.123f, -1.228f)
                lineToRelative(-1.227f, 0.134f)
                close()
                moveTo(1.483f, 23.932f)
                lineToRelative(4.506f, -4.507f)
                curveToRelative(-0.053f, -0.041f, -0.105f, -0.083f, -0.157f, -0.126f)
                curveToRelative(-0.472f, -0.39f, -0.89f, -0.824f, -1.25f, -1.295f)
                lineTo(0.069f, 22.518f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _featherPointed!!
    }

private var _featherPointed: ImageVector? = null
