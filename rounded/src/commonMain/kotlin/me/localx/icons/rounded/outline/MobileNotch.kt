package me.localx.icons.rounded.outline

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

public val Icons.Outline.MobileNotch: ImageVector
    get() {
        if (_mobileNotch != null) {
            return _mobileNotch!!
        }
        _mobileNotch = Builder(name = "MobileNotch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.045f, 0.0f)
                curveToRelative(-0.027f, -0.001f, -6.063f, -0.001f, -6.09f, 0.0f)
                curveToRelative(-2.736f, 0.024f, -4.955f, 2.258f, -4.955f, 4.999f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(20.0f, 5.0f)
                curveTo(20.0f, 2.258f, 17.781f, 0.025f, 15.045f, 0.0f)
                close()
                moveTo(18.0f, 18.999f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(6.0f, 5.0f)
                curveToRelative(0.0f, -1.453f, 1.038f, -2.667f, 2.411f, -2.942f)
                lineToRelative(0.694f, 1.389f)
                curveToRelative(0.169f, 0.339f, 0.516f, 0.553f, 0.895f, 0.553f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.379f, 0.0f, 0.725f, -0.214f, 0.895f, -0.553f)
                lineToRelative(0.694f, -1.389f)
                curveToRelative(1.373f, 0.274f, 2.411f, 1.489f, 2.411f, 2.942f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(13.0f, 19.999f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _mobileNotch!!
    }

private var _mobileNotch: ImageVector? = null
