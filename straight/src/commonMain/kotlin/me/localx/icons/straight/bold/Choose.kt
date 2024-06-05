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

public val Icons.Bold.Choose: ImageVector
    get() {
        if (_choose != null) {
            return _choose!!
        }
        _choose = Builder(name = "Choose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.253f)
                verticalLineToRelative(5.747f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.483f)
                lineToRelative(-6.0f, -1.714f)
                verticalLineToRelative(5.198f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-3.766f, -2.891f)
                curveToRelative(-0.866f, -0.722f, -0.983f, -2.008f, -0.261f, -2.874f)
                curveToRelative(0.722f, -0.866f, 2.008f, -0.983f, 2.874f, -0.261f)
                lineToRelative(1.152f, 0.835f)
                lineToRelative(-0.013f, -7.388f)
                curveToRelative(0.0f, -0.911f, 0.799f, -1.632f, 1.739f, -1.479f)
                curveToRelative(0.737f, 0.12f, 1.273f, 0.812f, 1.273f, 1.56f)
                verticalLineToRelative(4.182f)
                lineToRelative(9.0f, 2.571f)
                close()
                moveTo(8.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(18.0f, 0.0f)
                close()
            }
        }
        .build()
        return _choose!!
    }

private var _choose: ImageVector? = null
