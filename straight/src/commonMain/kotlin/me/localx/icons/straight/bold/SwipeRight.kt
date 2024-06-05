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

public val Icons.Bold.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = Builder(name = "SwipeRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.74f, 5.128f)
                lineToRelative(-3.74f, 3.372f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                lineTo(20.0f, 0.5f)
                lineToRelative(3.74f, 3.371f)
                curveToRelative(0.347f, 0.347f, 0.347f, 0.91f, 0.0f, 1.257f)
                close()
                moveTo(9.125f, 9.707f)
                lineToRelative(12.0f, 3.13f)
                verticalLineToRelative(11.15f)
                lineToRelative(-15.0f, 0.009f)
                lineTo(0.859f, 19.605f)
                curveToRelative(-0.866f, -0.722f, -0.983f, -2.008f, -0.261f, -2.874f)
                curveToRelative(0.722f, -0.866f, 2.008f, -0.983f, 2.874f, -0.261f)
                lineToRelative(2.64f, 2.222f)
                lineTo(6.112f, 3.496f)
                curveToRelative(0.0f, -0.911f, 0.799f, -1.632f, 1.739f, -1.479f)
                curveToRelative(0.737f, 0.12f, 1.273f, 0.812f, 1.273f, 1.56f)
                verticalLineToRelative(6.13f)
                close()
                moveTo(9.125f, 12.807f)
                verticalLineToRelative(8.197f)
                lineToRelative(9.0f, -0.013f)
                verticalLineToRelative(-5.836f)
                lineToRelative(-9.0f, -2.348f)
                close()
            }
        }
        .build()
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
