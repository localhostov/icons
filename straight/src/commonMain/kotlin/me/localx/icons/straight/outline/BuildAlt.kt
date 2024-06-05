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

public val Icons.Outline.BuildAlt: ImageVector
    get() {
        if (_buildAlt != null) {
            return _buildAlt!!
        }
        _buildAlt = Builder(name = "BuildAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(11.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 6.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-14.0f)
                lineTo(8.0f, 10.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(2.0f, 7.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(2.0f, 18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(18.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(11.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _buildAlt!!
    }

private var _buildAlt: ImageVector? = null
