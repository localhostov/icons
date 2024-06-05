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

public val Icons.Outline.PlaneTail: ImageVector
    get() {
        if (_planeTail != null) {
            return _planeTail!!
        }
        _planeTail = Builder(name = "PlaneTail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.382f, 16.622f)
                curveToRelative(-0.187f, -0.078f, -2.124f, -0.87f, -5.039f, -1.777f)
                lineTo(22.302f, 0.0f)
                horizontalLineToRelative(-4.302f)
                curveToRelative(-0.939f, 0.0f, -1.837f, 0.448f, -2.399f, 1.2f)
                lineToRelative(-6.301f, 8.4f)
                curveToRelative(-1.127f, 1.502f, -2.921f, 2.399f, -4.8f, 2.399f)
                lineTo(0.0f, 11.999f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 13.999f)
                curveToRelative(7.77f, 0.0f, 16.282f, 2.852f, 19.394f, 4.0f)
                curveToRelative(-3.111f, 1.148f, -11.624f, 4.0f, -19.394f, 4.0f)
                lineTo(0.0f, 21.999f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 23.999f)
                curveToRelative(10.083f, 0.0f, 20.926f, -4.433f, 21.382f, -4.622f)
                lineToRelative(0.618f, -0.255f)
                verticalLineToRelative(-2.246f)
                lineToRelative(-0.618f, -0.255f)
                close()
                moveTo(10.9f, 10.8f)
                lineTo(17.2f, 2.399f)
                curveToRelative(0.188f, -0.25f, 0.486f, -0.399f, 0.8f, -0.399f)
                horizontalLineToRelative(1.698f)
                lineToRelative(-3.273f, 12.275f)
                curveToRelative(-2.187f, -0.619f, -4.737f, -1.233f, -7.423f, -1.667f)
                curveToRelative(0.721f, -0.49f, 1.365f, -1.098f, 1.897f, -1.808f)
                close()
                moveTo(14.001f, 17.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _planeTail!!
    }

private var _planeTail: ImageVector? = null
