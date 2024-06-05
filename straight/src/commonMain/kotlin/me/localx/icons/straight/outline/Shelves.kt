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

public val Icons.Outline.Shelves: ImageVector
    get() {
        if (_shelves != null) {
            return _shelves!!
        }
        _shelves = Builder(name = "Shelves", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(17.0f, 2.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(17.0f, 2.5f)
                close()
                moveTo(2.0f, 14.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(16.0f, 19.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.562f, 0.0f, -1.082f, 0.187f, -1.5f, 0.501f)
                curveToRelative(-0.418f, -0.315f, -0.938f, -0.501f, -1.5f, -0.501f)
                lineTo(2.5f, 12.0f)
                curveToRelative(-0.171f, 0.0f, -0.338f, 0.017f, -0.5f, 0.05f)
                verticalLineToRelative(-3.05f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _shelves!!
    }

private var _shelves: ImageVector? = null
