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

public val Icons.Bold.SchoolBus: ImageVector
    get() {
        if (_schoolBus != null) {
            return _schoolBus!!
        }
        _schoolBus = Builder(name = "SchoolBus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 10.257f)
                verticalLineToRelative(-4.757f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, -4.5f, -4.5f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, 3.45f)
                verticalLineToRelative(0.05f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                curveToRelative(0.0f, -0.017f, 0.0f, -0.033f, 0.0f, -0.05f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, -3.45f)
                verticalLineToRelative(-2.0f)
                arcToRelative(4.508f, 4.508f, 0.0f, false, false, -3.0f, -4.243f)
                close()
                moveTo(3.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(21.0f, 16.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _schoolBus!!
    }

private var _schoolBus: ImageVector? = null
