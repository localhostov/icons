package me.localx.icons.rounded.bold

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

public val Icons.Bold.SidebarFlip: ImageVector
    get() {
        if (_sidebarFlip != null) {
            return _sidebarFlip!!
        }
        _sidebarFlip = Builder(name = "SidebarFlip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.038f)
                lineTo(5.5f, 2.038f)
                curveTo(2.467f, 2.038f, 0.0f, 4.506f, 0.0f, 7.538f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 7.538f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(15.0f, 19.038f)
                lineTo(5.5f, 19.038f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 7.538f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                lineTo(15.0f, 5.038f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(19.5f, 13.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.5f, 8.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _sidebarFlip!!
    }

private var _sidebarFlip: ImageVector? = null
