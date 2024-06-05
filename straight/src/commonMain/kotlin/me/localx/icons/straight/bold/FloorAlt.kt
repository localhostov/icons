package me.localx.icons.straight.bold

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

public val Icons.Bold.FloorAlt: ImageVector
    get() {
        if (_floorAlt != null) {
            return _floorAlt!!
        }
        _floorAlt = Builder(name = "FloorAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 5.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 10.414f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(2.086f, 2.086f)
                lineToRelative(-6.586f, 6.586f)
                verticalLineToRelative(-4.172f)
                close()
                moveTo(16.0f, 8.586f)
                lineToRelative(-4.75f, 4.75f)
                lineToRelative(-2.086f, -2.086f)
                lineToRelative(6.836f, -6.836f)
                verticalLineToRelative(4.172f)
                close()
                moveTo(11.0f, 6.586f)
                lineToRelative(-2.086f, -2.086f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineToRelative(4.172f)
                lineToRelative(-3.586f, 3.586f)
                close()
                moveTo(7.75f, 12.664f)
                lineToRelative(2.086f, 2.086f)
                lineToRelative(-1.25f, 1.25f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(3.336f, -3.336f)
                close()
                moveTo(16.0f, 11.414f)
                verticalLineToRelative(4.586f)
                horizontalLineToRelative(-4.586f)
                lineToRelative(4.586f, -4.586f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineToRelative(4.086f)
                lineTo(3.0f, 7.586f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                close()
            }
        }
        .build()
        return _floorAlt!!
    }

private var _floorAlt: ImageVector? = null
