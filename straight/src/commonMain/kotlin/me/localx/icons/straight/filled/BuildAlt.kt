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

public val Icons.Filled.BuildAlt: ImageVector
    get() {
        if (_buildAlt != null) {
            return _buildAlt!!
        }
        _buildAlt = Builder(name = "BuildAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                horizontalLineToRelative(-11.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(7.0f, 8.0f)
                lineTo(7.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(8.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(11.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(13.0f, 10.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
        }
        .build()
        return _buildAlt!!
    }

private var _buildAlt: ImageVector? = null
