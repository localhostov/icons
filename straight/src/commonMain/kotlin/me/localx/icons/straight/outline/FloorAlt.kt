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

public val Icons.Outline.FloorAlt: ImageVector
    get() {
        if (_floorAlt != null) {
            return _floorAlt!!
        }
        _floorAlt = Builder(name = "FloorAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.25f, 8.0f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -1.517f, -1.233f, -2.75f, -2.75f, -2.75f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-13.25f)
                curveToRelative(0.0f, -1.517f, -1.233f, -2.75f, -2.75f, -2.75f)
                close()
                moveTo(2.0f, 9.289f)
                lineToRelative(4.25f, -4.25f)
                lineToRelative(1.648f, 1.648f)
                lineToRelative(-5.898f, 5.898f)
                verticalLineToRelative(-3.297f)
                close()
                moveTo(14.0f, 6.711f)
                lineToRelative(-4.469f, 4.469f)
                lineToRelative(-1.648f, -1.648f)
                lineToRelative(6.117f, -6.117f)
                verticalLineToRelative(3.297f)
                close()
                moveTo(9.312f, 5.273f)
                lineToRelative(-1.648f, -1.648f)
                lineToRelative(1.625f, -1.625f)
                horizontalLineToRelative(3.297f)
                lineToRelative(-3.273f, 3.273f)
                close()
                moveTo(6.468f, 10.945f)
                lineToRelative(1.648f, 1.648f)
                lineToRelative(-1.406f, 1.406f)
                horizontalLineToRelative(-3.297f)
                lineToRelative(3.055f, -3.055f)
                close()
                moveTo(13.999f, 9.539f)
                verticalLineToRelative(4.461f)
                horizontalLineToRelative(-4.461f)
                lineToRelative(4.461f, -4.461f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(3.461f)
                lineTo(2.0f, 6.461f)
                verticalLineToRelative(-3.461f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                lineTo(16.0f, 6.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.413f, 0.0f, 0.75f, 0.336f, 0.75f, 0.75f)
                verticalLineToRelative(11.25f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.413f, 0.0f, 0.75f, 0.336f, 0.75f, 0.75f)
                verticalLineToRelative(11.25f)
                close()
            }
        }
        .build()
        return _floorAlt!!
    }

private var _floorAlt: ImageVector? = null
