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

public val Icons.Outline.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) {
            return _lighthouse!!
        }
        _lighthouse = Builder(name = "Lighthouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 2.5f)
                lineTo(12.0f, 0.0f)
                lineToRelative(-5.0f, 2.5f)
                verticalLineToRelative(5.424f)
                lineToRelative(-1.988f, 12.924f)
                lineToRelative(-0.012f, 3.152f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-2.0f, -13.076f)
                lineTo(17.0f, 2.5f)
                close()
                moveTo(15.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.009f)
                lineToRelative(0.008f, -3.0f)
                horizontalLineToRelative(6.001f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.924f)
                lineToRelative(1.858f, -12.076f)
                horizontalLineToRelative(6.295f)
                lineToRelative(1.847f, 12.076f)
                verticalLineToRelative(0.924f)
                close()
                moveTo(5.0f, 4.5f)
                lineTo(0.0f, 2.625f)
                lineTo(0.0f, 0.488f)
                lineToRelative(5.0f, 1.875f)
                verticalLineToRelative(2.137f)
                close()
                moveTo(5.0f, 8.637f)
                lineToRelative(-5.0f, 1.875f)
                verticalLineToRelative(-2.137f)
                lineToRelative(5.0f, -1.875f)
                verticalLineToRelative(2.137f)
                close()
                moveTo(24.0f, 0.488f)
                verticalLineToRelative(2.137f)
                lineToRelative(-5.0f, 1.875f)
                verticalLineToRelative(-2.137f)
                lineToRelative(5.0f, -1.875f)
                close()
                moveTo(19.0f, 6.5f)
                lineToRelative(5.0f, 1.875f)
                verticalLineToRelative(2.137f)
                lineToRelative(-5.0f, -1.875f)
                verticalLineToRelative(-2.137f)
                close()
            }
        }
        .build()
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
