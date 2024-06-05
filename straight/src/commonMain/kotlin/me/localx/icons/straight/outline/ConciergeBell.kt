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

public val Icons.Outline.ConciergeBell: ImageVector
    get() {
        if (_conciergeBell != null) {
            return _conciergeBell!!
        }
        _conciergeBell = Builder(name = "ConciergeBell", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -5.728f, -4.401f, -10.447f, -10.0f, -10.954f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.046f)
                curveTo(5.401f, 5.553f, 1.0f, 10.272f, 1.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(3.0f, 16.0f)
                curveToRelative(0.0f, -4.962f, 4.038f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _conciergeBell!!
    }

private var _conciergeBell: ImageVector? = null
