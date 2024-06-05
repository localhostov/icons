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

public val Icons.Outline.Sofa: ImageVector
    get() {
        if (_sofa != null) {
            return _sofa!!
        }
        _sofa = Builder(name = "Sofa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                horizontalLineToRelative(-8.0f)
                curveTo(4.691f, 0.0f, 2.0f, 2.691f, 2.0f, 6.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(3.184f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.302f, -0.839f, -2.402f, -2.0f, -2.816f)
                verticalLineToRelative(-3.184f)
                close()
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(2.0f, 20.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _sofa!!
    }

private var _sofa: ImageVector? = null
