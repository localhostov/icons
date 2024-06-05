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

public val Icons.Bold.ConciergeBell: ImageVector
    get() {
        if (_conciergeBell != null) {
            return _conciergeBell!!
        }
        _conciergeBell = Builder(name = "ConciergeBell", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -6.109f, -4.589f, -11.166f, -10.5f, -11.906f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.094f)
                curveTo(4.589f, 5.834f, 0.0f, 10.891f, 0.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(13.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(4.625f, 0.0f, 8.446f, 3.506f, 8.945f, 8.0f)
                horizontalLineTo(3.055f)
                curveToRelative(0.499f, -4.494f, 4.32f, -8.0f, 8.945f, -8.0f)
                close()
            }
        }
        .build()
        return _conciergeBell!!
    }

private var _conciergeBell: ImageVector? = null
