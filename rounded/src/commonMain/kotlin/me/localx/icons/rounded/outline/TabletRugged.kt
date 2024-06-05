package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.TabletRugged: ImageVector
    get() {
        if (_tabletRugged != null) {
            return _tabletRugged!!
        }
        _tabletRugged = Builder(name = "TabletRugged", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.414f, 5.586f)
                curveToRelative(0.375f, -0.375f, 0.586f, -0.884f, 0.586f, -1.414f)
                verticalLineToRelative(-1.672f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.672f)
                curveToRelative(-0.53f, 0.0f, -1.039f, 0.211f, -1.414f, 0.586f)
                lineToRelative(-0.414f, 0.414f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-0.414f, -0.414f)
                curveToRelative(-0.375f, -0.375f, -0.884f, -0.586f, -1.414f, -0.586f)
                horizontalLineToRelative(-1.672f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(1.672f)
                curveToRelative(0.0f, 0.53f, 0.211f, 1.039f, 0.586f, 1.414f)
                lineToRelative(0.414f, 0.414f)
                verticalLineToRelative(2.0f)
                lineToRelative(-0.414f, 0.414f)
                curveToRelative(-0.375f, 0.375f, -0.586f, 0.884f, -0.586f, 1.414f)
                verticalLineToRelative(4.343f)
                curveToRelative(0.0f, 0.53f, 0.211f, 1.039f, 0.586f, 1.414f)
                lineToRelative(0.414f, 0.414f)
                verticalLineToRelative(2.0f)
                lineToRelative(-0.414f, 0.414f)
                curveToRelative(-0.375f, 0.375f, -0.586f, 0.884f, -0.586f, 1.414f)
                verticalLineToRelative(1.672f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.672f)
                curveToRelative(0.53f, 0.0f, 1.039f, -0.211f, 1.414f, -0.586f)
                lineToRelative(0.414f, -0.414f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.414f, 0.414f)
                curveToRelative(0.375f, 0.375f, 0.884f, 0.586f, 1.414f, 0.586f)
                horizontalLineToRelative(1.672f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-1.672f)
                curveToRelative(0.0f, -0.53f, -0.211f, -1.039f, -0.586f, -1.414f)
                lineToRelative(-0.414f, -0.414f)
                verticalLineToRelative(-2.0f)
                lineToRelative(0.414f, -0.414f)
                curveToRelative(0.375f, -0.375f, 0.586f, -0.884f, 0.586f, -1.414f)
                verticalLineToRelative(-4.343f)
                curveToRelative(0.0f, -0.53f, -0.211f, -1.039f, -0.586f, -1.414f)
                lineToRelative(-0.414f, -0.414f)
                verticalLineToRelative(-2.0f)
                lineToRelative(0.414f, -0.414f)
                close()
                moveTo(5.0f, 21.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(18.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _tabletRugged!!
    }

private var _tabletRugged: ImageVector? = null
