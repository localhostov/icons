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

public val Icons.Filled.ConciergeBell: ImageVector
    get() {
        if (_conciergeBell != null) {
            return _conciergeBell!!
        }
        _conciergeBell = Builder(name = "ConciergeBell", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-3.0f)
                curveTo(1.0f, 10.272f, 5.402f, 5.558f, 11.0f, 5.051f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.051f)
                curveToRelative(5.598f, 0.508f, 10.0f, 5.221f, 10.0f, 10.949f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _conciergeBell!!
    }

private var _conciergeBell: ImageVector? = null
