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

public val Icons.Outline.FeatherPointed: ImageVector
    get() {
        if (_featherPointed != null) {
            return _featherPointed!!
        }
        _featherPointed = Builder(name = "FeatherPointed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.811f, 0.083f)
                curveToRelative(-2.731f, 0.299f, -11.044f, 1.209f, -17.545f, 7.729f)
                curveToRelative(-1.539f, 1.543f, -2.362f, 3.68f, -2.257f, 5.861f)
                curveToRelative(0.077f, 1.602f, 0.625f, 3.093f, 1.573f, 4.331f)
                lineTo(0.069f, 22.518f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.506f, -4.507f)
                curveToRelative(1.349f, 1.054f, 2.981f, 1.571f, 4.633f, 1.57f)
                curveToRelative(2.14f, 0.0f, 4.31f, -0.867f, 5.927f, -2.556f)
                curveToRelative(4.121f, -4.302f, 6.668f, -10.271f, 7.366f, -17.263f)
                lineToRelative(0.123f, -1.228f)
                lineToRelative(-1.227f, 0.134f)
                close()
                moveTo(15.104f, 17.057f)
                curveToRelative(-2.095f, 2.187f, -5.396f, 2.566f, -7.687f, 0.94f)
                lineToRelative(2.996f, -2.996f)
                horizontalLineToRelative(6.427f)
                curveToRelative(-0.54f, 0.725f, -1.12f, 1.412f, -1.737f, 2.057f)
                close()
                moveTo(12.414f, 13.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(4.275f)
                curveToRelative(-0.446f, 1.05f, -0.952f, 2.051f, -1.516f, 3.0f)
                horizontalLineToRelative(-5.759f)
                close()
                moveTo(20.448f, 8.0f)
                horizontalLineToRelative(-5.862f)
                lineToRelative(-8.571f, 8.572f)
                curveToRelative(-0.605f, -0.874f, -0.955f, -1.9f, -1.008f, -2.996f)
                curveToRelative(-0.078f, -1.62f, 0.533f, -3.207f, 1.675f, -4.353f)
                curveToRelative(5.221f, -5.236f, 11.791f, -6.562f, 15.097f, -7.004f)
                curveToRelative(-0.276f, 2.036f, -0.723f, 3.969f, -1.331f, 5.78f)
                close()
            }
        }
        .build()
        return _featherPointed!!
    }

private var _featherPointed: ImageVector? = null
