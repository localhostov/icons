package me.localx.icons.straight.filled

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

public val Icons.Filled.Cream: ImageVector
    get() {
        if (_cream != null) {
            return _cream!!
        }
        _cream = Builder(name = "Cream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 24.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 9.0f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(19.965f, 7.0f)
                curveToRelative(-0.332f, -4.72f, -2.945f, -6.715f, -3.065f, -6.8f)
                lineToRelative(-0.263f, -0.2f)
                horizontalLineToRelative(-1.637f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.883f, 1.883f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(5.538f, 5.538f, 0.0f, false, false, -5.668f, 4.0f)
                close()
            }
        }
        .build()
        return _cream!!
    }

private var _cream: ImageVector? = null
