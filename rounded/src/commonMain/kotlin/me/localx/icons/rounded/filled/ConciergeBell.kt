package me.localx.icons.rounded.filled

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
                moveTo(23.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.343f)
                curveToRelative(1.465f, 0.0f, 2.657f, -1.192f, 2.657f, -2.657f)
                curveToRelative(0.0f, -5.88f, -4.371f, -10.79f, -10.0f, -11.298f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.044f)
                curveTo(5.371f, 5.553f, 1.0f, 10.462f, 1.0f, 16.343f)
                curveToRelative(0.0f, 1.465f, 1.192f, 2.657f, 2.657f, 2.657f)
                horizontalLineToRelative(7.343f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(23.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _conciergeBell!!
    }

private var _conciergeBell: ImageVector? = null
