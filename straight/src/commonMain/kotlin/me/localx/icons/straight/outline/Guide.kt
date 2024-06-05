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

public val Icons.Outline.Guide: ImageVector
    get() {
        if (_guide != null) {
            return _guide!!
        }
        _guide = Builder(name = "Guide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.343f)
                curveTo(11.831f, 1.672f, 9.608f, 0.0f, 7.0f, 0.0f)
                curveTo(3.691f, 0.0f, 1.0f, 2.691f, 1.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(7.0f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(7.0f, 2.0f)
                curveToRelative(1.478f, 0.0f, 2.771f, 0.805f, 3.463f, 2.0f)
                lineTo(3.537f, 4.0f)
                curveToRelative(0.693f, -1.195f, 1.985f, -2.0f, 3.463f, -2.0f)
                close()
                moveTo(12.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(24.0f, 2.462f)
                lineToRelative(-4.0f, 2.538f)
                verticalLineToRelative(5.469f)
                lineToRelative(-6.638f, 5.531f)
                lineTo(4.5f, 16.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(8.138f)
                lineToRelative(5.362f, -4.469f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(4.0f, 2.462f)
                close()
            }
        }
        .build()
        return _guide!!
    }

private var _guide: ImageVector? = null
