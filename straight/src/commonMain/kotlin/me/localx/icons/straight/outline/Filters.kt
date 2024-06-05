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

public val Icons.Outline.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.5f)
                verticalLineToRelative(4.5f)
                lineToRelative(-6.0f, -4.5f)
                verticalLineToRelative(-3.086f)
                lineTo(0.0f, 9.414f)
                verticalLineToRelative(-2.414f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                verticalLineToRelative(4.402f)
                lineToRelative(7.0f, 7.0f)
                verticalLineToRelative(2.914f)
                lineToRelative(2.0f, 1.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(2.0f, 1.5f)
                close()
                moveTo(17.0f, 12.414f)
                lineToRelative(7.0f, -7.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.414f)
                lineToRelative(7.0f, 7.0f)
                verticalLineToRelative(3.086f)
                lineToRelative(6.0f, 4.5f)
                verticalLineToRelative(-7.586f)
                close()
                moveTo(13.0f, 11.586f)
                lineTo(6.0f, 4.586f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(-7.0f, 7.0f)
                verticalLineToRelative(4.414f)
                lineToRelative(-2.0f, -1.5f)
                verticalLineToRelative(-2.914f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
