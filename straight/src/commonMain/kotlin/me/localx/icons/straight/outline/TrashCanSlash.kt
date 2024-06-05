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

public val Icons.Outline.TrashCanSlash: ImageVector
    get() {
        if (_trashCanSlash != null) {
            return _trashCanSlash!!
        }
        _trashCanSlash = Builder(name = "TrashCanSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 15.242f)
                verticalLineToRelative(3.758f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.758f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(17.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-10.758f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(12.757f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.765f, 0.0f, 1.457f, -0.297f, 1.988f, -0.77f)
                lineToRelative(-1.426f, -1.425f)
                curveToRelative(-0.162f, 0.114f, -0.349f, 0.196f, -0.562f, 0.196f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(1.758f)
                lineToRelative(-1.758f, -1.758f)
                verticalLineToRelative(1.758f)
                close()
                moveTo(2.586f, 4.0f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.957f, 3.957f)
                horizontalLineToRelative(1.586f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-0.086f)
                lineToRelative(4.043f, 4.043f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(4.586f, 6.0f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(7.414f, 6.0f)
                lineToRelative(5.586f, 5.586f)
                verticalLineToRelative(-2.586f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(3.0f, 3.0f)
                lineTo(18.0f, 6.0f)
                close()
            }
        }
        .build()
        return _trashCanSlash!!
    }

private var _trashCanSlash: ImageVector? = null
