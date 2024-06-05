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

public val Icons.Outline.Archway: ImageVector
    get() {
        if (_archway != null) {
            return _archway!!
        }
        _archway = Builder(name = "Archway", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.303f)
                lineTo(24.0f, 1.0f)
                lineTo(0.0f, 1.0f)
                lineTo(0.0f, 3.303f)
                lineToRelative(2.0f, 3.0f)
                verticalLineToRelative(14.697f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 23.0f)
                lineTo(8.0f, 15.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 6.303f)
                lineToRelative(2.0f, -3.0f)
                close()
                moveTo(21.798f, 3.0f)
                lineToRelative(-1.333f, 2.0f)
                lineTo(3.535f, 5.0f)
                lineToRelative(-1.333f, -2.0f)
                lineTo(21.798f, 3.0f)
                close()
                moveTo(18.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _archway!!
    }

private var _archway: ImageVector? = null
