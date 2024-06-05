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

public val Icons.Outline.Projector: ImageVector
    get() {
        if (_projector != null) {
            return _projector!!
        }
        _projector = Builder(name = "Projector", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.343f)
                curveToRelative(-0.825f, -2.328f, -3.049f, -4.0f, -5.657f, -4.0f)
                reflectiveCurveToRelative(-4.831f, 1.672f, -5.657f, 4.0f)
                lineTo(3.0f, 10.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 13.0f)
                close()
                moveTo(14.0f, 8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(22.0f, 20.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(7.0f, 15.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 4.0f)
                close()
                moveTo(18.866f, 5.572f)
                lineToRelative(-1.732f, -1.0f)
                lineToRelative(2.0f, -3.465f)
                lineToRelative(1.732f, 1.0f)
                lineToRelative(-2.0f, 3.465f)
                close()
                moveTo(9.134f, 5.572f)
                lineToRelative(-2.0f, -3.465f)
                lineToRelative(1.732f, -1.0f)
                lineToRelative(2.0f, 3.465f)
                lineToRelative(-1.732f, 1.0f)
                close()
            }
        }
        .build()
        return _projector!!
    }

private var _projector: ImageVector? = null
